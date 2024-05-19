package com.acn.sampleapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.web.bind.annotation.*;

import com.acn.sampleapi.entity.Author;
import com.acn.sampleapi.repository.AuthorRepository;


import java.util.List;

@RestController
@RequestMapping("/api/authors")
public class AuthorController {

    @Autowired
    private AuthorRepository authorRepository;

    @GetMapping
    public List<Author> getAllAuthors() {
        return authorRepository.findAll();
    }

    @GetMapping("/{id}")
    public Author getAuthorById(@PathVariable int id) {
        return authorRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Author with id "+ id + " not found"));
    }

    @PostMapping
    public Author createAuthor(@RequestBody Author author) {
        return authorRepository.save(author);
    }

    @PutMapping("/{id}")
    public Author updateAuthor(@PathVariable int id, @RequestBody Author authorDetails) {
        Author author = authorRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Author with id "+ id + " not found"));
        author.setName(authorDetails.getName());
        author.setBio(authorDetails.getBio());
        return authorRepository.save(author);
    }

    @DeleteMapping("/{id}")
    public void deleteAuthor(@PathVariable int id) {
        Author author = authorRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Author with id "+ id + " not found"));
        authorRepository.delete(author);
    }
}
 

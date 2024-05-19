package com.acn.sampleapi.service;

import com.acn.sampleapi.entity.Author;
import com.acn.sampleapi.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorService {
    
    @Autowired
    private AuthorRepository authorRepository;

    public List<Author> getAllAuthors() {
        return authorRepository.findAll();
    }

    public Author getAuthorById(int id) {
        return authorRepository.findById(id).orElse(null);
    }

    public Author saveAuthor(Author Author) {
        return authorRepository.save(Author);
    }

    public void deleteAuthor(int id) {
        authorRepository.deleteById(id);
    }
}

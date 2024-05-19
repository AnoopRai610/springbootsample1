package com.acn.sampleapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.acn.sampleapi.entity.Author;

public interface AuthorRepository extends JpaRepository<Author, Integer> {
} 

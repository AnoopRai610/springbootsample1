package com.acn.sampleapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.acn.sampleapi.entity.Book;

public interface BookRepository extends JpaRepository<Book, Integer> {
} 

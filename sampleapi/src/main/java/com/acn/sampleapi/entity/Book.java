package com.acn.sampleapi.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name="Books")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int id;
    public String title;
    public int author_id;
    public String tags;
    public java.sql.Date date_of_published;

    public Book() {
    }

    public Book(int id, String title, int author_id, String tags, java.sql.Date date_of_published) {
        this.id = id;
        this.title = title;
        this.author_id = author_id;
        this.tags = tags;
        this.date_of_published = date_of_published;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getAuthor_id() {
        return author_id;
    }

    public void setAuthor_id(int author_id) {
        this.author_id = author_id;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public java.sql.Date getDate_of_published() {
        return date_of_published;
    }

    public void setDate_of_published(java.sql.Date date_of_published) {
        this.date_of_published = date_of_published;
    }

    

}

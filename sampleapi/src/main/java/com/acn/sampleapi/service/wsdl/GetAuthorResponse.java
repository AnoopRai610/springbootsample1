package com.acn.sampleapi.service.wsdl;

import com.acn.sampleapi.entity.Author;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(namespace = "http://example.com/demo")
public class GetAuthorResponse {
    private Author author;

    @XmlElement
    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }
}

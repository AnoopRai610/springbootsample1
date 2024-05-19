package com.acn.sampleapi.endpoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.acn.sampleapi.entity.Author;
import com.acn.sampleapi.service.AuthorService;
import com.acn.sampleapi.service.wsdl.GetAuthorRequest;
import com.acn.sampleapi.service.wsdl.GetAuthorResponse;

@Endpoint
public class AuthorEndpoint {
    private static final String NAMESPACE_URI = "http://example.com/demo";

    @Autowired
    private AuthorService authorService;

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getPersonRequest")
    @ResponsePayload
    public GetAuthorResponse getPerson(@RequestPayload GetAuthorRequest request) {
        GetAuthorResponse response = new GetAuthorResponse();
        Author author = authorService.getAuthorById(request.getId());
        response.setAuthor(author);
        return response;
    }
}

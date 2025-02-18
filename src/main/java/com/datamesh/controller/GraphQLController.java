package com.datamesh.controller;

import com.datamesh.service.DataProductService;
import graphql.ExecutionResult;
import graphql.GraphQL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/graphql")
public class GraphQLController {

    @Autowired
    private GraphQL graphQL;

    @PostMapping
    public ResponseEntity<Object> executeQuery(@RequestBody String query) {
        ExecutionResult result = graphQL.execute(query);
        return ResponseEntity.ok(result.getData());
    }
}
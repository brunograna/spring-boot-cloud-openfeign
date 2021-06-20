package com.demo.openfeign.controller;

import com.demo.openfeign.config.JsonPlaceHolderClient;
import com.demo.openfeign.dto.Post;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/feign/v1/posts")
public class PostController {

    private static final Logger logger = LoggerFactory.getLogger(PostController.class);
    private final JsonPlaceHolderClient jsonPlaceHolderClient;

    public PostController(JsonPlaceHolderClient jsonPlaceHolderClient) {
        this.jsonPlaceHolderClient = jsonPlaceHolderClient;
    }

    @GetMapping
    public List<Post> getPosts() {
        logger.info("PostController.getPosts");
        return this.jsonPlaceHolderClient.getPosts();
    }

    @GetMapping("{id}")
    public Post getPostsById(@PathVariable("id") String id) {
        logger.info("PostController.getPostsById");
        return this.jsonPlaceHolderClient.getPostById(Long.valueOf(id));
    }
}

package com.demo.openfeign.dto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Post {

    private final Integer id;
    private final String title;
    private final String body;

    @JsonCreator
    public Post(@JsonProperty("id") Integer id,
                @JsonProperty("title") String title,
                @JsonProperty("body") String body) {
        this.id = id;
        this.title = title;
        this.body = body;
    }

    public Integer getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getBody() {
        return body;
    }

    @Override
    public String toString() {
        return "Post{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", body='" + body + '\'' +
                '}';
    }
}

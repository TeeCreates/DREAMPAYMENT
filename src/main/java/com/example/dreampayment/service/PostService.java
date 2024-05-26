package com.example.dreampayment.service;


import model.Post;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PostService {
    private final List<Post> posts = new ArrayList<>();

    // Get all posts
    public List<Post> getAllPosts() {
        return posts;
    }

    // Add a new post
    public void addPost(Post post) {
        posts.add(post);
    }

    // Get a post by ID
    public Post getPostById(int id) {
        return posts.get(id);
    }

    // Update a post
    public void updatePost(int id, Post post) {
        posts.set(id, post);
    }

    // Delete a post
    public void deletePost(int id) {
        posts.remove(id);
    }
}

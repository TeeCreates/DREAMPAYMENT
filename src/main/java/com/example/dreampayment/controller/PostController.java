package com.example.dreampayment.controller;

import model.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.example.dreampayment.service.PostService;

import java.time.LocalDate;
import java.util.List;

@Controller
@RequestMapping("/posts")
public class PostController {

    @Autowired
    private PostService postService;

    // Display the list of posts
    @GetMapping
    public String viewPosts(Model model) {
        List<Post> posts = postService.getAllPosts();
        model.addAttribute("posts", posts);
        return "index";
    }

    // Form to create a post
    @GetMapping("/create")
    public String showCreateForm(Model model) {
        model.addAttribute("post", new Post("", "", "", LocalDate.now()));
        return "createPost";
    }

    // Create a new post
    @PostMapping("/create")
    public String createPost(@ModelAttribute Post post) {
        postService.addPost(post);
        return "redirect:/posts";
    }

    // View post details
    @GetMapping("/{id}")
    public String viewPostDetails(@PathVariable int id, Model model) {
        Post post = postService.getPostById(id);
        model.addAttribute("post", post);
        return "postDetails";
    }

    // Form to edit a post
    @GetMapping("/edit/{id}")
    public String showEditForm(@PathVariable int id, Model model) {
        Post post = postService.getPostById(id);
        model.addAttribute("post", post);
        return "editPost";
    }

    // Update a post
    @PostMapping("/edit/{id}")
    public String updatePost(@PathVariable int id, @ModelAttribute Post post) {
        postService.updatePost(id, post);
        return "redirect:/posts";
    }

    // Delete a post
    @GetMapping("/delete/{id}")
    public String deletePost(@PathVariable int id) {
        postService.deletePost(id);
        return "redirect:/posts";
    }
}

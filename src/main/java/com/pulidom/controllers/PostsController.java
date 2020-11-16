package com.pulidom.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pulidom.models.Post;
import com.pulidom.models.PostRequest;
import com.pulidom.services.PostService;

@RestController
@RequestMapping("/api/v1/posts")
public class PostsController {

	@Autowired
	private PostService postService;
	
	@GetMapping
	public String getPosts() {
		return "Get Posts";
	}
	
	@PostMapping
	public Post addPost(final PostRequest post) {
		return postService.savePost(post);
	}
	
}

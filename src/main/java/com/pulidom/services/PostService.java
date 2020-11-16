package com.pulidom.services;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pulidom.models.Post;
import com.pulidom.models.PostRequest;
import com.pulidom.repositories.PostRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class PostService {

	@Autowired
	private PostRepository postRepository;
	
	public List<Post> getAllPosts() {
		List<Post> allPosts = new ArrayList<>();
		postRepository.findAll().forEach(p -> allPosts.add(p));
		return allPosts;
	}
	
	public Post savePost(final PostRequest postRequest) {
		log.info("Post Service layer");
		final Post post = new Post();
		final Date current = new Date();
		BeanUtils.copyProperties(postRequest, post);
		post.setCreated(current);
		post.setUpdated(current);
		return postRepository.save(post);
	}

	public Post getPostById(Long id) {
		return postRepository.findById(id).orElse(null);
	}
}

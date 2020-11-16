package com.pulidom.services;

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
	
	public Post savePost(final PostRequest postRequest) {
		//log.info("Post Service layer");
		Post post = new Post();
		BeanUtils.copyProperties(postRequest, post);
		return postRepository.save(post);
	}
}

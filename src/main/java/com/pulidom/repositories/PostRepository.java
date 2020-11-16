package com.pulidom.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.pulidom.models.Post;

@Repository
public interface PostRepository extends CrudRepository<Post, Long> {
	
}

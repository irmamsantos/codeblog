package com.tutorial.spring.codeblog.service;

import java.util.List;

import com.tutorial.spring.codeblog.model.Post;

public interface CodeblogService {

	List<Post> findAll();
	Post findById(Long id);
	Post save(Post post);
}

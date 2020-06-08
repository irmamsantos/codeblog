package com.tutorial.spring.codeblog.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tutorial.spring.codeblog.dao.CodeblogRepository;
import com.tutorial.spring.codeblog.model.Post;

@Service
public class CodeblogServiceImpl implements CodeblogService {
	
	@Autowired
	private CodeblogRepository codeblogRepository;

	@Override
	public List<Post> findAll() {
		return codeblogRepository.findAll();
	}

	@Override
	public Post findById(Long id) {
		return codeblogRepository.findById(id).get();
	}

	@Override
	public Post save(Post post) {
		return codeblogRepository.save(post);
	}

}

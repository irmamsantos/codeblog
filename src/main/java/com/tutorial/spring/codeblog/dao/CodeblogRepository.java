package com.tutorial.spring.codeblog.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tutorial.spring.codeblog.model.Post;

@Repository
public interface CodeblogRepository extends JpaRepository<Post, Long>{

}

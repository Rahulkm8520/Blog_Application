package com.rahul.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.rahul.enity.PostEntity;
import com.rahul.services.PostService;

@Controller
public class PostController {
	

	@Autowired
	private PostService postService;
	
	@GetMapping("/posts/{postId}")
	public String getPost(@PathVariable Integer postId , Model  model) {
		
		//find the post By post Id
		Optional<PostEntity> optionalPost = postService.getById(postId);
		//check post is exist or not if post exists , then shove it into the model
		if(optionalPost.isPresent()) {
			PostEntity post = optionalPost.get();
			model.addAttribute( "post", post);
			return "post";
		}else {
			return "404";
		}
	}
}

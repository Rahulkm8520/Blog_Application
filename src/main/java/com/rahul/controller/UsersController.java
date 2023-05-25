package com.rahul.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.rahul.enity.PostEntity;
import com.rahul.services.PostService;

@Controller
public class UsersController {
	
	@Autowired
	private PostService postService;
	
	@GetMapping("/")
	public String  home(Model model) {
		List<PostEntity> posts = postService.getAll();
		model.addAttribute("posts" , posts);
		return "index";
	}
	
	
	

}

package com.rahul.services;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rahul.enity.PostEntity;
import com.rahul.repositories.PostRepo;

@Service
public class PostService {
	
	@Autowired
	private PostRepo postRepo;
	
	public Optional<PostEntity> getById(Integer postId){	
		return postRepo.findById(postId);
		
	}
	//to retrieve all blog post ...methods
	
	public List<PostEntity> getAll(){
		return postRepo.findAll();
		
	}
	//save Post  with post Creation Date
	public PostEntity save(PostEntity postEnt) {
		if(postEnt.getPostId() == null) {
			postEnt.setCreatedOn(LocalDate.now());
		}
		return postRepo.save(postEnt);
	}
	
	

}

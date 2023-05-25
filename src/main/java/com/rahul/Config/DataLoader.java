package com.rahul.Config;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.rahul.enity.PostEntity;
import com.rahul.enity.UsersEntity;
import com.rahul.services.PostService;
import com.rahul.services.UserService;

@Component
public class DataLoader implements CommandLineRunner{
	
	@Autowired
	private PostService postService;
	
	@Autowired
	private UserService userService;
	

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		List<PostEntity> posts = postService.getAll();
		
		if(posts.size() == 0) {
			
			UsersEntity  user1 = new UsersEntity();
			user1.setFname("rahul");
			user1.setLname("kumar");
			user1.setEmail("rahulmaurya8520@gmail.com");
			user1.setPwd("123456");
			
			UsersEntity  user2 = new UsersEntity();
			user2.setFname("rahul");
			user2.setLname("Maurya");
			user2.setEmail("rahulmaurya1@gmail.com");
			user2.setPwd("123456");
			
			userService.save(user1);
			userService.save(user2);
			
			
			
			
			PostEntity  post1 = new PostEntity();
			post1.setTitle("title of post 1");
			post1.setContent("This is the body of post 1");
			
			PostEntity  post2 = new PostEntity();
			post2.setTitle("title of post 2");
			post2.setContent("This is the body of post 2");
			
			postService.save(post1);
			postService.save(post2);
			
		}
		
	}

}

package com.rahul.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rahul.enity.PostEntity;

public interface PostRepo extends JpaRepository<PostEntity	, Integer> {

}

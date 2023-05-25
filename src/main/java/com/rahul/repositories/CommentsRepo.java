package com.rahul.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rahul.enity.CommentsEntity;

public interface CommentsRepo extends JpaRepository<CommentsEntity, Integer> {

}

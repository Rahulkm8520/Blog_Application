package com.rahul.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rahul.enity.UsersEntity;

public interface UsersRepo extends JpaRepository<UsersEntity, Integer> {

}

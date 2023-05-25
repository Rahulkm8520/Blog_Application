package com.rahul.enity;


import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
//import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name ="USER_TBL")
@Setter
@Getter
@NoArgsConstructor
public class UsersEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Integer userId;
	private String fname;
	private String lname;
	private String email;
	private String pwd;
	
	@OneToMany(mappedBy = "userEntity") //one user can have 
	private List<PostEntity> postEntity;

}

package com.rahul.enity;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name="COMMENT_TBL")
public class CommentsEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Integer id;
	
	private String name;
	
	private String email;
	
	@Lob
	private String content;
	
	@CreationTimestamp
	private LocalDate  createdOn;
	
	@ManyToOne
	//post table primery key  will be inserted comments table as a foreign key
	@JoinColumn(name="post_id")  
	private PostEntity postEntity;
	
	//when i delete the post then COmments also delted 
	@OneToMany(mappedBy ="postEntity", cascade =CascadeType.REMOVE)
	private List<CommentsEntity> commentsEntity;  

}

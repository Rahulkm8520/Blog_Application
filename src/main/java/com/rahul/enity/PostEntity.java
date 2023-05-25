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
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name="POST_TBL")
public class PostEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Integer postId;
	
	private String title;
	
	private String description;
	@Lob  //large object it is contain large amount of data
    private String content;
	
	@CreationTimestamp
	private LocalDate createdOn;
	  
	@UpdateTimestamp
	private LocalDate updatedOn;
	
	//user table primary key will be inserted in Post table as a foreign key
	@ManyToOne 
	@NotNull
	@JoinColumn(name="user_Id" ,referencedColumnName = "userId", nullable=false ) 
	private UsersEntity userEntity;
	
	//when i delete the post comments also be deleted 
	@OneToMany(mappedBy = "postEntity",cascade = CascadeType.REMOVE)
	private List<CommentsEntity> commentsEntity;
	
	
	
}

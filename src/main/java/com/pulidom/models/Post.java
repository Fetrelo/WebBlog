package com.pulidom.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "posts")
@Data
@NoArgsConstructor
public class Post {
		
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idPost;
	
	@Column(length = 50, nullable = false)
	private String title;
	
	@Column(length = 255, nullable = false)
	private String body;
	
	@Column
	@Temporal(TemporalType.DATE)
	private Date created;
	
	@Column
	@Temporal(TemporalType.DATE)
	private Date updated;

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
}

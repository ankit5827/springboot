package com.database.demo.pojo;

import javax.persistence.*;
@Entity
public class MarksDetails {
	@Id
	private Long markid;
	
	@ManyToOne
	 @JoinColumn(name = "student_id")
	private Student student;

	

}

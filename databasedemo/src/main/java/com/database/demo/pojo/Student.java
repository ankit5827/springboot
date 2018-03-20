package com.database.demo.pojo;

import java.util.Set;

import javax.persistence.*;
@Entity

public class Student {
	@Id
	private Long studentid;
	
	
	@OneToMany(mappedBy = "student", cascade = CascadeType.ALL)
	private Set<MarksDetails> marksDetails;

	private String name;

	public Long getStudentid() {
		return studentid;
	}

	public String getName() {
		return name;
	}

	public void setStudentid(Long studentid) {
		this.studentid = studentid;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	

}

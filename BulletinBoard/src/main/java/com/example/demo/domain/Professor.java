package com.example.demo.domain;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import java.util.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Entity
public class Professor {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer pid; 
	
	private String professorNum;
	private String professorName;
	private String professorEmail;
	private String professorId;
	private String professorPw;
	//전공코드FK
	@ManyToOne
	@JoinColumn(name="majorCode",nullable=false)
	private MajorCourse majorcourse;
	//board관련
	@OneToMany(mappedBy="professor", fetch=FetchType.EAGER)
	private List<Board> boardList = new ArrayList<Board>();
	/*
	public void setMajor(MajorCourse majorcourse) {
		this.majorcourse = majorcourse;
		majorcourse.getProfList().add(this);
	}
	*/
}

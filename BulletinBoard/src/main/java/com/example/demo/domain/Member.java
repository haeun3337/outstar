package com.example.demo.domain;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.sun.istack.NotNull;

import java.util.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Entity
public class Member {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long sid;//PK
	
	private String studentNum; //학번
	private String studentPw;
	private String studentEmail;
	private String studentName;
	//board관련
	@OneToMany(mappedBy="member", fetch=FetchType.EAGER)
	private List<Board> boardList = new ArrayList<Board>();
	//전공코드FK
	@NotNull
	@ManyToOne
	@JoinColumn(name="majorCode",nullable=false)
	private MajorCourse majorcourse;
	/*
	public void setMajor(MajorCourse majorcourse) {
		this.majorcourse = majorcourse;
		majorcourse.getMemList().add(this);
	}*/
}

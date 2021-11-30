package com.example.demo.domain;

import javax.persistence.Column;
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
	private String studentNum; //학번
	
	@Column(nullable = false)
	private String studentPw;
	@Column(nullable = false)
	private String studentEmail;
	@Column(nullable = false)
	private String studentName;
	
	//board관련
	@OneToMany(mappedBy="member", fetch=FetchType.EAGER)
	private List<SBoard> sboardList = new ArrayList<SBoard>();
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

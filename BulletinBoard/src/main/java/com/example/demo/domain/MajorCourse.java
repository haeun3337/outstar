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
public class MajorCourse {//전공entity
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer majorCode; //전공코드
	private String major; //전공학과
	/*
	@OneToMany(mappedBy="member", fetch=FetchType.EAGER)
	private List<Member> memList = new ArrayList<Member>();
	
	@OneToMany(mappedBy="professor", fetch=FetchType.EAGER)
	private List<Professor> profList = new ArrayList<Professor>();
	*/
}

package com.example.demo.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import java.util.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Entity
public class Subject { //과목명entity
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long subjectid; 
	private String subjectName;
	//강의평점

	//전공코드FK
//	@ManyToOne
//	@JoinColumn(name="majorCode",nullable=false)
//	private MajorCourse majorcourse;
	//담당교수FK
	@ManyToOne
	@JoinColumn(name="pid",nullable=false)
	private Professor professor;
}

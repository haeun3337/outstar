package com.example.demo.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import java.util.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Entity
public class Board {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long postNum; //PK
	@Column(updatable = false)
	private Long cnt = 0L;
	@Temporal(TemporalType.TIMESTAMP)
	@Column(updatable = false)
	private Date createDate = new Date();
	//회원FK
	@ManyToOne
	@JoinColumn(name="sid", nullable=false, updatable=false)
	private Member member;
	public void setMember(Member member) {
		this.member = member;
		member.getBoardList().add(this);
	}
	//교수FK
	@ManyToOne
	@JoinColumn(name="pid", nullable=false, updatable=false)
	private Professor professor;
	public void setProfessor(Professor professor) {
		this.professor = professor;
		professor.getBoardList().add(this);
	}
	//카테고리FK
	@ManyToOne
	@JoinColumn(name="CategoryCode", nullable=false, updatable=false)
	private Category category;
}

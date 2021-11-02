package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.example.demo.domain.*;
import com.example.demo.persistence.*;

@SpringBootTest
public class QueryMethodTest {
//	@Autowired
//	private MemberRepository memberRepo;
//	@Autowired
//	private BoardRepository boardRepo;
	@Autowired
	private MajorCourseRepository majorRepo;
	@Autowired
	private CategoryRepository categoryRepo;
	@Autowired
	private SubjectRepository subjectRepo;
	@Autowired
	private ProfessorRepository professorRepo;
	
//	@Test
//	public void categoryTest() {
//		Category category1 = new Category();
//		category1.setCategoryName("강의후기");
//		categoryRepo.save(category1);
//		
//		Category category2 = new Category();
//		category2.setCategoryName("족보공유");
//		categoryRepo.save(category2);
//		
//		Category category3 = new Category();
//		category3.setCategoryName("책공유");
//		categoryRepo.save(category3);
//	}
	
//	@Test//
//	public void subjectTest(){
//		Subject subj = new Subject();
//		subj.setSubjectName("일반화학");
//		subj.setProfessor(professorRepo.findByProfessorNum("123123").get(0));
//		subjectRepo.save(subj);
//	}
	
//	@Test
//	public void testCategory() {
//		
//	}
//	@Test
//	public void testProfessorInsert() {
//		Professor professor1 = new Professor();
//		professor1.setProfessorName("이만기");
//		professor1.setProfessorNum("123123");
//		professor1.setProfessorEmail("123123"+"@gmail.com");
//		professor1.setProfessorId("123123");
//		professor1.setProfessorPw("123123");
//		professor1.setMajorcourse(majorRepo.findByMajor("화학공학과").get(0));
//		professorRepo.save(professor1);
//	}
		

//		for (int i = 1; i <= 13; i++) {
//			Board board = new Board();
//			board.setMember(member1);
//			board.setTitle(member1.getName() + "가 등록한 게시글 " + i);
//			board.setContent(member1.getName() + "가 등록한 게시글 " + i);
//			boardRepo.save(board);
//		}
//				
//		for (int i = 1; i <= 3; i++) {
//			Board board = new Board();
//			board.setMember(member2);
//			board.setTitle(member2.getName() + "가 등록한 게시글 " + i);
//			board.setContent(member2.getName() + "가 등록한 게시글 " + i);
//			boardRepo.save(board);
//		}		
	}

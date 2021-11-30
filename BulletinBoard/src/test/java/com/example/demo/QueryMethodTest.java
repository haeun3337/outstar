package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.example.demo.domain.*;
import com.example.demo.persistence.*;

@SpringBootTest
public class QueryMethodTest {
	@Autowired
	private MemberRepository memberRepo;
	@Autowired
	private SBoardRepository sboardRepo;
	@Autowired
	private MajorCourseRepository majorRepo;
	@Autowired
	private CategoryRepository categoryRepo;
//	@Autowired
//	private SubjectRepository subjectRepo;
//	@Autowired
//	private ProfessorRepository professorRepo;
	
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
//	@Test 
//	public void testMajorInsert() {
//		String str[] = {"교양교육과", "컴퓨터공학과", "환경생명공학과"};
//		for(int i=0;i<str.length;i++) {
//			MajorCourse maj =  new MajorCourse();
//			maj.setMajorCode(i);
//			maj.setMajor(str[i]);
//			majorRepo.save(maj);
//		}
//	}
	
//	@Test
//	public void testMemberInsert() {
//		Member m = new Member();
//		m.setStudentName("이나연");
//		m.setStudentNum("101011");
//		m.setStudentEmail("101011"+"@gmail.com");
//		m.setStudentPw("101011");
//		m.setMajorcourse(majorRepo.findByMajor("환경생명공학과").get(0));
//		memberRepo.save(m);
//	}
	
//	@Test
//	public void testBoardInsert() {
//		for (int i = 1; i <= 3; i++) {
//			SBoard board = new SBoard();
//			Member member1=memberRepo.findById("101011").get();
//			board.setMember(member1);
//			board.setTitle(member1.getStudentName() + "가 등록한 게시글 " + i);
//			board.setContent(member1.getStudentName() + "가 등록한 게시글 " + i);
//			board.setCategory(categoryRepo.findById(2).get());
//			sboardRepo.save(board);
//		}	
//		
//		for (int i = 1; i <= 2; i++) {
//		SBoard board = new SBoard();
//		Member member2=memberRepo.findById("123123").get();
//		board.setMember(member2);
//		board.setTitle(member2.getStudentName() + "가 등록한 게시글 " + i);
//		board.setContent(member2.getStudentName() + "가 등록한 게시글 " + i);
//		board.setCategory(categoryRepo.findById(1).get());
//		sboardRepo.save(board);
//		
//		}
//	}

}

package com.example.demo.Controller;

import java.net.http.HttpRequest;
import java.util.Optional;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.domain.*;
import com.example.demo.persistence.*;

@Controller
@RequestMapping(path="/board")
public class StudentController {
//	@Autowired
//	ProfessorRepository professorRepo;
	@Autowired
	MemberRepository memberRepo;
	@Autowired
	SBoardRepository sboardRepo;
		
	//학생로그인
	@GetMapping("/s_login")
	public String sloginGet(){
		return "/board/s_login";
	}
	@PostMapping("/s_login")
    public String sloginPost(HttpSession session, String studentNum, String studentPw){
		//String msg = alertmsg(studentNum, studentPw);
		//model.addAttribute("msg", msg);
		//model.addAttribute("check", 0);
		//if (msg.equals("")) {			
		Iterable<Member> memList = memberRepo.findAll();
		for (Member m : memList) {
			if (studentNum.equals(m.getStudentNum()) && studentPw.equals(m.getStudentPw())) {
				//model.addAttribute(m);
				session.setAttribute("member", m);
				return "/board/s_main";//로그인 사용자 정보 가지고 이동
			}
		}
		//model.addAttribute("check", 1);
		//model.addAttribute("msg", "아이디 또는 비밀번호가 틀렸습니다.");
		return "/board/s_login";
		//}
		//check=1;
		//model.addAttribute("empty_alert",empty_info);
	}
		
	//학생회원가입
	@GetMapping("/s_join")
	public String sjoinGet() {
		return "/board/s_join";
	}
	@PostMapping("/s_join")
	public String sjoinPost(Member m) {
		memberRepo.save(m);
		System.out.println("member DB에 저장완료");
		return "redirect:s_login";//학생로그인페이지로 넘어가야함
	}

	//학생 메인페이지
	@GetMapping("/s_main")
	//public String mainGet(HttpServletRequest request, Model model) {
	public String smainGet(HttpSession session, Model model) {
		//세션이 없으면 홈으로 이동
//			HttpSession session = request.getSession(false);
//			if(session == null) {
//				return "/";
//			}
		//세션에 저장된 회원 조회
		//Member loginingMember =(Member)session.getAttribute(SessionConstants.LOGIN_MEMBER);
		//model.addAttribute("member", m);
		//Long sId=(Long)session.getAttribute("sid");
		//System.out.println(sId);
		Iterable<SBoard> sboardList=sboardRepo.findAll();
		model.addAttribute("sboardList", sboardList);
		return "/board/s_main";
	}
	
	@PostMapping("/s_main")
	public String smainPost(HttpSession session, Model model) {
		return "/board/s_main";
	}
	
	//학생정보수정페이지
	@GetMapping("/s_update")
	public String supdateGet() {
		return "/board/s_update";
	}
	@PostMapping("/s_update")
	public String supdatePost(Member member, HttpSession session) {
//		Member member=memberRepo.findById(sId).get();
		//System.out.println(member.getSid());
		Member m=memberRepo.findById(member.getStudentNum()).get();
		m.setStudentName(member.getStudentName());
		m.setStudentNum(member.getStudentNum());
		m.setStudentEmail(member.getStudentEmail());
		m.setStudentPw(member.getStudentPw());
		m.setMajorcourse(member.getMajorcourse());
		memberRepo.save(m);
		session.setAttribute("member", m);
		return "/board/s_update";
	}
}


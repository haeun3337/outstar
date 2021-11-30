package com.example.demo.Controller;

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
public class MainController {
//	@Autowired
//	ProfessorRepository professorRepo;
	@Autowired
	MemberRepository memberRepo;
	@Autowired
	SBoardRepository sboardRepo;
	@Autowired
	CategoryRepository cateRepo;
	
	//강의후기페이지
	@GetMapping("/review")
	public String reviewGet(Model model) {
		Iterable<SBoard> sboardList=sboardRepo.findAll();
		model.addAttribute("sboardList", sboardList);
//		for(SBoard sboard:sboardList) {
//			System.out.println(sboard.toString());
//		}
		return "/board/review";
	}
	@PostMapping("/review")
	public String reviewPost() {
		return "/board/review";
	}
//	@RequestMapping("/review")
//	public String getReview(Model model, SBoard sboard) {
//		<SBoard> sboardList=
//		return "/board/review";
//	}
	//강의자료페이지
	@GetMapping("/data")
	public String dataGet(Model model) {
		Iterable<SBoard> sboardList=sboardRepo.findAll();
		model.addAttribute("sboardList", sboardList);
		return "/board/data";
	}
	@PostMapping("/data")
	public String dataPost() {
		return "/board/data";
	}
	//강의자료글쓰기
	@GetMapping("/up_data")
	public String updataGet() {
		return "/board/up_data";
	}
	@PostMapping("/up_data")
	public String updataPost() {
		return "/board/up_data";
	}
	//책공유페이지
	@GetMapping("/share_book")
	public String shareGet(Model model) {
//		Category cate=cateRepo.findByCategoryName("책공유");
//		model.addAttribute("sboardList", cate.getSboardList());
		//Iterable<SBoard> sboardList=sboardRepo.findByCategoryName("책공유");
		//Iterable<SBoard> sboardList=sboardRepo.findAll();
		Iterable<SBoard> sboardList=sboardRepo.findAll();
		model.addAttribute("sboardList", sboardList);
		return "/board/share_book";
	}
	@PostMapping("/share_book")
	public String sharePost() {
		return "/board/share_book";
	}
	//책공유글쓰기
	@GetMapping("/up_book")
	public String upbookGet() {
		return "/board/up_book";
	}
	@PostMapping("/up_book")
	public String upbookPost() {
		return "/board/up_book";
	}
	//후기글쓰기
	@GetMapping("/up_review")
	public String upreviewGet() {
		return "/board/up_review";
	}
	@PostMapping("/up_review")
	public String upreviewPost() {
		return "/board/up_review";
	}
}

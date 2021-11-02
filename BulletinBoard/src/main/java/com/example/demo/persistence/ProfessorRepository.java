package com.example.demo.persistence;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.domain.MajorCourse;
import com.example.demo.domain.Member;
import com.example.demo.domain.Professor;

public interface ProfessorRepository extends CrudRepository<Professor, Integer> {
	List<Professor> findByProfessorNum(String searchword);
}
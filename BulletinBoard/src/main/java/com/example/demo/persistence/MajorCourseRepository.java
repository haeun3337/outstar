package com.example.demo.persistence;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.domain.MajorCourse;

public interface MajorCourseRepository extends CrudRepository<MajorCourse, Integer> {
	List<MajorCourse> findByMajor(String searchword);
}
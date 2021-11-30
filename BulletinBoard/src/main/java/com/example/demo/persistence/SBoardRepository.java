package com.example.demo.persistence;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.domain.SBoard;

public interface SBoardRepository extends CrudRepository<SBoard, Integer> {
	//List<SBoard> findByCategoryName(String search);
}
package com.example.demo.persistence;

import org.springframework.data.repository.CrudRepository;
import com.example.demo.domain.Subject;

public interface SubjectRepository extends CrudRepository<Subject, Long> {
}
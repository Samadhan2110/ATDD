package com.samlab.practiceapp.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.samlab.practiceapp.model.Student;

public interface StudentRepo extends JpaRepository<Student,Long>{

	

}

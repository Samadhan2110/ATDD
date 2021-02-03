package com.samlab.practiceapp.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.samlab.practiceapp.model.StudentProject;

public interface StudentProRepo extends JpaRepository<StudentProject,Long>{

}

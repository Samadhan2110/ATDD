package com.samlab.practiceapp.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.samlab.practiceapp.model.Project;

public interface ProjectRepo extends JpaRepository<Project,Long>{

}

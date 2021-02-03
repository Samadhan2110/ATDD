package com.samlab.practiceapp.model;

import javax.persistence.Entity;
import javax.persistence.Table;
@Entity
@Table(name = "StudentsProjects")
public class StudentProject {
	private String StudentNo;
	private String PrjNo;
	private String Designation;
	private String PrimaryKey=StudentNo+PrjNo+Designation;
	private String ForeignKey=StudentNo;
	private String getStudentNo() {
		return StudentNo;
	}
	private void setStudentNo(String studentNo) {
		StudentNo = studentNo;
	}
	private String getPrjNo() {
		return PrjNo;
	}
	private void setPrjNo(String prjNo) {
		PrjNo = prjNo;
	}
	private String getDesignation() {
		return Designation;
	}
	private void setDesignation(String designation) {
		Designation = designation;
	}
	@Override
	public String toString() {
		return "StudentProject [StudentNo=" + StudentNo + ", PrjNo=" + PrjNo + ", Designation=" + Designation
				+ ", PrimaryKey=" + PrimaryKey + ", ForeignKey=" + ForeignKey + "]";
	}
	
}

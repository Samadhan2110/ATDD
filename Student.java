package com.samlab.practiceapp.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "STUDENT")
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
private String StudentNo;
private String StudentName;
private Date Dobirth;
private Date Dojoin;
private String getStudentNo() {
	return StudentNo;
}
private void setStudentNo(String studentNo) {
	StudentNo = studentNo;
}
private String getStudentName() {
	return StudentName;
}
private void setStudentName(String studentName) {
	StudentName = studentName;
}
private Date getDobirth() {
	return Dobirth;
}
private void setDobirth(Date dobirth) {
	Dobirth = dobirth;
}
private Date getDojoin() {
	return Dojoin;
}
private void setDojoin(Date dojoin) {
	Dojoin = dojoin;
}
@Override
public String toString() {
	return "Student [StudentNo=" + StudentNo + ", StudentName=" + StudentName + ", Dobirth=" + Dobirth + ", Dojoin="
			+ Dojoin + "]";
}


}

package com.samlab.practiceapp.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "Projects")
public class Project {
	private String ProjectNo;
	private String ProjectName;
	private Integer Duration;
	private String Platform;
	private String getProjectNo() {
		return ProjectNo;
	}
	private void setProjectNo(String projectNo) {
		ProjectNo = projectNo;
	}
	private String getProjectName() {
		return ProjectName;
	}
	private void setProjectName(String projectName) {
		ProjectName = projectName;
	}
	private Integer getDuration() {
		return Duration;
	}
	private void setDuration(Integer duration) {
		Duration = duration;
	}
	private String getPlatform() {
		return Platform;
	}
	private void setPlatform(String platform) {
		Platform = platform;
	}
	@Override
	public String toString() {
		return "Project [ProjectNo=" + ProjectNo + ", ProjectName=" + ProjectName + ", Duration=" + Duration
				+ ", Platform=" + Platform + "]";
	}
	
}

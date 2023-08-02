package com.ktdsuniversity.scoresystem.classroom;

import java.util.List;

public class ClassroomVO {
	
	private String subject;
	private String classroomName;
	private String student;
	
	public ClassroomVO() {
		
	}

	public ClassroomVO(String subject, String classroomName, String student) {
		super();
		this.subject = subject;
		this.classroomName = classroomName;
		this.student = student;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getClassroomName() {
		return classroomName;
	}

	public void setClassroomName(String classroomName) {
		this.classroomName = classroomName;
	}

	public String getStudent() {
		return student;
	}

	public void setStudent(String student) {
		this.student = student;
	}
	
	
	
	
}

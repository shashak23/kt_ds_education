package com.ktdsuniversity.scoresystem.school;

import java.util.List;

public class SchoolVO {
	private List classRomm;
	private List subject;
	private List student;
	public SchoolVO(List classRomm, List subject, List student) {
		super();
		this.classRomm = classRomm;
		this.subject = subject;
		this.student = student;
	}
	public List getClassRomm() {
		return classRomm;
	}
	public void setClassRomm(List classRomm) {
		this.classRomm = classRomm;
	}
	public List getSubject() {
		return subject;
	}
	public void setSubject(List subject) {
		this.subject = subject;
	}
	public List getStudent() {
		return student;
	}
	public void setStudent(List student) {
		this.student = student;
	}
	
	

}

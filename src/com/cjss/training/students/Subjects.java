package com.cjss.training.students;
public class Subjects {
	private String subjectNo;
	private String subjectName;

	public String getSubjectNo() {
		return subjectNo;
	}

	public void setSubjectNo(String subjectNo) {
		this.subjectNo = subjectNo;
	}

	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	public Subjects(String subjectNo, String subjectName) {
		super();
		this.subjectNo = subjectNo;
		this.subjectName = subjectName;
	}

	@Override
	public String toString() {
		return "Subjects [subjectNo=" + subjectNo + ", subjectName=" + subjectName + "]";
	}

}
package com;

public class Subject {
	
	private int id;	
	private String subject;
	private int class_id;
	private Teacher teacher;
	
	public Subject() {
		super();
	}
	public Subject(int id, String subject, int class_id, Teacher teacher) {
		super();
		this.id = id;
		this.subject = subject;
		this.class_id = class_id;
		this.teacher = teacher;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public int getClass_id() {
		return class_id;
	}
	public void setClass_id(int class_id) {
		this.class_id = class_id;
	}
	public Teacher getTeacher() {
		return teacher;
	}
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
	@Override
	public String toString() {
		return "Subject [id=" + id + ", subject=" + 
	subject + ", class_id=" + class_id + ", teacher=" + teacher + "]";
	}
}

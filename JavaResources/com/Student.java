package com;

public class Student {
	
	private int id;	
	private int adm_no;	
	private String stu_name;
	private int class_id;
	
	public Student() {
		super();
	}
	public Student(int id, int adm_no, String stu_name, int class_id) {
		super();
		this.id = id;
		this.adm_no = adm_no;
		this.stu_name = stu_name;
		this.class_id = class_id;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAdm_no() {
		return adm_no;
	}
	public void setAdm_no(int adm_no) {
		this.adm_no = adm_no;
	}
	public String getStu_name() {
		return stu_name;
	}
	public void setStu_name(String stu_name) {
		this.stu_name = stu_name;
	}
	public int getClass_id() {
		return class_id;
	}
	public void setClass_id(int class_id) {
		this.class_id = class_id;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", adm_no=" + adm_no + ", stu_name=" + 
	stu_name + ", class_id=" + class_id + "]";
	}
}


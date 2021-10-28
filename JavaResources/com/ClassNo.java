package com;

import java.util.ArrayList;
import java.util.List;

public class ClassNo {
	
	private int id;
	private int class_id;
	List<Subject> sublist = new ArrayList<>();
	
	public ClassNo() {
		super();
	}
	public ClassNo(int id, int class_id, List<Subject> sublist) {
		super();
		this.id = id;
		this.class_id = class_id;
		this.sublist = sublist;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getClass_id() {
		return class_id;
	}
	public void setClass_id(int class_id) {
		this.class_id = class_id;
	}
	public List<Subject> getSublist() {
		return sublist;
	}
	public void setSublist(List<Subject> sublist) {
		this.sublist = sublist;
	}

	@Override
	public String toString() {
		return "ClassNo [id=" + id + ", class_id=" + class_id + ", sublist=" + sublist + "]";
	}

}

package com.glearning.pg.model;

public class DepartmentSuper {
	public String departmentName() {
		String s = "Department Super";
		return s;
	}
 
	public String getTodaysWork() {
		String s1 = "No Work as of now";
		return s1;
	}
	
	public String getWorkDeadline() {
		String s2 = "Nil";
		return s2;
	}
	
	public String isTodayAHoliday() {
		String s3 = "Today is not a holiday";
		return s3;
	}
}
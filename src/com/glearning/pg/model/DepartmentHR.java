package com.glearning.pg.model;

public class DepartmentHR extends DepartmentSuper {
	public String departmentName() {
		String s = "Department HR";
		return s;
	}
 
	public String getTodaysWork() {
		String s1 = "Fill today’s timesheet and mark your attendance";
		return s1;
	}
	
	public String getWorkDeadline() {
		String s2 = "Complete by EOD";
		return s2;
	}
	
	public String doActivity() {
		String s4 = "team Lunch";
		return s4;
	}

}
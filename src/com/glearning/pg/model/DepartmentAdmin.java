package com.glearning.pg.model;

public class DepartmentAdmin extends DepartmentSuper {
	public String departmentName() {
		String s = "Department Admin";
		return s;
	}
 
	public String getTodaysWork() {
		String s1 = "Complete your documents Submission";
		return s1;
	}
	
	public String getWorkDeadline() {
		String s2 = "Complete by EOD";
		return s2;
	}

}
package com.glearning.pg.service;
import com.glearning.pg.model.*;

public class Driverclass {

	public static void main(String[] args) {
		DepartmentAdmin a = new DepartmentAdmin();
		System.out.println("Welcome to "+ a.departmentName());
		System.out.println(a.getTodaysWork());
		System.out.println(a.getWorkDeadline());
		System.out.println(a.isTodayAHoliday());
		System.out.println("          ");
		
		DepartmentHR h = new DepartmentHR();
		System.out.println("Welcome to "+ h.departmentName());
		System.out.println(h.doActivity());
		System.out.println(h.getTodaysWork());
		System.out.println(h.getWorkDeadline());
		System.out.println(h.isTodayAHoliday());
		System.out.println("          ");
		
		DepartmentTech t = new DepartmentTech();
		System.out.println("Welcome to "+ t.departmentName());
		System.out.println(t.getTodaysWork());
		System.out.println(t.getWorkDeadline());
		System.out.println(t.getTechStackInformation());
		System.out.println(t.isTodayAHoliday());
	}

}

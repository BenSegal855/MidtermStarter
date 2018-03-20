package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.UUID;

import org.junit.BeforeClass;
import org.junit.Test;

public class Student_Test {

	private static ArrayList<Course> courses = new ArrayList<Course>();
	private static ArrayList<Semester> semesters = new ArrayList<Semester>();
	private static ArrayList<Section> sections = new ArrayList<Section>();
	
	@BeforeClass
	public static void setup() {
		courses.add(new Course(UUID.randomUUID(),"CISC 181", 3));
		courses.add(new Course(UUID.randomUUID(),"CPEG 202", 3));
		courses.add(new Course(UUID.randomUUID(),"MATH 242", 4));
		
		semesters.add(new Semester(UUID.randomUUID(), new Date(117, 8, 29), new Date(117, 12, 16)));
		semesters.add(new Semester(UUID.randomUUID(), new Date(118, 2, 5), new Date(118, 5, 24)));
		
		sections.add(new Section(courses.get(0).getCourseID(), semesters.get(0).getSemesterID(), UUID.randomUUID(), 205));
		sections.add(new Section(courses.get(1).getCourseID(), semesters.get(0).getSemesterID(), UUID.randomUUID(), 203));
		sections.add(new Section(courses.get(2).getCourseID(), semesters.get(0).getSemesterID(), UUID.randomUUID(), 206));
		sections.add(new Section(courses.get(0).getCourseID(), semesters.get(1).getSemesterID(), UUID.randomUUID(), 205));
		sections.add(new Section(courses.get(1).getCourseID(), semesters.get(1).getSemesterID(), UUID.randomUUID(), 203));
		sections.add(new Section(courses.get(2).getCourseID(), semesters.get(1).getSemesterID(), UUID.randomUUID(), 206));
	}

	@Test
	public void test() {
		assertEquals(1, 1);
	}
}
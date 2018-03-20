package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.UUID;

import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eMajor;

public class Student_Test {

	private static ArrayList<Course> courses = new ArrayList<Course>();
	private static ArrayList<Semester> semesters = new ArrayList<Semester>();
	private static ArrayList<Section> sections = new ArrayList<Section>();
	private static ArrayList<Enrollment> enrollments = new ArrayList<Enrollment>();
	private static ArrayList<Student> students = new ArrayList<Student>();
	
	@BeforeClass
	public static void setup() {
		//Creating courses
		courses.add(new Course(UUID.randomUUID(),"CISC 181", 3));
		courses.add(new Course(UUID.randomUUID(),"CPEG 202", 3));
		courses.add(new Course(UUID.randomUUID(),"MATH 242", 4));
		
		//Creating semesters
		semesters.add(new Semester(UUID.randomUUID(), new Date(117, 8, 29), new Date(117, 12, 16)));
		semesters.add(new Semester(UUID.randomUUID(), new Date(118, 2, 5), new Date(118, 5, 24)));
		
		//Creating sections
		sections.add(new Section(courses.get(0).getCourseID(), semesters.get(0).getSemesterID(), UUID.randomUUID(), 205));
		sections.add(new Section(courses.get(1).getCourseID(), semesters.get(0).getSemesterID(), UUID.randomUUID(), 203));
		sections.add(new Section(courses.get(2).getCourseID(), semesters.get(0).getSemesterID(), UUID.randomUUID(), 206));
		sections.add(new Section(courses.get(0).getCourseID(), semesters.get(1).getSemesterID(), UUID.randomUUID(), 205));
		sections.add(new Section(courses.get(1).getCourseID(), semesters.get(1).getSemesterID(), UUID.randomUUID(), 203));
		sections.add(new Section(courses.get(2).getCourseID(), semesters.get(1).getSemesterID(), UUID.randomUUID(), 206));
		
		//Creating students
		try
		{
			students.add(new Student("Ben", "Richard", "Segal", new Date(99,5,18),
					eMajor.COMPSI, "438B George Read", "(012)-345-6789",
					"bensegal@udel.edu"));
			students.add(new Student("Cen", "Sichard", "Tegal", new Date(99,5,18),
					eMajor.BUSINESS, "438B George Read", "(012)-345-6789",
					"bensegal@udel.edu"));
			students.add(new Student("Den", "Tichard", "Uegal", new Date(99,5,18),
					eMajor.CHEM, "438B George Read", "(012)-345-6789",
					"bensegal@udel.edu"));
			students.add(new Student("En", "Uichard", "Vegal", new Date(99,5,18),
					eMajor.NURSING, "438B George Read", "(012)-345-6789",
					"bensegal@udel.edu"));
			students.add(new Student("Fen", "Vichard", "Wegal", new Date(99,5,18),
					eMajor.PHYSICS, "438B George Read", "(012)-345-6789",
					"bensegal@udel.edu"));
			students.add(new Student("Gen", "Wichard", "Xegal", new Date(99,5,18),
					eMajor.COMPSI, "438B George Read", "(012)-345-6789",
					"bensegal@udel.edu"));
			students.add(new Student("Hen", "Xichard", "Yegal", new Date(99,5,18),
					eMajor.BUSINESS, "438B George Read", "(012)-345-6789",
					"bensegal@udel.edu"));
			students.add(new Student("Ien", "Yichard", "Zegal", new Date(99,5,18),
					eMajor.CHEM, "438B George Read", "(012)-345-6789",
					"bensegal@udel.edu"));
			students.add(new Student("Jen", "Zichard", "Aegal", new Date(99,5,18),
					eMajor.NURSING, "438B George Read", "(012)-345-6789",
					"bensegal@udel.edu"));
			students.add(new Student("Ken", "Aichard", "Begal", new Date(99,5,18),
					eMajor.PHYSICS, "438B George Read", "(012)-345-6789",
					"bensegal@udel.edu"));
		} catch (PersonException e)
		{
			fail();
		}
		
		//Enrolling students
		for(int i = 0; i < sections.size(); i++)
		{
			for(int j = 0; j < students.size(); j++)
			{
				enrollments.add(new Enrollment(sections.get(i).getSectionID(), students.get(j).getStudentID()));
			}
		}
		
		//Creating and setting grades
		for(int i = 0; i < enrollments.size(); i++)
		{
				enrollments.get(i).setGrade(90);	
		}
	}

	@Test
	public void test() {
		assertEquals(1, 1);
	}
	
	
	
	
	
}
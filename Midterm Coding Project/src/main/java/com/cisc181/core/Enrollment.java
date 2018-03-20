package com.cisc181.core;

import java.util.UUID;

public class Enrollment
{
	private UUID SectionID, StudentID, EnrollmentID;
	private double Grade;
	
	private Enrollment()
	{
		super();
	}

	public Enrollment(UUID sectionID, UUID studentID)
	{
		super();
		SectionID = sectionID;
		StudentID = studentID;
		
		EnrollmentID = UUID.randomUUID();
	}

	public void setGrade(double grade)
	{
		Grade = grade;
	}

	public double getGrade()
	{
		return Grade;
	}

	public UUID getSectionID()
	{
		return SectionID;
	}

	public UUID getStudentID()
	{
		return StudentID;
	}

	public UUID getEnrollmentID()
	{
		return EnrollmentID;
	}
	
	
}

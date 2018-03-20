package com.cisc181.core;

import static org.junit.Assert.*;

import com.cisc181.core.Staff;
import com.cisc181.eNums.eTitle;
import java.util.Date;

import java.util.ArrayList;
import java.util.Calendar;

import org.junit.BeforeClass;
import org.junit.Test;

public class Staff_Test {
	
	private static ArrayList<Staff> Staffers = new ArrayList<Staff>();
	
	@BeforeClass
	public static void setup() {
		
		try
		{
			Staffers.add(new Staff("Bert", "R", "Gibbons", new Date(70,1,1), 
					"Kirkbride 205", "(012)-345-6789", "bgibbons@udel.edu", 
					"Thursday afternoon", 1, 260000, new Date(112,11,1), eTitle.MR));
			Staffers.add(new Staff("Cert", "S", "Hibbons", new Date(70,1,1), 
				"Kirkbride 205", "(012)-345-6789", "bgibbons@udel.edu", 
				"Monday afternoon", 1, 250000, new Date(112,11,1), eTitle.MR));
			Staffers.add(new Staff("Dert", "T", "Ibbons", new Date(70,1,1), 
				"Kirkbride 205", "(012)-345-6789", "bgibbons@udel.edu", 
				"Tuesday afternoon", 1, 270000, new Date(112,11,1), eTitle.MR));
			Staffers.add(new Staff("Ert", "U", "Jibbons", new Date(70,1,1), 
				"Kirkbride 205", "(012)-345-6789", "bgibbons@udel.edu", 
				"Wednesday afternoon", 1, 280000, new Date(112,11,1), eTitle.MR));
			Staffers.add(new Staff("Fert", "V", "Kibbons", new Date(70,1,1), 
				"Kirkbride 205", "(012)-345-6789", "bgibbons@udel.edu", 
				"Friday afternoon", 1, 240000, new Date(112,11,1), eTitle.MR));
		} catch (PersonException e)
		{
			fail();
		}
		
	}
	
	@Test
	public void test() {
		
		assertEquals(getAvgSal(), 260000, 0.01);
		
		//Bad age
		try
		{
			Staffers.add(new Staff(" Old Bert", "R", "Gibbons", new Date(-90,1,1), 
					"Kirkbride 205", "(012)-345-6789", "bgibbons@udel.edu", 
					"Thursday afternoon", 1, 260000, new Date(112,11,1), eTitle.MR));
			fail();
		} catch (PersonException e)
		{
			assertTrue(true);
		}
		
		//Bad phone
		try
		{
			Staffers.add(new Staff("Dont call Bert", "R", "Gibbons", new Date(70,1,1), 
					"Kirkbride 205", "12345678", "bgibbons@udel.edu", 
					"Thursday afternoon", 1, 260000, new Date(112,11,1), eTitle.MR));
			fail();
		} catch (PersonException e)
		{
			assertTrue(true);
		}
	}
	
	private double getAvgSal()
	{
		double avarage = 0;
		
		for(int i = 0; i < Staffers.size(); i++)
		{
			avarage += Staffers.get(i).getSalary();
		}
		
		avarage = avarage/Staffers.size();
		
		return avarage;
	}

}

package be.abis.courseadmin.model;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Course 
{
	//Declaration of variables
	private String courseTitle;
	private int courseDays;
	private double coursePriceDay;
	private boolean coursePriorKnowledge;
	private List<Instructor> courseInstructors = new ArrayList<Instructor>();
		
	//Constructor
	public Course(String courseTitle, int courseDays, double coursePriceDay, boolean coursePriorKnowledge)
	{
		this.courseTitle = courseTitle;
		this.courseDays = courseDays;
		this.coursePriceDay = coursePriceDay;
		this.coursePriorKnowledge = coursePriorKnowledge;
	}
	
	//Constructor
	public Course()
	{
		//empty constructor method
	}
	
	//public method calculateTotalPrice
	public double calculateTotalPrice()
	{
		double totalPrice = courseDays * coursePriceDay;
		if (!(coursePriceDay > 3 && coursePriorKnowledge == true))
		{
			totalPrice *= 1.21;
		}
				
		return totalPrice;
	}
	
	//public method printInfo
	public void printInfo()
	{
		try 
		{
			File myPrintInfoFile = new File("courseInfo-" +this.courseTitle+ ".txt");
			if (myPrintInfoFile.createNewFile())
			{
				FileWriter myPrintInfoWriter = new FileWriter("courseInfo-" +this.courseTitle+ ".txt");
			    myPrintInfoWriter.write("The course " +this.courseTitle+ " takes " +this.courseDays+ " days for " +this.coursePriceDay+ " per day and prior knowledge is " +this.coursePriorKnowledge+ "." + "\r\n");
			    myPrintInfoWriter.write("The total price of this course is " +this.calculateTotalPrice()+ " euro." + "\r\n"); 
			    myPrintInfoWriter.write("The course is labeled as " +this.getLabelCourse()+ "\r\n"); 
			    myPrintInfoWriter.write("This course has " +this.courseInstructors.size()+ " instructors." + "\r\n");
		        if (courseInstructors.size() > 0) 
		        {
		            myPrintInfoWriter.write("The instructors for this course are: " + "\r\n");		            
		        }
		        for (int i=0;i<courseInstructors.size();i++)
			    {
		        	myPrintInfoWriter.write(courseInstructors.get(i).toString() + "\r\n");
			    }
			  myPrintInfoWriter.close();
			  System.out.println("File created successfully: " + myPrintInfoFile.getName());
		    } 
			else
			{
				System.out.println("The file courseInfo-" +this.courseTitle+ ".txt already exists.");
		    }
		} 
		catch (IOException expPrintInfoFile) 
		{
			System.out.println("An error occurred.");
			expPrintInfoFile.printStackTrace();
		}
				
	}
	
	public String getLabelCourse()
	{
		// Label the course based on the "priceDay"
		if (this.coursePriceDay < 500.00)
		{
			return "Cheap";
		}
		else if (this.coursePriceDay >= 500.00 && this.coursePriceDay <= 1500.00)
		{
			return "Ok";
		}
		else
		{
			return "Expensive";
		}	
	}
	
	public void addInstructor(Instructor newInstructor)
	{
		this.courseInstructors.add(newInstructor);
	}

	public String getCourseTitle() {
		return courseTitle;
	}

	public void setCourseTitle(String courseTitle) {
		this.courseTitle = courseTitle;
	}

	public int getCourseDays() {
		return courseDays;
	}

	public void setCourseDays(int courseDays) {
		this.courseDays = courseDays;
	}

	public double getCoursePriceDay() {
		return coursePriceDay;
	}

	public void setCoursePriceDay(double coursePriceDay) {
		this.coursePriceDay = coursePriceDay;
	}

	public boolean isCoursePriorKnowledge() {
		return coursePriorKnowledge;
	}

	public void setCoursePriorKnowledge(boolean coursePriorKnowledge) {
		this.coursePriorKnowledge = coursePriorKnowledge;
	}	
}


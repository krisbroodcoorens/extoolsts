package be.abis.courseadmin.model;

import java.io.FileWriter;
import java.io.IOException;

public class Instructor
{
	private String firstName;
	private String lastName;
	private int age;
	private int startAge;
	private double startSalary;	
	
	public Instructor(String firstName, String lastName, int age, int startAge, double startSalary)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.startAge = startAge;
		this.startSalary = startSalary;		
	}
	
	public Instructor()
	{
		//Empty constructor method
	}

	public String getFirstName() 
	{
		return firstName;
	}

	public void setFirstName(String firstName) 
	{
		this.firstName = firstName;
	}

	public String getLastName() 
	{
		return lastName;
	}

	public void setLastName(String lastName) 
	{
		this.lastName = lastName;
	}

	public int getAge() 
	{
		return age;
	}

	public void setAge(int age) 
	{
		this.age = age;
	}

	public int getStartAge() 
	{
		return startAge;
	}

	public void setStartAge(int startAge) 
	{
		this.startAge = startAge;
	}

	public double getStartSalary() 
	{
		return startSalary;
	}

	public void setStartSalary(double startSalary)
	{
		this.startSalary = startSalary;
	}	
	
	public void displaySalaryHistory () 
	{
		int increasedAge = startAge;
		double increasedSalary = startSalary;
		int currentAge = age;

		while (increasedAge <= currentAge && (increasedAge - startAge) <= 35 )
		{
			System.out.println("Salary of " + firstName + " at " + increasedAge + " is " + increasedSalary + "\n");
			increasedAge += 5;
			increasedSalary *= 1.03;
		}
		System.out.println("Maximum Salary reached for " +firstName+ " " +lastName);  
	} 
	
	public void printSalaryHistory () 
	{
		int increasedAge = startAge;
		double increasedSalary = startSalary;
		int currentAge = age;
		
		try 
		{
			FileWriter mySalaryHistoryWriter = new FileWriter("salaryHistory-" +firstName+".txt");
			while (increasedAge <= currentAge && (increasedAge - startAge) <= 35 )
			{
				mySalaryHistoryWriter.write("Salary of " + firstName + " at " + increasedAge + " is " + increasedSalary + "\n");
				increasedAge += 5;
				increasedSalary *= 1.03;
			}
			mySalaryHistoryWriter.write("Maximum Salary reached for " +firstName);
			System.out.println("Successfully create file salaryHistory-" +firstName+ ".txt");
			mySalaryHistoryWriter.close();		
		}
		catch(IOException expSalaryHistory) 
		{
			System.out.println("Error writing file salaryHistory.txt");			
		}	  
	} 
	
}

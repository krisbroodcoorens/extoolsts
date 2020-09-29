package be.abis.courseadmin.model;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.Period;

public class Instructor
{
	private String firstName;
	private String lastName;
	private LocalDate birthday;
	private int startAge;
	private double startSalary;	
	
	public Instructor(String firstName, String lastName, LocalDate birthday, int startAge, double startSalary)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthday = birthday;
		this.startAge = startAge;
		this.startSalary = startSalary;		
	}
	
	public Instructor()
	{
		//Empty constructor method
	}

	public String toString ()  
	{
		return firstName+ " " +lastName+ " - " +birthday+ " - " +startSalary  ;
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

	public LocalDate getBirthday() 
	{
		return birthday;
	}

	public void setBirthDay (LocalDate birthday) 
	{
		this.birthday = birthday;
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
		LocalDate today = LocalDate.now();
		int currentAge = Period.between(birthday, today).getYears();

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
		printSalaryHistory ("salaryHistory-" +firstName+".txt");  
	} 
	
	public void printSalaryHistory (String fileName) 
	{
		int increasedAge = startAge;
		double increasedSalary = startSalary;
		LocalDate today = LocalDate.now();
		int currentAge = Period.between(birthday, today).getYears();
		
		try 
		{
			FileWriter mySalaryHistoryWriter = new FileWriter(fileName+ ".txt");
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

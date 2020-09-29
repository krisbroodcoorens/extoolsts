package be.abis.exercisea6.model;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.Period;

public class Person 
{
	int personNumber;
	String firstName;
	String lastName;
	LocalDate birthDay;
	Company company;
	
	//Constructor
	public Person (int personNumber, String firstName, String lastName, LocalDate birthDay, Company company) {
		this.personNumber = personNumber;
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthDay = birthDay;
		this.company = company;
	}
	
	//Constructor
	public Person (int personNumber, String firstName, String lastName, LocalDate birthDay) {
		this.personNumber = personNumber;
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthDay = birthDay;
	}
	
	public int getPersonNumber() {
		return personNumber;
	}
	
	public void setPersonNumber(int personNumber) {
		this.personNumber = personNumber;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public LocalDate getBirthDay() {
		return birthDay;
	}
	
	public void setBirthDay(LocalDate birthDay) {
		this.birthDay = birthDay;
	}	
	
	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	public String toString() {
		return firstName+ " " +lastName+ " (" +calculateAge()+ " years old)";
	}
	
	public int calculateAge() {
		LocalDate today = LocalDate.now();
		int currentAge = Period.between(birthDay, today).getYears();
		return currentAge;
	}	
	
	public void printInfo()
	{
		try 
		{
			File myPersonInfoFile = new File("personinfo.txt");
			FileWriter myPrintInfoWriter = new FileWriter("personinfo.txt", true);
		    if (this.getCompany() == null) 
		    {
		    	myPrintInfoWriter.write(this+ " is not employed for the moment." +System.lineSeparator());		            
		    }
		    else
		    {
		     	myPrintInfoWriter.write(this+ " works for " +this.getCompany() +System.lineSeparator());
		    }
			myPrintInfoWriter.close();
			System.out.println("Record written successfully in " + myPersonInfoFile.getName());
		} 
		catch (IOException expPrintInfoFile) 
		{
			System.out.println("An error occurred.");
			expPrintInfoFile.printStackTrace();
		}
				
	}
}

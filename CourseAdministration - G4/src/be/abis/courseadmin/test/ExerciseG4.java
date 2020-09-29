package be.abis.courseadmin.test;

import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;

import be.abis.courseadmin.model.Course;
import be.abis.courseadmin.model.Instructor;

public class ExerciseG4
{
	public static void main(String[] args)
	{
		//Declare "myFirstInstructor"
		Instructor myFirstInstructor = new Instructor("Patrick", "Van Overveldt", LocalDate.parse("1965-11-01"), 27, 2500.0);
		myFirstInstructor.printSalaryHistory(myFirstInstructor.getFirstName()+ " " + myFirstInstructor.getLastName());	
				
		//Declare "mySecondInstructor"
		Instructor mySecondInstructor = new Instructor("Kris", "Broodcoorens", LocalDate.parse("1983-04-11"), 21, 1290.0);
		//Calculate & print salary history for "mySecondInstructor in separate file"
		mySecondInstructor.printSalaryHistory(mySecondInstructor.getFirstName()+ " " + mySecondInstructor.getLastName());
		
		//Declare "myThirdInstructor"
		Instructor myThirdInstructor = new Instructor("Tom", "Blomme", LocalDate.parse("1974-07-09"), 23, 2000.0);
		//Calculate & print salary history for "myThirdInstructor in separate file"
		myThirdInstructor.printSalaryHistory(myThirdInstructor.getFirstName()+ " " + myThirdInstructor.getLastName());
		
		//Declare "firstCourse" 
		Course myFirstCourse = new Course("Java", 18, 750.0, false);
		myFirstCourse.addInstructor(myFirstInstructor);
		myFirstCourse.addInstructor(mySecondInstructor);
		myFirstCourse.addInstructor(myThirdInstructor);
		myFirstCourse.printInfo();
				
		//Declare "mySecondCourse"
		Course mySecondCourse = new Course("ReactJS", 20, 550.0, false);
		mySecondCourse.addInstructor(myFirstInstructor);
		mySecondCourse.addInstructor(mySecondInstructor);
		mySecondCourse.printInfo();
		
		//Declare "myThirsCourse"
		Course myThirdCourse = new Course("Python", 15, 350.0, true);
		myThirdCourse.addInstructor(myFirstInstructor);
		myThirdCourse.addInstructor(mySecondInstructor);
		myThirdCourse.addInstructor(myThirdInstructor);
		myThirdCourse.printInfo();
		
	}
}
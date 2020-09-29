package be.abis.courseadmin.test;

import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
import be.abis.courseadmin.model.Course;
import be.abis.courseadmin.model.Instructor;

public class ExerciseG1G2
{
	public static void main(String[] args)
	{
		//Declare "myFirstInstructor"
		Instructor myFirstInstructor = new Instructor("Patrick", "Van Overveldt", 52, 27, 2500.0);
		myFirstInstructor.printSalaryHistory();	
		myFirstInstructor.printSalaryHistory(myFirstInstructor.getFirstName()+ " " + myFirstInstructor.getLastName());	
				
		//Declare "mySecondInstructor"
		Instructor mySecondInstructor = new Instructor("Kris", "Broodcoorens", 37, 21, 1290.0);
		//Calculate & print salary history for "mySecondInstructor in separate file"
		mySecondInstructor.printSalaryHistory();
		mySecondInstructor.printSalaryHistory(mySecondInstructor.getFirstName()+ " " + mySecondInstructor.getLastName());
		
		//Declare "myThirdInstructor"
		Instructor myThirdInstructor = new Instructor("Tom", "Blomme", 45, 23, 2000.0);
		//Calculate & print salary history for "myThirdInstructor in separate file"
		myThirdInstructor.printSalaryHistory();
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
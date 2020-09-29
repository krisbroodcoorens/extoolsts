package be.abis.exercisea6.test;

import java.time.LocalDate;
import be.abis.exercisea6.model.*;

public class ExerciseA6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Declare "myFirsAddress"
		Address myFirstAddress = new Address("Warandeberg", "1", "1000", "Brussels", "Belgium", "BE");
		
		//Declare "mySecondAddress"
		Address mySecondAddress = new Address("Veldstraat", "1", "9000", "Ghent", "Belgium", "BE");
		
		//Declare "myFirstCompany"
		Company myFirstCompany = new Company("BNP Paribas Fortis", myFirstAddress);
				
		//Declare "mySecondCompany"
		Company mySecondCompany = new Company("Ikea", mySecondAddress);
		
		//Declare "myFirstPerson"
		Person myFirstPerson = new Person(1234, "Jonathan", "De Medina", LocalDate.parse("1990-11-01"), myFirstCompany);
		
		//Declare "mySecondPerson"
		Person mySecondPerson = new Person(5678, "Christophe", "Bataille", LocalDate.parse("1987-05-23"));
		
		//Print info "myFirstPerson"
		myFirstPerson.printInfo();
		
		//Print info "mySecondPerson"
		mySecondPerson.printInfo();		
	}

}

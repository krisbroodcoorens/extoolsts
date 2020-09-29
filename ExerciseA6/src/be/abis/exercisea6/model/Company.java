package be.abis.exercisea6.model;

public class Company 
{
	//Declaration of variables
	String name;
	Address address; 

	//Constructor
	public Company (String name, Address address) {
		this.name = name;	
		this.address = address;
	}	
	
	public String toString() {
		return name+ " in " +address.town+ ".";
	}
		
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}	
		
}

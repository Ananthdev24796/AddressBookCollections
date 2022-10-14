/**
 * 
 */
package com.bridgelabz;

/**
 * @author Iam_A
 *
 */
public class Contact {

	String firstName;
	String lastName;
	String address;
	String city;
	String state;
	String zip;
	String phoneNumber;
	String emailId;
	public Contact(String firstName, String lastName, String address, String city, String state, String zip,
			String phoneNumber, String emailId) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.phoneNumber = phoneNumber;
		this.emailId = emailId;
	}	
	public void displaData() {
		System.out.println("\nFirst Name : "+firstName);
		System.out.println("Last Name : "+lastName);
		System.out.println("Address : "+address);
		System.out.println("City : "+city);
		System.out.println("State : "+state);
		System.out.println("Zip : "+zip);
		System.out.println("Phone Number : "+phoneNumber);
		System.out.println("Email Id : "+emailId);
	}

}

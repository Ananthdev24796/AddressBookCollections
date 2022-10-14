/**
 * 
 */
package com.bridgelabz;

/**
 * @author Iam_A
 *
 */
 /*Ability to create a Contacts in Address Book with first and last names,
 *  address, city, state, zip, phone number and email...
 */
public class AddressBook {
	String firstName;
	String lastName;
	String address;
	String city;
	String state;
	String zip;
	String phoneNumber;
	String emailId;	

	public AddressBook(String firstName, String lastName, String address, String city, String state, String zip,
			String phoneNumber, String emailId) {
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



/**
 * 
 */
package com.bridgelabz;

import java.util.Scanner;

/**
 * @author Iam_A
 *
 */
public class AddressBookMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String firstName;
		String lastName;
		String address;
		String city;
		String state;
		String zip;
		String phoneNo;
		String email;
		
		
		System.out.println("Welcome to Address Book");
		System.out.print("Enter first name : ");
		firstName = input.nextLine();
		System.out.print("Enter last name :  ");
		lastName = input.nextLine();
		System.out.print("Enter address :  ");
		address = input.nextLine();
		System.out.print("Enter state :  ");
		state = input.nextLine();
		System.out.print("Enter city :  ");
		city = input.nextLine();
		System.out.print("Enter zip :  ");
		zip = input.nextLine();
		System.out.print("Enter phoneNo :  ");
		phoneNo = input.nextLine();
		System.out.print("Enter email :  ");
		email = input.nextLine();		
		
		Contact contactPerson = new Contact(firstName, lastName, address, city, state, zip, phoneNo, email);
		contactPerson.displaData();
		AddressBook addressBook = new AddressBook();
		addressBook.addContacts(contactPerson);
		
		input.close();

	}

}

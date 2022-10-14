/**
 * 
 */
package com.bridgelabz;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Iam_A
 *
 */
 /*UC3
  * Ability to edit existing contact person using their name
 */
public class AddressBook {
	 
	ArrayList<Contact> contactList = new ArrayList<Contact>();
	static int index=0;
	Scanner input = new Scanner(System.in);
	String firstName;
	String lastName;
	String address;
	String city;
	String state;
	String zip;
	String phoneNo;
	String email;
	
	public void addContacts() {
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
		contactList.add(contactPerson);
		index++;
	}
	public void editPersonName() {
		int check=0;
		System.out.println("\nEnter current name of person to edit name");
		String currentName = input.nextLine();
		System.out.println("Enter name to update");
		String updateName = input.nextLine();
		
		for(int i=0; i < index; i++) {
			if(contactList.get(i).firstName.equals(currentName)) {
				contactList.get(i).firstName = updateName;
				check=1;
				System.out.println(check);
				return;
			}
		}
		
		if(check==0) {
			System.out.println("No record found with given name");
		}
	}	
	public void displayAddressBook() {
		System.out.println("Displaying all contacts from address book");
		for(int i=0; i < index; i++) {
			contactList.get(i).displaData();
		}
	}
	


}



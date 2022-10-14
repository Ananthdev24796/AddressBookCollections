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
 /*UC-8
  *Ability to search Person in a City or State across the multiple AddressBook
 */
public class AddressBook {
	 
	ArrayList<Contact> contactList = new ArrayList<Contact>();
	static int index=0;
	Scanner input = new Scanner(System.in);
	String firstName1;
	String lastName1;
	String address1;
	String city1;
	String state1;
	String zip1;
	String phoneNo1;
	String email1;
	
	public void addContacts() {
		System.out.println("Welcome to Address Book");
		System.out.print("Enter first name : ");
		firstName1 = input.nextLine();
		System.out.print("Enter last name :  ");
		lastName1 = input.nextLine();
		System.out.print("Enter address :  ");
		address1 = input.nextLine();
		System.out.print("Enter state :  ");
		state1 = input.nextLine();
		System.out.print("Enter city :  ");
		city1 = input.nextLine();
		System.out.print("Enter zip :  ");
		zip1 = input.nextLine();
		System.out.print("Enter phoneNo :  ");
		phoneNo1 = input.nextLine();
		System.out.print("Enter email :  ");
		email1 = input.nextLine();
		Contact contactPerson = new Contact(firstName1, lastName1, address1, city1, state1, zip1, phoneNo1, email1);
		if(contactList.isEmpty()) {
			contactList.add(contactPerson);
		}
		else {
			for(int i=0;i<contactList.size();i++) {
				if(contactList.get(i).firstName.equals(firstName1)&&contactList.get(i).lastName.equals(lastName1)) {
					System.out.println("Contact already Exist");
					break;
					
				}
				else {
					contactList.add(contactPerson);
					
				}
			}
		}
		
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
	public void deleteContact() {
		
		System.out.println("\nEnter name of person to delete contact");
		String name = input.nextLine();
		for(int i=0; i <contactList.size(); i++) {	
			if(contactList.get(i).firstName.equals(name)) {
				contactList.remove(i);
				break;
			}
		}
		}
	

	public void displayAddressBook() {
		System.out.println("Displaying all contacts from address book");
		for(int i=0; i < contactList.size(); i++) {
			contactList.get(i).displaData();
		}
	}
	
	public void displayPersonInCity(String cityName) {
		int found=0;
		for(int i=0; i <contactList.size(); i++) {	
			if(contactList.get(i).city.equalsIgnoreCase(cityName)) {
				found=1;
				System.out.println("Person Name : "+contactList.get(i).firstName + " "+contactList.get(i).lastName);
			}
		}
		if(found==0) {
			System.out.println("No person found in given city");
		}
	}
	
	//Search for person in state
	public void displayPersonInState(String stateName) {
		int found=0;
		for(int i=0; i <contactList.size(); i++) {	
			if(contactList.get(i).state.equalsIgnoreCase(stateName)) {
				found=1;
				System.out.println("Person Name : "+contactList.get(i).firstName + " "+contactList.get(i).lastName);
			}
		}

	}
}



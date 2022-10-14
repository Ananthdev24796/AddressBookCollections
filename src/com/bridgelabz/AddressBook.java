/**
 * 
 */
package com.bridgelabz;

import java.util.ArrayList;

/**
 * @author Iam_A
 *
 */
 /*UC2
  * Ability to add a new Contact to Address Book - Use Console to add person details from AddressBookMain class
  - Use Object Oriented Concepts to managerelationship between AddressBook and Contact Person
 */
public class AddressBook {
	 
	ArrayList<Contact> contactList = new ArrayList<Contact>();
	
	public void addContacts(Contact contactPerson) {
		contactList.add(contactPerson);
	}
	


}



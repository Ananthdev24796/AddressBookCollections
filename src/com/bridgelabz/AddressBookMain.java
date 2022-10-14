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
		AddressBook addressBook1 = new AddressBook();	
		int choice =1;
		
		while (choice!=0){         
            switch (choice){
                case 0:
                    return;                   
                case 1:
                    addressBook1.addContacts();
                    break;
                case 2:
                    addressBook1.editPersonName();
                    break;   
                case 3:
                	addressBook1.displayAddressBook();
                	break;
            }
            
            System.out.println("Press 0 to exit \nPress 1 to add more contact \nPress 2 to edit contact \nPress 3 to display");
            choice = input.nextInt();
        }
		
		input.close();
	}
}

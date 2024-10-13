

import java.util.Scanner;

public class Main {
	 public static void main(String[] args) {
		 
		 //creates scanner to ask user for file path
		 Scanner scnr = new Scanner(System.in);
	     System.out.print("Enter file: ");
	     String filename = scnr.nextLine();
	     
		 //created an instance of ContactManager
		 ContactManager contactManager = new ContactManager();
		  
		 //Use contactManageer to read file 
		 contactManager.readContactsFromFile(filename);
		  
		 //displays the file that is read
		 contactManager.displayAllContacts();
		
		 
		 //closes scanner
		 scnr.close();
	 }
}

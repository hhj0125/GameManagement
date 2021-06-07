package gui;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.InputMismatchException;
import java.util.Scanner;

import log.EventLogger;

public class GameManager {
	static EventLogger Logger = new EventLogger("log.txt");
	
   public static void main(String[] args) {
	   
	   Scanner input = new Scanner(System.in);
	   UserManager userManager = getObject("usermanager.ser");
	   if(userManager == null) {
		   userManager = new UserManager(input);
	   }
	   
	   WindowFrame frame = new WindowFrame();
	   selectMenu(input, userManager);
	   putObject(userManager, "usermanager.ser");
	}
   


    public static void selectMenu(Scanner input, UserManager userManager) {
	   int num = -1;
       while (num != 5) {
    	   try {
        	showMenu();
		num = input.nextInt();
		if (num == 1) {
			userManager.addUser();
			Logger.log("add a user");
		}
		else if (num == 2) {
			userManager.deleteUser();
			Logger.log("delete a user");
		}
		else if (num == 3) {
			userManager.editUser();
			Logger.log("edit a user");
		}
		else if (num == 4) {
			userManager.viewUsers();
			Logger.log("edit a list of user");
		}
		else {
			continue;
		}
    	   }  
    	   
    	   catch(InputMismatchException e) {
    		   System.out.println("Please put 1~5");
    		   if(input.hasNext()) {
    			   input.next();
    		   }		   
    		   num = -1;
    		   
    	   }
       }
    }

   
   public static void showMenu() {
	    System.out.println("1. Add User");
		System.out.println("2. Delete User");
		System.out.println("3. Edit User");
		System.out.println("4. View User");
		System.out.println("5. Exit");
		System.out.println("Select one number betwwn 1-6:");
   }
   
   public static UserManager getObject(String filename) {
	   UserManager userManager = null;
	   try { 
		   FileInputStream file = new FileInputStream(filename);
	       ObjectInputStream in = new ObjectInputStream(file);
	       
	       userManager = (UserManager) in.readObject();
	       
	       in.close();
	       file.close();
	       
	       
   } catch (FileNotFoundException e) {
	   return userManager;
   
   } catch (IOException e) {
	   e.printStackTrace();
   } catch (ClassNotFoundException e) {
	   e.printStackTrace();
   }
	   
	   return userManager;
   
}
   
   public static void putObject(UserManager userManager, String filename) {
	   try { 
		   FileOutputStream file = new FileOutputStream(filename);
	       ObjectOutputStream out = new ObjectOutputStream(file);
	       
	       out.writeObject(userManager);
	       
	       out.close();
	       file.close();
	       
	       
   } catch (FileNotFoundException e) {
	   e.printStackTrace();
   
   } catch (IOException e) {
	   e.printStackTrace();
   }
	   
   
}
}
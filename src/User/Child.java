package User;

import java.util.Scanner;

public class Child extends User {
	public void getUserInput(Scanner input) {
		System.out.println("This is for Child");
		System.out.print("User ID:");
		int id = input.nextInt();
		this.setId(id);
		
		System.out.print("User name:");
		String name = input.next();
		this.setName(name);
		
		System.out.print("User job:");
		String job = input.next();
		this.setJob(job);
		
		System.out.print("User LV:");
        int lv = input.nextInt();
        this.setLv(lv);
        
        char answer = 'x';
        while  (answer != 'y' && answer != 'Y'  && answer != 'n'  && answer != 'N') {
        System.out.print("Do you have phone? (Y/N)");
        answer = input.next().charAt(0);
        if(answer == 'y' || answer == 'Y') {
        	 System.out.print("User phonenumber");
             int phone = input.nextInt();
             this.setPhone(phone);
             break;
        }
        else if (answer == 'n' || answer == 'N') {
        	this.setPhone(0);
        	break;
        }
        else {       	
        }
        }

        System.out.print("When User Start?");    
        int day = input.nextInt();   
        this.setDay(day);
	
	}
}

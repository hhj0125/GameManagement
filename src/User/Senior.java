package User;

import java.util.Scanner;

public class Senior extends User implements UserInput {
	
	public Senior(UserKind kind) {
		super(kind);
	}
	
	public void getUserInput(Scanner input) {
		System.out.println("This is for Senior");	
		
		
		 char answer = 'x';
	        while  (answer != 'y' && answer != 'Y'  && answer != 'n'  && answer != 'N') {
	        System.out.print("Do you need enlarge mode? (Y/N)");
	        answer = input.next().charAt(0);
	        if(answer == 'y' || answer == 'Y') {
	        	 System.out.println("enlarge mode on");
	             break;
	        }
	        else if (answer == 'n' || answer == 'N') {
	        	System.out.println("enlarge mode off");
	        	break;
	        }
	        else {       	
	        }
	        }
	        
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
        
        System.out.print("User phonenumber");
        int phone = input.nextInt();
        this.setPhone(phone);                 

        System.out.print("When User Start?");    
        int day = input.nextInt();   
        this.setDay(day);
	
	}
	
	 public void printInfo() {
	    	String skind = "none";
	    	switch(this.kind) {
	    	case Child:
	    		skind = "Child";
	    		break;
	    	case Adult:
	    		skind = "Adult";
	    		break;
	    	case Senior:
	    		skind = "Senior";
	    		break;
	    	default:
	    	}
	    	System.out.println("kind:" + skind + "id: " + id + ", name: " + name);
	    	System.out.println("job: " + job + ", lv: " + lv);
	    	System.out.println("phone: " + phone + ", day: " + day);
	    }
	   
}

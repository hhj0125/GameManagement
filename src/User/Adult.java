package User;

import java.util.Scanner;

public class Adult extends User implements UserInput {
	
	public Adult(UserKind kind) {
		super(kind);
	}
	public void getUserInput(Scanner input) {
		System.out.println("This is for Adult");
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
		 String skind = getKindString();    	
	    	System.out.println("kind:" + skind + "id: " + id + ", name: " + name);
	    	System.out.println("job: " + job + ", lv: " + lv);
	    	System.out.println("phone: " + phone + ", day: " + day);
	    }
	 
	 public String getKindString() {
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
	    	return skind;
	 }
}
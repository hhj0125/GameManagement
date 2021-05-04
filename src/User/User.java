package User;

import java.util.Scanner;

public class User {
	protected UserKind kind = UserKind.Adult;
	protected int id;
	protected String name;
	protected String job;
	protected int lv;
	protected int phone;
	protected int phone2;
	protected int day;
	
	public User() {
	}
	
	public User(UserKind kind) {
		this.kind = kind;
	}
	
	
	public User(int id, String name, String job, int lv, int phone, int day)	{
		this.id = id;
		this.name = name;
		this.job = job;
		this.lv = lv;
		this.phone = phone;
		this.day = day;
		
	}
	
	public User(UserKind kind, int id, String name, String job, int lv, int phone, int day)	{
		this.kind = kind;
		this.id = id;
		this.name = name;
		this.job = job;
		this.lv = lv;
		this.phone = phone;
		this.day = day;
		
	}
	
	public User(UserKind kind, int id, String name, String job, int lv, int phone, int phone2, int day)	{
		this.kind = kind;
		this.id = id;
		this.name = name;
		this.job = job;
		this.lv = lv;
		this.phone = phone;
		this.phone2 = phone2;
		this.day = day;
		
	}
	
	public UserKind getKind() {
		return kind;
	}


	public int getId() {
		return id;
	}


	public String getName() {
		return name;
	}


	public String getJob() {
		return job;
	}


	public int getLv() {
		return lv;
	}


	public int getPhone() {
		return phone;
	}
	
	public int getPhone2() {
		return phone2;
	}


	public int getDay() {
		return day;
	}


	public void setKind(UserKind kind) {
		this.kind = kind;
	}


	public void setId(int id) {
		this.id = id;
	}


	public void setName(String name) {
		this.name = name;
	}


	public void setJob(String job) {
		this.job = job;
	}


	public void setLv(int lv) {
		this.lv = lv;
	}


	public void setPhone(int phone) {
		this.phone = phone;
	}
	
	public void setPhone2(int phone2) {
		this.phone2 = phone2;
	}


	public void setDay(int day) {
		this.day = day;
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
    	
    	
    	
    	
    	
	public void EditInfo() {
    	System.out.printf("1 : id " + " 2 : name " + " 3 : job " + " 4 : lv " + " 5 : phone " + " 6 : day ");
		
	}
	
	public void getUserInput(Scanner input) {
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
	

		
	
}

			
	


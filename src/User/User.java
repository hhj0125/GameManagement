package User;

import java.util.Scanner;

public abstract class  User {
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
	
	public abstract void printInfo();
	
}

			
	


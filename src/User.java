
public class User {
	int id;
	String name;
	String job;
	int lv;
	int phone;
	int day;
	
	public User() {
	}
	
	
	public User(int id, String name, String job, int lv, int phone, int day)	{
		this.id = id;
		this.name = name;
		this.job = job;
		this.lv = lv;
		this.phone = phone;
		this.day = day;
		
	}

    public void printInfo() {
    	System.out.println("id: " + id + ", name: " + name);
    	System.out.println("job: " + job + ", lv: " + lv);
    	System.out.println("phone: " + phone + ", day: " + day);
    }
	public void EditInfo() {
    	System.out.printf("1 : id " + " 2 : name " + " 3 : job " + " 4 : lv " + " 5 : phone " + " 6 : day ");
		
	}
	
	
}

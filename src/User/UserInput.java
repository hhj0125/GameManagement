package User;

import java.util.Scanner;

public interface UserInput {
	
	public int getId();

	public void setId(int id);
	
	public void setName(String name);
	
	public void setJob(String job);

	public void setLv(int lv);

	public void setPhone(int phone);
	
	public void setPhone2(int phone2);

	public void setDay(int day);
	
	public void getUserInput(Scanner input);
	
	public void printInfo();

}

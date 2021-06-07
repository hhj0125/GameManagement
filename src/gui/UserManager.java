package gui;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import User.Adult;
import User.Child;
import User.Senior;
import User.User;
import User.UserInput;
import User.UserKind;

public class UserManager implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -2406884363412594901L;
	ArrayList<UserInput> users = new ArrayList<UserInput>();
	transient Scanner input;
	

	
	UserManager(Scanner input) {
		this.input = input;
	}
	
	public void addUser() {
		int kind = 0;
		Scanner input2 = new Scanner(System.in);
		UserInput userInput;
		while (kind !=1 && kind != 2 && kind !=3) { 
		  try {
		System.out.println("Select User Kind:");
		System.out.println("1 for Child:");
		System.out.println("2 for Adult:");
		System.out.println("3 for Senior:");
		kind = input2.nextInt();
		if (kind == 1) {
			userInput = new Child(UserKind.Child);
			userInput.getUserInput(input2);
			users.add(userInput);
			break;
		}
		else if (kind == 2) {
			userInput = new Adult(UserKind.Adult);
			userInput.getUserInput(input2);
			users.add(userInput);
			break;
		}
		else if (kind == 3) {
			userInput = new Senior(UserKind.Senior);
			userInput.getUserInput(input2);
			users.add(userInput);
			break;
		}
		
		else {
			System.out.print("Select num 1~3");
		}
	}

	catch(InputMismatchException e) {
	 System.out.println("Please put 1~3");
	  if(input.hasNext()) {
	 	 input.next();
	 	 kind = -1;
	 		   }
	}
		}
}
    
		
	
	
	public void deleteUser() {
		Scanner input2 = new Scanner(System.in);
		System.out.print("User ID:");
		int UserId = input2.nextInt();
		int index = findIndex(UserId);
		removefromUser(index, UserId);
			
	}
		
	public int findIndex(int UserId) {
		int index = -1;
		for (int i = 0; i<users.size(); i++) {
			if (users.get(i).getId() == UserId) {
				index = i;				
				break;
			}
	
		}
		return index;
	}
	
	
	
	
	public int removefromUser(int index, int UserId) {	
	    if (index >= 0) {
		users.remove(index);
		System.out.println("User" + UserId + "deleted");
		return 1;
		}
		else {
				System.out.println("none User");
				return -1;
		}
	}
	public void editUser() {
		Scanner input2 = new Scanner(System.in);
		System.out.print("User ID:");
		int UserId = input2.nextInt();
		for (int i = 0; i<users.size(); i++) {
			UserInput User = users.get(i);
		if (User.getId() == UserId) {
			System.out.println("User edits");
			System.out.printf("1 : id " + " 2 : name " + " 3 : job " + " 4 : lv " + " 5 : phone " + " 6 : day ");
			int a = input2.nextInt();
			if(a == 1) {
				setUserID(User, input2);
			}
			
				else if(a == 2) {
					setUserName(User, input2);
				}
			
				else if(a == 3) {
					setUserJob(User, input2);
				}
			
				else if(a == 4) {
					setUserLv(User, input2);
				}
			
				else if(a == 5) {
					setUserPhone(User, input2);
				}
			
				else if(a == 6) {
					setUserDay(User, input2);
				}
			
			
		} // if
	}	// for
}
	public void viewUsers() {
//		System.out.print("User ID:");
//		int UserId = input.nextInt();
		System.out.println("# of registered Users:" + users.size());
		for (int i = 0; i<users.size(); i++) {
			users.get(i).printInfo();		
		}
	}
	
	public void setUserID(UserInput User, Scanner input) {
		System.out.println("Edit id");
		int id = input.nextInt();
		User.setId(id);
	}
	
	public void setUserName(UserInput User, Scanner input) {
		System.out.println("Edit name");
		String name = input.next();
		User.setName(name);
		}
	
	
	public void setUserJob(UserInput User, Scanner input) {
		System.out.println("Edit job");
		String job = input.next();
		User.setJob(job);
	}
	
	public void setUserLv(UserInput User, Scanner input) {
		System.out.println("Edit lv");
		int Lv = input.nextInt();
		User.setLv(Lv);
	}
	
	public void setUserPhone(UserInput User, Scanner input) {
		System.out.println("Edit phone");
		int phone = input.nextInt();
		User.setPhone(phone);
	}
	
	public void setUserDay(UserInput User, Scanner input) {
		System.out.println("Edit day");
		int day = input.nextInt();
		User.setDay(day);
	}
	
}



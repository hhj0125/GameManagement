import java.util.ArrayList;
import java.util.Scanner;

import User.Adult;
import User.Child;
import User.Senior;
import User.User;
import User.UserKind;

public class UserManager {
	ArrayList<User> users = new ArrayList<User>();
	Scanner input;
	UserManager(Scanner input) {
		this.input = input;
	}
	
	public void addUser() {
		int kind = 0;
		User user;
		while (kind !=1 && kind != 2 && kind !=3) {
		System.out.println("Select User Kind:");
		System.out.println("1 for Child:");
		System.out.println("2 for Adult:");
		System.out.println("3 for Senior:");
		kind = input.nextInt();
		if (kind == 1) {
			user = new Child(UserKind.Child);
			user.getUserInput(input);
			users.add(user);
			break;
		}
		else if (kind == 2) {
			user = new Adult(UserKind.Adult);
			user.getUserInput(input);
			users.add(user);
			break;
		}
		else if (kind == 3) {
			user = new Senior(UserKind.Senior);
			user.getUserInput(input);
			users.add(user);
			break;
		}
		else {
			System.out.print("Select num 1~3");
		}
		}
				
	}
	
	public void deleteUser() {
		System.out.print("User ID:");
		int UserId = input.nextInt();
		int index = -1;
		for (int i = 0; i<users.size(); i++) {
			if (users.get(i).getId() == UserId) {
				index = i;				
				break;
			}
		}
		if (index >= 0) {
			users.remove(index);
			System.out.println("User" + UserId + "deleted");
		}
		else {
				System.out.println("none User");
				return;
		

		}
		
	
	}
	public void editUser() {
		System.out.print("User ID:");
		int UserId = input.nextInt();
		for (int i = 0; i<users.size(); i++) {
			User user = users.get(i);
		if (user.getId() == UserId) {
			System.out.println("User edits");
			user.EditInfo();
			int a = input.nextInt();
			if(a == 1) {
				System.out.println("Edit id");
				int id = input.nextInt();
				user.setId(id);
			}
				else if(a == 2) {
				System.out.println("Edit name");
				String name = input.next();
				user.setName(name);
				}
				else if(a == 3) {
					System.out.println("Edit job");
					String job = input.next();
					user.setJob(job);
				}
				else if(a == 4) {
					System.out.println("Edit lv");
					int Lv = input.nextInt();
					user.setLv(Lv);
				}
				else if(a == 5) {
					System.out.println("Edit phone");
					int phone = input.nextInt();
					user.setPhone(phone);
				}
				else if(a == 6) {
					System.out.println("Edit day");
					int day = input.nextInt();
					user.setDay(day);
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

}

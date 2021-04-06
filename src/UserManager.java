import java.util.Scanner;

public class UserManager {
	User user;
	Scanner input;
	UserManager(Scanner input) {
		this.input = input;
	}
	
	public void addUser() {
		user = new User();
		System.out.print("User ID:");
		user.id = input.nextInt();
		System.out.print("User name:");
		user.name = input.next();
		System.out.print("User job:");
		user.job = input.next();
		System.out.print("User LV:");
        user.lv = input.nextInt();
        System.out.print("User phonenumber");
        user.phone = input.nextInt();
        System.out.print("When User Start?");
        user.day = input.nextInt();
		
	}
	public void deleteUser() {
		System.out.print("User ID:");
		int UserId = input.nextInt();
		if (user == null) {
			System.out.println("none User");
			return;
		}
		if (user.id == UserId) {
			user = null;
			System.out.println("User deleted");
			
			
		}
	
	}
	public void editUser() {
		System.out.print("User ID:");
		int UserId = input.nextInt();
		if (user.id == UserId) {
			System.out.println("User edits");
			user.EditInfo();
			int a = input.nextInt();
			if(a == 1) {
				System.out.println("Edit id");
				user.id = input.nextInt();
			}
				else if(a == 2) {
				System.out.println("Edit name");
				user.name = input.next();
				}
				else if(a == 3) {
					System.out.println("Edit job");
					user.job = input.next();
				}
				else if(a == 4) {
					System.out.println("Edit lv");
					user.lv = input.nextInt();
				}
				else if(a == 5) {
					System.out.println("Edit phone");
					user.phone = input.nextInt();
				}
				else if(a == 6) {
					System.out.println("Edit day");
					user.day = input.nextInt();
				}
			
			
		}
	}
	public void viewUser() {
		System.out.print("User ID:");
		int UserId = input.nextInt();
		if (user.id == UserId) {
			user.printInfo();
		}
	}

}

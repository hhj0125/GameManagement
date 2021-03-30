

import java.util.Scanner;

public class GameManager {

	public static void main(String[] args) {
		int num = 0;
		Scanner input = new Scanner(System.in);

        while (num != 6) {		
		System.out.println("1. Add User");
		System.out.println("2. Delete User");
		System.out.println("3. Edit User");
		System.out.println("4. View User");
		System.out.println("5. Show a Menu");
		System.out.println("6. Exit");
		System.out.println("Select one number betwwn 1-6:");
		num = input.nextInt();
		if (num == 1) {
			addUser();
		}
		else if (num == 2) {
			deleteUser();
		}
		else if (num == 3) {
			editUser();
		}
		else if (num == 4) {
			viewUser();
		}
		else {
			continue;
			
		  }
		}
	}
	public static void addUser() {
		Scanner input = new Scanner(System.in);
		System.out.print("User ID:");
		int UserId = input.nextInt();
		System.out.print("User name:");
		String Username = input.next();
		System.out.print("User class");
		String Userclass = input.next();
		System.out.print("User LV:");
        int UserLV = input.nextInt();
        System.out.print("User phonenumber");
        int phone = input.nextInt();
        System.out.print("When User Start?");
        int day = input.nextInt();
		
	}
	public static void deleteUser() {
		Scanner input = new Scanner(System.in);
		System.out.print("User ID:");
		int UserId = input.nextInt();
	
	}
	public static void editUser() {
		Scanner input = new Scanner(System.in);
		System.out.print("User ID:");
		int UserId = input.nextInt();
	}
	public static void viewUser() {
		Scanner input = new Scanner(System.in);
		System.out.print("User ID:");
		int UserId = input.nextInt();
	}
	
}

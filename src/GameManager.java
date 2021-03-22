

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
		switch(num) {
		case 1:
			System.out.print("User Id:");
			int Id = input.nextInt();
			System.out.print("User Name:");
			String Name = input.next();
			System.out.print("User Level");
			int LV = input.nextInt();
			System.out.print("User Class");
			String Class = input.next();
			break;
		case 2:
			System.out.print("Delete Id:");	
			int DeleteId = input.nextInt();
			break;
		case 3:
			System.out.print("Edit Id:");
			int EditId = input.nextInt();
			break;
		case 4:
			System.out.print("View Id:");
			int ViewId = input.nextInt();
		case 5:
		case 6: break;
			
		  }
		}
	}
}

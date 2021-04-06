import java.util.Scanner;

public class GameManager {
   public static void main(String[] args) {
	   Scanner input = new Scanner(System.in);
	   UserManager userManager = new UserManager(input);
	   
		int num = -1;

        while (num != 5) {		
		System.out.println("1. Add User");
		System.out.println("2. Delete User");
		System.out.println("3. Edit User");
		System.out.println("4. View User");
		System.out.println("5. Exit");
		System.out.println("Select one number betwwn 1-6:");
		num = input.nextInt();
		if (num == 1) {
			userManager.addUser();
		}
		else if (num == 2) {
			userManager.deleteUser();
		}
		else if (num == 3) {
			userManager.editUser();
		}
		else if (num == 4) {
			userManager.viewUser();
		}
		else {
			continue;
			
		  }
		}
	}
}

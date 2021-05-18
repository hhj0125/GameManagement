import java.util.InputMismatchException;
import java.util.Scanner;

public class GameManager {
   public static void main(String[] args) {
	   Scanner input = new Scanner(System.in);
	   UserManager userManager = new UserManager(input);
	   
	   selectMenu(input, userManager);
	}


    public static void selectMenu(Scanner input, UserManager userManager) {
	   int num = -1;
       while (num != 5) {
    	   try {
        	showMenu();
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
			userManager.viewUsers();
		}
		else {
			continue;
		}
    	   }  
    	   
    	   catch(InputMismatchException e) {
    		   System.out.println("Please put 1~5");
    		   if(input.hasNext()) {
    			   input.next();
    		   }		   
    		   num = -1;
    		   
    	   }
       }
    }

   
   public static void showMenu() {
	    System.out.println("1. Add User");
		System.out.println("2. Delete User");
		System.out.println("3. Edit User");
		System.out.println("4. View User");
		System.out.println("5. Exit");
		System.out.println("Select one number betwwn 1-6:");
   }
   
   
}

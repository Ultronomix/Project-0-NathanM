package ultranomics.quartercollectionapplicationv0.common.screens;

import java.util.Scanner;
import ultranomics.quartercollectionapplicationv0.common.util.LogInAttempt;

public class LogInMenu {
    static String menuText = 
            "----------------------------\n"+
            "Log In Menu\n"+
            "Please follow the prompts:\n";
    static Scanner input = new Scanner(System.in);// scanner for user input
    static String usernameInput = null;
    static String passwordInput = null;
    static boolean exitWatcher = false;
    static boolean usernameMatch = false;
    static boolean passwordMatch = false;
    static boolean userIdentified = false;
    static short userIDNum;
    
    public static void menu(){
        System.out.println(menuText);
        
        do{
            System.out.println("Username: ");
            usernameInput = input.nextLine();

            System.out.println("Password: ");
            passwordInput = input.nextLine();

            userIDNum = LogInAttempt.attempt(usernameInput, passwordInput);
            
            if(userIDNum == 0){
                System.out.println("\nUsername and Password do not match any known users");
                System.out.println("Would you like to try again? Y/N");

                String response = input.nextLine();
                response = response.toLowerCase();

                switch (response.charAt(0)) {
                    case 'y':
                        //the loop will reiterate
                        break;
                    case 'n':
                        //this will break out of the loop and return us to the WelcomeMenu
                        userIdentified = true;
                        break;
                    default:
                        System.out.println("Response not recognized. Make sure to reply Y or N");
                        //the loop will reiterate with input correction message to user
                        break;
                }
            }else{
                //if LogInAttempt is successful the returned UserIDNumber will 
                //match the account of our user, allowing us to access their 
                //collections
                CollectionSelectionMenu.menu(userIDNum);
            }
            
        }while(userIdentified != true);
    }
}

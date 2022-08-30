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
    static short userIDNum;
    
    public static void menu(){
        System.out.println(menuText);
        
        System.out.print("Username: ");
        usernameInput = input.nextLine();
        
        System.out.println("password: ");
        passwordInput = input.nextLine();
        
        userIDNum = LogInAttempt.attempt(usernameInput, passwordInput);
    }
}

package ultranomics.quartercollectionapplicationv0.common.screens;

import java.util.InputMismatchException;
import java.util.Scanner;

public class WelcomeMenu {
    static String menuText = 
            "----------------------------\n"+
            "Welcome to QuarterCollector!\n"+
            "Please select from the options below:\n"+
            "1] Log In\n"+
            "2] New User\n"+
            "3] Exit\n"+
            ">";
    static Scanner input = new Scanner(System.in);// scanner for user input
    static int menuInput = 0;
    static boolean exitWatcher = false;
    static boolean inputValidation = false;
    
    public static void menu(){
        do{
            try{
                do{
                    System.out.println(menuText);
                    
                    // where the possible exception could throw
                    menuInput = input.nextInt();
                    input.nextLine();//consume new line character
                    
                    //loop escape once proper input is obtained
                    if(menuInput >= 1 && menuInput <=3){
                        inputValidation = true; 
                    }else{
                        System.out.println("Input Error: input must be in range listed above (1-3)\n");
                    }
                }while(inputValidation == false);
            }catch(InputMismatchException e){
                input.nextLine();//consume new line character
                System.out.println("Input Error: input must be numeric (1,2,3 ect)\n");
            }
            
            switch(menuInput){
                case 1:
                    LogInMenu.menu();
                    break;
                case 2:
                    RegistrationMenu.menu();
                    break;
                case 3:
                    System.out.println("Goodbye!");
                    exitWatcher = true;
                    break;
            }
        }while(exitWatcher == false);
    }
    
}



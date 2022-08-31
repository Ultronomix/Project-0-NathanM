package ultranomics.quartercollectionapplicationv0.common.screens;

import java.util.Scanner;
import ultranomics.quartercollectionapplicationv0.Collector;
import ultranomics.quartercollectionapplicationv0.common.util.CollectorCreation;


public class RegistrationMenu {
    
    
    public static void menu(){
        Collector newColl = new Collector();
        Scanner input = new Scanner(System.in);
        String name;
        String username;
        String password;
        
        System.out.println("\nThanks for choosing to register with QuarterCollector!");
        System.out.println("We're excited to have you!");
        System.out.println("Lets get you started on your new account!");
        
        do{
            System.out.println("Enter your name here: ");
            name = input.nextLine();
        }while(name == null);
        
        do{
            System.out.println("\nEnter your desired username here: ");
            username = input.nextLine();
            
            if(username.length() < 5){
                System.out.println("Usernames must be 5 characters or longer!");
            }
        }while(username ==null || username.length() < 5);
        
        do{
            System.out.println("\nEnter your desired password here: ");
            password = input.nextLine();
            
            if(password.length() < 8){
                System.out.println("Passwords must be 8 characters or longer!");
            }
        }while(password ==null || password.length() < 8);
        
        newColl.setName(name);
        newColl.setUsername(username);
        newColl.setPassword(password);
        
        CollectorCreation.builder(newColl);
        
        System.out.println("You can now log in from the Welcome Menu!");
        
    }
}

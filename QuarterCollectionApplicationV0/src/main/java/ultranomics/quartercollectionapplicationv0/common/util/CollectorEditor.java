package ultranomics.quartercollectionapplicationv0.common.util;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.InputMismatchException;
import java.util.Scanner;
import ultranomics.quartercollectionapplicationv0.Collector;
import ultranomics.quartercollectionapplicationv0.common.datasource.ConnectionFactory;

public class CollectorEditor {
    public static void edit(){
        Scanner input = new Scanner(System.in);
        ConnectionFactory connection = new ConnectionFactory();
        try{
            Connection conn = connection.getConnection();
            if(conn != null){
                System.out.println("Connection Established");
            }
            
            System.out.println("What is the Collector ID to be edited?");
            int idToEdit; 
            
            try{
                idToEdit = input.nextInt();
                input.nextLine();
                
                String sql = "SELECT * FROM collectors WHERE collector_id = '"+ idToEdit + "';";

                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql);

                while(rs.next()){
                    Collector collect = new Collector();

                    collect.setIDNumber(rs.getShort("collector_id"));
                    collect.setName(rs.getString("collector_name"));
                    collect.setUsername(rs.getString("collector_username"));
                    collect.setPassword(rs.getString("collector_password"));

                    String newData;
                    int menuInput = 0;
                    boolean inputValidation = false;
                    boolean exitWatcher = false;
                    String sql02;
                    do{
                        try{
                            do{
                                System.out.println("Which field would we like to edit?");
                                System.out.println("1] Name");
                                System.out.println("2] Username");
                                System.out.println("3] Password");
                                System.out.println("4] Exit");


                                // where the possible exception could throw
                                menuInput = input.nextInt();
                                input.nextLine();//consume new line character

                                //loop escape once proper input is obtained
                                if(menuInput >= 1 && menuInput <=4){
                                    inputValidation = true; 
                                }else{
                                    System.out.println("Input Error: input must be in range listed above (1-4)\n");
                                }
                            }while(inputValidation == false);
                        }catch(InputMismatchException e){
                            input.nextLine();//consume new line character
                            System.out.println("Input Error: input must be numeric (1,2,3 ect)\n");
                        }

                        switch(menuInput){
                            case 1:
                                System.out.println("What should the new Name be?");
                                newData = input.nextLine();
                                collect.setName(newData);
                                sql02 = "UPDATE collectors SET collector_name = '" + newData+ "' WHERE collector_id = "+ idToEdit;
                                stmt.executeUpdate(sql02);
                                break;
                            case 2:
                                System.out.println("What should the new Username be?");
                                newData = input.nextLine();
                                collect.setUsername(newData);
                                sql02 = "UPDATE collectors SET collector_username = '" + newData+ "' WHERE collector_id = "+ idToEdit;
                                stmt.executeUpdate(sql02);
                                break;
                            case 3:
                                System.out.println("What should the new Password be?");
                                newData = input.nextLine();
                                collect.setPassword(newData);
                                sql02 = "UPDATE collectors SET collector_password = '" + newData+ "' WHERE collector_id = "+ idToEdit;
                                stmt.executeUpdate(sql02);
                                break;
                            case 4:
                                exitWatcher = true;
                                break;
                        }

                    }while(exitWatcher == false);
                }
                
                

                

            }catch(InputMismatchException e){
                System.out.println("ERROR: Input must be an int");
            }
        }catch(SQLException e){
            System.err.println("Error: problem with the Database");
            e.printStackTrace();
        }
    }
}

package ultranomics.quartercollectionapplicationv0;


import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class QuarterCollectionMain {
    public static void main (String[] args){
        
        
        try{
            Properties dbprops = new Properties();
            dbprops.load(new FileReader("src/main/resources/application.properties"));
            
            Class.forName("org.postgresql.Driver");
            Connection conn = DriverManager.getConnection(dbprops.getProperty("db-url"), dbprops.getProperty("db-username"), dbprops.getProperty("db-password"));
            if(conn != null){
                System.out.println("Connection established");
            }
        }
        catch(IOException e){
            System.err.println("Error: could not read from application file");
        }
        catch(SQLException e){
            e.printStackTrace();
            System.err.println("Error: connection to database could not be established");
        }
        catch(ClassNotFoundException e){
            System.err.println("Error: PostgreSQL  JDBC Driver failed to load");
        }
        
    }//end main method
}//end class

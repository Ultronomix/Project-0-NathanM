package ultranomics.quartercollectionapplicationv0;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class QuarterCollectionMain {
    public static void main (String[] args){
        //these will be added later in an infoSec manner
        String dBeaverURL = "jdbc:postgresql://FAKE_DB_URL:5432/postgresql?currentSchema=QuarterCollection";
        String dBeaverUserName = "fakeUser";
        String dBeaverPassword = "fakePAss";
        
        try{
            Class.forName("org.postgresql.Driver");
            Connection conn = DriverManager.getConnection(dBeaverURL, dBeaverUserName, dBeaverPassword);
            if(conn != null){
                System.out.println("Connection established");
            }
        }
        catch(SQLException e){
            System.err.println("Error: connection to database could not be established");
        }
        catch(ClassNotFoundException e){
            System.err.println("Error: PostgreSQL  JDBC Driver failed to load");
        }
        
    }//end main method
}//end class

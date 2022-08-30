package ultranomics.quartercollectionapplicationv0;

import java.sql.Connection;
import java.sql.SQLException;
import ultranomics.quartercollectionapplicationv0.common.datasource.ConnectionFactory;

public class QuarterCollectionMain {
    public static void main (String[] args){
        ConnectionFactory connection = new ConnectionFactory();
        try{
            Connection conn = connection.getConnection();
            if(conn != null){
                System.out.println("Connection Established");
            }
        }catch(SQLException e){
            System.err.println("Error: could not establish connection to Database");
            System.exit(0);
        }
    }//end main method
}//end class

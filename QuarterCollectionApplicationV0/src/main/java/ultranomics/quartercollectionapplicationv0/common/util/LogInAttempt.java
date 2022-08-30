package ultranomics.quartercollectionapplicationv0.common.util;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import ultranomics.quartercollectionapplicationv0.Collector;
import ultranomics.quartercollectionapplicationv0.common.datasource.ConnectionFactory;

public class LogInAttempt {
    public static short attempt(String username, String password){
        String sql = "SELECT * FROM COLLECTORS;";
        
        ArrayList<Collector> allCollectors = new ArrayList<>();
        
        ConnectionFactory connection = new ConnectionFactory();
        try{
            Connection conn = connection.getConnection();
            if(conn != null){
                System.out.println("Connection Established");
            }
            
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            
            while(rs.next()){
                Collector collect = new Collector();
                
                collect.setIDNumber(rs.getShort("collector_id"));
                collect.setName(rs.getString("collector_name"));
                collect.setUsername(rs.getString("collector_username"));
                //!!!this needs to be done differently for password security in the future!!!
                collect.setPassword(rs.getString("collector_password"));
                
                allCollectors.add(collect);
            }
            
            
            
            
        }catch(SQLException e){
            System.err.println("Error: could not establish connection to Database");
        }
        
        
    }
}

package ultranomics.quartercollectionapplicationv0.common.util;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import ultranomics.quartercollectionapplicationv0.Collector;
import ultranomics.quartercollectionapplicationv0.common.datasource.ConnectionFactory;

public class LogInAttempt {
    public static short attempt(String username, String password){
        String sql = "SELECT * FROM COLLECTORS;";
        
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
                collect.setPassword(rs.getString("collector_password"));
                
                if(collect.getUsername().equals(username) && collect.getPassword().equals(password)){
                    return(collect.getIDNumber());
                }
            }
        }catch(SQLException e){
            System.err.println("Error: problem with the Database");
            e.printStackTrace();
        }
        
        return(0);
    }
}

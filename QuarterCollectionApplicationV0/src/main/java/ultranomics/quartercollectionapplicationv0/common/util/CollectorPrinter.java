package ultranomics.quartercollectionapplicationv0.common.util;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import ultranomics.quartercollectionapplicationv0.Collector;
import ultranomics.quartercollectionapplicationv0.common.datasource.ConnectionFactory;

public class CollectorPrinter {
    public static void print(){
        List<Collector> collList = new ArrayList<>();
        
        ConnectionFactory connection = new ConnectionFactory();
        try{
            Connection conn = connection.getConnection();
            if(conn != null){
                System.out.println("Connection Established");
            }
            
            String sql = "SELECT * from collectors;";
            
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            
            while(rs.next()){
                Collector collect = new Collector();
                
                collect.setIDNumber(rs.getShort("collector_id"));
                collect.setName(rs.getString("collector_name"));
                collect.setUsername(rs.getString("collector_username"));
                collect.setPassword(rs.getString("collector_password"));
                
                collList.add(collect);
            }
            
            for(Collector i:collList){
                System.out.println("Collector ID: "+ i.getIDNumber());
                System.out.println("Name: " +i.getName());
                System.out.println("Username: " +i.getUsername());
                System.out.println("Password: [SECRET]" );
            }
        }catch(SQLException e){
            System.err.println("Error: problem with the Database");
            e.printStackTrace();
        }
    }
}

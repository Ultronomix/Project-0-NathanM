package ultranomics.quartercollectionapplicationv0.common.util;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import ultranomics.quartercollectionapplicationv0.Collection;
import ultranomics.quartercollectionapplicationv0.Collector;
import ultranomics.quartercollectionapplicationv0.common.datasource.ConnectionFactory;

public class CollectorCreation {
    public static void builder(Collector coll){
        String sql =
                "INSERT INTO collectors (COLLECTOR_NAME, COLLECTOR_USERNAME, COLLECTOR_PASSWORD)\n" +
                "VALUES \n" +
                "('" + coll.getName() + "', " + 
                "'" + coll.getUsername() + "', " +
                "'" + coll.getPassword() + "');";
        
        
        
        ConnectionFactory connection = new ConnectionFactory();
        try{
            Connection conn = connection.getConnection();
            if(conn != null){
                System.out.println("Connection Established");
            }
            
            Statement stmt = conn.createStatement();
            
            stmt.executeUpdate(sql);
            
//            System.out.println("BUG CHECKER 01");
//            String sql2 = 
//                "SELECT COLLECTOR_ID from COLLECTORS WHERE collector_name = '" + coll.getName() + "';";
//            ResultSet rs = stmt.executeQuery(sql2);
//            coll.setIDNumber(rs.getShort("collector_id")); 
//            
//            System.out.println("BUG CHECKER 02");
//            String sql3 =
//                "INSERT INTO collections (COLLECTION_NAME, COLLECTOR_ID) "+
//                "VALUES ('DefaultCollection', " + coll.getIDNumber() + ");";
//            stmt.executeUpdate(sql3);
//            
//            System.out.println("BUG CHECKER 03");
//            String sql4 = "SELECT COLLECTION_ID from COLLECTIONS WHERE collector_id = " + coll.getIDNumber() + ";";
//            rs = stmt.executeQuery(sql4);
//            short collectionID = rs.getShort("collection_id");
//            
//            String sql5 = Collection.newQuarterCollection(collectionID);
//            stmt.executeUpdate(sql5);
//            
            System.out.println("Collector added, credentials established!");
        }catch(SQLException e){
            System.err.println("Error: problem with the Database");
            e.printStackTrace();
        }
    }
}

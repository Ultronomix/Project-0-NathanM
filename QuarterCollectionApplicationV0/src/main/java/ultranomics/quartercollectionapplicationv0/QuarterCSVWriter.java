package ultranomics.quartercollectionapplicationv0;

import java.io.File;
import java.io.FileWriter;

public class QuarterCSVWriter{
    public static void main(String[] args){
        
        File file = new File("QuarterCollectionStatesCSV.csv");
        
        
        try{
            file.createNewFile();
            FileWriter fw = new FileWriter(file);
            
            
        }catch(Exception e){
            System.out.println("Error Caught");
        }
        
        
        
        
    }//end main
    
    
}//end class


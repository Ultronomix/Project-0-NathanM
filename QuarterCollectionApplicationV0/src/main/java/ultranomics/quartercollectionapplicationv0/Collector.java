package ultranomics.quartercollectionapplicationv0;

public class Collector {
    private short idNumber;
    private String name;
    private String username;
    private String password;
    
    //getters
    public short getIDNumber(){
        return this.idNumber;
    }
    public String getName(){
        return this.name;
    }
    public String getUsername(){
        return this.username;
    }
    public String getPassword(){
        return this.password;
    }
    
    //setters
    public void setIDNumber(short dataImport){
        this.idNumber = dataImport;
    }
    public void setName(String dataImport){
        this.name = dataImport;
    }
    public void setUsername(String dataImport){
        this.username = dataImport;
    }
    public void setPassword(String dataImport){
        this.password = dataImport;
    }
}

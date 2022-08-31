package ultranomics.quartercollectionapplicationv0;

public class Collection {
    private short idNumber;
    private String name;
    private short collectorIDNum;
    
    //getters
    public short getIDNumber(){
        return this.idNumber;
    }
    public String getName(){
        return this.name;
    }
    public short getCollectorIDNum(){
        return this.collectorIDNum;
    }
    
    //setters
    public void setIDNumber(short dataImport){
        this.idNumber = dataImport;
    }
    public void setName(String dataImport){
        this.name = dataImport;
    }
    public void setUsername(short collectorIDNum){
        this.collectorIDNum = collectorIDNum;
    }
    
    //quarter insertion statement
    public static String newQuarterCollection(short collectionID){
        String stringSQLCommand = 
                "INSERT INTO quarters (MINT, YEAR_ISSUED, STATE, COLLECTION_ID)\n" +
"VALUES\n" +
"	('Denver', '1999', 'Delaware', " + collectionID + "),\n" +
"	('Denver', '1999', 'Pennsylvania', " + collectionID + "),\n" +
"	('Denver', '1999', 'New_Jersey', " + collectionID + "),\n" +
"	('Denver', '1999', 'Georgia', " + collectionID + "),\n" +
"	('Denver', '1999', 'Connecticut', " + collectionID + "),\n" +
"	('Philadelphia', '1999', 'Delaware', " + collectionID + "),\n" +
"	('Philadelphia', '1999', 'Pennsylvania', " + collectionID + "),\n" +
"	('Philadelphia', '1999', 'New_Jersey', " + collectionID + "),\n" +
"	('Philadelphia', '1999', 'Georgia', " + collectionID + "),\n" +
"	('Philadelphia', '1999', 'Connecticut', " + collectionID + "),\n" +
"	--\n" +
"	('Denver', '2000', 'Massachusetts', " + collectionID + "),\n" +
"	('Denver', '2000', 'Maryland', " + collectionID + "),\n" +
"	('Denver', '2000', 'South_Carolina', " + collectionID + "),\n" +
"	('Denver', '2000', 'New_Hampshire', " + collectionID + "),\n" +
"	('Denver', '2000', 'Virginia', " + collectionID + "),\n" +
"	('Philadelphia', '2000', 'Massachusetts', " + collectionID + "),\n" +
"	('Philadelphia', '2000', 'Maryland', " + collectionID + "),\n" +
"	('Philadelphia', '2000', 'South_Carolina', " + collectionID + "),\n" +
"	('Philadelphia', '2000', 'New_Hampshire', " + collectionID + "),\n" +
"	('Philadelphia', '2000', 'Virginia', " + collectionID + "),\n" +
"	--\n" +
"	('Denver', '2001', 'New_York', " + collectionID + "),\n" +
"	('Denver', '2001', 'North_Carolina', " + collectionID + "),\n" +
"	('Denver', '2001', 'Rhode_Island', " + collectionID + "),\n" +
"	('Denver', '2001', 'Vermont', " + collectionID + "),\n" +
"	('Denver', '2001', 'Kentucky', " + collectionID + "),\n" +
"	('Philadelphia', '2001', 'New_York', " + collectionID + "),\n" +
"	('Philadelphia', '2001', 'North_Carolina', " + collectionID + "),\n" +
"	('Philadelphia', '2001', 'Rhode_Island', " + collectionID + "),\n" +
"	('Philadelphia', '2001', 'Vermont', " + collectionID + "),\n" +
"	('Philadelphia', '2001', 'Kentucky', " + collectionID + "),\n" +
"	--\n" +
"	('Denver', '2002', 'Tennessee', " + collectionID + "),\n" +
"	('Denver', '2002', 'Ohio', " + collectionID + "),\n" +
"	('Denver', '2002', 'Louisiana', " + collectionID + "),\n" +
"	('Denver', '2002', 'Indiana', " + collectionID + "),\n" +
"	('Denver', '2002', 'Mississippi', " + collectionID + "),\n" +
"	('Philadelphia', '2002', 'Tennessee', " + collectionID + "),\n" +
"	('Philadelphia', '2002', 'Ohio', " + collectionID + "),\n" +
"	('Philadelphia', '2002', 'Louisiana', " + collectionID + "),\n" +
"	('Philadelphia', '2002', 'Indiana', " + collectionID + "),\n" +
"	('Philadelphia', '2002', 'Mississippi', " + collectionID + "),\n" +
"	--\n" +
"	('Denver', '2003', 'Illinois', " + collectionID + "),\n" +
"	('Denver', '2003', 'Alabama', " + collectionID + "),\n" +
"	('Denver', '2003', 'Maine', " + collectionID + "),\n" +
"	('Denver', '2003', 'Missouri', " + collectionID + "),\n" +
"	('Denver', '2003', 'Arkansas', " + collectionID + "),\n" +
"	('Philadelphia', '2003', 'Illinois', " + collectionID + "),\n" +
"	('Philadelphia', '2003', 'Alabama', " + collectionID + "),\n" +
"	('Philadelphia', '2003', 'Maine', " + collectionID + "),\n" +
"	('Philadelphia', '2003', 'Missouri', " + collectionID + "),\n" +
"	('Philadelphia', '2003', 'Arkansas', " + collectionID + "),\n" +
"	--\n" +
"	('Denver', '2004', 'Michigan', " + collectionID + "),\n" +
"	('Denver', '2004', 'Florida', " + collectionID + "),\n" +
"	('Denver', '2004', 'Texas', " + collectionID + "),\n" +
"	('Denver', '2004', 'Iowa', " + collectionID + "),\n" +
"	('Denver', '2004', 'Wisconsin', " + collectionID + "),\n" +
"	('Philadelphia', '2004', 'Michigan', " + collectionID + "),\n" +
"	('Philadelphia', '2004', 'Florida', " + collectionID + "),\n" +
"	('Philadelphia', '2004', 'Texas', " + collectionID + "),\n" +
"	('Philadelphia', '2004', 'Iowa', " + collectionID + "),\n" +
"	('Philadelphia', '2004', 'Wisconsin', " + collectionID + "),\n" +
"	--\n" +
"	('Denver', '2005', 'California', " + collectionID + "),\n" +
"	('Denver', '2005', 'Minnesota', " + collectionID + "),\n" +
"	('Denver', '2005', 'Oregon', " + collectionID + "),\n" +
"	('Denver', '2005', 'Kansas', " + collectionID + "),\n" +
"	('Denver', '2005', 'West_Virginia', " + collectionID + "),\n" +
"	('Philadelphia', '2005', 'California', " + collectionID + "),\n" +
"	('Philadelphia', '2005', 'Minnesota', " + collectionID + "),\n" +
"	('Philadelphia', '2005', 'Oregon', " + collectionID + "),\n" +
"	('Philadelphia', '2005', 'Kansas', " + collectionID + "),\n" +
"	('Philadelphia', '2005', 'West_Virginia', " + collectionID + "),\n" +
"	--\n" +
"	('Denver', '2006', 'Nevada', " + collectionID + "),\n" +
"	('Denver', '2006', 'Nebraska', " + collectionID + "),\n" +
"	('Denver', '2006', 'Colorado', " + collectionID + "),\n" +
"	('Denver', '2006', 'North_Dakota', " + collectionID + "),\n" +
"	('Denver', '2006', 'South_Dakota', " + collectionID + "),\n" +
"	('Philadelphia', '2006', 'Nevada', " + collectionID + "),\n" +
"	('Philadelphia', '2006', 'Nebraska', " + collectionID + "),\n" +
"	('Philadelphia', '2006', 'Colorado', " + collectionID + "),\n" +
"	('Philadelphia', '2006', 'North_Dakota', " + collectionID + "),\n" +
"	('Philadelphia', '2006', 'South_Dakota', " + collectionID + "),\n" +
"	--\n" +
"	('Denver', '2007', 'Montana', " + collectionID + "),\n" +
"	('Denver', '2007', 'Washington', " + collectionID + "),\n" +
"	('Denver', '2007', 'Idaho', " + collectionID + "),\n" +
"	('Denver', '2007', 'Wyoming', " + collectionID + "),\n" +
"	('Denver', '2007', 'Utah', " + collectionID + "),\n" +
"	('Philadelphia', '2007', 'Montana', " + collectionID + "),\n" +
"	('Philadelphia', '2007', 'Washington', " + collectionID + "),\n" +
"	('Philadelphia', '2007', 'Idaho', " + collectionID + "),\n" +
"	('Philadelphia', '2007', 'Wyoming', " + collectionID + "),\n" +
"	('Philadelphia', '2007', 'Utah', " + collectionID + "),\n" +
"	--\n" +
"	('Denver', '2008', 'Oklahoma', " + collectionID + "),\n" +
"	('Denver', '2008', 'New_Mexico', " + collectionID + "),\n" +
"	('Denver', '2008', 'Arizona', " + collectionID + "),\n" +
"	('Denver', '2008', 'Alaska', " + collectionID + "),\n" +
"	('Denver', '2008', 'Hawaii', " + collectionID + "),\n" +
"	('Philadelphia', '2008', 'Oklahoma', " + collectionID + "),\n" +
"	('Philadelphia', '2008', 'New_Mexico', " + collectionID + "),\n" +
"	('Philadelphia', '2008', 'Arizona', " + collectionID + "),\n" +
"	('Philadelphia', '2008', 'Alaska', " + collectionID + "),\n" +
"	('Philadelphia', '2008', 'Hawaii', " + collectionID + ");";
        
        
        return stringSQLCommand;
    }
}

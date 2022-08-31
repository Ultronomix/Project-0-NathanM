package ultranomics.quartercollectionapplicationv0;

public class Quarter{
    private short idNumber;
    private String idYear;
    private State idState;
    private Mint idMint; 
    private boolean inCollection;
    private short collectionIDNum;


    //getters
    public short getIDNumber(){
        return this.idNumber;
    }
    public String getIDYear(){
        return this.idYear;
    }
    public State getIDState(){
        return this.idState;
    }
    public Mint getIDMint(){
        return this.idMint;
    }
    public boolean getInCollection(){
        return this.inCollection;
    }
    public short getCollectionIDNum(){
        return this.collectionIDNum;
    }

    //setters
    public void setIDNumber(short idNumber){
        this.idNumber = idNumber;
    }
    public void setIDYear(String idYear){
        this.idYear = idYear;
    }
    public void setIDState(State idState){
        this.idState = idState;
    }
    public void setIDMint(Mint idMint){
        this.idMint = idMint;
    }
    public void setInCollection(boolean inCollection){
        this.inCollection = inCollection;
    }
    public void setCollectionIDNum(short collectionIDNum){
        this.collectionIDNum = collectionIDNum;
    }

}
enum State{
    ALABAMA,
    ALASKA,
    ARIZONA,
    ARKANSAS,
    CALIFORNIA,
    COLORADO,
    CONNECTICUT,
    DELAWARE,
    FLORIDA,
    GEORGIA,
    HAWAII,
    IDAHO,
    ILLINOIS,
    INDIANA,
    IOWA,
    KANSAS,
    KENTUCKY,
    LOUISIANA,
    MAINE,
    MARYLAND,
    MASSACHUSETTS,
    MICHIGAN,
    MINNESOTA,
    MISSISSIPPI,
    MISSOURI,
    MONTANA,
    NEBRASKA,
    NEVADA,
    NEW_HAMPSHIRE,
    NEW_JERSEY,
    NEW_MEXICO,
    NEW_YORK,
    NORTH_CAROLINA,
    NORTH_DAKOTA,
    OHIO,
    OKLAHOMA,
    OREGON,
    PENNSYLVANIA,
    RHODE_ISLAND,
    SOUTH_CAROLINA,
    SOUTH_DAKOTA,
    TENNESSEE,
    TEXAS,
    UTAH,
    VERMONT,
    VIRGINIA,
    WASHINGTON,
    WEST_VIRGINIA,
    WISCONSIN,
    WYOMING

}

enum Mint{
    PHILADELPHIA,
    DENVER,
    WESTPOINT
}
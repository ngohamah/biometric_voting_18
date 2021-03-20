/**
 * @brief  The ElectoralOfficer class has information about the chief operating 
 *          personnel at each polling station.
 * @author ngoh
 */
package operations;

public class ElectoralOfficer extends Voter{
    private String officerID;
    private String constituent;
    private String operatingStation;
    
    public ElectoralOfficer(String fname,String lname, int age, char gender, 
    long fingerprintID,String nationality,String officerID, String constituent, String operatingStation){
        super(fname,lname,age,gender,fingerprintID,nationality);
        this.officerID=officerID;
        this.constituent=constituent;
        this.operatingStation=operatingStation;
    }

    public String getOfficerID() {
        return officerID;
    }

    public String getOperatingStation() {
        return operatingStation;
    }

    public String getConstituency() {
        return constituent;
    }
    
    public void setOfficerID(String officerID) {
        this.officerID = officerID;
    }

    public void setOperatingStation(String operatingStation) {
        this.operatingStation = operatingStation;
    }

    public void setConstituency(String constituent) {
        this.constituent = constituent;
    }
   
    @Override
    public String toString() {
        return "ElectoralOfficer{" + "fname=" + this.getFname() + ", lname=" + 
                this.getLname()+ ", age=" + this.getAge()+ ", gender=" + 
                this.getGender() + ", " + "fingerprintID=" + this.getFingerprintID() 
                + "officerID=" + this.getOfficerID() + ", constituent=" + 
                this.getConstituency() + ", "+ "operatingStation=" + 
                this.getOperatingStation() + '}';
    }	
    
}

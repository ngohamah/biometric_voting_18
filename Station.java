package bvs_redefined;

import java.util.ArrayList;

abstract class Station{
  
    String location;
    ElectoralOfficer officer;
    
    /**
     * @brief 
     * To keep track of the votes cast so far we adopt an ArrayList 
     * 
     * Every polling station has its own ArrayList, and every constituency, would
     * be a merger of all the ArrayList below it. 
     * 
     * For instance, the RegionalElectoralOffice  would be a collation of all 
     * the polling stations at the district level and so on...
    */
    ArrayList<Integer> numberOfVotes =new ArrayList<>();

    public Station(String location, ElectoralOfficer officer, ArrayList<Integer> numberOfVotes) {
        this.location = location;
        this.officer = officer;
        this.numberOfVotes=numberOfVotes;
    }

    public abstract String getLocation();
    public abstract ElectoralOfficer getOfficer();
    public abstract void setLocation(String location);
    public abstract void setOfficer(ElectoralOfficer officer);
    public abstract ArrayList<Integer> getNumberOfVotes();
    public abstract void setNumberOfVotes(ArrayList<Integer> getNumberOfVotes);

}

package bvs_redefined;

import java.util.ArrayList;

public class DistrictOffice extends Station{
	
	ArrayList<PollingStation> ps = new ArrayList<>(); //arraylist of PollingStations in that district.
	
	public DistrictOffice(String location, ElectoralOfficer officer, 
           ArrayList<Integer> numberOfVotes) {
		super(location,officer,numberOfVotes);
	}

	public ArrayList<PollingStation> getPollingStation() {
		return ps;
	}

	public void setPollingStations(ArrayList<PollingStation> ps) {
		this.ps = ps;
	}
	
    public String getLocation() {
    	return location;
    }
    
    public ElectoralOfficer getOfficer() {
    	return officer;
    }
    
    public ArrayList<Integer> getNumberOfVotes(){
    	return numberOfVotes;
    }
    
    public void setLocation(String location) {
    	this.location=location;
    }
    
    public void setOfficer(ElectoralOfficer officer) {
    	this.officer=officer;
    }
    
    public void setNumberOfVotes(ArrayList<Integer> numberOfVotes) {
    	this.numberOfVotes=numberOfVotes;
    }
    
    //method collates all the pollingstations in the same district.
    public boolean collatePollingStation(PollingStation ps1) {
    	if(ps1!=null) {
    		ps.add(ps1);
    		return true;
    	}else
    	return false;
    }
     
    private Integer addInteger(Integer n1, Integer n2) {
    	return n1+n2;
    }
    
    /*** 
     * @brief this method would return an arraylist of the results for that District.
     * @param doff
     * @return
     */
    public ArrayList getDistrictResults(DistrictOffice dof) {
    	ArrayList<PollingStation> aps = dof.getPollingStation(); //aps is an arraylist of all pollingstations in 
    															  //that district
    	
    	ArrayList<ArrayList> districtResult = new ArrayList<ArrayList>(); //this DS would contain the arraylists of the number of votes 
    																	  //for each pollingstation.
    	
    	ArrayList<Integer> collatedDistrictResult = new ArrayList<>();
    	
    	//Assigning numberOfVotes ArrayList of each Polling Station  to the districtResult arraylist.
    	for(int i=0;i<aps.size();i++) {
    		PollingStation ps = aps.get(i); 
    		districtResult.add(ps.getNumberOfVotes()); 
    	}
    	
    	//we must assign default values for the collatedDistrictResult arraylist since its Integer type(default is null not 0)
    	for(int m=0;m<districtResult.size();) {
    		ArrayList results = districtResult.get(m);//numberOfVotes for the pollingstation m
    		for(int n=0;n<results.size();n++) {
    			collatedDistrictResult.set(n, 0);
    		}
    		break;
    	}
    	
    	//collating votes of all pollingstations into a single arraylist called collatedDistrictResult..
    	for(int j=0;j<districtResult.size();j++) {
    		ArrayList<Integer> numberofvotes = districtResult.get(j); //get the numberofvotes arraylist for each pollingstation.
    		
    		for(int k=0;k<numberofvotes.size();k++) { //note that numberofvotes.size() is no other than the number of candidates.
    										       			
    			Integer score = collatedDistrictResult.get(k);
    			score=addInteger(score,numberofvotes.get(k));
    			collatedDistrictResult.set(k, score); //updates the collatedDistrictResult with then new score.    			
    		}	
    	}	
    	this.setNumberOfVotes(collatedDistrictResult);
    	return collatedDistrictResult;
    } 
    
    @Override
    public String toString() {
    	return "PollingStation infos: "+ this.getLocation() + "  " + this.getOfficer() + " " + this.getNumberOfVotes();
    } 
}

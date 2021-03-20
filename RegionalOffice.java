package operations;

import java.util.ArrayList;

public class RegionalOffice extends Station {
   
	//declaring an arraylist of districtOffices in that Region.
	ArrayList<DistrictOffice> districtOffice = new ArrayList<>();
	
	/**
	 * @brief constructor
	 * @param location
	 * @param officer
	 * @param numberOfVotes
	 */
	public RegionalOffice(String location, ElectoralOfficer officer, 
	           ArrayList<Integer> numberOfVotes) {
			super(location,officer,numberOfVotes);
	}
	
	public ArrayList<DistrictOffice> getDistrictOffice() {
		return districtOffice;
	}

	public void setDistrictOffice(ArrayList<DistrictOffice> districtOffice) {
		this.districtOffice = districtOffice;
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

	public void setNumberOfVotes(ArrayList<Integer> NumberOfVotes){this.numberOfVotes=NumberOfVotes;};

	public void initializeVotes(ArrayList<Integer> numberOfVotes, int numberOfCandidates) {
		//initializing number of votes for each candidate to zero from the start.
		for(int i=0;i<numberOfCandidates;i++){
			numberOfVotes.add(i,0);
		}
		this.numberOfVotes = numberOfVotes;
	}

	//method collates all the DistrictOffices in the same Region.
    public boolean collateDistrictOffice(DistrictOffice dof) {
    	if(dof!=null) {
    		districtOffice.add(dof);
    		return true;
    	}else
    	return false;
    }
     
    private Integer addInteger(Integer n1, Integer n2) {
    	return n1+n2;
    }
    
    /*** 
     * @brief this method would return an arraylist of the results for that region.
     * @param rof
     * @return
     */
    public ArrayList getRegionalResults(RegionalOffice rof) {
    	ArrayList<DistrictOffice> adof = rof.getDistrictOffice(); //adof is an arraylist of all districtsoffices in 
    															 //that region
    	
    	ArrayList<ArrayList> regionalResult = new ArrayList<ArrayList>(); //this DS would contain the arraylists of the number of votes 
    																	  //for each district.
    	
    	ArrayList<Integer> collatedRegionalResult = new ArrayList<>();
    	
    	//Assigning numberOfVotes ArrayList of each DistrictOfice to the regionalResults arraylist.
    	for(int i=0;i<adof.size();i++) {
    		DistrictOffice dof = adof.get(i); 
    		regionalResult.add(dof.getNumberOfVotes()); 
    	}
    	
    	//we must assign default values for the collatedRegionalResult arraylist since its Integer type(default is null not 0)
    	for(int m=0;m<regionalResult.size();) {
    		ArrayList results = regionalResult.get(m);//numberOfVotes for the district m
    		for(int n=0;n<results.size();n++) {
    			collatedRegionalResult.add(n, 0);
    		}
    		break;
    	}
    	
    	//collating votes of all districtOffices into a single arraylist called collatedRegionalResult..
    	for(int j=0;j<regionalResult.size();j++) {
    		ArrayList<Integer> numberofvotes = regionalResult.get(j); //get the numberofvotes arraylist for each districtOffice.
    		
    		for(int k=0;k<numberofvotes.size();k++) { //note that numberofvotes.size() is no other than the number of candidates.
    										       			
    			Integer score = collatedRegionalResult.get(k);
    			score=addInteger(score,numberofvotes.get(k));
    			collatedRegionalResult.set(k, score); //updates the collatedDistrictResult with then new score.    			
    		}	
    	}
		this.setNumberOfVotes(collatedRegionalResult);
    	return collatedRegionalResult;
    }   
    
    @Override
    public String toString() {
    	return "RegionalElectoralOffice infos: "+ this.getLocation() + "  " + this.getOfficer() + " " + this.getNumberOfVotes();
    } 
}

package operations;

import java.util.ArrayList;

public class NationalHQ extends Station{
		//declaring an arraylist of districtOffices in that Region.
		ArrayList<RegionalOffice> regionalOffice = new ArrayList<>();
		
		public NationalHQ(String location, ElectoralOfficer officer, 
		           ArrayList<Integer> numberOfVotes) {
				super(location,officer,numberOfVotes);
		}
		
		public ArrayList<RegionalOffice> getRegionalOffice() {
			return regionalOffice;
		}

		public void setRegionalOffice(ArrayList<RegionalOffice> ro) {
			this.regionalOffice= ro;
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

	//method collates all the RegionalOffices in the nation.
	    public boolean collateRegionalOffice(RegionalOffice ro) {
	    	if(ro!=null) {
	    		regionalOffice.add(ro);
	    		return true;
	    	}else
	    	return false;
	    }
	     
	    private Integer addInteger(Integer n1, Integer n2) {
	    	return n1+n2;
	    }
	    
	    /*** 
	     * @brief this method would return an arraylist of the results for the nation.
	     * @param nhq
	     * @return
	     */
	    public ArrayList getNationalResult(NationalHQ nhq) {
	    	ArrayList<RegionalOffice> arof = nhq.getRegionalOffice(); //arof is an arraylist of all RegionalOffice in 
	    															 //the nation
	    	
	    	ArrayList<ArrayList> nationalResult = new ArrayList<ArrayList>(); //this DS would contain the arraylists of the number of votes 
	    																	  //for the nation.
	    	
	    	ArrayList<Integer> collatedNationalResult = new ArrayList<>();
	    	
	    	//Assigning numberOfVotes ArrayList of each RegionalOffice to the nationalResult arraylist.
	    	for(int i=0;i<arof.size();i++) {
	    		RegionalOffice rof = arof.get(i); 
	    		nationalResult.add(rof.getNumberOfVotes()); 
	    	}
	    	
	    	//we must assign default values for the collatedNationalResult arraylist since its Integer type(default is null not 0)
	    	for(int m=0;m<nationalResult.size();) {
	    		ArrayList results = nationalResult.get(m);//numberOfVotes for the region with index m
	    		for(int n=0;n<results.size();n++) {
	    			collatedNationalResult.add(n, 0);
	    		}
	    		break;
	    	}
	    	
	    	//collating votes of all districtOffices into a single arraylist called collatedRegionalResult..
	    	for(int j=0;j<nationalResult.size();j++) {
				ArrayList<Integer> numberOfVotes = nationalResult.get(j); //get the numberOfVotes arraylist for each districtOffice.

				for (int k = 0; k < numberOfVotes.size(); k++) { //note that numberOfVotes.size() is no other than the number of candidates.

					Integer score = collatedNationalResult.get(k);
					score = addInteger(score, numberOfVotes.get(k));
					collatedNationalResult.set(k, score); //updates the collatedDistrictResult with then new score.
				}
			}
	    	return collatedNationalResult;
	    }  
	    
	    @Override
	    public String toString() {
	    	return "NationalResults infos: "+ this.getLocation() + "  " + this.getOfficer() + " " + this.getNumberOfVotes();
	    } 
}

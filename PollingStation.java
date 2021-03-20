package operations;

import java.util.ArrayList;
import java.util.LinkedList;

public class PollingStation extends Station{
    /**
     * @brief To keep track of all the voters who registered prior to the 
     * election
     * 
     * During the registration period, voters information are saved here 
     * which would be verified during the voting day
     */
    LinkedList<Voter> RegisteredVoters = new LinkedList<>(); 
    
    /**
     * @brief To keep track of all the candidates who registered prior to the
     * election. 
     * 
     * This would form a comprehensive list of those that would be voted for.
     */
    LinkedList<Candidate> RegisteredCandidates = new LinkedList<>();
    
    /**
     * @brief constructor
     * 
     * @param location
     * @param officer
     * @param numberOfVotes
     */
    public PollingStation(String location, ElectoralOfficer officer, 
           ArrayList<Integer> numberOfVotes) {
        super(location,officer,numberOfVotes);
    }
    
    
    public String getLocation() {
        return location;
    }

    public ElectoralOfficer getOfficer() {
        return officer;
    }

    public ArrayList<Integer> getNumberOfVotes() {
        return numberOfVotes;
    }

    public LinkedList<Voter> getRegisteredVoters() {
        return RegisteredVoters;
    }
    
    public LinkedList<Candidate> getRegisteredCandidates() {
    	return RegisteredCandidates;
    }

    public void setLocation(String location) {
        this.location = location;
    }


    public void setOfficer(ElectoralOfficer officer) {
        this.officer = officer;
    }

    public void setRegisteredVoters(LinkedList<Voter> RegisteredVoters) {
        this.RegisteredVoters = RegisteredVoters;
    }
    
    public void setRegisteredCandidates(LinkedList<Candidate> RegisteredCandidates) {
    	this.RegisteredCandidates = RegisteredCandidates;
    }

    public void setNumberOfVotes(ArrayList<Integer> getNumberOfVotes){this.numberOfVotes=getNumberOfVotes;}
    
    public void initializeVotes(ArrayList<Integer> numberOfVotes, int numberOfCandidates) {
        //initializing number of votes for each candidate to zero from the start.
        for(int i=0;i<numberOfCandidates;i++){
            numberOfVotes.add(i,0);
        }
        this.numberOfVotes = numberOfVotes;
    }

    
    /**
     * @brief checks if a voter can be registered
     * @param v
     * @return
     */
    public boolean registerVoter(Voter v){
        if(v.getNationality()=="Ghanaian" && v.getAge()>=18){
            RegisteredVoters.add(v);
            return true;
        }
        return false;
    }
    
    /**
     * @brief checks if a candidate can be registered
     * @param c
     * @return boolean
     */
    public boolean registeredCandidate(Candidate c) {
    	if(c.getCandidateNo()!=null)
    		return true; //Candidate has been registered.
    	else {
    		return false; //candidate has not been registered
    	}	
    }  
    
    /**
     * @brief add the number of votes for a candidate
     * @param c
     * @return boolean
     */
    private void addNumberOfVotes(Candidate c) {
         ArrayList<Integer> scoreboard = this.getNumberOfVotes();

        //adding candidate score at a required position in an arraylist.
        //note that arraylist index correspond to candidateNo

        Integer score = scoreboard.get(c.getCandidateNo());
        score+=1;
        scoreboard.set(c.getCandidateNo(), score); //number of votes of candidate has increased
        this.setNumberOfVotes(scoreboard);
    }
    
    /**
     * @brief this method is toggled when a voter wants to vote for a candidate.
     * @param v
     * @param c
     * @return boolean
     */    
    
    public boolean vote(Voter v, Candidate c){
        if(RegisteredVoters.contains(v)){ //checks if the voter has been registered.
        	if(RegisteredCandidates.contains(c)) { //checks if candidate is registered.
        		this.addNumberOfVotes(c);
        	}else return false; //candidate not registered.		
        }else return false; //voter not registered.
        return false;        
    }
}

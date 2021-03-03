/**
 * @brief  The Candidate class stores information about the individuals 
 *         to be voted into office.
 * @author ngoh
 */
package bvs_redefined;

import java.util.ArrayList;

public class Candidate extends Voter{
        //would appear on display during voting, as well as the name of the 
        //candidate.
	private Integer candidateNo=null; 
    private String pparty;  
    
    public Candidate(String fname, String lname, int age, char gender, long 
            fingerprintID,String nationality, Integer candidateNo, String pparty){
        super(fname, lname,age,gender,fingerprintID,nationality);
        this.candidateNo=candidateNo;
        this.pparty=pparty;           
    }

    public Integer getCandidateNo() {
        return candidateNo;
    }

    public String getPparty() {
        return pparty;
    }

    public void setCandidateNo(Integer candidateNo) {
        this.candidateNo = candidateNo;
    }

    public void setPparty(String pparty) {
        this.pparty = pparty;
    }

    @Override
    public String toString() {
        return "Candidate{" + "fname=" + this.getFname() + ", lname=" + this.getLname() 
                + ", age=" + this.getAge()+ ", gender=" + this.getGender() + ", "
                + "fingerprintID= " + this.getFingerprintID() +", candidateNo=" + 
                this.getCandidateNo() + ", pparty=" + this.getPparty() +'}';
    } 
}
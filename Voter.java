/**
 * @brief  The voter class implements the Person class and specifies the properties
 *         and certain behaviors of a voter.
 * @author ngoh
 */
package bvs_redefined;

public class Voter implements Person {
    private String fname;
    private String lname;
    private int age;
    private char gender;
    private long fingerprintID;
    private String nationality;

    public Voter(String fname, String lname, int age, char gender, long 
            fingerprintID, String nationality) {
        this.fname = fname;
        this.lname = lname;
        this.age = age;
        this.gender = gender;
        this.fingerprintID = fingerprintID;
        this.nationality=nationality;
    } 
    
    
    public String getFname() {
        return fname;
    }

    public String getLname() {
        return lname;
    }

    public int getAge() {
        return age;
    }

    public char getGender() {
        return gender;
    }

    public long getFingerprintID() {
        return fingerprintID;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }
    
    public void setFname(String fname) {
        this.fname = fname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public void setFingerprintID(long fingerprintID) {
        this.fingerprintID = fingerprintID;
    }

    public int hashCode() {
        int hash = 5;
        hash = 79 * hash + (int) (this.fingerprintID ^ (this.fingerprintID >>> 32));
        return hash;
    }

    public boolean equals(Voter v){
        if (this == v) {
            return true;
        }
        if (v == null) {
            return false;
        }
        if (getClass() != v.getClass()) {
            return false;
        }
        final Voter other = (Voter) v;
        return this.fingerprintID == other.fingerprintID;
    }    

    @Override
    public String toString() {
        return "Voter{" + "fname=" + fname + ", lname=" + lname + ", age=" + age
                + ", gender=" + gender + ", fingerprintID= " + fingerprintID + '}';
    }	

    @Override
    public long getFingerPrintID() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public void setFingerPrintID(long fingerprintID) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public boolean equals(Person p) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public int hashcode() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    
}

package bvs_redefined;

public interface Person {
	public String getFname();
	public String getLname();
	public char getGender();
	public long getFingerPrintID();
	public int getAge();
    public String getNationality();
	public void setFname(String fname);
	public void setLname(String lname);
    public void setGender(char gender);
	public void setAge(int age);
	public void setFingerPrintID(long fingerprintID);
    public void setNationality(String nationality);
	public String toString();
    public boolean equals(Person p);
	public int hashcode();
}

package bvs_redefined;

//please use this class for all your testing and creation @Jacob and @Akosua
public class Main {
	
	public static void main(String args[]) {
		//Officer Details for the national Level
		ElectoralOfficer officer1=new ElectoralOfficer("Rodney","Ngoh",24,,'Male',123456,"Ghanaian",24681357,"Ghana","National Headquarters");
		
		//Officer Details for the Regional Level
		ElectoralOfficer officer2=new ElectoralOfficer("Akosua","Debrah",22,,'Female',123457,"Ghanaian",24681358,"Greater Accra Region","Accra Regional Headquarters");
		ElectoralOfficer officer3=new ElectoralOfficer("Jacob","Koranteng",25,,'Male',123458,"Ghanaian",24681359,"Eastern Region","Eastern Regional Headquarters");
		
		//Officer Details for the District level
		ElectoralOfficer officer4=new ElectoralOfficer("Panashe","Taruwinga",24,,'Male',1351,"Ghanaian",24681,"Assin","District Headquarters");
		ElectoralOfficer officer5=new ElectoralOfficer("Elvis","Asirifi",26,,'Male',1352,"Ghanaian",24682,"Agona","District Headquarters");
		ElectoralOfficer officer6=new ElectoralOfficer("Ebo","Yamooah",32,,'Male',1353,"Ghanaian",24683,"Kwahu","District Headquarters");
		ElectoralOfficer officer7=new ElectoralOfficer("Jojoe","Ainoo",23,,'Male',1354,"Ghanaian",24684,"Abetifi","District Headquarters");
		ElectoralOfficer officer8=new ElectoralOfficer("Fafa","Owusu",24,,'Female',1355,"Ghanaian",24685,"Westlands","District Headquarters");
		ElectoralOfficer officer9=new ElectoralOfficer("David","Sampah",30,,'Male',1356,"Ghanaian",24686,"Aboam","District Headquarters");
		
		//Officers at the polling station
		ElectoralOfficer officer10=new ElectoralOfficer("Rebecca","Awuah",24,,'Female',060310,"Ghanaian",195701,"Adenta","Polling station");
		ElectoralOfficer officer11=new ElectoralOfficer("Eric","Ocran",26,,'Male',060312,"Ghanaian",195702,"Achimota","Polling station");
		ElectoralOfficer officer12=new ElectoralOfficer("Joseph","Mensah",35,,'Male',060313,"Ghanaian",195703,"Kasoa","Polling station");
		ElectoralOfficer officer13=new ElectoralOfficer("Stepan","Amoah",32,,'Male',060314,"Ghanaian",195704,"Legon","Polling station");
		ElectoralOfficer officer14=new ElectoralOfficer("Ayawoa","Dagbovie",27,,'Female',060315,"Ghanaian",195705,"Madina","Polling station");
		ElectoralOfficer officer15=new ElectoralOfficer("Patrick","Yemofio",29,,'Male',060316,"Ghanaian",195706,"Dome","Polling station");
		ElectoralOfficer officer16=new ElectoralOfficer("Angela","Ansah",24,,'Female',0603117,"Ghanaian",195707,"Kwabenya","Polling station");
		ElectoralOfficer officer17=new ElectoralOfficer("Jonas","Ecke",34,,'Male',060318,"Ghanaian",195708,"Berekuso","Polling station");
		ElectoralOfficer officer18=new ElectoralOfficer("Sefa","Boateng",28,,'Female',060319,"Ghanaian",195709,"Aburi","Polling station");
		ElectoralOfficer officer19=new ElectoralOfficer("Frederick","Plange",26,,'Male',060311,"Ghanaian",195710,"Ashomang","Polling station");
		
		//Testing the NationalHQ class
		NationalHQ nationalHQ=new NationalHQ();
		nationalHQ.getOfficer(officer1);
		nationalHQ.getNumberOfVotes();
		nationalHQ.getLocation();
		
		//Testing the RegionalOffice class
		RegionalOffice regionaloffice=new RegionalOffice();
		RegionalOffice regionaloffice1=new RegionalOffice();
		
		regionaloffice.getOfficer(officer2);
		regionaloffice.getLocation();
		regionaloffice.getNumberOfVotes();
		
		regionaloffice1.getOfficer(officer3);
		regionaloffice1.getLocation();
		regionaloffice1.getNumberOfVotes();
		
		//Printing out the officers for the various levels
		System.out.println(nationalHQ);
		System.out.println(regionaloffice);
		System.out.println(regionaloffice1);
		
		
		
		
	}
}

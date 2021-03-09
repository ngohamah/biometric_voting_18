//contains all main methods for classes: voter, polling station, candidates and districtoffice
public class Main {

    //voter
    public static void main(String args[]) {//made up names
        Voter v1 = new Voter("Kwesi","Boakye",19,'M',1012345,"Ghanaian");
        Voter v2 = new Voter("Kofi","Danso",24,'M',1012346,"Ghanaian");
        Voter v3 = new Voter("Patrick","Osei",58,'M',1012347,"Ghanaian");
        Voter v4 = new Voter("Yaw","Ntim",45,'M',1012348,"Ghanaian");
        Voter v5 = new Voter("Emmanuel","Asante",26,'M',1012349,"Ghanaian");
        Voter v6 = new Voter("Paa","Addae",40,'M',1012350,"Ghanaian");
        Voter v7 = new Voter("Akwasi","Agyapong",37,'M',1012351,"Ghanaian");
        Voter v8 = new Voter("Cyril","Sistofe",27,'M',1012352,"Ghanaian");
        Voter v9 = new Voter("Adbul","Mustafi",21,'M',1012353,"Ghanaian");
        Voter v10 = new Voter("Patricia","Amissah",51,'F',1012354,"Ghanaian");
        Voter v11 = new Voter("Amira","Laden",25,'F',1012355,"Ghanaian");
        Voter v12 = new Voter("Rahma","Saddique",58,'F',1012356,"Ghanaian");
        Voter v13 = new Voter("Aatifa","Razrat",34,'F',1012357,"Ghanaian");
        Voter v14 = new Voter("Efua","Mensah",23,'F',1012358,"Ghanaian");
        Voter v15 = new Voter("Abena","Asabea",30,'F',1012359,"Ghanaian");
        Voter v16 = new Voter("Elizabeth","Dzirasa",20,'F',1012360,"Ghanaian");
        Voter v17 = new Voter("Nana","Oye",40,'M',1012361,"Ghanaian");
        Voter v18 = new Voter("Anita","Rahman",29,'F',1012362,"Ghanaian");
        Voter v19 = new Voter("Michael","Quarshie",26,'M',1012363,"Ghanaian");
        Voter v20 = new Voter("Freda","Lomotey",18,'F',1012364,"Ghanaian");
    }

    //polling station
    public static void main (String[]args){
        PollingStation p1 = new PollingStation("AMENFI CENTRAL","Rebecca Awuah",1001);
        PollingStation p2 = new PollingStation("AGOTIME-ZIOPE","Eric Ocran",1010);
        PollingStation p3 = new PollingStation("WENCHI","Joseph Mensah",5004);
        PollingStation p4 = new PollingStation("OLD TAFO","Stephan Amoah",5667);
        PollingStation p5 = new PollingStation("ANLO","Ayawoa Dagbovie",5555);
        PollingStation p6 = new PollingStation("EKUMFI","Patrick Yemofio",4556);
        PollingStation p7 = new PollingStation("MADINA","Angela Ansah",64544);
        PollingStation p8 = new PollingStation("JIRAPA","Jonas Ecke",78995);
        PollingStation p9 = new PollingStation("TAIN","Sefa Boateng",24567);
        PollingStation p10 = new PollingStation("LEDZOKUKU","David Sampah",85432);
    }

    //candidates
    public static void main (String[]args){
        Candidate c1 = new Candidate("Nana","Akufo-Addo",77,'M',1012301,"Ghanaian",001,"New Patriotic Party (NPP)");
        Candidate c2 = new Candidate("John","Mahama",63,'M',1012302,"Ghanaian",002," National Democratic Congress (NDC)");
        Candidate c3 = new Candidate("Ivor","Greenstreet",55,'M',1012303,"Ghanaian",003,"Convention People's Party (CPP)");
        Candidate c4 = new Candidate("Hassan","Ayariga",49,'M',1012304,"Ghanaian",004," All People's Congress (APC)");
        Candidate c5 = new Candidate("Akua","Donkor",70,'F',1012305,"Ghanaian",005," Ghana Freedom Party (GFP)");
        Candidate c6 = new Candidate("Henry Herbert","Lartey",68,'M',1012306,"Ghanaian",006,"Great Consolidated Popular Party");
    }

    //districtoffice
    public static void main (String[]args){
        DistrictOffice do1 = new DistrictOffice("Ga West","Panashe Taruwinga",64544,85432);
        DistrictOffice do2 = new DistrictOffice("Tamale Metropolitan","Elvis Asirifi",78995,65656);
        DistrictOffice do3 = new DistrictOffice("Sekyere East","Ebo Yamaoh",5004,1010);
        DistrictOffice do4 = new DistrictOffice("Ekumfi","Jojoe Ainoo",4556,24567);
        DistrictOffice do5 = new DistrictOffice("Ho West","Fafa Owusu",5555,1010);
        DistrictOffice do6 = new DistrictOffice("Bolgatanga East","Frederick Plange",1001,3001);

    }
}

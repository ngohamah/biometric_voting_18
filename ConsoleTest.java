package operations;

/**
 * authors:
 *          Ngoh Rodney Amah
 *          Akosua Takyiwa-Debrah
 *          Jacob Twum-Koranteng
 *          Panashe Taruwinga
 *
 *
 * Project name: Biometric Voting System inspired from Mr. Chukuka's study.
 */

import java.util.ArrayList;
import java.util.LinkedList;

//Code testing....
public class ConsoleTest {
    public static void main(String args[]) {

        //voter
        Voter v1 = new Voter("Kwesi", "Boakye", 19, 'M', 1012345, "Ghanaian");
        Voter v2 = new Voter("Kofi", "Danso", 24, 'M', 1012346, "Ghanaian");
        Voter v3 = new Voter("Patrick", "Osei", 58, 'M', 1012347, "Ghanaian");
        Voter v4 = new Voter("Yaw", "Ntim", 45, 'M', 1012348, "Ghanaian");
        Voter v5 = new Voter("Emmanuel", "Asante", 26, 'M', 1012349, "Ghanaian");
        Voter v6 = new Voter("Paa", "Addae", 40, 'M', 1012350, "Ghanaian");
        Voter v7 = new Voter("Akwasi", "Agyapong", 37, 'M', 1012351, "Ghanaian");
        Voter v8 = new Voter("Cyril", "Sistofe", 27, 'M', 1012352, "Ghanaian");
        Voter v9 = new Voter("Adbul", "Mustafi", 21, 'M', 1012353, "Ghanaian");
        Voter v10 = new Voter("Patricia", "Amissah", 51, 'F', 1012354, "Ghanaian");
        Voter v11 = new Voter("Amira", "Laden", 25, 'F', 1012355, "Ghanaian");
        Voter v12 = new Voter("Rahma", "Saddique", 58, 'F', 1012356, "Ghanaian");
        Voter v13 = new Voter("Aatifa", "Razrat", 34, 'F', 1012357, "Ghanaian");
        Voter v14 = new Voter("Efua", "Mensah", 23, 'F', 1012358, "Ghanaian");
        Voter v15 = new Voter("Abena", "Asabea", 30, 'F', 1012359, "Ghanaian");
        Voter v16 = new Voter("Elizabeth", "Dzirasa", 20, 'F', 1012360, "Ghanaian");
        Voter v17 = new Voter("Nana", "Oye", 40, 'M', 1012361, "Ghanaian");
        Voter v18 = new Voter("Anita", "Rahman", 29, 'F', 1012362, "Ghanaian");
        Voter v19 = new Voter("Michael", "Quarshie", 26, 'M', 1012363, "Ghanaian");
        Voter v20 = new Voter("Freda", "Lomotey", 18, 'F', 1012364, "Ghanaian");

        //Officers at the polling station ->>>>operating station is the location of the station where the Electoral officer works.
        ElectoralOfficer officer10 = new ElectoralOfficer("Rebecca", "Awuah", 24, 'F', 60310, "Ghanaian", "195701", "Polling Station", "Berekuso");
        ElectoralOfficer officer11 = new ElectoralOfficer("Eric", "Ocran", 26, 'M', 60312, "Ghanaian", "195702", "Polling Station", "Temale");
        ElectoralOfficer officer12 = new ElectoralOfficer("Joseph", "Mensah", 35, 'M', 60313, "Ghanaian", "195703", "Polling Station", "Kasoa");
        ElectoralOfficer officer13 = new ElectoralOfficer("Stepan", "Amoah", 32, 'M', 60314, "Ghanaian", "195704", "Polling Station", "Achimota");
        ElectoralOfficer officer14 = new ElectoralOfficer("Ayawoa", "Dagbovie", 27, 'F', 60315, "Ghanaian", "195705", "Polling Station", "Legon");
        ElectoralOfficer officer15 = new ElectoralOfficer("Patrick", "Yemofio", 29, 'M', 60316, "Ghanaian", "195706", "Polling Station", "Madina");

        /* -->> not relevant for this testing.
        ElectoralOfficer officer16 = new ElectoralOfficer("Angela", "Ansah", 24, 'F', 603117, "Ghanaian", "195707", "Polling Station", "Kwabenya");
        ElectoralOfficer officer17 = new ElectoralOfficer("Jonas", "Ecke", 34, 'M', 60318, "Ghanaian", "195708", "Polling Station", "Belo");
        ElectoralOfficer officer18 = new ElectoralOfficer("Sefa", "Boateng", 28, 'F', 60319, "Ghanaian", "195709", "Polling Station", "Aburi");
        ElectoralOfficer officer19 = new ElectoralOfficer("Frederick", "Plange", 26, 'M', 60311, "Ghanaian", "195710", "Polling Station", "Ashomang");
        ElectoralOfficer officer7 = new ElectoralOfficer("Jojoe", "Ainoo", 23, 'M', 1354, "Ghanaian", "24684", "District Office", "Nsimalen");
        ElectoralOfficer officer8 = new ElectoralOfficer("Fafa", "Owusu", 24, 'F', 1355, "Ghanaian", "24685", "District Office", "Tarkrade");
        ElectoralOfficer officer9 = new ElectoralOfficer("David", "Sampah", 30, 'M', 1356, "Ghanaian", "24686", "District Office", "Omnisport");
        */

        //Officer Details for the national Level
        ElectoralOfficer officer1 = new ElectoralOfficer("Rodney", "Ngoh", 24, 'M', 123456, "Ghanaian", "24681357", "National Head Quater", "Accra");

        //Officer Details for the Regional Level
        ElectoralOfficer officer2 = new ElectoralOfficer("Akosua", "Debrah", 22, 'F', 123457, "Ghanaian", "24681358", "Regional Office", "Dansoman");
        ElectoralOfficer officer3 = new ElectoralOfficer("Jacob", "Koranteng", 25, 'M', 123458, "Ghanaian", "24681359", "Regional Office", "Akrade");

        //Officer Details for the District level
        ElectoralOfficer officer4 = new ElectoralOfficer("Panashe", "Taruwinga", 24, 'M', 1351, "Ghanaian", "24681", "District Office", "Cape coast");
        ElectoralOfficer officer5 = new ElectoralOfficer("Elvis", "Asirifi", 26, 'M', 1352, "Ghanaian", "24682", "District Office", "Jehbo");
        ElectoralOfficer officer6 = new ElectoralOfficer("Ebo", "Yamooah", 32, 'M', 1353, "Ghanaian", "24683", "District Office", "Niasoso");


        /**
         * testing for 6 polling stations in 3 district offices (2 in each), in 2 Regional office (1 and 2 for each), in 1 national head quarter
         * testing for 6 candidates and for 20 voters
         */


        //PollingStations

        ArrayList<Integer> numberofVotes_Poll1 = new ArrayList<>();
        ArrayList<Integer> numberofVotes_Poll2 = new ArrayList<>();
        ArrayList<Integer> numberofVotes_Poll3 = new ArrayList<>();
        ArrayList<Integer> numberofVotes_Poll4 = new ArrayList<>();
        ArrayList<Integer> numberofVotes_Poll5 = new ArrayList<>();
        ArrayList<Integer> numberofVotes_Poll6 = new ArrayList<>();

        PollingStation p1 = new PollingStation("AMENFI CENTRAL", officer10, numberofVotes_Poll1);
        PollingStation p2 = new PollingStation("AGOTIME-ZIOPE", officer11, numberofVotes_Poll2);
        PollingStation p3 = new PollingStation("WENCHI", officer12, numberofVotes_Poll3);
        PollingStation p4 = new PollingStation("OLD TAFO", officer13, numberofVotes_Poll4);
        PollingStation p5 = new PollingStation("ANLO", officer14, numberofVotes_Poll5);
        PollingStation p6 = new PollingStation("EKUMFI", officer15, numberofVotes_Poll6);

        /* --> not useful for this testing.
        PollingStation p7 = new PollingStation("MADINA", officer16, 64544);
        PollingStation p8 = new PollingStation("JIRAPA", officer17, 78995);
        PollingStation p9 = new PollingStation("TAIN", officer18, 24567);
        PollingStation p10 = new PollingStation("LEDZOKUKU", officer19, 85432);
         */

        //DistrictOffice
        ArrayList<Integer> numberofVotes_do1 = new ArrayList<>();
        ArrayList<Integer> numberofVotes_do2 = new ArrayList<>();
        ArrayList<Integer> numberofVotes_do3 = new ArrayList<>();

        DistrictOffice do1 = new DistrictOffice("Ga West", officer4, numberofVotes_do1);
        DistrictOffice do2 = new DistrictOffice("Tamale Metropolitan", officer5, numberofVotes_do2);
        DistrictOffice do3 = new DistrictOffice("Sekyere East", officer6, numberofVotes_do3);

        /* ---> not useful for this testing.
        DistrictOffice do4 = new DistrictOffice("Ekumfi", officer7, 4556, 24567);
        DistrictOffice do5 = new DistrictOffice("Ho West", officer8, 5555, 1010);
        DistrictOffice do6 = new DistrictOffice("Bolgatanga East", officer9, 1001, 3001);
        */

        //RegionalOffice
        ArrayList<Integer> numberofVotes_ro1 = new ArrayList<>();
        ArrayList<Integer> numberofVotes_ro2 = new ArrayList<>();

        RegionalOffice ro1 = new RegionalOffice("Ga West", officer2, numberofVotes_ro1);
        RegionalOffice ro2 = new RegionalOffice("Tamale Metropolitan", officer3, numberofVotes_ro2);

        //National Head Quaters
        ArrayList<Integer> numberofVotes_final = new ArrayList<>();

        NationalHQ national = new NationalHQ("Ga West", officer1, numberofVotes_final);

        //Candidate
        Candidate c1 = new Candidate("Nana", "Akufo-Addo", 77, 'M', 1012301, "Ghanaian", 0, "New Patriotic Party (NPP)");
        Candidate c2 = new Candidate("John", "Mahama", 63, 'M', 1012302, "Ghanaian", 1, " National Democratic Congress (NDC)");
        Candidate c3 = new Candidate("Ivor", "Greenstreet", 55, 'M', 1012303, "Ghanaian", 2, "Convention People's Party (CPP)");
        Candidate c4 = new Candidate("Hassan", "Ayariga", 49, 'M', 1012304, "Ghanaian", 3, " All People's Congress (APC)");
        Candidate c5 = new Candidate("Akua", "Donkor", 70, 'F', 1012305, "Ghanaian", 4, " Ghana Freedom Party (GFP)");
        Candidate c6 = new Candidate("Henry Herbert", "Lartey", 68, 'M', 1012306, "Ghanaian", 5, "Great Consolidated Popular Party");


        /*** register 20 voters for election and 6 candidate
         *   register 4 voters in poll1, 3 in poll2, 4 in poll3, 2 in poll4, 5 in poll5, 2 in poll6
         *   register 6 candidates for all polling stations
         */

        //we first begin by creating linkedlists, that would hold the content of registered voters and the registered candidates.
        //later we use the setRegisteredVoters and setRegisteredCandidates methods in the pollingstations to initialize the voters
        //and candidates for each polling station.

        // polling stations are p1 ... p6

        //---> poll1 - registered voters
        p1.registerVoter(v1);
        p1.registerVoter(v2);
        p1.registerVoter(v3);
        p1.registerVoter(v4);

        //--> poll2 - registered voters
        p2.registerVoter(v5);
        p2.registerVoter(v6);
        p2.registerVoter(v7);

        //--> poll3 - registered voters
        p3.registerVoter(v8);
        p3.registerVoter(v9);
        p3.registerVoter(v10);
        p3.registerVoter(v11);

        //--> poll4 - registered voters
        p4.registerVoter(v12);
        p4.registerVoter(v13);

        //--> poll5 - registered voters
        p5.registerVoter(v14);
        p5.registerVoter(v15);
        p5.registerVoter(v16);
        p5.registerVoter(v17);
        p5.registerVoter(v18);

        //--> poll6 - registered voters
        p6.registerVoter(v19);
        p6.registerVoter(v20);

        //registered candidates...
        LinkedList<Candidate> RegisteredCandidates = new LinkedList<>();

        RegisteredCandidates.add(c1);
        RegisteredCandidates.add(c2);
        RegisteredCandidates.add(c3);
        RegisteredCandidates.add(c4);
        RegisteredCandidates.add(c5);
        RegisteredCandidates.add(c6);

        //once you register as a voter, your information is included in the RegisteredVoters for that polling station.
        //but when you register as a candidate, your information is included as registered candidate for every polling station.

        p1.setRegisteredCandidates(RegisteredCandidates);
        p2.setRegisteredCandidates(RegisteredCandidates);
        p3.setRegisteredCandidates(RegisteredCandidates);
        p4.setRegisteredCandidates(RegisteredCandidates);
        p5.setRegisteredCandidates(RegisteredCandidates);
        p6.setRegisteredCandidates(RegisteredCandidates);


        /**set number of votes for each candidate to be zero at each constituent level before the election begins.*/

        //----------polling stations -----------//
        p1.initializeVotes(p1.getNumberOfVotes(),RegisteredCandidates.size());
        p2.initializeVotes(p2.getNumberOfVotes(),RegisteredCandidates.size());
        p3.initializeVotes(p3.getNumberOfVotes(),RegisteredCandidates.size());
        p4.initializeVotes(p4.getNumberOfVotes(),RegisteredCandidates.size());
        p5.initializeVotes(p5.getNumberOfVotes(),RegisteredCandidates.size());
        p6.initializeVotes(p6.getNumberOfVotes(),RegisteredCandidates.size());

        //----------District Offices -----------//
        do1.initializeVotes(do1.getNumberOfVotes(),RegisteredCandidates.size());
        do2.initializeVotes(do2.getNumberOfVotes(),RegisteredCandidates.size());
        do3.initializeVotes(do3.getNumberOfVotes(),RegisteredCandidates.size());

        //----------Regional Offices ----------//
        ro1.initializeVotes(ro1.getNumberOfVotes(),RegisteredCandidates.size());
        ro2.initializeVotes(ro2.getNumberOfVotes(),RegisteredCandidates.size());

        //----------National Head Quarters ----------//
        national.initializeVotes(national.getNumberOfVotes(),RegisteredCandidates.size());


        /*** V O T I N G ------------->
         *
         * Expected Results: 6 voters vote for candidate1, 3 for candidate2, 4 for candidate3, 1 for candidate4, 2 for candidate5, 4 for candidate6
         *
         * Inputs
         * Candidate 1: 1 vote from each of the six PollingStation, (ticked)
         * Candidate 2: 1 vote each from 3 out of the six PS,  (ticked)
         * Candidate 3: 2 votes from 1PS and 2votes from another PS out of six, (ticked)
         * Candidate 4: 1 vote from 1PS out of the six,
         * Candidate 5: 2 votes in 1PS out of the 6, (ticked)
         * Candidate 6: 1vote in 1PS, 2votes in 1PS and 1vote in 1PS out of the six) (ticked)
         *
         */

        //----------Poll 1 ----------//
        // registered voters in poll one are v1 ... v4
        //
        // Rule: Candidate 1: v1 votes
        //       Candidate 2: v2 votes
        //       Candidate 3: v3 and v4 votes
        //       Candidate 4: no votes
        //       Candidate 5: no votes
        //       Candidate 6: no votes

        p1.vote(v1,c1);
        p1.vote(v2,c2);
        p1.vote(v3,c3);
        p1.vote(v4,c3);

        //----------Poll 2 ----------//
        // registered voters in poll one are v5 ... v7
        //
        // Rule: Candidate 1: v5 votes
        //       Candidate 2: v6 votes
        //       Candidate 3:
        //       Candidate 4:
        //       Candidate 5:
        //       Candidate 6: v7 votes

        p2.vote(v5,c1);
        p2.vote(v6,c2);
        p2.vote(v7,c6);

        //----------Poll 3 ----------//
        // registered voters in poll one are v8 ... v11
        //
        // Rule: Candidate 1:  v8 votes
        //       Candidate 2:  v9 votes
        //       Candidate 3:  v10, v11 votes
        //       Candidate 4:
        //       Candidate 5:
        //       Candidate 6:

        p3.vote(v8,c1);
        p3.vote(v9,c2);
        p3.vote(v10,c3);
        p3.vote(v11,c3);

        //----------Poll 4 ----------//
        // registered voters in poll one are v12 ... v13
        //
        // Rule: Candidate 1: v12 votes
        //       Candidate 2:
        //       Candidate 3:
        //       Candidate 4: v13 votes
        //       Candidate 5:
        //       Candidate 6:

        p4.vote(v12,c1);
        p4.vote(v13,c4);

        //----------Poll 5 ----------//
        // registered voters in poll one are v14 ... v18
        //
        // Rule: Candidate 1:  v14 votes
        //       Candidate 2:
        //       Candidate 3:
        //       Candidate 4:
        //       Candidate 5: v17, v18 votes
        //       Candidate 6: v15, v16 votes

        p5.vote(v14,c1);
        p5.vote(v17,c5);
        p5.vote(v18,c5);
        p5.vote(v15,c6);
        p5.vote(v16,c6);

        //----------Poll 6 ----------//
        // registered voters in poll one are v19 ... v20
        //
        // Rule: Candidate 1:  v19 votes
        //       Candidate 2:
        //       Candidate 3:
        //       Candidate 4:
        //       Candidate 5:
        //       Candidate 6: v20 votes

        p6.vote(v19,c1);
        p6.vote(v20,c6);


        /** C O L L A T E  R E S U L T S
         *
         * Here we intend to collate the election results in an upward fashion to obtained the above expected results
         * We begin at the district level, then to the Regional level and then to the National level
         * Currently we have 3 district offices, 2 regional offices and 1 national head quarters.
         *
         * Recall:
         * testing for 6 polling stations in 3 district offices (2 in each), in 2 Regional office (1 and 2 for each), in 1 national head quarter
         * testing for 6 candidates and for 20 voters
         */

        //first we must identify all pollingstations that are in the same district and then collate their results

        //p1 and p2 belong to do1 --->
        do1.collatePollingStation(p1);
        do1.collatePollingStation(p2);
        ArrayList<Integer> collated_districtResult01 = do1.getDistrictResults(do1);

        //p3 and p4 belong to do2 --->
        do2.collatePollingStation(p3);
        do2.collatePollingStation(p4);
        ArrayList<Integer> collated_districtResult02 = do2.getDistrictResults(do2);

        //p5 and p6 belong to do3 --->
        do3.collatePollingStation(p5);
        do3.collatePollingStation(p6);
        ArrayList<Integer> collated_districtResult03 = do3.getDistrictResults(do3);


        //second we must identify all the district offices that are in same region and then collate their results

        //do1 and do2 belong to ro1 -->
        ro1.collateDistrictOffice(do1);
        ro1.collateDistrictOffice(do2);

        ArrayList<Integer> collated_regionalResult01 = ro1.getRegionalResults(ro1);


        //do3 belong to ro2 -->
        ro2.collateDistrictOffice(do3);

        ArrayList<Integer> collated_regionalResult02 = ro2.getRegionalResults(ro2);


        //lastly we must identify all the regions that belong to the same nation and then collate their results.

        //ro1 and ro2 belong to national.-->
        national.collateRegionalOffice(ro1);
        national.collateRegionalOffice(ro2);

        ArrayList<Integer> final_results = national.getNationalResult(national);
        System.out.println(final_results);

        /** output
         * 6, 3, 4, 1, 2, 4
         *
         * Recall
         * Expected Results: 6 voters vote for candidate1, 3 for candidate2, 4 for candidate3, 1 for candidate4, 2 for candidate5, 4 for candidate6
         *
         * Results are as expected - code validated!
         */
    }
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package votingui;

/**
 *
 * @author harshit
 */
public class Voter {
    private String voterName[][] = new String[44][2];
    private int voterVotes[] = new int[44];
    
    public Voter() {    
        voterName[0][0] = "AAS";
        voterName[1][0] = "ADI";
        voterName[2][0] = "AKA";
        voterName[3][0] = "ANA";
        voterName[4][0] = "ANK";
        voterName[5][0] = "ARJ";
        voterName[6][0] = "ASH";
        voterName[7][0] = "BAL";
        voterName[8][0] = "BHA";
        voterName[9][0] = "BHA";
        voterName[10][0] = "DEV";
        voterName[11][0] = "DHA";
        voterName[12][0] = "EKL";
        voterName[13][0] = "GAU";
        voterName[14][0] = "HAR";
        voterName[15][0] = "HAR";
        voterName[16][0] = "HIT";
        voterName[17][0] = "KIR";
        voterName[18][0] = "MAN";
        voterName[19][0] = "MAN";
        voterName[20][0] = "MAY";
        voterName[21][0] = "NAN";
        voterName[22][0] = "NAV";
        voterName[23][0] = "NIR";
        voterName[24][0] = "NIT";
        voterName[25][0] = "OMK";
        voterName[26][0] = "PAR";
        voterName[27][0] = "PAR";
        voterName[28][0] = "PRA";
        voterName[29][0] = "PRA";
        voterName[30][0] = "RAJ";
        voterName[31][0] = "RAV";
        voterName[32][0] = "RIS";
        voterName[33][0] = "RUD";
        voterName[34][0] = "SAH";
        voterName[35][0] = "SAU";
        voterName[36][0] = "SHA";
        voterName[37][0] = "SHA";
        voterName[38][0] = "SHR";
        voterName[39][0] = "SUN";
        voterName[40][0] = "VED";
        voterName[41][0] = "VIK";
        voterName[42][0] = "YAT";
        voterName[43][0] = "ZAL";
        
        voterName[0][1] = "11701";
        voterName[1][1] = "11702";
        voterName[2][1] = "11703";
        voterName[3][1] = "11704";
        voterName[4][1] = "11705";
        voterName[5][1] = "11706";
        voterName[6][1] = "11707";
        voterName[7][1] = "11708";
        voterName[8][1] = "11709";
        voterName[9][1] = "11710";
        voterName[10][1] = "11711";
        voterName[11][1] = "11712";
        voterName[12][1] = "11713";
        voterName[13][1] = "11714";
        voterName[14][1] = "11715";
        voterName[15][1] = "11716";
        voterName[16][1] = "11717";
        voterName[17][1] = "11718";
        voterName[18][1] = "11719";
        voterName[19][1] = "11720";
        voterName[20][1] = "11721";
        voterName[21][1] = "11722";
        voterName[22][1] = "11723";
        voterName[23][1] = "11724";
        voterName[24][1] = "11725";
        voterName[25][1] = "11726";
        voterName[26][1] = "11727";
        voterName[27][1] = "11728";
        voterName[28][1] = "11729";
        voterName[29][1] = "11730";
        voterName[30][1] = "11731";
        voterName[31][1] = "11732";
        voterName[32][1] = "11733";
        voterName[33][1] = "11734";
        voterName[34][1] = "11735";
        voterName[35][1] = "11736";
        voterName[36][1] = "11737";
        voterName[37][1] = "11738";
        voterName[38][1] = "11739";
        voterName[39][1] = "11740";
        voterName[40][1] = "11741";
        voterName[41][1] = "11742";
        voterName[42][1] = "11743";
        voterName[43][1] = "11744";
        
        
    }
    
    String getVoterUser(int i) {
        return voterName[i][1];
    }
    
    String getVoterPass(int i) {
        return voterName[i][0];
    }
    
    void voterVoted(int i) {
        voterVotes[i] = 1;
    }
    /*
    void voter2Voted() {
        voterVotes[1] = 1;
    }
    void voter3Voted() {
        voterVotes[2] = 1;
    }
    */
    
    void voterReset() {
        for (int i=0;i<44;++i) {
            voterVotes[i] = 0;
        }
    }
    /*void voter2Reset() {
        voterVotes[1] = 0;
    }
    void voter3Reset() {
        voterVotes[2] = 0;
    }
    */
    public int getvoter(int i) {
        return voterVotes[i];
    }
    /*
    public int getvoter2() {
        return voterVotes[1];
    }
    public int getvoter3() {
        return voterVotes[2];
    }
    */
    
    
}

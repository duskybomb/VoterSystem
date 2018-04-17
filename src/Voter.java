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
    private String voterName[] = new String[3];
    private int voterVotes[] = new int[3];
    
    public Voter() {    
        voterName[0] = "Harshit Joshi";
        voterName[1] = "Manas Awasthi";
        voterName[2] = "Mayank Malik";
    }
    
    void voter1Voted() {
        voterVotes[0] = 1;
    }
    void voter2Voted() {
        voterVotes[1] = 1;
    }
    void voter3Voted() {
        voterVotes[2] = 1;
    }
    public int getvoter1() {
        return voterVotes[0];
    }
    public int getvoter2() {
        return voterVotes[1];
    }
    public int getvoter3() {
        return voterVotes[2];
    }
    
    
}

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
public class Candidate {
    private String candName[] = new String[3];
    private int candVotes[] = new int[3];
    
    public Candidate() {    
        candName[0] = "Harshit Joshi";
        candName[1] = "Manas Awasthi";
        candName[2] = "Mayank Malik";
    }
    
    public void cand1() {
        candVotes[0]++;
    }
    public void cand2() {
        candVotes[1]++;
    }
    public void cand3() {
        candVotes[2]++;
    }
    
    public void cand1Reset() {
        candVotes[0] = 0;
    }
    public void cand2Reset() {
        candVotes[1] = 0;
    }
    public void cand3Reset() {
        candVotes[2] = 0;
    }
    
    public int getcan1(){
        return candVotes[0];
    }

    public int getcan2(){
        return candVotes[1];
    }

    public int getcan3(){
        return candVotes[2];
    }
}

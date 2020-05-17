/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HRCompanion;

/**
 *
 * @author themi
 */
public class RegionalManagerPerformance extends Performance{
    
    private int leadership,communication,motivation,quastionnaire,statement;
    
    public RegionalManagerPerformance (int overal_score, String date,int leadership, int communication, int motivation, int quastionnaire, int statement)
    {
       super(overal_score,date); 
       this.overal_score=overal_score;
       this.date=date;
       this.leadership=leadership;
       this.communication=communication;
       this.motivation=motivation;
       this.quastionnaire=quastionnaire;
       this.statement=statement;
       
    }
    
    public int getleadership(){
        return leadership;
    }
    
    public int getcommunication(){
        return communication;
    }
    
    public int getmotivation(){
        return motivation;
    }
    
    public int getquastionnaire(){
        return quastionnaire;
    }
    
    public int getstatement(){
        return statement;
    }
}

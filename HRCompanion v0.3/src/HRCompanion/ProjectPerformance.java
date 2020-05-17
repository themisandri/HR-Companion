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
public class ProjectPerformance extends Performance {
    private String questionnaire,comments ;
    double cost;
    int time, percent_of_specs_met;
    
    public ProjectPerformance (int overal_score, String date,String questionnaire,String comments,double cost,int time, int percent_of_specs_met )
    {
       super(overal_score,date);    
       this.overal_score=overal_score;
       this.date=date;
       this.questionnaire=questionnaire;
       this.comments=comments;
       this.cost=cost;
       this.time=time;
       this.percent_of_specs_met=percent_of_specs_met;
    
    }
    
    public String getquestionnaire(){
        return questionnaire;
    }
    
    public String getcomments(){
        return comments;
    }
    
    public double getcost(){
        return cost;
    }
    
    public int gettime(){
        return time;
    }
    
    public int getpercent_of_specs_met(){
        return percent_of_specs_met;
    }
}

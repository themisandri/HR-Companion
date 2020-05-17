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
public class EmployeePerformance extends Performance{
    
    private int technical_knowledge,productivity,deadlines,quality_of_work,teamwork,communication_skills,improvement;
    private String written_report;
    
    public EmployeePerformance (int overal_score, String date,int technical_knowledge, int productivity, int deadlines, int quality_of_work, int teamwork, int communication_skills, int improvement, String written_report)
    {
       super(overal_score,date); 
       this.overal_score=overal_score;
       this.date=date;
       this.technical_knowledge=technical_knowledge;
       this.productivity=productivity;
       this.deadlines=deadlines;
       this.quality_of_work=quality_of_work;
       this.teamwork=teamwork;
       this.communication_skills=communication_skills;
       this.improvement=improvement;
       this.written_report=written_report;
       
    }
    
    public int getoveral_score(){
        return overal_score;
    }
    
    public String getdate(){
        return date;
    }
    
    public int gettechnical_knowledge(){
        return technical_knowledge;
    }
    
    public int getproductivity(){
        return productivity;
    }
    
    public int getdeadlines(){
        return deadlines;
    }
    
    public int getquality_of_work(){
        return quality_of_work;
    }
    
    public int getteamwork(){
        return teamwork;
    }
    
    public int getcommunication_skills(){
        return communication_skills;
    }
    
    public int getimprovement(){
        return improvement;
    }
    
    public String getwritten_report(){
        return written_report;
    }
}

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
public class TeamPerformance extends Performance {
    
    int cooperation,quality_of_work,final_result;
    String deadlines;
    
    public TeamPerformance (int overal_score, String date,int cooperation,int quality_of_work,int final_result, String deadlines)
    {
    
     super(overal_score,date);
     this.cooperation=cooperation;
     this.quality_of_work=quality_of_work;
     this.final_result=final_result;
     this.deadlines=deadlines;
    }
    
    public int getcooperation(){
        return cooperation;
    }
    
    public int getquality_of_work(){
        return quality_of_work;
    }
    
    public int getfinal_result(){
        return final_result;
    }
    
    public String getdeadlines(){
        return deadlines;
    }
}

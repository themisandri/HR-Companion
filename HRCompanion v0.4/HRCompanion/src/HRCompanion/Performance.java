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
public class Performance {
    protected int overal_score;
    protected String date;



public Performance (int overal_score, String date)
    {
       this.overal_score=overal_score;
       this.date=date;
       
    }




public int getscore(){
        return overal_score;
    }
    
    public String getdate(){
        return date;
    }

}
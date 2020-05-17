/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HRCompanion;


class Meeting {
    private int duration;
    private String date,room;
    
    public Meeting (int duration, String date, String room)
    {
       this.room=room;
       this.date=date;
       this.duration=duration;
      
    }
    
    public int getduration(){
        return room;
    }
    
    public String getdate(){
        return date;
    }
    
    public String getroom(){
        return duration;
    }
    
   
    
}
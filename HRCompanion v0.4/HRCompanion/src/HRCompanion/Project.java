/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HRCompanion;


class Project {
    private int id;
    private String name,description;
    
    public Project (int id,String name, String description)
    {
       this.id = id;
       this.name=name;
       this.description=description;
    }
    
    public String getname(){
        return name;
    }
    
    public int getid(){
        return id;
    }
    
    public String getdescription(){
        return description;
    }
    
}
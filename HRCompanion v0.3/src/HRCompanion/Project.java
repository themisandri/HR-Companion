/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HRCompanion;


class Project {
    private String name,description;
    
    public Project (String name, String description)
    {
       this.name=name;
       this.description=description;
    }
    
    public String getname(){
        return name;
    }
    
    public String getdescription(){
        return description;
    }
    
}
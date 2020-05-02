/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HRCompanion;


class User {
    private int id;
    private String username,password,type,name,email,gender;
    
    public User (int id, String username, String password,String type, String name, String email, String gender)
    {
       this.id=id;
       this.username=username;
       this.password=password;
       this.type=type;
       this.name=name;
       this.email=email;
       this.gender=gender;
    }
    
    public int getid(){
        return id;
    }
    
    public String getusername(){
        return username;
    }
    
    public String getpassword(){
        return password;
    }
    
    public String gettype(){
        return type;
    }
    
    public String getname(){
        return name;
    }
    
    public String getemail(){
        return email;
    }
    
    public String getgender(){
        return gender;
    }
    
}

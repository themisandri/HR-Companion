package HRCompanion;


public class Client extends User{
   
	
	public Client (int id, String username, String password,String type, String name, String email, String gender)
	{
	
	 super(id,username,password,type,name,email,gender);
	  this.id=id;
	  this.username=username;
	  this.password=password;
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

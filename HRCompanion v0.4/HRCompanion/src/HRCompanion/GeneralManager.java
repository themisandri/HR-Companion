package HRCompanion;

public class GeneralManager extends User{
    private String leave;

	
	public GeneralManager (String leave, int id, String username, String password,String type, String name, String email, String gender)
	{
	  super(id,username,password,type,name,email,gender);
	  this.leave=leave;
	  this.id=id;
	  this.username=username;
	  this.password=password;
	  this.name=name;
	  this.email=email;
	  this.gender=gender;
	  
	  }
	  
	  public String getleave() {
	  return leave;
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
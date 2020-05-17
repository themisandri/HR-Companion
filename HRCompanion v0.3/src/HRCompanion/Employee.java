package HRCompanion;

public class Employee extends User{
    private boolean promotion_match;
    private String feedback,leave;
	
	public Employee (boolean promotion_match,String feedback,String leave, int id, String username, String password,String type, String name, String email, String gender)
	{
	  super(id,username,password,type,name,email,gender);
	  this.leave=leave;
	  this.feedback=feedback;
	  this.id=id;
	  this.username=username;
	  this.password=password;
	  this.name=name;
	  this.email=email;
	  this.gender=gender;
	  
	  }
	  
	  public boolean getpromotion_match() {
	  return promotion_match;
	  }
	  
	  public String getfeedback() {
	  return feedback; 
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
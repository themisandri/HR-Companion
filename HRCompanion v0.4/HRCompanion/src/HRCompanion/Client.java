package HRCompanion;


public class Client extends User{
   String review;
   	
	public Client (int id, String username, String password,String type,String name,String email, String gender, String review)
	{
	
	  super(id,username,password,type,name,email,gender);
	  this.name=name;
	  this.review =review;
	  
	  }
	  
	 
    
    
    public String getclientname(){
        return name;
    }
    
    public String getclientreview(){
        return review;
    }
    
    
    
}

public class Students extends Admission{  
    //private data members  
    private String email,id ;  
    private int birth_year;  
    
     //getter method for id  
    public String getId(){  
      return id;  
    }  
    //setter method for id  
    public void setId(String id){  
      this.id=id ; 
    }  
      //getter method for birth_year  
    public int getBirth_year(){  
      return birth_year;  
    }  
    //setter method for bitrh_year  
    public void setBirth_year(int birth_year){  
      this.birth_year=birth_year ; 
    } 
     //getter method for email  
    public String getEmail(){  
      return email;  
    }  
    //setter method for email  
    public void setEmail(String email){  
      this.email=email ; 
    }  

    void welcome(){
        System.out.println("--------------Information about students---------");
    } 

}  
public class University{  
    private String name, surname;

    void welcome(){
        System.out.println("Welcome to the system");
    }  

    public String getName(){  
      return name;  
    }  
     
    public void setName(String name){  
      this.name=name ; 
    }  

    public String getSurname(){  
      return surname;  
    }  
    
    public void setSurname(String surname){  
      this.surname=surname ; 
    }  
        
}  
public class Administration extends Employees{  
    //private data members  
    private String position, level;
   
    void welcome(){
        System.out.println("--------------Information about administration---------");
    } 
    
    public String getPosition(){  
      return position;  
    }  
    
    public void setPosition(String position){  
      this.position=position ; 
    }  

    public String getLevel(){  
      return level;  
    }  
    
    public void setLevel(String level){  
      this.level=level ; 
    } 

    
   
}  
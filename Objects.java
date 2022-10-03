public class Objects  extends Departments{  
    //private data members  
    private String professor;
    private int credits,lessons;
    private boolean mandatory;
    
    public String getProfessor(){  
      return professor;  
    }  
      
    public void setProfessor(String professor){  
      this.professor=professor; 
    }  

    public int getCredits(){  
      return credits;  
    }  
      
    public void setCredits(int credits){  
      this.credits=credits ; 
    }  

    public int getLessons(){  
      return lessons;  
    }  
      
    public void setLessons(int lessons){  
      this.lessons=lessons ; 
    }  

    public boolean getMandatory(){  
      return mandatory;  
    }  
      
    public void setMandatory(boolean mandatory){  
      this.mandatory=mandatory ; 
    }  

    void welcome(){
        System.out.println("--------------Information about objects---------");
    } 

   
}  
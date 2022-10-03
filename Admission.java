public class Admission extends University{  
    //private data members  
    private double grade;
    private int exam;
    
    void welcome(){
        System.out.println("--------------Information about admission---------");
    } 
    public double getGrade(){  
      return grade;  
    }  
      
    public void setGrade(double grade){  
      this.grade=grade ; 
    }  

    public int getExam(){  
      return exam;  
    }  
      
    public void setExam(int exam){  
      this.exam=exam ; 
    }  
    
   
}  

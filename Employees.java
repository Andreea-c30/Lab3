public class Employees extends University{  
    //private data members   
    private int working_hours, p_h;

   //getter method for working_hours  
    public int getWorking_hours(){  
      return working_hours;  
    }  
    //setter method for working_hours  
    public void setWorking_hours(int working_hours){  
      this.working_hours=working_hours ; 
    }  
    //getter method for price per hour  
    public int getP_h(){  
      return p_h;  
    }  
    //setter method for price per hour  
    public void setP_h(int p_h){  
      this.p_h=p_h ; 
    } 
    //overriding the method salary
    public double salary(){
      double salary;
      salary=working_hours*p_h;
      return salary;
    }
}  
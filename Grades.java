public class Grades extends Students{  
    //private data members   
    private float sem1,sem2; 
    private int absence;

    void welcome(){
        System.out.println("--------------Information about student's grades---------");
    } 
    
    public float getSem1(){  
      return sem1;  
    }  
   
    public void setSem1(float sem1){  
      this.sem1=sem1 ; 
    }      

    public float getSem2(){  
      return sem2;  
    }  
   
    public void setSem2(float sem2){  
      this.sem2=sem2 ; 
    } 

    public int getAbsence(){  
      return absence;  
    }  
   
    public void setAbsence(int absence){  
      this.absence=absence ; 
    }  

    

}  
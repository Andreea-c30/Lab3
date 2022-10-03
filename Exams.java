public class Exams extends Students{   
    //private data members  
    private String object;
    private boolean admis;
    
    public String getObj(){  
      return object;  
    }  
      
    public void setObj(String object){  
      this.object=object; 
    }  

    public boolean getAdmis(){  
      return admis;  
    }  
      
    public void setAdmis(boolean admis){  
      this.admis=admis ; 
    }  

    void welcome(){
        System.out.println("--------------Information about exams---------");
    } 

   
}  
public class Schedule extends Groups{  
    //private data members  
    private String professor;
    private int cab,starth,startmin,finishh,finishmin;
    
    

   public String getProfessor(){  
      return professor;  
    }  
     
    public void setProfessor(String professor){  
      this.professor=professor ; 
    }  

    public int getCab(){  
      return cab;  
    }  
     
    public void setCab(int cab){  
      this.cab=cab ; 
    }  
    public int getSth(){  
      return starth;  
    }  
     
    public void setSth(int starth){  
      this.starth=starth ; 
    }  
    public int getStmin(){  
      return startmin;  
    }  
     
    public void setStmin(int startmin){  
      this.startmin=startmin ; 
    } 

    public int getFinh(){  
      return finishh;  
    }  
     
    public void setFinh(int finishh){  
      this.finishh=finishh ; 
    }  

    public int getFinmin(){  
      return finishmin;  
    }  
     
    public void setFinmin(int finishmin){  
      this.finishmin=finishmin ; 
    }  

    void welcome(){
        System.out.println("--------------Information about schedule---------");
    } 


   
}  
public class Groups extends Departments{  
    //private data members   
    private int begin,nr_st;
    private String number;

    void welcome(){
        System.out.println("--------------Information about groups---------");
    } 
    
    public int getBegin(){  
      return begin;  
    }  
   
    public void setBegin(int begin){  
      this.begin=begin ; 
    }  
    public String getNumber(){  
      return number;  
    }  
   
    public void setNumber(String number){  
      this.number=number ; 
    }  

    public int getNr_st(){  
      return nr_st;  
    }  
   
    public void setNr_st(int nr_st){  
      this.nr_st=nr_st ; 
    }  

    

    
}  
public class Departments extends University{  
    //private data members  
    private String head, deputy, partners;  
    private int nr;
    
    void welcome(){
        System.out.println("--------------Information about departments---------");
    } 
    
    public String getHead(){  
      return head;  
    }  
     
    public void setHead(String head){  
      this.head=head ; 
    }  

    public String getDeputy(){  
      return deputy;  
    }  
     
    public void setDeputy(String deputy){  
      this.deputy=deputy ; 
    }  

    public int getNr(){  
      return nr;  
    }  
   
    public void setNr(int nr){  
      this.nr=nr ; 
    }  

    public String getPartners(){  
      return partners;  
    }  
     
    public void setPartners(String partners){  
      this.partners=partners ; 
    }  

    
}  
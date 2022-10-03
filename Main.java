import java.util.Scanner;    
class Main{  

    public static void admission(){

        //creating instance of the encapsulated class 
        Admission pr1=new Admission(); 
        Admission pr2=new Admission();  
        Admission pr3=new Admission();  
        pr1.welcome();
        pr1.setName("Anna");
        pr1.setSurname("Miro");
        pr1.setGrade(9.1);
        pr1.setExam(8);

        pr2.setName("Melisa");
        pr2.setSurname("Marin");
        pr2.setGrade(7.3);
        pr2.setExam(7);

        pr3.setName("Jake");
        pr3.setSurname("laurentis");
        pr3.setGrade(8.5);
        pr3.setExam(9);
        
        double contgr1=(pr1.getGrade()*0.6)+(pr1.getExam()*0.4);
        boolean fund;
        if (contgr1>8.5){
            fund=true;
        }else
            fund=false;
        
        System.out.println("\nStudent: "+pr1.getName()+" "+pr1.getSurname()+"\tContest grade: "+contgr1+"\tState funding: "+fund);

        double contgr2=(pr2.getGrade()*0.6)+(pr2.getExam()*0.4);
        boolean fund2;
        if (contgr2>8.5){
            fund2=true;
        }else
            fund2=false;
        System.out.println("\nStudent: "+pr2.getName()+" "+pr2.getSurname()+"\tContest grade: "+contgr2+"\tState funding: "+fund2);

        double contgr3=(pr3.getGrade()*0.6)+(pr3.getExam()*0.4);
        boolean fund3;
        if (contgr3>8.5){
            fund3=true;
        }else
            fund3=false;
        System.out.println("\nStudent: "+pr3.getName()+" "+pr3.getSurname()+"\tContest grade: "+contgr3+"\tState funding: "+fund3);

    } 

    public static void studentdata(){
        //Data about students
        //creating instance of the encapsulated class 
        //Getting the information about the student 
        Students s1=new Students(); 
        Students s2=new Students();   
        Students s3=new Students();  
        Students s4=new Students();  
        Students s5=new Students();  
        s1.welcome();
        //setting values for students
        s1.setName("Nicole"); s1.setSurname("Johnson"); s1.setId("27343"); s1.setBirth_year(2002); s1.setEmail("alice.jdf@gmail.com");
        s2.setName("Eduard"); s2.setSurname("Houghes"); s2.setId("27654"); s2.setBirth_year(2000); s2.setEmail("eduard.453@gmail.com");
        s3.setName("Alwin"); s3.setSurname("Faulken"); s3.setId("12303"); s3.setBirth_year(2001); s3.setEmail("alwin.d3s@gmail.com");
        s4.setName("Devorah"); s4.setSurname("Piesaro"); s4.setId("87604"); s4.setBirth_year(2002); s4.setEmail("devorah.jjn@gmail.com");
        s5.setName("Seline"); s5.setSurname("Traversi"); s5.setId("98705"); s5.setBirth_year(2001); s5.setEmail("saline.834@gmail.com");
        //getting values 
        System.out.println("-> Id: "+s1.getId()+"\tName: "+s1.getName()+"\tSurname: "+s1.getSurname()+"\tBirth_year: "+s1.getBirth_year()+"\tEmail: "+s1.getEmail()); 
        System.out.println("-> Id: "+s2.getId()+"\tName: "+s2.getName()+"\tSurname: "+s2.getSurname()+"\tBirth_year: "+s2.getBirth_year()+"\tEmail: "+s2.getEmail()); 
        System.out.println("-> Id: "+s3.getId()+"\tName: "+s3.getName()+"\tSurname: "+s3.getSurname()+"\tBirth_year: "+s3.getBirth_year()+"\tEmail: "+s3.getEmail()); 
        System.out.println("-> Id: "+s4.getId()+"\tName: "+s4.getName()+"\tSurname: "+s4.getSurname()+"\tBirth_year: "+s4.getBirth_year()+"\tEmail: "+s4.getEmail()); 
        System.out.println("-> Id: "+s5.getId()+"\tName: "+s5.getName()+"\tSurname: "+s5.getSurname()+"\tBirth_year: "+s5.getBirth_year()+"\tEmail: "+s5.getEmail()); 

    }   

    public static void studentgrades(){

        //creating instance of the encapsulated class 
        Grades g1=new Grades(); 
        g1.welcome();
        //setting values 
        g1.setId("65657");g1.setSem1(9);g1.setSem2(8);g1.setAbsence(3);
        //getting values 
        float finalgrade=(g1.getSem1()+g1.getSem2())/2;
        boolean scholarship;
        if(finalgrade>=9 && g1.getAbsence()<20){
            scholarship=true;
        }else 
            scholarship=false;
     
        System.out.println("\tStudent code: "+g1.getId()+"\tFinal grade: "+finalgrade+"\tAbsences: "+g1.getAbsence()+"\tScholarship: "+scholarship);

    } 

    public static void exams(){

        //creating instance of the encapsulated class 
        Exams ex1=new Exams(); 
        Exams ex2=new Exams(); 
        ex1.welcome();
        ex1.setId("453426");
        ex1.setObj("mathematics");
        ex1.setAdmis(true);
        ex1.setGrade(10.0);
       
        ex2.setId("753535");
        ex2.setObj("mathematics");
        ex2.setAdmis(true);
        ex2.setGrade(5.5);
        System.out.println("Student code: "+ex1.getId()+"\tObject: "+ex1.getObj()+"\tAdmis: "+ex1.getAdmis()+"\tGrade: "+ex1.getGrade());
        System.out.println("Student code: "+ex2.getId()+"\tObject: "+ex2.getObj()+"\tAdmis: "+ex2.getAdmis()+"\tGrade: "+ex2.getGrade());

    }

    public static void profdata(){

        //Data about professors

        //creating instance of the encapsulated class 
        Professors p1=new Professors(); 
        Professors p2=new Professors();   
        Professors p3=new Professors();  
        p1.welcome();
        //setting values for professors
        p1.setName("Mary"); p1.setSurname("Reid"); p1.setPermanent(true); p1.setWorking_hours(192); p1.setP_h(70);p1.setMedth(11);p1.setPm(90);
        p2.setName("Don"); p2.setSurname("Miles"); p2.setPermanent(false); p2.setWorking_hours(208); p2.setP_h(50);p2.setMedth(9);p2.setPm(89);
        p3.setName("Alice"); p3.setSurname("Hardy"); p3.setPermanent(true); p3.setWorking_hours(200); p3.setP_h(55);p3.setMedth(10);p3.setPm(70);
        //getting values 
        System.out.println("\tName: "+p1.getName()+"\tSurname: "+p1.getSurname()+"\tPermanent_pos: "+"\tSalary: "+p1.salary(p1.getWorking_hours(),p1.getP_h())+"$"); 
        System.out.println("\tName: "+p2.getName()+"\tSurname: "+p2.getSurname()+"\tPermanent_pos: "+"\tSalary: "+p2.salary(p2.getWorking_hours(),p2.getP_h())+"$"); 
        System.out.println("\tName: "+p3.getName()+"\tSurname: "+p3.getSurname()+"\tPermanent_pos: "+"\tSalary: "+p3.salary(p3.getWorking_hours(),p3.getP_h())+"$"); 
   
    }

    public static void administration(){

        //creating instance of the encapsulated class 
        Administration a1=new Administration(); 
        Administration a2=new Administration(); 
        Administration a3=new Administration(); 
        a1.welcome();
        a1.setName("Kalyani");
        a1.setSurname(" Travert");
        a1.setPosition("Head Chef");
        a1.setLevel("Superior");
        a1.setWorking_hours(170);
        a1.setP_h(90);

        a2.setName("Frederick");
        a2.setSurname("Franco");
        a2.setPosition("deputy Chef");
        a2.setLevel("Superior");
        a2.setWorking_hours(173);
        a2.setP_h(80);
        
        a3.setName("Corinne");
        a3.setSurname("Carl");
        a3.setPosition("Secretary");
        a3.setLevel("Medium");
        a3.setWorking_hours(180);
        a3.setP_h(50);

        System.out.println("\n\tName Surname: "+a1.getName()+" "+a1.getSurname()+"\n\tPosition: "+a1.getPosition()+"\n\tLevel: "+a1.getLevel()+"\n\tSalary: "+a1.salary()+" $");
        System.out.println("\n\tName Surname: "+a2.getName()+" "+a2.getSurname()+"\n\tPosition: "+a2.getPosition()+"\n\tLevel: "+a2.getLevel()+"\n\tSalary: "+a2.salary()+" $");
        System.out.println("\n\tName Surname: "+a3.getName()+" "+a3.getSurname()+"\n\tPosition: "+a3.getPosition()+"\n\tLevel: "+a3.getLevel()+"\n\tSalary: "+a3.salary()+" $");
    
       
    } 

    public static void departments(){

        //creating instance of the encapsulated class 
        Departments dr1=new Departments(); 
        Departments dr2=new Departments(); 
        dr1.welcome();
        dr1.setName("Mathematics");
        dr1.setHead(" Malik Schmitt ");
        dr1.setDeputy(" Pille Tucker ");
        dr1.setNr(25);
        dr1.setPartners("Mathematical Association of America");

        dr2.setName("English");
        dr2.setHead(" Jelica Farran ");
        dr2.setDeputy(" Shiva Bakalov ");
        dr2.setNr(40);
        dr2.setPartners("Linguata");
        System.out.println("\nName of the department: "+dr1.getName()
                        +"\nHead Chief: "+dr1.getHead()
                        +"\nDeputy Chief: "+dr1.getDeputy()
                        +"\nNumber of instructors: "+dr1.getNr()
                        +"\nPartners: "+dr1.getPartners());
        System.out.println("\nName of the department: "+dr2.getName()
                        +"\nHead Chief: "+dr2.getHead()
                        +"\nDeputy Chief: "+dr2.getDeputy()
                        +"\nNumber of instructors: "+dr2.getNr()
                        +"\nPartners: "+dr2.getPartners());    

    } 

    public static void objects(){

        //creating instance of the encapsulated class 
        Objects obj1=new Objects(); 
        obj1.welcome();
        obj1.setName("Mathematics");
        obj1.setProfessor("Malik Schmitt");
        obj1.setCredits(12);
        obj1.setLessons(60);
        obj1.setMandatory(true);
       
        System.out.println("\nObject: "+obj1.getName()
                        +"\nProfessor: "+obj1.getProfessor()
                        +"\nNr. of credits: "+obj1.getCredits()
                        +"\nNr, of lessons: "+obj1.getLessons()
                        +"\nMandatory object: "+obj1.getMandatory());
        
    } 

    public static void groups(){

        //creating instance of the encapsulated class 
        Groups gr=new Groups(); 
        gr.welcome();
        int st_yrs=4;
        //setting values 
        gr.setBegin(2018);gr.setNumber("1831");gr.setName("Programming");gr.setNr_st(100);
        //getting values 
        int graduation_year=gr.getBegin()+st_yrs;
        System.out.println("Specialty: "+gr.getName()+"\tNr of group: "+gr.getNumber()+"\tYears: "+gr.getBegin()+" - "+graduation_year+"\nNr of students: "+gr.getNr_st());
        
    } 

    public static void schedule(){

        //creating instance of the encapsulated class 
        Schedule sh1=new Schedule(); 
        Schedule sh2=new Schedule();
        Schedule sh3=new Schedule();
        sh1.welcome();
        sh1.setProfessor(" Hardmod Ferro ");
        sh1.setName("database");
        sh1.setNumber("1831");
        sh1.setCab(510);
        sh1.setSth(8);
        sh1.setStmin(00);
        sh1.setFinh(9);
        sh1.setFinmin(30);

        sh2.setProfessor(" Frederick Franco ");
        sh2.setName("processing");
        sh2.setNumber("1832");
        sh2.setCab(211);
        sh2.setSth(8);
        sh2.setStmin(00);
        sh2.setFinh(9);
        sh2.setFinmin(30);

        sh3.setProfessor("  Corinne Carl  ");
        sh3.setName("Architecture");
        sh3.setNumber("1821");
        sh3.setCab(211);
        sh3.setSth(8);
        sh3.setStmin(00);
        sh3.setFinh(9);
        sh3.setFinmin(30);
        
        //sh.set();
        System.out.println("\nGroup: "+sh1.getNumber()+"\tobject: "+sh1.getName()+"\tProfessor: "+sh1.getProfessor()+"\t Time : "+sh1.getSth()+":"+sh1.getStmin()+" - "+sh1.getFinh()+":"+sh1.getFinmin());
        System.out.println("\nGroup: "+sh2.getNumber()+"\tobject: "+sh2.getName()+"\tProfessor: "+sh2.getProfessor()+"\t Time : "+sh2.getSth()+":"+sh2.getStmin()+" - "+sh2.getFinh()+":"+sh2.getFinmin());
        System.out.println("\nGroup: "+sh3.getNumber()+"\tobject: "+sh3.getName()+"\tProfessor: "+sh3.getProfessor()+"\t Time : "+sh3.getSth()+":"+sh3.getStmin()+" - "+sh3.getFinh()+":"+sh3.getFinmin());

    } 


    public static void menu(){
        Scanner myObj = new Scanner(System.in);
        int option;
        
         System.out.println("\n1---Student data");
         System.out.println("2---Data about professors");
         System.out.println("3---Students grades");
         System.out.println("4---Groups");
         System.out.println("5---Departments");
         System.out.println("6---Admission");
         System.out.println("7---Exams");
         System.out.println("8---Objects");
         System.out.println("9---Schedule");
         System.out.println("10--Administration");
         System.out.println("Choose option->"); 
         option = myObj.nextInt();   
  
        switch (option) {
            case 1:
                     studentdata();
                     break;
            case 2:
                     profdata();
                     break;
            case 3:
                      studentgrades();
                     break;
            case 4:
                     groups();
                     break;
            case 5:
                     departments();
                     break;
            case 6:
                     admission();
                     break;
            case 7:
                     exams();
                     break;
            case 8:
                     objects();
                     break;
            case 9: 
                     schedule();
                     break;
            case 10:
                     administration();
                     break;
            } 
                    
    }

    public static void main(String[] args){  
        Scanner myObj = new Scanner(System.in);
        menu();
        int op=1;
        while (op<=10){
            menu();
            op=op+1;
        }
    }  

}  
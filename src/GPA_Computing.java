import java.util.Scanner;
import java.util.*;



 class GPA_Computing {

  
    public void Front(){
        System.out.println("GPA Computing System");
        System.out.println("The Program Starts!");
        System.out.println("");
        System.out.println("");
        /*
        Process is starting
        */
        String Score = "";
        int unit=0;
       
        GPA_Computing.S(Score);
        
       GPA_Computing.unit(unit);

       
        
        GPA_Computing.tally();
         
    }
    
    private static final String Score[] = new String [7];

    public static String S(String score){
       
        
        Scanner Students =new Scanner (System.in);
       
        /*
        Entering Score Field
        
        */
        for(int Sc=0;Sc<Score.length;Sc++){
        
        System.out.print("Enter your Score :");
        Score[Sc]=Students.nextLine();
        
        }
        /*
        Showing entered score in a list
        */
       
        for(String  list :Score){
            Arrays.asList(list);
            System.out.println("\nList of Score: "+list);
            equivalent(list); 
        }
        
        return score;
    }
    
    static int Un;
  
    public static int unit(int unit){
        /*
       Entering Unit field
        */
        Scanner Student = new Scanner(System.in);
        int UnitTotal []= new int [7];
       
        for(  Un =0;Un<7;Un++){
            System.out.println("");
            System.out.print("Enter how many Unit: ");
            UnitTotal[Un]= Student.nextInt();
        }
     
          /*
      List of Unit entered Field
        */
          
        int sum=0;
        
        for( int List :UnitTotal){
            Arrays.asList(List);
            sum=sum+=List;
            System.out.println("The list of entered Unit is :"+List);
        }Computing(sum);
        
      
        
        
        return sum;
    }
    private static int total;
    public static int Computing(int Power){
        total = Power;
       System.out.println("Sum of total is "+total);
     
       return Power;
    }
    
    private static String scoreEq;
    private static int uno,dos,tres,kwatro,betlog;
    public static String equivalent(String equivalent){
       scoreEq= equivalent;{
        /*
       Equivalent of  Score
       */
        switch(scoreEq){
           case "A":
                System.out.printf("The Equivalent of %s Score is :",scoreEq);
              kwatro=4;
               System.out.print(kwatro);
               
               break;
           case "B":
              
                System.out.printf("The Equivalent of %s Score is :",scoreEq);
                tres =3;
                System.out.print(tres);
           
                break;
           case "C":
                System.out.printf("The Equivalent of %s Score is :",scoreEq);
                dos=2;
                System.out.print(dos);
                break;
           case "D":
                System.out.printf("The Equivalent of %s Score is :",scoreEq);
                uno =1;
                System.out.print(uno);
                break;
           case"E":
                System.out.printf("The Equivalent of %s Score is :",scoreEq);
                betlog=0;
                System.out.print(betlog);
                break;
           case "F":
               System.out.print("Out of lsit");
               break;
           case "G":
               System.out.print("Out of list");
               break;
       }TotalScore(uno,dos,tres,kwatro,betlog);
 
return equivalent;
    }
    }

    private static int Tally;
    public static int TotalScore(int TotalScore1,int TotalScore2,int TotalScore3,int TotalScore4,int TotalScore5){
Tally = TotalScore1;
  
  
         
 
  return Tally;
}

public static void tally (){
     System.out.println("hello"+Tally);
}
}
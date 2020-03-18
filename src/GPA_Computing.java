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
        int Power;
        GPA_Computing.S(Score);
        GPA_Computing.unit(unit);
        
        GPA_Computing.Computing(Power);
    }
    public static String S(String score){
        String Score[] = new String [7];
        
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
        for(String list :Score){
            Arrays.asList(list);
           
            System.out.println("List of Score: "+list);
        }
        
        return score;
    }
    public static int unit(int unit){
        /*
       Entering Unit field
        */
        Scanner Student = new Scanner(System.in);
        int Unit []= new int [7];
        for(int Un =0;Un<Unit.length;Un++){
            System.out.print("Enter how many Unit: ");
            Unit[Un]= Student.nextInt();
        }
          /*
      List of Unit entered Field
        */
          int List;
        for(List=1;List <=Unit.length;List++){
            Arrays.asList(List);
            System.out.println("The list of entered Unit is :"+List);
            
        }Computing(List);
        
        
        return List;
    }
    
    public static int Computing(int Power){
        int total = Power +=Power;
   System.out.print(total);
       return total;
    }
    public void saying(){
      
    }
}
class main{
  public static void main(String args[]){
      GPA_Computing Total = new GPA_Computing();
      Total.Front();
     
}
}
import java.util.Scanner;
import java.util.*;
public class GPA_Computing {
    
    public void Front(){
        System.out.println("GPA Computing System");
        System.out.println("The Program Starts!");
        /*
        Process is starting
        */
        String Score = "";
        GPA_Computing.S(Score);
    }
    public static String S(String S){
        String Score[] = new String [7];
        Scanner Students =new Scanner (System.in);
        for(int Sc=0;Sc<Score.length;Sc++){
        
        System.out.print("Enter your Score :");
        Score[Sc]=Students.nextLine();
        
        }
        for(String list :Score){
            Arrays.asList(list);
            System.out.println("List of Score: "+list);
        }
        
        return S;
    }
    public void Computing(){
        
    }
}
class main{
  public static void main(String args[]){
      GPA_Computing Total = new GPA_Computing();
      Total.Front();
 
}
}
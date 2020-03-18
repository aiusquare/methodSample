import java.io.*;
import java.util.*;

public class Main_ClassGrade{

     public String Student(String input)throws IOException{
        boolean back=false;
    BufferedReader Student = new BufferedReader(new InputStreamReader(System.in));
          do{
         System.out.println("The Program Starts !");
         System.out.println("Do you want to use this program now? Please Enter(Y/N?)");

         input= Student.readLine();
         if (input.equals("Y"))
         {
            back=true;
         }
         else if(input.equals("N"))
         {
           System.out.println("Thanks for Visiting");
           break;
         }
         
         } while(!(back));
         
         /*
         * end of the start progress
         
         */
         /*
         Starting the process for getting the units and Score of a Students
         */
      
         switch(input)
                 {
             case "Y":
               
                String Score[]= new String [7];
                int Unit[] =new int[7];
        /*
        When the user/Student agree to this process!
         */
                /*
                Enter Students Score
                */
        for (int score = 0 ;score<Score.length;score++) {
            System.out.print("Enter your Score :");
            Score[score] = Student.readLine();
       
        }
        for (String Score1 : Score) {
            Arrays.asList(Score);
            
            System.out.println("The list of Entered Score is :" + Score1);
        }
        for(int unit =0 ;unit<Unit.length;unit++){
            System.out.print("Enter Unit: ");
            Unit[unit]=Integer.parseInt(Student.readLine());
        }
        for(int Unit1: Unit){
            Arrays.asList(Unit);
            System.out.println("The list of Entered Unit is :"+Unit1);
        }
        /*
        End of the process of entering details 
        */
                 
                 
         break;
          /*
           The program ends if the User/Students answer is no/rejected!!
          */
             default:
                 System.out.print("Thank You");
         }
        
         return input;
     
}
    
         public static String GPA(String GPA,String Unit){
           
             return GPA;
         }
       
     public static void main(String args[])throws IOException {
         String input ="";
         Main_ClassGrade Score = new Main_ClassGrade();
         Score.Student(input);
     


}
}
     

     
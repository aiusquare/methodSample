import java.util.Scanner;
import java.util.*;

 class GPA_Computing {
    
    public void front(){
        System.out.println("GPA Computing System");
        System.out.println("The Program Starts!");
        System.out.println("");
        System.out.println("");
  
        /*
        Process is starting
        */
        compute(score(),getCreaditUnit()); 
    }

    public int[] score(){
        Scanner scoreInput =new Scanner (System.in);
        int[] scores= new int[7];
        String[] grades = new String [7];
        /*
        Entering Score Field
        
        */
        for(int i=0;i<grades.length;i++){
            System.out.print("Enter your Score :");
            grades[i] = scoreInput.nextLine();
        }
        /*
        Showing entered score in a list
        */
       
        for(int i=0;i<scores.length;i++){
            scores[i]=equivalent(grades[i]);
        }
        
        return scores;
    }
 
    public int[] getCreaditUnit(){
        Scanner creaditUInput =new Scanner(System.in);
        int[] creaditUnits=new int[7];
        
        for(int i =0;i<creaditUnits.length;i++){
           creaditUnits[i] = creaditUInput.nextInt();
        }
        return creaditUnits;
    }
    
    public void compute(int[] score, int[] crdUnit){
       double gpa=0;
       for(int i=0;i<score.length;i++){
           System.out.println("The score points: "+score[i]);
       }
  
       for(int i=0;i<crdUnit.length;i++){
           System.out.println("The credit units: "+crdUnit[i]);
       }
    }
    
    public int equivalent(String gradePoint){
       int point=0;
        /*
       Equivalent of  Score
       */
        switch(gradePoint){
           case "A":
               point=5;
               break;
           case "B":
                point =4;
                break;
           case "C":
                point=3;
                break;
           case "D":
                point =2;
                break;
           case"E":
                point=1;
                break;
           case "F":
               point=0;
               break;
          }
          return point;
      }
}

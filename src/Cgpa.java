/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Default
 */
import java.io.*;
import java.util.*;

interface std1{
    /**
     * Explain furthermore this session sir I don't totally understand this 
     * @param hour 
     */
   void compute(int []hour);
   
    
}

class Cgpa implements std1{
    
    public double[] getScore(){
        
        double sem_Score[]= new double[3];
      
        InputStreamReader input = new InputStreamReader(System.in);
        Scanner student  = new Scanner (input);
        System.out.println("Get your CGPA here!"); 
        /*
        get the scores in 1st sem to 3rd sem
        */
        for(int i=0;i<sem_Score.length;i++)
        {
            
            System.out.print("Enter Your Score: ");
          
            
            sem_Score[i]=student.nextDouble();
            
        }
        
        return sem_Score;
        
    }
   public int []getHours(){
      int totalhrs[]=new int[3];
       Scanner hour = new Scanner(System.in);
           for(int i=0; i< totalhrs.length;i++){
               System.out.print("Enter hours :");
               totalhrs[i]= hour.nextInt();
           }
           return totalhrs;
       }
   
   public double getScore(double []score,int[] hours){
       float sc=0;
       int hrs=0;
       float total=0;
    for (int i=0; i<score.length;i++){
        System.out.println("The score you have :"+score[i]);
        System.out.println("The Hours you have :"+hours[i]);
    }
    for (int j =0;j<score.length;j++){
        sc += score[j];
        hrs += hours[j];
        
    }
   total=sc/hrs;
    
   return total;
    }

     @Override
    public void compute(int[] Hour){
        System.out.println("");
        /*
        *Please explain this @Override to make me clear on this topic
        *I'm just trying to use this perfectly well but i don't know this how to use this
        */
        
  }
    public double frontPage(){
        double StudentCompute;

        StudentCompute=getScore(getScore(),getHours());
        System.out.print("The CGPA is : "+StudentCompute);
        return StudentCompute;
    }



}

    






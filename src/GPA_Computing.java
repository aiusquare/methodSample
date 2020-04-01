import java.util.Scanner;

 class GPA_Computing {
    
    public double front(){
    	double gpa=0d;
        System.out.println("GPA Computing System");
        System.out.println("The Program Starts!");
        /*
        Process is starting
        */
  
        //there is no need of creating object here because 
        // the class has no custom constructor and we call call the methods directly
        //GPA_Computing complete = new GPA_Computing();
     
        /*
        getting the final result 
        */
        gpa=compute(score(),getCreaditUnit());
        System.out.println("The total gpa is: "+gpa); 
        return gpa;
    }

    public int[] score(){
     int[] scores= new int[7];
        Scanner scoreInput =new Scanner (System.in);
     
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
        int creaditUnits[]=new int[7];
          
        for(int i =0;i<creaditUnits.length;i++){
            System.out.print("\n");
            System.out.print("Enter the credit unit :");
              
           creaditUnits[i] = creaditUInput.nextInt();
        }   //hello
        return creaditUnits;
    }
   
    public double compute(int[] score, int[] crdUnit){
       float gpa =0;
       float LastTotal=0;
       int totalUnit=0;
       float totalPoint=0;

       // i am optimising the code here
       /*for(int j=0;j<score.length;j++){

           System.out.println("The score points: "+score[j]);
       }
       
       for(int i=0;i<crdUnit.length;i++){
           
           System.out.println("The credit units: "+crdUnit[i]);
           
       }*/
  
       for(int i=0;i<score.length;i++){
           System.out.println("The score points: "+score[i]);
           System.out.println("It's corresponding credit units: "+crdUnit[i]);
       }
  
       /*
         * The final computation for getting the gpa result...
         *in working with array you have think very critically how to make it automatic
         * using loop. your code serves right and out the correct result but in reality there is one big job ahead
         * what is the array holds more than on thousand elements do that means we have to call it one by one using its index number as you did
         * so that's the issue.
       */
  
       // i changed the looping variable because if it is complex it will add us programming time that is why mostly i is used for that 
       for(int i=0; i<crdUnit.length;i++){
           totalPoint +=score[i]*crdUnit[i];
           totalUnit += crdUnit[i];
           /*TotalUnit += crdUnit [totalUnit];
           for (int totalScore = 0;totalScore<score.length;totalScore++){
              LastTotal = crdUnit[0]*score[0]+crdUnit[1]*score[1]+crdUnit[2]*score[2]+crdUnit[3]*score[3]+crdUnit[4]*score[4]+crdUnit[5]*score[5]+crdUnit[6]*score[6];
            }*/
       }
  
       gpa= totalPoint/totalUnit;
       /*
       end of Computing
       */
       
       return gpa;
    }
    
    /*
     * this variable supposed to be local to equivalent method
     * because its value is returned by the function so there is no need to make it instance
     * 
    static int point=0;
    */
    public int equivalent(String gradePoint){
        // here is it
        int point=0;
        /*
       Equivalent of  Score
       */
        switch(gradePoint){
           case "A":
               point=4;
               break;
           case "B":
                point =3;
                break;
           case "C":
                point=2;
                break;
           case "D":
                point =1;
                break;
           case"E":
                point=0;
                break;
           case "F":
               point=0;
           /*
           * dito nauuwi ang lahat ng binuo niyo
              */
               break;//ito yon hahaha
          }
          return point;
      }
    }

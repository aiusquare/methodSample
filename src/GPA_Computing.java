import java.util.Scanner;

 class GPA_Computing {
    
    public void front(){
        System.out.println("GPA Computing System");
        System.out.println("The Program Starts!");
        /*
        Process is starting
        */
        int Units = 0;
        GPA_Computing Complete = new GPA_Computing();
        compute(score(),getCreaditUnit()); 
        /*
        getting the final result 
        */
    
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
             System.out.print("Enter the credtit unit :");
              
           creaditUnits[i] = creaditUInput.nextInt();
     
        }   
        return creaditUnits;
    }
   
    public void compute(int[] score, int[] crdUnit){
       double gpa =0;
       int LastTotal=0;
       int TotalUnit=0;
       for(int j=0;j<score.length;j++){

           System.out.println("The score points: "+score[j]);
       }
       
       for(int i=0;i<crdUnit.length;i++){
           
           System.out.println("The credit units: "+crdUnit[i]);
           
       }
       /*
       The final computation for getting the gpa result...
       */
       for(int totalUnit =0; totalUnit<crdUnit.length;totalUnit++){
           TotalUnit += crdUnit [totalUnit];
           for (int totalScore = 0;totalScore<score.length;totalScore++){
              LastTotal = crdUnit[0]*score[0]+crdUnit[1]*score[1]+crdUnit[2]*score[2]+crdUnit[3]*score[3]+crdUnit[4]*score[4]+crdUnit[5]*score[5]+crdUnit[6]*score[6];
            
           }
       }gpa= LastTotal/TotalUnit;
       System.out.println("The total gpa is: "+gpa);
       /*
       end of Computing
       */
    }
    
static int point=0;
    public int equivalent(String gradePoint){
        
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
               break;
          }
          return point;
      }
    

    }

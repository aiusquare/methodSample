
import java.util.Scanner;


class Inversing{
    
     public static void main(String args[]){
     System.out.print("Enter a String  :");
        Inversing never = new Inversing();
        never.input();
        Inversing.saying();
        never.Reverse();
         }
     
     static  String input[] = new String[1];
     public  String[] input(){
       
         Scanner Input = new Scanner(System.in);
        input[0] = Input.nextLine();
         return input;                 
     }
    
     public void Reverse(){
         String type []= new String [input.length];
         int j = input.length;

         for(int i=0;i>j-i-1;i--){
          if (ij){
            System.out.println(input[i]);
         }
     }
     }
          public static void saying(){
         System.out.println("The entered String is :"+input[0]);

     }
         
     }
         
     

     
=======
import java.util.Scanner;


class Inversing {
     public static void main (String args [])
{
          System.out.println ("Enter a string");
          Scanner words =new Scanner(System.in);
          String User = words.nextLine ();
          
          System.out.println ("the entered String is:   "+User);
          /*
           * Declaring the method
           */
          System.out.printf("the inverse string is: ");
          Inversing.inverse(User);
     }
     
     public static String inverse (String result){
          char [] Speak= new char [result.length()];
          for (int i= result.length() -1;i>=0;i--)
          {
               System.out.print (result.charAt(i));
          }
          return result;
     }
}

         
     

    
>>>>>>> origin/master

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

         
     

    
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
         
     

     
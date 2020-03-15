import java.util.Scanner;
import java.util.*;
import java.lang.*;
import java.io.*;

class Inversing{
    
     public static void main(String args[]){
    /*
     * asking the user to input some string
     */
     System.out.println("Enter a String");
        Inversing never = new Inversing();
        never.input();
        never.saying();
        never.Reverse();
         }
     static  String []input=new String [1];
     public  String input(){
        /*
     *getting the input string
     */
        Scanner Input = new Scanner(System.in);
        input[0] = Input.nextLine();
         return input[0];
     }
     public void Reverse(){

  /*
     * Reversing the string
     */
      String result="";
         for(int i=input.length-1;i>=0;i--){
             result= result+(input[i]);
            System.out.println(result);
         }
         
     }
     public void saying(){ 
         System.out.println("The entered String is :"+input[0]);

     }
         
     }
         
     

    
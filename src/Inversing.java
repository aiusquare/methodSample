import java.util.Scanner;
import java.util.*;
import java.lang.*;
import java.io.*;

class Inversing{
    
     public static void main(String args[]){
         Scanner input = new Scanner (System.in);
      String []message = new String [2];
      
      message[1]=input.nextLine();
             byte[] result = new byte[message.length];
              for (int i=0;i<message.length-1;i++){
                  result[i]= message[message.length-i];
                  
              }
        System.out.println((result));
           
     }
         
     }


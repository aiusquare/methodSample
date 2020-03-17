import java.util.*;

public class inverse{  
    public static void main(String args[]){
        System.out.print("Enter a string : ");
        Scanner n = new Scanner (System.in);
        String sign = n.nextLine();
        inverse.reverse(sign);

}
 
    public static String reverse(String s){
        
        char[] Words = new char[s.length()];
        System.out.print("The inverse String is: ");
        for ( int i =s.length()-1 ; i>=0;i--){
        System.out.print(s.charAt(i));
    } 
       
        return s;
    
}
    
}
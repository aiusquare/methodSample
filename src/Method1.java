import java.io.*;

public class Method1{
    
    public static void main (String args[])
    {
        System.out.print ("sum is:");
        
        
        cassie sum = new cassie ();
       int hello=0;
      sum.saying(hello);
    }
    }
class cassie {
    
    
    public cassie(){
        int a=2;
        int b=2;
        add (a,b);
        
    }
    public void add(int x, int y){
        int sum=x+y;
        saying (sum);
    }
  public  void saying (int hello){
        System.out.print(hello);
   
    }
}
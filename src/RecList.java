/**
 *
 * @author Default
 */

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;


public class RecList extends ArrayList {
    private static RecList recList;
    private RecList(){
        super();
    }
    
    public void RegisterStudent(){
        InputStreamReader input = new InputStreamReader(System.in);
        
        Scanner inputStreamReader=new Scanner(input);
        StudentRecord obj = new StudentRecord();
     
        System.out.println("Enter Student Name:");
        obj.nameSt=inputStreamReader.nextLine();
        System.out.println("Enter Course :");
        obj.courseSt=inputStreamReader.nextLine();
        System.out.println("Enter Age :");
        obj.ageSt=inputStreamReader.nextInt();
        System.out.println("Enter Total GPA :");
        obj.totalGPAST=inputStreamReader.nextDouble();
        System.out.println("Enter Year Level :");
        obj.yearSt=inputStreamReader.nextInt();
        System.out.println("End of Fill in ");
    
      add(obj);
      System.out.println("Added");
      /**
       * Saying that Successfully Added to the new RecordList
       * 
       */
    }
      public static RecList getInstance(){
          
          File file = new File("Rec.itm");
          File file2 = file.getAbsoluteFile();
          if (file2.exists()&& (file2)!= null){
              try {
                  FileInputStream fis=new FileInputStream(file2);
		ObjectInputStream ois=new ObjectInputStream(fis);
                    recList = (RecList)ois.readObject();
              }catch(IOException|ClassNotFoundException e){
                  e.printStackTrace();
              }
          }
              else {
                    recList = new RecList(); 
                      }
          
          
          return recList;
      }
      public void saved(RecList list){
            try {
                   
			FileOutputStream out=new FileOutputStream("Rec.itm");
			ObjectOutputStream oos=new ObjectOutputStream(out);
			oos.writeObject(list);
			oos.close();
			out.close();
            }catch(SecurityException|IOException e)
            {
                e.printStackTrace();
            }
    }
}


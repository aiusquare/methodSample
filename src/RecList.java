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
    
    // changed the method name to small letter
    public void registerStudent(){
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader inputStreamReader = new BufferedReader(input);
        StudentRecord obj = new StudentRecord();
      try{
          
        System.out.print("Enter Name: ");
        obj.nameSt=inputStreamReader.readLine(); 
        System.out.print("Enter Age : ");
        obj.ageSt=inputStreamReader.read();
        System.out.print("Enter Course:");
        obj.courseSt= inputStreamReader.readLine();
        System.out.print("Enter Year level : ");
        obj.yearSt=inputStreamReader.read();
          
        /**********************************/
        // let us leave GPA during registration
        
        //System.out.print("Enter GPA :");
        //obj.totalGPAST=inputStreamReader.read();
        
        System.out.println("");
        System.out.println("End of Fill in ");
      }catch(IOException e){
          e.printStackTrace();
      }
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


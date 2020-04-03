
  /*

*Main class method  

 */
import java.io.*;

public class Main extends GPA_Computing {
    public static void main(String args[])throws IOException {
        GPA_Computing gpaComputer = new GPA_Computing();
        Cgpa obj1 =new Cgpa();
        RecList recordList =RecList.getInstance();
        BufferedReader action =new BufferedReader(new InputStreamReader(System.in));
        
        String choose;
        System.out.println("Register -type (reg) || Compute GPA- type (comGPA) || Compute CGPA- type (comCGPA) || Status- type (stats)\n\n");
        System.out.print("Choose Action to Perform :");
        choose = action.readLine();
        switch (choose){
            case "reg":
                System.out.println("Register Faster");
                String ctrl="";
                while(!ctrl.equalsIgnoreCase("save")){
                    recordList.registerStudent();
                    System.out.print("Enter Save to end Registration : ");
	                try{
	                    ctrl=action.readLine();
	                }catch(IOException e){
	                    e.printStackTrace();
	                }
                }
                //recordList.saved(recordList);
                System.out.println("Record Saved!");
                break;
            case "comGPA":
            	/*
            	 * GPA is computed but not saved so i created the a way by which GPA will be saved automatically 
            	 */
          
            	 try{
                     System.out.print("Enter the student name :");
                     String name =action.readLine();
                     recordList =RecList.getInstance();
                     for (int i = 0; i < recordList.size();i++){
                         StudentRecord sr =(StudentRecord)recordList.get(i);
                         if (sr.nameSt.equalsIgnoreCase(name)){
                        	 sr.setGPA(gpaComputer.front());
                        	 recordList.remove(i); // i remove the element so that we wont have duplicate
                        	 recordList.add(sr); // adding the object back to the list
                        	 recordList.saved(recordList);
                        	 break;
                         }
                     }
                 }catch (IOException e){
                      e.printStackTrace();
                 }
            	
                break;
            case "comCGPA":
                
                try {
                    System.out.println("Enter the Student name :");
                    String name = action.readLine();
                    recordList=RecList.getInstance();
                    for (int i=0; i <recordList.size();i++){
                        StudentRecord sr  = (StudentRecord)recordList.get(i);
                        if(sr.nameSt.equalsIgnoreCase(name)){
                            sr.setCGPA(obj1.frontPage());
                            recordList.remove(i);
                            recordList.add(sr);
                            recordList.saved(recordList);
                            
                        }
                    }
                }catch(IOException e){}
                break;
            case "stats":
                try{
                System.out.print("Enter your name :");
                String name =action.readLine();
                recordList =RecList.getInstance();
                for (int i = 0; i < recordList.size();i++){
                    StudentRecord sr =(StudentRecord)recordList.get(i);
                    if (sr.nameSt.equalsIgnoreCase(name)){
                        System.out.println("Name is :"+sr.nameSt);
                        System.out.println("Course is :"+sr.courseSt);
                        System.out.println("Gpa is :"+sr.getGPA(0));
                        System.out.println("Cgpa is :"+sr.getCGPA(0));
                        break;
                    }
                }
                }catch (IOException e){
                    e.printStackTrace();
                }
                break;
            default:
                System.out.println("Enter or Choose the following above!!");
        }    
    }
}

             

/**
 * Student Record List...
 * Where able to get the inputted information..
 */

/**
 *
 * @author Default
 */
import java.io.Serializable;

public class StudentRecord implements Serializable{
    String nameSt;
    double totalGPAST;
    String courseSt;
    int ageSt;
    int yearSt;
 
    public StudentRecord (String name,int age,String course,int year,double totalGPA){
        
        nameSt = name;
        ageSt= age;
        courseSt= course;
        yearSt= year;
        totalGPAST= totalGPA;
    
        
    }
    public StudentRecord(){
    
}
}

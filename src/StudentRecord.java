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
    String courseSt;
    int ageSt;
    double totalGPAST;   
    int yearSt;
 
    public StudentRecord (String name,int year,String course,double totalGPA,int age){
       
        nameSt = name;
        yearSt = year;
        courseSt= course;
        totalGPAST= totalGPA;
        ageSt=age;
    }
    public StudentRecord(){
    
}
}


/**
 * Student Record List...
 * Where able to get the inputted information..
 */

/**
 *
 * @author Default
 */
import java.io.Serializable;
import java.util.*;

public class StudentRecord implements Serializable{
    String nameSt;
    /*
     * since that we use GPA for computing GPA
     * and we have GPA each semester then he have to 
     * use an array to hold the GPAs
     * ***********************
     * and the CGPA also supposed to be hold
     * using an array because we started calculating it once to semestera
     * are reached
     */
    
    /*
     * and since normal array is not dynamic we will 
     * be using arraylist object to hold it
     */
    private final ArrayList gpas;
    private final ArrayList cgpas;
    String courseSt;
    int ageSt;
    int yearSt;
 
    //i remove totalGPAST from the constructor
    public StudentRecord (String name,int age,String course,int year){
        gpas=new ArrayList();
        cgpas=new ArrayList();
        nameSt = name;
        ageSt= age;
        courseSt= course;
        yearSt= year;
    }
    
    public StudentRecord(){
    	gpas=new ArrayList();
        cgpas=new ArrayList();
    }
    
    // i created a method to retrieve the gpa
    public double getGPA(int semester){
        double gpa=0;
        gpa=(double)gpas.get(semester);
        return gpa;
    }
    
    public void setGPA(double gpa){
        gpas.add(gpa);
    }
    public double getCGPA(int semester){
        double cgpa=0;
        cgpa=(double)cgpas.get(semester);
        return cgpa;
    }
    public void setCGPA(double cgpa){
        cgpas.add(cgpa);
    }
}

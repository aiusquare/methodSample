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
    ArrayList<double> gpas;
    ArrayList<double> cgpas;
    String courseSt;
    int ageSt;
    int yearSt;
 
    //i remove totalGPAST from the constructor
    public StudentRecord (String name,int age,String course,int year){
        gpas=new ArrayList<double>();
        cgpas=new ArrayList<double>();
        nameSt = name;
        ageSt= age;
        courseSt= course;
        yearSt= year;
    }
    
    // i created a method to retrieve the gpa
    public double getGPA(int session){
        double gpa=0d;
        gpa=gpas.get(yearSt);
        return gpa;
    }
    
    public void setGPA(double gpa){
        gpas.add(gpa);
    }
}

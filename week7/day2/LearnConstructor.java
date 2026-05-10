package week7.day2;

import org.apache.commons.io.filefilter.TrueFileFilter;

public class LearnConstructor {
    /**
     * Constructor:
     * -it is used to initialize the state of the objects
     * -constructor name should be same as that of classname,doesnot have the reurn type
     * Types:
     * 1)default-with zero arguments
     * 2)Parameterized-having arguments
     * constructor overloading:having more than one constructor inside the same class with different arguments.
     * this keyword:
     * -differentiate between the local and instance variable
     * contructor chaining:
     * calling one constructor from another constructor
     * 
     * 
     */

    int empID;
    String empName;
    boolean empStatus;

    public LearnConstructor(){
       // this(56, "saranya", true);
        System.out.println("default constructor");
         //empID=34;

    }
    public LearnConstructor(int empID,String empName,boolean empStatus){
        
        System.out.println("parameterized constructor");
       this();
        this.empID=empID;
        this.empName=empName;
        this.empStatus=empStatus;
        
        
    }


    public static void main(String[] args) {
        LearnConstructor lc1=new LearnConstructor(78, "saran",true);
        System.out.println(lc1.empID+" "+lc1.empName+" "+lc1.empStatus);

        //LearnConstructor lc=new LearnConstructor();
        // System.out.println(lc.empID+" "+lc.empName+" "+lc.empStatus);
        

        
    }

}

package week1.day2;

public class LearnMethods {
    //accessmodifiers returntype mthd name(i/p parameters)

   public void  calculateSalary(int basic,int bonus,float tax){
        float totalSalary=basic+bonus-tax;
        System.out.println(totalSalary);
    }

  private  int noOfEmployees(){
        return 50;
    }

   String employeeDetails(String empName,String empDepartment,String empId){
        return empName+empDepartment;
    }
    public static void main(String[] args) {
        LearnMethods lm=new LearnMethods();
        lm.calculateSalary(30000, 5000, 1500.50f);
          int noOfEmployees = lm.noOfEmployees();
        System.out.println(noOfEmployees);
        System.out.println(lm.employeeDetails("saranya", "QA", "89"));
    }

}

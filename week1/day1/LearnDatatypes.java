package week1.day1;

public class LearnDatatypes {
    /**
     * 1)primitive--preDefined
     * 2)Nonprimitive-String,Arrays(Userdefined)
     */

    public static void main(String[] args) {
       byte noOfLearners=30;
      short regNo=12345;
    long phNo=8765443476L;
    System.out.println("NOofLearners:"+noOfLearners+" ,"+regNo+"\n"+phNo);
    float speed=0.028798988978665f;
    double capacity=0.657698989767625;
    System.out.println(speed+","+capacity);
    char logo='S';
    char single='3';
    boolean learnersAttendance=true;
    System.out.println(learnersAttendance);
    //non primitive datatype
    String str="the no of learners *$ in the session is 30 and they are splitted into 3 subgroups monitored by their mentors";
        System.out.println(str);
    }
}

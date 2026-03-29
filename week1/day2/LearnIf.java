package week1.day2;

public class LearnIf {
    public static void main(String[] args) {
        int marks=40;
        if (marks>=50) {
            System.out.println("pass");
        }else{
            System.out.println("fail");
        }

        int marks1=80;
       if(marks1==60){
    System.out.println("grade A");
       }else if(marks1>85){
        System.out.println("Distinction");
       }else{
        System.out.println("out of range");
       }
    }

}

package week4.day1;

public class LearnOverloading {

    public void add(){
        int a=8;
        int b=4;
        System.out.println(a+b);
    }
    public void add(int a,int b){
        System.out.println(a+b);
    }
    public void add(int a,int b,float c){
        System.out.println(a+b+c);
    }
     public void add(int a,float c,int b){
        System.out.println(a+b+c);
    }
    public static void main(String[] args) {
        
    }
    public static void main(int a,int b) {
        
    }



}

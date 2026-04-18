package week4.day1;

public class LearnOverriding extends LearnOverloading {
@Override
public void add(){
        int a=5;
        int b=6;
        System.out.println(a+b);
        super.add();//call the method from the parent class
    }

    public static void main(String[] args) {
        LearnOverriding LO=new LearnOverriding();
        LO.add();
        
    }
   

}

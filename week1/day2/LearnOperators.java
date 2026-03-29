package week1.day2;

public class LearnOperators {
    public static void main(String[] args) {
        
        //ArithmeticOperators
        System.out.println(4/2);
        System.out.println(11%2);
        //Assignment Operator
        int a=4,b=3;
        a+=5;//a=a+5,a=4+5=9
        System.out.println(a);
        b*=2;//2*3=6
        System.out.println(b);
        b-=2;//6-2=4
        System.out.println(b);
        //comparison operators
        System.out.println(3==3);
        System.out.println(5>=7);
        //Logical operators
        System.out.println((6>7)&&(3<=2)||(2>=3));//f(0)*f(0)--->0(false)+0=0(false)
        System.out.println((7==7)&&(9>0));//t(1)*t(1)--->1(true)
        
        System.out.println((7==7)||(9<0));//t(1)+f(0)-->1(true)
        //unary operators
        int x=1;
        System.out.println(++x);//2
        System.out.println(x++);//2
        System.out.println(x);//3
        System.out.println(--x);//2
        System.out.println(x--);//2
        System.out.println(x);//1
    }

}

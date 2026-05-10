package week7.day2;

public class LearnExceptionHandling {
    public static void main(String[] args) {
        int x=10;
        int y=0;
        int num[]={1,2,3,4};
        
        try {
            System.out.println(x/y);
             System.out.println(num[5]);
           
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }
        
        
        System.out.println("completed");
    }

}

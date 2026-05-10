package week7.day2;

public class LearnFinally {
    public static void main(String[] args) {
        int x=10;
        int y=5;
       
        try {
            System.out.println(x/y);
        }
           
        catch (Exception e) {
             System.out.println(e);
         }
        finally{
            System.out.println("Execution should happen in the finaaly block");
        }
        
        
        System.out.println("completed");
    }

    }



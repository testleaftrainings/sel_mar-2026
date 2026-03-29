package week1.day2;

public class LearnSwitchCase {

    public static void main(String[] args) {
        String browser="Firefox";
        switch (browser) {
            case "Chrome":
            System.out.println("chrome browser is launched sucessfully");
            break;
            case "Edge":
            System.out.println("Edge browser is launched sucessfully");
            break;
            case "Safari":
                System.out.println("safari browser is launched sucessfully");
                break;
                default:
                    System.out.println("open IE");
                break;
                
        
            
        }
    }

}

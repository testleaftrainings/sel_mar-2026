package week1.day2;

public class LoginPage {

    String username="democsr";//instant variable or global varible
    
    public void enterUname(){
        System.out.println("username is entered sucessfully");
    }
    public void enterPassword(){
        System.out.println("password entered sucessfully");
    }
    public void clickLogin(){
        System.out.println("logged in successfully");
    }

public static void main(String[] args) {
    
//syntax: className object=new ClassName();
LoginPage lp=new LoginPage();
lp.enterUname();
lp.enterPassword();
lp.clickLogin();
System.out.println(lp.username);

}
}

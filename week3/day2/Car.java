package week3.day2;

public class Car extends Vehicle {
    public void applyGear(){
        System.out.println("gear is applied--->car class");
    }
    public static void main(String[] args) {
        
        Car C=new Car();
        C.applyGear();
        C.applyBrake();

    }
    
    
}

package week3.day2;

public class BMW  extends Car{

        public void voiceCommand(){
            System.out.println("voice command is enabled---->BMW");
        }
        public static void main(String[] args) {
            BMW B=new BMW();
            B.applyBrake();
            B.applyGear();
            B.voiceCommand();
        }
}

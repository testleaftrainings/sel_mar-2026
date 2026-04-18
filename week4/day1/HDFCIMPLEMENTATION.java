package week4.day1;

public class HDFCIMPLEMENTATION extends HDFC {

    @Override
    public void KYC() {
        System.out.println("information from DrivingLicense");
    }

    @Override
    public void educationLoan() {
        System.out.println("rate of interest is 5%");
    }
    public static void main(String[] args) {
        HDFCIMPLEMENTATION hdfcBank=new HDFCIMPLEMENTATION();
        hdfcBank.educationLoan();
    }

}

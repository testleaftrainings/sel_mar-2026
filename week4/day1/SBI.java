package week4.day1;

public class SBI extends Axis implements SBIHQ{

    @Override
    public void KYC() {
        System.out.println("information from PanCard");
        
    }
    public static void main(String[] args) {
        SBI sbi=new SBI();
        sbi.KYC();
        System.out.println(sbi.goldROI);
       // RBI.housingLoan();
       sbi.housingLoan();
       sbi.creditLimit();

    }
    @Override
    public void minBalance() {
        
    }
    

}

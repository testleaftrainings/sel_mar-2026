package week4.day1;

public abstract class HDFC implements RBI {
    /**
     * 0-100%abstraction bec it can have both implemented and unimplemented methods
     */
    //private  float goldROI=0.08f;
    public void convertCurrency(){
        System.out.println("converted in dollars");
    }

    public abstract void educationLoan();
    

}

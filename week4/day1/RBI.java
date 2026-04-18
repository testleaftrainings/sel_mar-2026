package week4.day1;

public interface RBI  {
    /**
     * 100% abstraction method(dont have implementations)
     * cannot create an object
     * or every interface there should be an implementation class
     * can we implement the methods in interface?
     *    yes.. by using static and default keywords  we  can implement the methods
     * for backward compatibilty.
     */

    public void KYC();//UNIMPLEMENTED METHOD
    float goldROI=0.08f;
     public default void housingLoan(){//IMPLEMENTED METHOD
        System.out.println("the rat of interest is 8%");
     }
    
         
    


    

}

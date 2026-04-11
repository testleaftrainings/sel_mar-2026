package week3.day1;

public class PrintIntersection {
    public static void main(String[] args) {
        int num[]={2,3,4,5,6,7};
        int num1[]={2,1,8,9,4};
        //output:2,4
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num1.length; j++) {
                if(num[i]==num1[j]){
                    System.out.println(num[i]);//2
                }
            }
            
        }

    }

}

package week3.day1;

import java.util.Arrays;

public class LearnArrays {
/**
 * Arrays:collection of items of same datatype
 * implementations:
 * 1)ArrayLiterals-->based on data
 * syn:datatype[] var.Name={values};
 * 2)Array instantiation--->based on size
 * 
 * @param args
 */
    public static void main(String[] args) {
        //Array Literals
        int marks[]={87,65,32,90,45};//length of 5
        /*
        index0---87
        index1---65
        index--->32
        index3--->90
        index4--->45
         */
        //length of Array
        int arrLength=marks.length;
        System.out.println(arrLength);
        //System.out.println(marks[5]);

        //to sort an Array
        Arrays.sort(marks);//32,45,65,87,90
        for (int i = 0; i <marks.length; i++) {
            System.out.println(marks[i]);
        }
        //Array instantiation
        int[] marks1=new int[4];//length is3,index-->0,1,2,
        marks1[0]=67;
        marks1[1]=43;
        marks1[2]=56;
        System.out.println(marks1[3]);





        
        
    }

}

package week4.day2;

import java.util.HashSet;
import java.util.Set;

public class PrintUnique {
    public static void main(String[] args) {
        String name="saranya";//a n r  s y
        //string to character
         char[] charArray = name.toCharArray();
         //create the set
         Set<Character> unique=new HashSet<Character>();

         Set<Character> duplicates=new HashSet<Character>();
         for (int i = 0; i < charArray.length; i++) {
            boolean b = unique.add(charArray[i]);
            if(!b){
                duplicates.add(charArray[i]);
            }
             
         }
         System.out.println(unique);
         System.out.println(duplicates);
    }

}

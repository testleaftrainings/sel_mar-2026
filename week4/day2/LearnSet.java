package week4.day2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.sun.tools.javac.Main;

public class LearnSet {
    public static void main(String[] args) {
        //create a set
        Set<String> set=new HashSet<String>();
        set.add("Dharnidharan");
        set.add("Abdul");
        set.add("sangeetha");
        for (String each : set) {
            System.out.println(each);
        }
        //convert set into list
        List<String> list=new ArrayList<String>(set);
        System.out.println(list.get(2));
    }

}

package week4.day2;

import java.util.ArrayList;
import java.util.List;

public class LearnList {
    public static void main(String[] args) {
        //create an empty list
        //syn:interface<generictype> objref=new impl.class<generic type>();
        List<String> learners=new ArrayList<String>();
        List<String> Trainer=new ArrayList<String>();
        Trainer.add("Saranya");//0
        
        Trainer.add("vinoth");//1
        Trainer.add("Harrish");//3
        Trainer.add(2, "Anburaj");//2
        System.out.println(Trainer);
        //add the items
        learners.add("nivetha");//0 index
        learners.add("ganesh");//2
        learners.add("nithya");//3
        learners.add(1, "kaaleswaran");//1
        System.out.println(learners);
        learners.add("nithya");//4
        System.out.println(learners);
        //remove an item
        // learners.remove(4);
        learners.remove("nithya");
        System.out.println(learners);
        //clear the list
        // learners.clear();
        // System.out.println(learners);

        //add one list to other list
        Trainer.addAll(learners);
        System.out.println(Trainer);




    }

}

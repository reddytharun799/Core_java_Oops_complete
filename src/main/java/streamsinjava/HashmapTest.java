package streamsinjava;

import java.util.*;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class HashmapTest <K,V>{
    public static void main(String[] args) {
        Map<String,Integer>student=new HashMap<>();
        student.put("telugu",45);
        student.put("english",65);
        student.put("Hindi",68);
        student.put("Social",66);

        //BiPredicate<Student,Integer>predicate=(Integer,student)-> student>g



        Set<Map.Entry<String, Integer>> entrySet=student.entrySet();
        //set contents >map.entry" content >String and Integer
        Iterator<Map.Entry<String, Integer>> hashItr = entrySet.iterator();
        while (hashItr.hasNext()){
            Map.Entry<String,Integer> entrymap=hashItr.next();
            System.out.println("subject"+entrymap.getValue());
        }
        /*for (; hashItr.hasNext();){
            System.out.println("subjects"+hashItr.next());
        }
        */
        student.entrySet().stream().forEach( entry ->{
            System.out.println("stream subject" +entry. getValue());

        });
        //=======================================================
        TreeMap<String,Integer>cardTreeMap=new TreeMap<>(student);

        cardTreeMap.entrySet().stream().forEach( entry ->{
            System.out.println("stream subject sort" +entry.getValue());

        });
        //===============================================================

    }

}
//if>> exec only once
//while>> until condition is execution.
// show commit
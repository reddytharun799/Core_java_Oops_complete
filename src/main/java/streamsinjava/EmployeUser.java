package streamsinjava;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Predicate;
import java.util.stream.Collectors;

//import static java.util.stream.Nodes.collect;

public class EmployeUser {
    public static void main(String[] args) {
        Map<String, User> hashmap = new HashMap<>();
        User user = new User("ganesh", 45);
        User user1 = new User("pichi", 70);
        User user2 = new User("kiran", 55);

       /* user.getName();
        user1.getName();
        user2.getName();*/
        hashmap.put(user.getName(), user);
        hashmap.put(user1.getName(), user1);
        hashmap.put(user2.getName(), user2);

        /*hashmap.put("EMP1",new User("ganesh",45));
        hashmap.put("EMP2",new User("suresh",66));
        hashmap.put("EMP3",new User("madhu",77));


*/      Predicate<User> getMoreThen40= predicate -> predicate.getAge()>50;


        Set<Map.Entry<String, User>> entrySet = hashmap.entrySet();
        Iterator<Map.Entry<String, User>> itr = entrySet.iterator();
        for (; itr.hasNext(); ) {
            Map.Entry<String, User> entry = itr.next();
            User predicate2 = entry.getValue();
            if (getMoreThen40.test(predicate2)) {
                System.out.println(   " using predicate "  +"Key: " + entry.getKey() + ", User: " + user);
            }
            System.out.println("user details          " + entry.getKey() + "   " + entry.getValue().getAge());

            //============================================================

            // Treemap for sorted order.
            TreeMap<String, User> sort = new TreeMap<>(hashmap);
            Set<Map.Entry<String, User>> entrySet1 = sort.entrySet();
            Iterator<Map.Entry<String, User>> itr1 = entrySet1.iterator();
            for (; itr1.hasNext(); ) {
                Map.Entry<String, User> entry1 = itr1.next();
                System.out.println("user details  entry      " + entry1.getKey() + "   " + entry1.getValue().getAge());
                //=============================================================

                // Tree sorted order for "only Object".
                Iterator<String> itr2 = sort.keySet().iterator();
                for (; itr2.hasNext(); ) {
                    String entry2 = itr2.next();
                    System.out.println( entry2);
                    //===========================================================
                    Iterator<User> itr3=sort.values().iterator();
                    for (;itr3.hasNext();){
                        User entry3=itr3.next();
                        System.out.println(entry3);
                        //=======================================================
                        List<Map.Entry<String, User>> entryList = new ArrayList<>(sort.entrySet());

                        ListIterator<Map.Entry<String, User>> listIterator = entryList.listIterator();
                        for (;listIterator.hasNext();){
                            Map.Entry<String,User> entry4=listIterator.next();
                            System.out.println("Key: " + entry4.getKey() + ", User: " + entry4.getValue() + ", Age: " + entry4.getValue().getAge());
                        }
                        //=======================================================================
                        // Optional: Reverse iteration using ListIterator
                        System.out.println("\nTraversing in reverse direction:");
                        while (listIterator.hasPrevious()) {
                            Map.Entry<String, User> entry5 = listIterator.previous();
                            System.out.println("Key: " + entry5.getKey() + ", User: " + entry5.getValue() + ", Age: " + entry5.getValue().getAge());
                        }
                    }


                }
            }
        }
    }
}


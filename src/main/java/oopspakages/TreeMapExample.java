package oopspakages;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {


        Map<String, Employee> treeMap = new TreeMap<>();

        treeMap.put("E201", new Employee("rakesh", 29, "Marketing"));
        treeMap.put("E202", new Employee("suresh", 38, "Operations"));
        treeMap.put("E203", new Employee("arun", 31, "Sales"));


        for (Map.Entry<String, Employee> entry : treeMap.entrySet())


            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
    }

}

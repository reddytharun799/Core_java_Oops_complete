package oopspakages;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static  void main(String[] args) {

        Map<String, Employee> hashMap = new HashMap<>();


        hashMap.put("E101", new Employee("chandu", 28, "IT"));
        hashMap.put("E102", new Employee("Ramu", 35, "HR"));
        hashMap.put("E103", new Employee("kk", 42, "Finance"));


        for (Map.Entry<String, Employee> entry : hashMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}

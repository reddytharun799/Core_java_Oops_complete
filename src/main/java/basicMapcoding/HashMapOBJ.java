package basicMapcoding;

import java.util.HashMap;
import java.util.Objects;

public class HashMapOBJ {
    public static void main(String[] args) {
        HashMap<Object,Object> hashMap=new HashMap<>();
        String tharun="Tharun";
        String kiran="Kiran";
        String suresh="Suresh";
        String sumathi="Sumathi";
        hashMap.put(6,tharun);
        hashMap.put(suresh,9);//defult
        hashMap.put(kiran,4);
        hashMap.put(suresh,11);//defult(it is going to updated)
        hashMap.put(420,sumathi);
        System.out.println(hashMap.keySet());
        System.out.println(hashMap.values());
        System.out.println(hashMap.entrySet());
        System.out.println(hashMap.get(suresh));
        System.out.println(hashMap.containsKey(suresh));
        System.out.println(hashMap.containsValue(suresh));

    }
}


package basicMapcoding;

import java.util.HashMap;
import java.util.Map;

public class ExampleHashmap {
    public static void main(String[] args) {
        Map<String,Stringclass>h=new HashMap<>();
        for (int i = 0; i < 10000; i++) {
            h.put("Key" + i, new Stringclass("Name" + i, i % 100)); // Key is "Key" + i, and value is a new Stringclass object
        }
        h.put("kk",new Stringclass("suresh",30));
        h.put("boyfrnd",new Stringclass("krish",18));
        h.put("girlfrnd",new Stringclass("Radha",16));
        h.put("onesidelover",new Stringclass("kusubaludu",18));
        System.out.println(h.keySet());
       // System.out.println(h.containsKey("key3000"));




    }
}

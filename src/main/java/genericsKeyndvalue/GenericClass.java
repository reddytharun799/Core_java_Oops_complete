package genericsKeyndvalue;

import java.util.HashMap;
import java.util.Map;

public abstract class GenericClass<K,V>implements SuperGenerics<K,V> {

    public <K> String put(K element){
        return "generic";

    }
    public String put(K key,String Something ){
        return "Generic2";
    }



    public void shotpapa(K key, V value){
        System.out.println("hello world");
    }



    public void put(K key, V value) {
        System.out.println("npthing");

    }
}

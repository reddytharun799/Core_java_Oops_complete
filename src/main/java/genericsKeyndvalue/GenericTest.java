package genericsKeyndvalue;

public class GenericTest<K,V>extends GenericClass<K,V> {
    public static void main(String[] args) {
        GenericClass<Object, Object> genericClass = new GenericTest<>();
        genericClass.put("23456",123456);
        genericClass.shotpapa(12345,23456);
        genericClass.put("asdfg","qwert");
        System.out.println(genericClass);
    }

    @Override
    public void shotpapa(K key, V value) {
        System.out.println("world");

    }
}

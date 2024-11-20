package basicMapcoding;

public class Stringclass {
    private String name;
    private int age;

    public Stringclass(String name,int age){
        this.name=name;
        this.age=age;
        }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    @Override
    public String toString() {
        return "Stringclass{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
    public boolean equals(Object obj){
        if (obj==this)
        return true;
        if (obj==null || getClass()!=obj.getClass())
            return false;
        Stringclass s=(Stringclass)obj;
        return s.name.equals(this.name);
    }
    public int hashCode(){
        return name.hashCode();
    }
}

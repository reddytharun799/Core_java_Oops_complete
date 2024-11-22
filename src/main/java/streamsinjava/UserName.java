package streamsinjava;

import java.util.LinkedList;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class UserName {
    public static void main(String[] args) {
        LinkedList<User> user=new LinkedList<>();



        user.add(0 , new User("rakesh",45));
        user.add(1,new User("keerthi",78));
        user.add(2,new User("madhu",90));
        user.add(3,new User("madhu",76));

        Predicate<User> getMoreThen50= user1 -> user1.getAge()>50;
        List<User> username1=user.stream().filter(getMoreThen50)
                .collect(Collectors.toList());
        //=======================================================




        List<String> usernames=user.stream()
                .filter(user1 -> user1.getAge() > 50)
                .map(User::getName)
                .collect(Collectors.toList());
        System.out.println("Usernames of users older than 50: " + usernames);

        System.out.println("Usernames of users older than 50: " + username1);


    }
}

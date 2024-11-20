package streamsinjava;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.BiPredicate;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class CreditTest {
    public static void main(String[] args) {
        Map<String,CreditCard> card=new HashMap<>();
        card.put("nothing",new CreditCard("Rakesh",7829929,678));
        card.put("something",new CreditCard("krishna",579903,232));
        card.put("uhhhavetosee",new CreditCard("Radha",2739,232));

        BiPredicate<String,CreditCard> creditCardPredicate= (String,creditcard)-> creditcard.getCvv()==232;

        card.entrySet().stream()
                .filter(entry-> creditCardPredicate.test(entry.getKey(),entry.getValue()))
                .forEach(entry ->{
                                System.out.println(entry.getValue());
                                System.out.println(entry.getKey());
                } );
        //=======================================================================================
        TreeMap<String,CreditCard>cardTreeMap=new TreeMap<>(card);
        cardTreeMap.entrySet().stream().filter(entry1 ->creditCardPredicate.test(entry1.getKey(),entry1.getValue()))
                .forEach(entry1->{
                    System.out.println(entry1.getValue());
                    System.out.println(entry1.getValue());
                });
        //========================================================================================

    }
}

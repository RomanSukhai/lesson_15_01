package homework_01;

import java.util.AbstractSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {

        Set<Double> ig = new HashSet<>() ;
        ig.add(4.5);
        ig.add(4.6);
        ig.add(1.6);
        ig.add(0.6);
        ig.add(1.2);

/*
        Iterator a =ig.iterator();
        while (a.hasNext()){
            Double d = (Double) a.next();
            System.out.println(d);
        }

 */
        Iterator<Double> iterator = ig.iterator();
        while (iterator.hasNext()){
            Double d = (Double) iterator.next();
            if (d < 2){
                iterator.remove();
            }else {
            }
        }

        Set<Person> person = new HashSet<>();
        person.add(new Person("Василь",42));
        person.add(new Person("Петро",42));
        person.add(new Person("Роман",42));
        person.add(new Person("Іван",42));
        for (Person f :person){
            System.out.println(f);
        }







    }
}

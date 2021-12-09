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


        ig.forEach(x-> {
            if (x >2) {
                System.out.println(x);
            }
        });
        System.out.print("\n");
        Set<Person> person = new HashSet<>();
        person.add(new Person("Василь",42));
        person.add(new Person("Петро",42));
        person.add(new Person("Роман",42));
        person.add(new Person("Іван",42));
        person.forEach(x->System.out.println(x));






    }
}

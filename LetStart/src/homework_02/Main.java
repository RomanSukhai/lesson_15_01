package homework_02;

import homework_01.Person;

import java.util.Collections;
import java.util.HashSet;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<Person> str = new TreeSet<>();
        str.add(new Person("Vasul",32));
        str.add(new Person("Roman",30));
        str.add(new Person("John",12));
        str.add(new Person("Rostuslav",10));
        str.add(new Person("Ura",89));

        for (Person d : str){
            System.out.println(d);
        }

    }

}

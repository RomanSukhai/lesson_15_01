/*
It's my work,and I am author this code;
You can checked him,and edit too
 */
package homework_03;
import java.util.*;
import java.util.function.*;
import java.util.stream.Collectors;

/**
 * The (@code String) class represent character strings.
 * @author Roman Sukhai
 * @see  java.lang.Object#toString()
 * @since JDK 1.0
 */

//Class,where work programm
public class Main {
    //Void method print menu
    public static void main(){
        System.out.println("_____________________________");
        System.out.println("Натисни 1 ---->(Додати товар)");
        System.out.println("Натисни 2 ---->(Видалити товар)");
        System.out.println("Натисни 3 ---->(Замінити товар)");
        System.out.println("Натисни 4 ---->(Сортувати за назвоню)");
        System.out.println("Натисни 5 ---->(Сортувати за довжиною)");
        System.out.println("Натисни 6 ---->(Сортувати за шириною)");
        System.out.println("Натисни 7 ---->(Сортувати за вагою)");
        System.out.println("Натисни 8 ---->(Вивести елемент з колекції)");
        System.out.println("Натисни 9 ---->(Вийти з програми)");
    }

    public static void main(String[] args) {
        //Created TreeSet for Object(Commodity)
        TreeSet<Commodity> think = new TreeSet<>();
        Scanner sc =new  Scanner(System.in);
        main();
        //This method sort width in all data in TreeSet
        Consumer<TreeSet<Commodity>> SortForWeight =x->x.stream().sorted((o1,o2)->o1.getWeight()-o2.getWeight()).collect(Collectors.toList()).forEach(c-> System.out.println(c));
        //This method sort weight in all data in TreeSet
        Consumer<TreeSet<Commodity>> SortForWidth =x->x.stream().sorted((o1,o2)->o1.getWidth()- o2.getWidth()).collect(Collectors.toList()).forEach(c-> System.out.println(c));
        //This method sort height in all data in TreeSet
        Consumer<TreeSet<Commodity>> SortForHeight =x->x.stream().sorted((o1, o2) -> o1.getHeight()-o2.getHeight()).collect(Collectors.toList()).forEach(c-> System.out.println(c));

        while (true){
            System.out.println();
            System.out.print("<--Введіть цифру: ");
            int number = sc.nextInt();
            switch (number){
                case 1 :{
                    AddThink(think, sc);
                    main();
                    break;
                }
                case 2 :{
                    System.out.println("___________________");
                    System.out.print("<--Введіть ім'я товару: ");
                    String name =sc.next();
                    Iterator<Commodity> iterator = think.iterator();
                    while (iterator.hasNext()){
                        Commodity next = iterator.next();
                        if(next.getName().equalsIgnoreCase(name)){
                            think.remove(next);
                        }
                        System.out.println(next);
                    }
                    main();
                    break;
                }
                case 3 :{
                    System.out.println("___________________");
                    System.out.print("<--Введіть ім'я товару:");
                    String name =sc.next();
                    SetterValuesForObject(think, sc, name);
                    main();
                    break;
                }
                case 4 :{
                    SortForName(think);
                    main();
                    break;
                }
                case 5 :{
                    SortForHeight.accept(think);
                    main();
                    break;
                }
                case 6 :{
                    SortForWidth.accept(think);
                    main();
                    break;
                }
                case 7 :{
                    SortForWeight.accept(think);
                    main();
                    break;
                }
                case 8 :{
                    System.out.println("<--Введіть ім'я товару:");
                    String name =sc.next();
                    PrintOneObjectThatPrint(think, name);
                    main();
                    break;
                }
                case 9:{
                    System.out.println("Ви вийшли з програми");
                    System.exit(1);
                }
            }
        }
    }

    //This method can print one Object,if you print your name
    private static void PrintOneObjectThatPrint(TreeSet<Commodity> think, String name) {
        think.forEach(x-> {
            if (x.getName().equalsIgnoreCase(name)) {
                System.out.println(x);
            }
        });
    }
    //This method set all data in Object,if you print your name
    private static void SetterValuesForObject(TreeSet<Commodity> think, Scanner sc, String name) {
        think.forEach(x-> {
            if (x.getName().equalsIgnoreCase(name)) {
                SetThink(sc,x,think);
            }
        });
    }

    //Method created for creating List with Object(Commodity)
    private static List<Commodity> getListForThink(TreeSet<Commodity> think) {
        List<Commodity> think2 = new ArrayList();
        think2.addAll(think);
        return think2;
    }

    //Method in order to print all Object from TreeSet
    private static void IteratorPrintAll(TreeSet<Commodity> think) {
        System.out.println();
        think.forEach(x-> System.out.println(x));
        System.out.println();
    }

    //This method sort name in all data in TreeSet
    private static void SortForName(TreeSet<Commodity> think) {
        List<Commodity> think2 = getListForThink(think);
        Collections.sort(think2, new Comparator<Commodity>() {
            @Override
            public int compare(Commodity o1,Commodity o2 ) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        think2.forEach(x-> System.out.println(x));
    }

    //This method in order to substitute values in Object
    private static void SetThink(Scanner sc, Commodity next,TreeSet<Commodity> think) {
        System.out.println("____________________");
        System.out.print("Введіть нове ім'я товару: ");
        String names = sc.next();
        System.out.print("Введіть нову ширину товару: ");
        int width = sc.nextInt();
        System.out.print("Введіть нову двжину товару: ");
        int height = sc.nextInt();
        System.out.print("Введіть нову вагу товару: ");
        int weight = sc.nextInt();
        System.out.println("----------------------");
        System.out.println();
        next.setName(names);
        next.setHeight(height);
        next.setWeight(weight);
        next.setWidth(width);
        System.out.println("___________________");
        System.out.println(next);
        System.out.println("___________________\n\n");

    }

    //This method in order to created object in TheeSet

    private static void AddThink(TreeSet<Commodity> think, Scanner sc) {
        Supplier<Commodity> thinkNew=()->{
            System.out.println("____________________");
            System.out.print("Введіть ім'я товару: ");
            String name = sc.next();
            System.out.print("Введіть ширину товару: ");
            int width = sc.nextInt();
            System.out.print("Введіть дожину товару: ");
            int height = sc.nextInt();
            System.out.print("Введіть вагу товару: ");
            int weight = sc.nextInt();
            return new Commodity(name,height,width,weight);
        };
        think.add(thinkNew.get());
        IteratorPrintAll(think);
    }
}


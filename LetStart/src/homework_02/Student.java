package homework_02;

public class Student implements Comparable<Student>{
    private String name ;
    private int age ;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }


    public int compareTo(Student o) {
        return this.name.compareTo(o.getName());
    }

}

package homework_03;

public class Commodity implements Comparable<Commodity>{
    private String name;
    private int height;
    private int width;
    private int weight;

    public Commodity(String name, int height, int width, int weight) {
        this.name = name;
        this.height = height;
        this.width = width;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public int getWeight() {
        return weight;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Commodity{" +
                "name='" + name + '\'' +
                ", height=" + height +
                ", width=" + width +
                ", weight=" + weight +
                '}';
    }


    public int compareTo(Commodity o) {
        return this.name.compareTo(o.getName());
    }
}

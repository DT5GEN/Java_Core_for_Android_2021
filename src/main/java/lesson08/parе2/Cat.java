package lesson08.parе2;

public class Cat {

    private String name;
    private Color color;
    private int age;

    public Cat(String name,Color color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;

    }

    @Override
    public String toString() {
        return "Cat{}";
    }
}

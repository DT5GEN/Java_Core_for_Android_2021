package lesson06singleLern;

public class Cats extends Animal {
      int swimDistance;
    String color;

    public Cats(String name, String color, int swimDistance) {
        this.name = name;
        this.color = color;
        this.swimDistance = 0;
    }

    public Cats() {

    }

    public void catInfo() {
        System.out.println("Кот  имя: " + name + " цвет: " + color +  "  может проплыть " + swimDistance + " метров.");
    }

    void voice() {
        System.out.println("Котейко  мявкнул");
    }

}
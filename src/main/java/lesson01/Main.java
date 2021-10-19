package lesson01;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, Java!");
        printHelloJava();
        printText();
        testWars();
    }

    static void printHelloJava() {
        System.out.println("Hello, Java from method!");
    }

    static void printText(){
        printHelloJava();
        printHelloJava();
    }
    static void testWars()
    {
        int appleCount = 9;
        int orangeCount = appleCount + 4;
        System.out.println("V korzine " + appleCount + " yablok \ni " + orangeCount + " apelsinov");

    }
}


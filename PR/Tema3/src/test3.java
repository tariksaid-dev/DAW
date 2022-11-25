// give me a class called car, with 3 methods, 2 attributes, and a constructor
public class car {
    // attributes
    private String color;
    private int speed;
    // constructor
    public car(String color, int speed) {
        this.color = color;
        this.speed = speed;
    }
    // methods
    public void accelerate() {
        this.speed += 10;
    }
    public void brake() {
        this.speed -= 10;
    }
    public void print() {
        System.out.println("Color: " + this.color + " Speed: " + this.speed);
    }
}

// give me a class with a main method, and a method that returns a string, and a method that returns an int
public class motorbike {
    // main method
    public static void main(String[] args) {
        // call methods
        System.out.println(getString());
        System.out.println(getInt());
    }
    // methods
    public static String getString() {
        return "Hello World";
    }
    public static int getInt() {
        return 42;
    }
}
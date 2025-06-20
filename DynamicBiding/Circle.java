package DynamicBiding;

public class Circle extends Shape {

    public void draw() {
        System.out.println("Drawing a circle.");
    }

    public static void main(String[] args) {
        // Dynamic binding in action
        Shape s = new Circle();
        Circle c = new Circle();

        s.draw();
        c.draw();
    }

}

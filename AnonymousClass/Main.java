package AnonymousClass;

public class Main {
    public static void main(String[] args) {
        Greating g = new Greating() {

            public void sayHello() {
                System.out.println("Hello from anonymous class!");
            }
        };
        g.sayHello();
    }
}

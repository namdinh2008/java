package SCOT;

public class Counter {
    public static int count = 0;
    public int sum = 0;

    public Counter() {
        count++;
        System.out.println("Object " + count + " created. Count: " + count);
    }

    public void count() {
        sum++;
    }
}

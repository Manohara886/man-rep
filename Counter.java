class Counter {
    static int count = 0; 

    Counter() {
        count++;
    }

    static void showCount() {
        System.out.println("Total: " + count);
    }
}

public class Main {
    public static void main(String[] args) {
        new Counter();
        new Counter();
        Counter.showCount(); 
    }
}
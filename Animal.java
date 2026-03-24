
class Animal {

    protected int number = 50;

    protected void display() {
        System.out.println("Protected method in Parent class");
    }
}


class Lion extends Animal {

    void show() {
        System.out.println("Protected variable: " + number);
        display();
    }

    public static void main(String[] args) {

        Lion obj = new Lion();
        obj.show();
    }
}
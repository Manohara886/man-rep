class Student {
    String name;
    int age;
    int rollnumber;

    Student(String name, int age, int rollnumber) {
        this.name = name;
        this.age = age;
        this.rollnumber = rollnumber;

    }

    void display() {
        System.out.println("Student -> Name: " + name + ", Age: " + age +",rollnumber:"+ rollnumber);
    }
}

class Car {
    String brand;
    String model;

    Car(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    void display() {
        System.out.println("Car -> Brand: " + brand + ", Model: " + model);
    }
}

class Book {
    String title;
    String author;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    void display() {
        System.out.println("Book -> Title: " + title + ", Author: " + author);
    }
}

public class ClassesAndObjects {
    public static void main(String[] args) {
        Student s1 = new Student("Aman", 18,1);
        Student s2 = new Student("Priya", 20,2);
        Student s3 = new Student("Ravi", 19,3);

        Car c1 = new Car("Toyota", "Corolla");
        Car c2 = new Car("Honda", "City");
        Car c3 = new Car("Tesla", "Model 3");

        Book b1 = new Book("Java Basics", "James");
        Book b2 = new Book("OOP Concepts", "Martin");
        Book b3 = new Book("Data Structures", "Narasimha");

        s1.display();
        s2.display();
        s3.display();

        c1.display();
        c2.display();
        c3.display();

        b1.display();
        b2.display();
        b3.display();
    }
}
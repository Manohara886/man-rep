class copy_con{
    int id;
    String name;

    // Default constructor
    Student(int i, String n) {
        id = i;
        name = n;
    }

    // Copy constructor
    Student(Student s) {
        id = s.id;
        name = s.name;
    }

    void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
    }

    public static void main(String[] args) {
        Student s1 = new Student(101, "Rahul");   // normal constructor
        Student s2 = new Student(s1);             // copy constructor

        System.out.println("Original Object:");
        s1.display();

        System.out.println("\nCopied Object:");
        s2.display();
    }
}
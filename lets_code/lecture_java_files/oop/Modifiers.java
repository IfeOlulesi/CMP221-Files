package lets_code.lecture_java_files.oop;

class Modifiers extends Person {

    public Modifiers() {
        super("gabby", 23);
    }


    public static void main(String[] args) {
        Person bob = new Person("Bob", 73);
        sleep();
        bob.getProperties("name");
        bob.getProperties("age");

    }

}
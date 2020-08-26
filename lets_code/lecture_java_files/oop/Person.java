package lets_code.lecture_java_files.oop;

class Person {

    String name;
    int age;

    public Person(String pName, int pAge) {
        this.name = pName;
        this.age = pAge;
    }

    public static void sleep() {
        System.out.println("Zzzzzzz Zzzzz Zzz...");
    }

    public void getProperties(String which) {
        if(which.equals("name")) {
            System.out.println(name);
        } else if (which.equals("age")) {
            System.out.println(age);
        } 
    }

}
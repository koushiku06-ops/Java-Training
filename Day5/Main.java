 class Teacher {
    String name;

    Teacher(String name) {
        this.name = name;
    }
}

class Student {
    String name;

    Student(String name) {
        this.name = name;
    }

    void learn(Teacher t) {
        System.out.println(name + " learns from " + t.name);
    }
}

class Main {
    public static void main(String[] args) {
       Teacher t = new Teacher("Teach");
       Student s = new Student("Study");

        s.learn(t);
    }
}

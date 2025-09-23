package prashant.Immutability;

// class and field name should be final for Immutability
// class is final to stop inheritance
public final class Student {
    private final String name;      // private so that no one can put direct updates on field
    private final int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // no setter method
}

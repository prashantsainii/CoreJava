package prashant.InterviewTopics.EqualsMethod;

public class Student {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        // For same reference check, non-mandatory although
        // Eg : Student s1 = new Student(1, "Prashant");
        //      Student s2 = s1
        //      s1.equals(s2) -->> this = s1 and obj = s2
        // Same reference means values will obviously be same

        if (!(obj instanceof Student)) return false;
        // For type check
        // Eg : Student s1 = new Student(1, "Prashant");
        //      String str = "Prashant"
        //      s1.equals(str) -->> Without the instanceof check, the next line
        //      Student other = (Student) obj would through ClassCastException
        // So for safe casting we this check is mandatory

        Student other = (Student) obj;
        return id == other.id && name.equals(other.name);
        // So now whether s1 and s2 is equal or not will be returned
        // on the basis of the values of id and name, not the reference
    }
}

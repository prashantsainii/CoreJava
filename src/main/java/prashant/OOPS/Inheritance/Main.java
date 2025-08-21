package prashant.OOPS.Inheritance;

public class Main {
    public static void main(String[] args) {

        Parent p = new Parent(50);
        Child c = new Child(50, 20, "Golu");

        Parent pc = new Child(40, 10, "Molu");

        pc.greet();   //this will call greet method of parent not of child

        pc.fun();
    }
}

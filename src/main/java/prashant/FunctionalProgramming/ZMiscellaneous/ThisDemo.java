package prashant.FunctionalProgramming.ZMiscellaneous;

public class ThisDemo {
    public static void main(String[] args) {
        ThisDemo thisDemo = new ThisDemo();
        Printer lambdaPrinter = thisDemo.getLambdaPrinter();
        Printer anonymousPrinter = thisDemo.getAnonymousPrinter();
        Printer anonymousPrinter2 = thisDemo.getAnonymousPrinter2();

        lambdaPrinter.print("Lambda Printer : ");
        anonymousPrinter.print("Anonymous Printer : ");
        anonymousPrinter2.print("Anonymous Printer2 : ");
    }

    public Printer getLambdaPrinter() {
        // this keyword in getLambdaPrinter method will refer to ThisDemo class
        Printer printer = input -> System.out.println(input + this.getClass());
        return printer;
    }

    public Printer getAnonymousPrinter() {
        // this keyword in getAnonymousPrinter method will refer to anonymous class we create
        Printer printer = new Printer() {
            @Override
            public void print(String msg) {
                System.out.println(msg + this.getClass());
            }
        };
        return printer;
    }

    public Printer getAnonymousPrinter2() {
        // this keyword in getAnonymousPrinter2 method will refer to anonymous class we create
        Printer printer = new Printer() {
            @Override
            public void print(String msg) {
                System.out.println(msg + this.getClass());
            }
        };
        return printer;
    }

//    Output
//    Lambda Printer : class prashant.FunctionalProgramming.ZMiscellaneous.ThisDemo
//    Anonymous Printer : class prashant.FunctionalProgramming.ZMiscellaneous.ThisDemo$1
//    Anonymous Printer2 : class prashant.FunctionalProgramming.ZMiscellaneous.ThisDemo$2

}

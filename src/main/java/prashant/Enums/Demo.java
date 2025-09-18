package prashant.Enums;

enum Status {
    SUCCESS(200), ERROR(500), NOT_FOUND(404);

    private int code;

    Status(int code) {  // constructor
        this.code = code;
    }

    public int getCode() {
        return code;
    }
}

public class Demo {
    public static void main(String[] args) {

//        Think of it like
//        public static final Status SUCCESS = new Status(200);

        Status s = Status.SUCCESS;
        System.out.println(s);            // SUCCESS
        System.out.println(s.getCode());  // 200
    }
}

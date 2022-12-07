// Реализуйте 3 метода, чтобы в каждом из них получить разные исключения

public class main {
    public static void main(String[] args) {
        System.out.println(divide(10, 0));
    }

    public static int divide(int a, int b) {
        if (b == 0) {
            throw new RuntimeException("На 0 делить нельзя!");
        }
        return a / b;
    }
}

/* public class main {
    public static void main(String[] args) {
        System.out.println(divide(10, 0));
    }

    public static int divide(int a, int b) {
        if (b == 0) {
            return -1;
        }
        return a / b;
    }
} */

/* public class main {
    public static void main(String[] args) {
        System.out.println(divide(10, 0));
    }

    public static int divide(int a, int b) {
        return a / b;
    }
} */
/**
7. Write a Java program that shows exception propagation across multiple methods
 (method1 calls method2 calls method3, which throws the exception). Handle the exception in method1.
‌ */class Q7 {

    public static void method3() {
        int result = 10 / 0;
    }

    public static void method2() {
        method3();  
    }

    public static void method1() {
        method2();
    }

    public static void main(String[] args) {
        try {
            method1();  
        } catch (ArithmeticException e) {
            System.out.println("Exception caught in method1: " + e.getMessage());
        }
    }
}

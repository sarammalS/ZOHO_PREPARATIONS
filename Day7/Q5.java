/*5. Create a program where try block contains a return statement. 
Ensure that finally block executes before the method returns. Show this with output.
‌*/class Q5 {
    public static int hello() {
        System.out.println("try function call");
        return 10;
    }

    public static void main(String[] args) {
        int result;
        try {
            result = hello();
            System.out.println(result);
        } finally {
            System.out.println("Finally executed");
        }
        
    }
}

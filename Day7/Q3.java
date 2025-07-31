/*‌
3. Write a program to illustrate how to throw a ClassNotFoundException.
‌*/class Q3 {
    public static void main(String[] args) {
        try {
            Class.forName("Ticket"); 
        } catch (ClassNotFoundException e) {
            System.out.println("Class Not Found: " + e.getMessage());
        }
    }
}

/* Develop a Java program to illustrate pass-by-value.*/
class Sara {
    int value = 5;
}

public class Q6 {
    
    // Method to modify primitive value
    public static void modifyPrimitive(int a) {
        a = 100;
        System.out.println("Inside modifyPrimitive: " + a);
    }

    // Method to modify object reference
    public static void modifyObject(Sara obj) {
        obj.value = 200;
        System.out.println("Inside modifyObject: " + obj.value);
    }

    public static void main(String[] args) {
        int a = 50;
        modifyPrimitive(a);
        System.out.println("After modifyPrimitive: " + a);  // remains 50 → pass-by-value

        Sara s = new Sara();
        System.out.println("Before modifyObject: " + s.value); // 5
        modifyObject(s);
        System.out.println("After modifyObject: " + s.value);  // 200 → because the object itself was changed
    }
}

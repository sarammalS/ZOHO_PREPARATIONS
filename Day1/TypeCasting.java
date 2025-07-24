public class TypeCasting {
    public static void main(String[] args) {
        //  Implicit Type Casting (Widening)
        int a = 100;
        long b = a;       
        float c = b;      
        double d = c;     

        

        System.out.println("--- Implicit Type Casting ---");
        System.out.println("int a = " + a);
        System.out.println("long b = " + b);
        System.out.println("float c = " + c);
        System.out.println("double d = " + d);

        //  Explicit Type Casting (Narrowing)
        double x = 99.99;
        float y = (float) x;      
        long z = (long) y;        
        int i = (int) z;          
        byte bt = (byte) i;       

        System.out.println("\n--- Explicit Type Casting ---");
        System.out.println("double x = " + x);
        System.out.println("float y = (float)x = " + y);
        System.out.println("long z = (long)y = " + z);
        System.out.println("int i = (int)z = " + i);
        System.out.println("byte bt = (byte)i = " + bt);
    }
}
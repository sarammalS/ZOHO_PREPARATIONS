public class  Q7{
    public static String toBinary(int decimal) {
        if (decimal == 0) return "0";
        String binary = "";
        while (decimal > 0) {
            binary = (decimal % 2) + binary;
            decimal = decimal / 2;
        }
        return binary;
    }

    public static void main(String[] args) {
        int num = 25;
        System.out.println("Binary of " + num + " is " + toBinary(num));
    }
}
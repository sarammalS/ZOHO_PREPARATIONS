class BasicCalculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        if (b == 0) throw new ArithmeticException("Divide by zero");
        return a / b;
    }
}

class AdvancedCalculator extends BasicCalculator {
    public int power(int base, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) result *= base;
        return result;
    }

    public int modulus(int a, int b) {
        return a % b;
    }

    public double squareRoot(double number) {
        return Math.sqrt(number);
    }
}

class ScientificCalculator extends AdvancedCalculator {
    public double sin(double angle) {
        return Math.sin(Math.toRadians(angle));
    }

    public double cos(double angle) {
        return Math.cos(Math.toRadians(angle));
    }

    public double log(double value) {
        return Math.log(value);
    }

    public double exp(double value) {
        return Math.exp(value);
    }

    public static void main(String[] args) {
        ScientificCalculator calc = new ScientificCalculator();

       
        System.out.println("Add: " + calc.add(10, 5));
        System.out.println("Subtract: " + calc.subtract(10, 5));
        System.out.println("Multiply: " + calc.multiply(10, 5));
        System.out.println("Divide: " + calc.divide(10, 2));

        
        System.out.println("Power: " + calc.power(2, 5));
        System.out.println("Modulus: " + calc.modulus(10, 3));
        System.out.println("Square Root: " + calc.squareRoot(16));

        System.out.println("Sin(30): " + calc.sin(30));
        System.out.println("Cos(60): " + calc.cos(60));
         System.out.println("Log(10): " + calc.log(10));
        System.out.println("Exp(1): " + calc.exp(1));
    }
}

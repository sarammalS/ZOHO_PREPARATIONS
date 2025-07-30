/*
2. Construct a base class called twoD contains x and y and methods to read and write the x and y. Create another class called threeD which is derived from twoD and also contains z and write methods to read and write z. Also write a method to find the distance of two threeD Points.
sqrt((x2-x1)^2+(y2-y1)^2+(z2-z1)^2)
In main:
Create one ThreeD object using the default constructor.
Use the setters to set x, y, and z.
Create the second ThreeD object using the constructor with three arguments.
in the TwoD class:
Add a cout statement to the TwoD default constructor with a message "TwoD default constructor"
Add a cout statement to other TwoD constructor with a message "TwoD constructor with two arguments"*/
class TwoD {
    protected int x, y;

    TwoD() {
        System.out.println("TwoD default constructor");
        x = 0;
        y = 0;
    }

    TwoD(int x, int y) {
        System.out.println("TwoD constructor with two arguments");
        this.x = x;
        this.y = y;
    }

    void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    void getXY() {
        System.out.println("X: " + x + ", Y: " + y);
    }
}

class ThreeD extends TwoD {
    private int z;

    ThreeD() {
        super();
        z = 0;
    }

    ThreeD(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }

    void setZ(int z) {
        this.z = z;
    }

    void getZ() {
        System.out.println("Z: " + z);
    }

    double distanceTo(ThreeD other) {
        return Math.sqrt(Math.pow(other.x - x, 2)
                       + Math.pow(other.y - y, 2)
                       + Math.pow(other.z - z, 2));
    }
}

public class Main2 {
    public static void main(String[] args) {
        ThreeD p1 = new ThreeD();
        p1.setXY(1, 2);
        p1.setZ(3);

        ThreeD p2 = new ThreeD(4, 6, 8);

        double distance = p1.distanceTo(p2);
        System.out.println("Distance: " + distance);
    }
}

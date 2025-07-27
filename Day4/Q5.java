class Shape {
    void display() {
        System.out.println("This is a shape");
    }
}

class Polygon extends Shape {
    void display() {
        System.out.println("Polygon is a shape");
    }
}

class Rectangle extends Polygon {
    void display() {
        System.out.println("Rectangle is a polygon");
    }
}

class Triangle extends Polygon {
    void display() {
        System.out.println("Triangle is a polygon");
    }
}

class Square extends Rectangle {
    void display() {
        System.out.println("Square is a rectangle");
    }
}

public class Q5 {
    public static void main(String[] args) {
        Shape s = new Shape();
        s.display();

        Polygon p = new Polygon();
        p.display();

        Rectangle r = new Rectangle();
        r.display();

        Triangle t = new Triangle();
        t.display();

        Square sq = new Square();
        sq.display();
    }
}

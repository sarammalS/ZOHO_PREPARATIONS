/*5. Create a class named Shape with a method that prints "This is a shape". Create another class named Polygon inheriting the Shape class with the same method that prints "Polygon is a shape". Create two other classes named Rectangle and Triangle having the same method which prints "Rectangle is a polygon" and "Triangle is a polygon" respectively. Again, make another class named Square having the same method which prints "Square is a rectangle".*/
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

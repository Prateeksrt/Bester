package bester;

public class Rectangle implements Bestable<Rectangle> {
    private double length;
    private double breadth;

    public Rectangle(double breadth, double length) {
        this.breadth = breadth;
        this.length = length;
    }

    public double area() {
        return length * breadth;
    }

    public Rectangle compareTo(Rectangle rect) {
        if(rect == null) return this;
        if(area()>rect.area()){
            return this;
        }

        return rect;
    }
}

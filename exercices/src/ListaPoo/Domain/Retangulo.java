package ListaPoo.Domain;

public class Retangulo {
    private double base;
    private double height;

    public Retangulo(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public double area() {
        return base * height;
    }

    public double perimeter() {
        return 2 * (base + height);
    }

    public double pitagoras() {
        return Math.sqrt((Math.pow(base, 2) +(Math.pow(height,2))));
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}

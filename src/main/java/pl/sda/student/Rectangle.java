package pl.sda.student;

public class Rectangle implements Figure {
    public double sideA;
    public double sideB;

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    public Rectangle(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public double getArea (double sideA, double sideB) {
        double Area = sideA * sideB;
        return Area;
    }

    public double getPerimeter (double sideA, double sideB) {
        double Perimeter = sideA + sideA + sideB + sideB;
        return Perimeter;
    }
}

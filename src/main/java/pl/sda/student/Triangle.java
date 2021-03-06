package pl.sda.student;

public class Triangle implements Figure {
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

    public Triangle(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }
    //public int getPerimeter(int sideA + int sideB + int sideC

    //double sideC = Math.pow(Math.pow(sideA, 2) + Math.pow(sideB, 2),0.5);

    public double getArea (double sideA, double sideB) {
        double Area = sideA * sideB / 2;
        return Area;
    }

    public double getPerimeter (double sideA, double sideB) {
        double Perimeter = sideA + sideB + Math.sqrt ((sideA*sideA) + (sideB*sideB));
        return Perimeter;
    }
}

package pl.sda.student;

public class Main {

    public static void main(String[] args) {
        Triangle triangle = new Triangle(12, 13);
        Rectangle rectangle = new Rectangle(23, 12);

        System.out.println("Pole trojkata to" + triangle.getArea(triangle.getSideA(), triangle.getSideB()));
        System.out.println("Obwód trojkata to" + triangle.getPerimeter(triangle.getSideA(), triangle.getSideB()));

        System.out.println("Pole prostokąta to" + rectangle.getArea(rectangle.getSideA(), rectangle.getSideB()));
        System.out.println("Obwod prostokata to" + rectangle.getPerimeter(rectangle.getSideA(), rectangle.getSideB()));
    }


}

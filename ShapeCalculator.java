import java.util.Scanner;

abstract class Shape {
    public abstract double calculateArea();
    public abstract double calculatePerimeter();
}

class Square extends Shape {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return side * side;
    }

    @Override
    public double calculatePerimeter() {
        return 4 * side;
    }
}

class Triangle extends Shape {
    private double base;
    private double height;
    private double side1;
    private double side2;
    private double side3;

    public Triangle(double base, double height, double side1, double side2, double side3) {
        this.base = base;
        this.height = height;
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    public double calculateArea() {
        return (base * height) / 2;
    }

    @Override
    public double calculatePerimeter() {
        return side1 + side2 + side3;
    }
}

public class ShapeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите фигуру для расчета: 1 - Квадрат, 2 - Треугольник");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Введите длину стороны квадрата:");
                double side = scanner.nextDouble();
                Square square = new Square(side);
                System.out.println("Площадь квадрата: " + square.calculateArea());
                System.out.println("Периметр квадрата: " + square.calculatePerimeter());
                break;
            case 2:
                System.out.println("Введите основание треугольника:");
                double base = scanner.nextDouble();
                System.out.println("Введите высоту треугольника:");
                double height = scanner.nextDouble();
                System.out.println("Введите длину первой стороны треугольника:");
                double side1 = scanner.nextDouble();
                System.out.println("Введите длину второй стороны треугольника:");
                double side2 = scanner.nextDouble();
                System.out.println("Введите длину третьей стороны треугольника:");
                double side3 = scanner.nextDouble();
                Triangle triangle = new Triangle(base, height, side1, side2, side3);
                System.out.println("Площадь треугольника: " + triangle.calculateArea());
                System.out.println("Периметр треугольника: " + triangle.calculatePerimeter());
                break;
            default:
                System.out.println("Неверный выбор. Завершение программы.");
                break;
        }
        scanner.close();
    }
}

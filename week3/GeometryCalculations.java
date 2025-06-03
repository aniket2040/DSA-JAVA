package week3;

public class GeometryCalculations {

    // Area Calculations
    public static double areaOfCircle(double radius) {
        return Math.PI * radius * radius;
    }

    public static double areaOfTriangle(double base, double height) {
        return 0.5 * base * height;
    }

    public static double areaOfRectangle(double length, double width) {
        return length * width;
    }

    public static double areaOfIsoscelesTriangle(double base, double height) {
        return 0.5 * base * height;
    }

    public static double areaOfParallelogram(double base, double height) {
        return base * height;
    }

    public static double areaOfRhombus(double diagonal1, double diagonal2) {
        return 0.5 * diagonal1 * diagonal2;
    }

    public static double areaOfEquilateralTriangle(double side) {
        return (Math.sqrt(3) / 4) * side * side;
    }

    // Perimeter Calculations
    public static double perimeterOfCircle(double radius) {
        return 2 * Math.PI * radius;
    }

    public static double perimeterOfEquilateralTriangle(double side) {
        return 3 * side;
    }

    public static double perimeterOfParallelogram(double side1, double side2) {
        return 2 * (side1 + side2);
    }

    public static double perimeterOfRectangle(double length, double width) {
        return 2 * (length + width);
    }

    public static double perimeterOfSquare(double side) {
        return 4 * side;
    }

    public static double perimeterOfRhombus(double side) {
        return 4 * side;
    }

    // Volume Calculations
    public static double volumeOfCone(double radius, double height) {
        return (1.0 / 3) * Math.PI * radius * radius * height;
    }

    public static double volumeOfPrism(double baseArea, double height) {
        return baseArea * height;
    }

    public static double volumeOfCylinder(double radius, double height) {
        return Math.PI * radius * radius * height;
    }

    public static double volumeOfSphere(double radius) {
        return (4.0 / 3) * Math.PI * radius * radius * radius;
    }

    public static double volumeOfPyramid(double baseArea, double height) {
        return (1.0 / 3) * baseArea * height;
    }

    // Surface Area Calculations
    public static double curvedSurfaceAreaOfCylinder(double radius, double height) {
        return 2 * Math.PI * radius * height;
    }

    public static double totalSurfaceAreaOfCube(double side) {
        return 6 * side * side;
    }

    public static void main(String[] args) {
        // Example usage of the methods can be added here
    }
}

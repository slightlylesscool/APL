abstract class Shape {
abstract double area();
}
class Rectangle extends Shape {
double l = 13.5, b = 3.5;
double area() {
return l * b;
}
}
class Triangle extends Shape {
double b = 5.2, h = 6.9;
double area() {
return 0.5 * b * h;
}
}
class Square extends Shape {
double s = 9.5;
double area() {
return s * s;
}
}
public class ShapeDemo {
public static void main(String[] args) {
Rectangle r1 = new Rectangle();
Triangle t1 = new Triangle();
Square s1 = new Square();
System.out.println("The area of rectangle is: " + r1.area());
System.out.println("The area of triangle is: " + t1.area());
System.out.println("The area of square is: " + s1.area());
}
}

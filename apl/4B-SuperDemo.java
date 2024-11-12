class A {
int l, b;
A() {
l = 25;
b = 40;
}
}
class B extends A {
int h;
B() {
super();
h = 30;
}
int volume() {
return l * b * h;
}
}
public class SuperDemo {
public static void main(String[] args) {
B b1 = new B();
int r = b1.volume();
System.out.println("The volume is: " + r);
}
}

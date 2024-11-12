interface Area {
    float compute(float x, float y);
}

class Rectangle implements Area {
    public float compute(float x, float y) {
        return (x * y);
    }
}

class Triangle implements Area {
    public float compute(float x, float y) {
        return (x * y / 2);
    }
}

public class InterfaceMain {
    public static void main(String[] args) {
        Area rect = new Rectangle();  // Polymorphic assignment
        Area tri = new Triangle();    // Polymorphic assignment

        System.out.println("Area of rectangle = " + rect.compute(26, 24));
        System.out.println("Area of triangle = " + tri.compute(17, 18));
    }
}

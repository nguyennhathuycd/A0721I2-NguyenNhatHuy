package interface_Colorable_cho_lop_hinh_hoc;

public class ShapeTest {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        int length = shapes.length;
        // init array circle
        shapes[0] = new Circle(3.5, "indigo", false);
        shapes[1] = new Rectangle(2.5, 3.8, "orange", true);
        shapes[2] = new Square(5.5,"orange", true);
        // resize
        for (int i = 0; i < length; i++) {
            System.out.println("=======================================================");
            System.out.println("Shape " + (i + 1) + " :");
            System.out.println("Area: " + shapes[i].getArea());
            if (shapes[i] instanceof Colorable) {
                System.out.println("Color: " + ((Square) shapes[i]).howToColor());
            }
        }
    }
}

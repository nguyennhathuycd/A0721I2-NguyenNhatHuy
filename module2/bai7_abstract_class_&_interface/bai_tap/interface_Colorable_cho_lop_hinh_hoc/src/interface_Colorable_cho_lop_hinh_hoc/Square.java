package interface_Colorable_cho_lop_hinh_hoc;

public class Square extends Shape implements Colorable{
    private double length = 1.0;

    public Square() {
    }

    public Square(double length) {
        this.length = length;
    }

    public Square(double length, String color, boolean filled) {
        super(color, filled);
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
        return this.length * this.length;
    }

    public double getPerimeter() {
        return 4 * this.length;
    }

    @Override
    public String toString() {
        return "A Square with length=" + getLength()
                + ", which is a subclass of "
                + super.toString();
    }

    @Override
    public String howToColor() {
        return "Color all four sides";
    }
}

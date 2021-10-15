package thiet_ke_va_trien_khai_lop_triangle.model;

public class Triangle extends Shape{
    private double slide1 = 1.0;
    private double slide2 = 1.0;
    private double slide3 = 1.0;

    public Triangle() {
    }

    public Triangle(double slide1, double slide2, double slide3) {
        this.slide1 = slide1;
        this.slide2 = slide2;
        this.slide3 = slide3;
    }

    public Triangle(String color, boolean filled, double slide1, double slide2, double slide3) {
        super(color, filled);
        this.slide1 = slide1;
        this.slide2 = slide2;
        this.slide3 = slide3;
    }

    public double getSlide1() {
        return slide1;
    }

    public void setSlide1(double slide1) {
        this.slide1 = slide1;
    }

    public double getSlide2() {
        return slide2;
    }

    public void setSlide2(double slide2) {
        this.slide2 = slide2;
    }

    public double getSlide3() {
        return slide3;
    }

    public void setSlide3(double slide3) {
        this.slide3 = slide3;
    }

    public double getPerimeter() {
        return (slide1 + slide2 + slide3);
    }

    public double getArea() {
        double p = getPerimeter() / 2;
        double S = Math.sqrt(p*(p-slide1)*(p-slide2)*(p-slide3));
        return S;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "color = " + getColor() +
                (isFilled() ? ", filled" : ", not filled") +
                ", slide1 = " + slide1 +
                ", slide2 = " + slide2 +
                ", slide3 = " + slide3 +
                '}';
    }
}

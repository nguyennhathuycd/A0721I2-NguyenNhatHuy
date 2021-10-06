package lop_hinh_chu_nhat;

public class Rectangle {
    double height, width;

    public Rectangle() {
    }

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public double getArea() {
        return height * width;
    }

    public double getPerimeter() {
        return (height + width) * 2;
    }

    public void display() {
        System.out.println("Rectangle:\tHeight: " + this.height + "\tWidth: " + this.width);
    }
}

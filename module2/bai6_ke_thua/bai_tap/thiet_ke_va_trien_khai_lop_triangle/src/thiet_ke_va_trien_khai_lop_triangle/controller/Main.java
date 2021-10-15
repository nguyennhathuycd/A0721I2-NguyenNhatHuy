package thiet_ke_va_trien_khai_lop_triangle.controller;

import thiet_ke_va_trien_khai_lop_triangle.model.Triangle;
import thiet_ke_va_trien_khai_lop_triangle.service.ShapeService;
import thiet_ke_va_trien_khai_lop_triangle.service.TriangleService;

public class Main {
    private static ShapeService shapeService = new ShapeService();
    private static TriangleService triangleService = new TriangleService();

    public static void main(String[] args) {
        // Test class Shape
        shapeService.add();
        shapeService.display();

        // Test class Shape
        triangleService.add();
        triangleService.display();
        triangleService.getPerimeter();
        triangleService.getArea();
    }
}

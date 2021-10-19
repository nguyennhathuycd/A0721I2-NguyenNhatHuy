package interface_comparable_cho_lop_hinh_hoc.controller;

import interface_comparable_cho_lop_hinh_hoc.service.ShapeService;

public class ShapeTest {
    private static ShapeService shapeService = new ShapeService();

    public static void main(String[] args) {
        // Test class Shape
        shapeService.add();
        shapeService.display();

    }
}

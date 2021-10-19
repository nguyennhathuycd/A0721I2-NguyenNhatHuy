package interface_comparable_cho_lop_hinh_hoc.controller;

import interface_comparable_cho_lop_hinh_hoc.service.CircleService;

public class CircleTest {
    private static CircleService circleService = new CircleService();

    public static void main(String[] args) {
        // Test class Circle
        circleService.add();
        circleService.display();
        circleService.getArea();
        circleService.getPerimeter();
    }
}

package controller;

import entity.Product;
import service.ProductService;

import java.util.List;

public class ProductManager {

    public static void main(String[] args) {
        ProductService service = new ProductService();

        Product p1 = new Product(1, "Giay", 230000);
        Product p2 = new Product(2, "Ao", 220000);
        Product p3 = new Product(3, "Quan", 210000);
        Product p4 = new Product(4, "Giay", 200000);
        Product p5 = new Product(5, "Sach", 210000);
        Product p6 = new Product(6, "Vo", 190000);

        service.addProduct(p1);
        service.addProduct(p2);
        service.addProduct(p3);
        service.addProduct(p4);
        service.addProduct(p5);
        service.addProduct(p6);

        List<Product> products = service.getProductList();
        service.sortByNameAsc(products);

        System.out.println("Sắp xếp theo giá giảm dần, nếu giá bằng nhau thì sắp xếp giảm dần theo tên:");
        products.stream().forEach(p -> System.out.println(p));

        Product updateProduct = new Product(1,"vang",50000);
        if (service.editProduct(updateProduct)) {
            System.out.println("Cập nhật sản phẩm thành công");
        } else {
            System.out.println("Cập nhật sản phẩm thất bại");
        }

        if (service.deleteProduct(6)) {
            System.out.println("Xóa sản phẩm thành công");
        } else {
            System.out.println("Xóa sản phẩm thất bại");
        }

        products.stream().forEach(p -> System.out.println(p));
    }
}
package service;

import model.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ProductServiceImpl implements ProductService{
    private List<Product> products = new ArrayList<>();

    public ProductServiceImpl() {
        products.add(new Product(1, "Nokia 590", 123, "d1", "Nokia"));
        products.add(new Product(2, "SamSung A80", 123, "d2", "Samsung"));
        products.add(new Product(3, "Iphone 13", 123, "d3", "Apple"));
        products.add(new Product(4, "Test 13", 123, "d3", "Test"));
        products.add(new Product(5, "LG 139", 123, "d3", "LG"));
    }

    @Override
    public List<Product> getAll() {
        return products;
    }

    @Override
    public void save(Product product) {
        if (product.getId() > 0) {
            int index =products.indexOf(product);
            System.out.println("Index:" + index);
            products.set(index, product);
        } else {
            int index = products.get(products.size() - 1).getId() + 1;
            product.setId(index);
            products.add(product);
        }
    }

    @Override
    public void delete(int id) {
        products.removeIf(e -> e.getId() == id);
    }

    @Override
    public List<Product> search(String name) {
        return products.stream().filter(e -> e.getName().contains(name)).collect(Collectors.toList());
    }
}

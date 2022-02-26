package service;

import model.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ProductServiceImpl implements IProductService{
    private static final Map<Integer, Product> products;

    private int id;
    private String name;
    private double price;
    private String description;
    private String manufacture;


    static {
        products = new HashMap<>();
        products.put(1, new Product(1, "Sach", 30000, "Sach chinh hang", "Da Nang"));
        products.put(2, new Product(2, "Vo", 40000, "Vo chinh hang", "Hai Phong"));
        products.put(3, new Product(3, "But", 50000, "But chinh hang", "Ha Noi"));
        products.put(4, new Product(4, "Thuoc", 60000, "Thuoc chinh hang", "Ho Chi Minh"));
        products.put(5, new Product(5, "Compa", 70000, "Compa chinh hang", "Binh Duong"));
    }

    @Override
    public List<Product> findAll() {
        return new ArrayList<Product>(products.values());
    }

    @Override
    public Product findById(int id) {
        return products.get(id);
    }

    @Override
    public void save(Product product) {
        products.put(product.getId(), product);
    }

    @Override
    public void update(int id, Product product) {
        products.put(id, product);
    }

    @Override
    public void remove(int id) {
        products.remove(id);
    }

    @Override
    public List<Product> searchByName(String name) {
        return new ArrayList<Product>(products.values().stream().filter(e -> e.getName().toLowerCase().contains(name.toLowerCase())).collect(Collectors.toList()));
    }
}

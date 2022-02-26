package controller;

import model.Product;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import service.IProductService;
import service.ProductServiceImpl;

import java.util.List;

@Controller
@RequestMapping("/product")
public class ProductController {
    private IProductService productService = new ProductServiceImpl();

    @GetMapping("")
    public String index(Model model) {
        List<Product> productList = productService.findAll();
        model.addAttribute("products", productList);
        return "index";
    }

    @GetMapping("/add")
    public String showAddProduct(Model model) {
        model.addAttribute("product", new Product());
        return "create";
    }

    @PostMapping("/add")
    public String addProduct(Product product) {
        product.setId((int) (Math.random() * 1000));
        productService.save(product);
        return "redirect:/product";
    }

    @GetMapping("/{id}/view")
    public String viewProduct(@PathVariable int id, Model model) {
        Product product = productService.findById(id);
        model.addAttribute("product", product);
        return "view";
    }

    @GetMapping("/{id}/edit")
    public String showEditProduct(@PathVariable int id, Model model) {
        model.addAttribute("product", productService.findById(id));
        return "edit";
    }

    @PostMapping("/update")
    public String editProduct(Product product){
        productService.update(product.getId(), product);
        return "redirect:/product";
    }

    @PostMapping("/delete")
    public String deleteProduct(@RequestParam("productId") int id) {
        productService.remove(id);
        return "redirect:/product";
    }

    @GetMapping("/search")
    public String searchByName(@RequestParam("search") String search, Model model) {
        List<Product> productList = productService.searchByName(search);
        model.addAttribute("products", productList);
        return "index";
    }
}

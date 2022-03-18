package com.example.them_sp_vao_gio_hang.controller;

import com.example.them_sp_vao_gio_hang.model.Cart;
import com.example.them_sp_vao_gio_hang.model.Product;
import com.example.them_sp_vao_gio_hang.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Optional;

@Controller
@SessionAttributes("cart")
public class ProductController {
    @Autowired
    private IProductService iProductService;

    @ModelAttribute("cart")
    public Cart setupCart() {
        return new Cart();
    }

    @GetMapping("/shop")
    public ModelAndView showShop() {
        ModelAndView modelAndView = new ModelAndView("/shop");
        modelAndView.addObject("products", iProductService.findAll());
        return modelAndView;
    }

    @GetMapping("/view/{id}")
    public ModelAndView viewProduct(@PathVariable Long id) {
        ModelAndView modelAndView = new ModelAndView("/viewProduct");
        modelAndView.addObject("product", iProductService.findById(id).get());
        return modelAndView;
    }

    @GetMapping("/changeQuantity/{quantity}/{id}")
    public ModelAndView changeQuantity(@PathVariable Long id, @PathVariable Integer quantity, @ModelAttribute Cart cart) {
        if (quantity <= 0 ) {
            ModelAndView modelAndView = new ModelAndView("/cart");
            modelAndView.addObject("messenge", "Quantity error.");
            return modelAndView;
        } else {
            cart.changeQuantity(iProductService.findById(id).get(), quantity);
            ModelAndView modelAndView = new ModelAndView("redirect:/shopping-cart");
            return modelAndView;
        }
    }

    @GetMapping("/deleteItem/{id}")
    public ModelAndView deleteItem(@PathVariable Long id, @ModelAttribute Cart cart) {
        cart.deleteItem(iProductService.findById(id).get());
        ModelAndView modelAndView = new ModelAndView("/cart");
        modelAndView.addObject("messenge", "Delete item successfully");
        return modelAndView;
    }

    @GetMapping("/add/{id}")
    public String addToCart(@PathVariable Long id, @ModelAttribute Cart cart, @RequestParam("action") String action) {
        Optional<Product> productOptional = iProductService.findById(id);
        if (!productOptional.isPresent()) {
            return "/error.404";
        }
        if (action.equals("show")) {
            cart.addProduct(productOptional.get());
            return "redirect:/shopping-cart";
        }
        cart.addProduct(productOptional.get());
        return "redirect:/shop";
    }
}

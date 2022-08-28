package com.bookish.spring.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.bookish.spring.global.GlobalData;
import com.bookish.spring.model.Product;
import com.bookish.spring.model.UserDetails;
import com.bookish.spring.repository.UserDetailRepository;
import com.bookish.spring.service.ProductService;

@Controller
public class CartController {
    @Autowired
    ProductService productService;

    Product product;

    @Autowired
    UserDetailRepository userDetailRepository;

    @GetMapping("/addToCart/{id}")
    public String addToCart(@PathVariable int id){
        GlobalData.cart.add(productService.getProductById(id).get());
        return "redirect:/shop";
    }
    float val=(float) 0.0;

    @GetMapping("/cart")
    public String goToCart(Model model){
        model.addAttribute("cartCount", GlobalData.cart.size());
        model.addAttribute("total", GlobalData.cart.stream().mapToDouble(Product::getPrice).sum());        
        if(GlobalData.cart.size()!=0)
            val= (float) 100.0;
        model.addAttribute("rate", val);
        model.addAttribute("sum", GlobalData.cart.stream().mapToDouble(Product::getPrice).sum()+val);
        model.addAttribute("cart", GlobalData.cart);
        return "cart";
    }


    @GetMapping("/cart/removeItem/{index}")
    public String removeItem(@PathVariable int index){
        GlobalData.cart.remove(index);
        return "redirect:/cart";
    }

    @GetMapping("/checkout")
    public String Checkout(Model model){
        model.addAttribute("total", GlobalData.cart.stream().mapToDouble(Product::getPrice).sum());
        model.addAttribute("rate", val);
        model.addAttribute("sum", GlobalData.cart.stream().mapToDouble(Product::getPrice).sum()+val);
        model.addAttribute("cart", GlobalData.cart);
        model.addAttribute("number", GlobalData.cart.size());
        return "checkout";
    }
    @GetMapping("/orderPlaced")
    public String OrderPlaced(Model model){
        model.addAttribute("count", GlobalData.cart.size());
        model.addAttribute("total", GlobalData.cart.stream().mapToDouble(Product::getPrice).sum());
        model.addAttribute("sum", GlobalData.cart.stream().mapToDouble(Product::getPrice).sum()+val);
        return "orderPlaced";
    }
    @PostMapping("/confirm")
    public String OrderPlacing(@ModelAttribute("userdetails") UserDetails userDetails){
        userDetailRepository.save(userDetails);
        return "redirect:/orderPlaced";
    }

    
}

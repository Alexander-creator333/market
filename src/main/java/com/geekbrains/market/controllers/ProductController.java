package com.geekbrains.market.controllers;

import com.geekbrains.market.entities.Product;
import com.geekbrains.market.entities.Student;
import com.geekbrains.market.services.ProductService;
import com.geekbrains.market.services.StudentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.transaction.Transactional;
import java.util.List;

@Controller
@RequestMapping("/products")
@Transactional
public class ProductController {
    private ProductService productService;

    @Autowired
    public void setProductService(ProductService productService) {
        this.productService = productService;
    }

    @RequestMapping("/list")
    @Transactional
    public String showStudentsList(Model model) {
        List<Product> allProduct = productService.getAllProducts();
        model.addAttribute("productsList", allProduct);
        return "products-list";
    }

}

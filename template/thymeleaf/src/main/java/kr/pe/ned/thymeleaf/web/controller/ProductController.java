package kr.pe.ned.thymeleaf.web.controller;

import kr.pe.ned.thymeleaf.model.Product;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

/**
 * http://www.baeldung.com/spring-boot-internationalization
 */
@Controller
@RequestMapping("product")
public class ProductController {

    @GetMapping
    public ModelAndView list() {

        List<Product> products = buildProducts();

        ModelAndView mav = new ModelAndView("product/product_list");
        mav.addObject("products", products);
        mav.addObject("totalCount", products.size());
        return mav;
    }

    private List<Product> buildProducts() {
        List<Product> products = new ArrayList<>();
        products.add(new Product("Product1", "Product 1"));
        products.add(new Product("Product2", "Product 2"));
        products.add(new Product("Product3", "Product 3"));
        products.add(new Product("Product4", "Product 4"));

        return products;
    }

}

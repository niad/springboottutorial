package kr.pe.ned.thymeleaf.web.controller;

import kr.pe.ned.thymeleaf.model.Code;
import kr.pe.ned.thymeleaf.model.Product;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

/**
 * http://www.baeldung.com/spring-boot-internationalization
 *
 *
 * 예제
 *      http://firstboos.tistory.com/entry/Thymeleaf-%EC%97%90%EC%84%9C-%EC%9E%90%EC%A3%BC-%EC%82%AC%EC%9A%A9%ED%95%98%EB%8A%94-%EC%98%88%EC%A0%9C
 *      http://www.thymeleaf.org/doc/articles/standardurlsyntax.html
 *
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

    @ModelAttribute("productTypes")
    public List<Code> productTypes() {
        // 컨트롤러의 모든 Request 처리시 호출됨
        List<Code> codes = new ArrayList<>();
        codes.add(new Code("FOOD", "식품"));
        codes.add(new Code("ELECTRIC GOODS", "전자제품"));
        return codes;
    }


    private List<Product> buildProducts() {
        List<Product> products = new ArrayList<>();
        products.add(new Product("Product1", "Product 1", 0));
        products.add(new Product("Product2", "Product 2", 2500000));
        products.add(new Product("Product3", "Product 3", 35000));
        products.add(new Product("Product4", "Product 4", 250000));

        return products;
    }

}

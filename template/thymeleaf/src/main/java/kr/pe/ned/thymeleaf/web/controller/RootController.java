package kr.pe.ned.thymeleaf.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping
public class RootController {

    // inject via application.properties

    @RequestMapping(value="/")
    public ModelAndView list() {

        ModelAndView mav = new ModelAndView("index");
        mav.addObject("message", "Hello World");
        return mav;
    }

}


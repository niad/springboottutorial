package kr.pe.ned.jsp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping
public class RootController {

    @RequestMapping(value="/")
    public ModelAndView list() {

        return new ModelAndView("index");
    }

}

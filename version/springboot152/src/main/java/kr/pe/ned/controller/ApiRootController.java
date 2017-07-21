package kr.pe.ned.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/api")
public class ApiRootController {

	@RequestMapping(method = RequestMethod.GET)
	@ResponseBody
	String home() {
		return "Hello World!";
	}

}

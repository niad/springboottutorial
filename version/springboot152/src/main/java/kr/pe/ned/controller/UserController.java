package kr.pe.ned.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import kr.pe.ned.model.User;
import kr.pe.ned.service.UserService;

@Controller
@RequestMapping("user")
public class UserController {
	
	private UserService userService;
	
	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView list() {
		
		List<User> users = userService.selectList();
		ModelAndView mav = new ModelAndView("user/user_list");
		mav.addObject("users", users);
		return mav;
	}
	
	
	@Autowired
	private void setUserService(UserService userService) {
		this.userService = userService;
	}
}

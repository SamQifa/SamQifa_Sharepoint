package mountain.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/account")
public class AccountController extends LinkController {
	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public ModelAndView addAccount() {
		ModelAndView modelAndView = new ModelAndView("add-account-form");
		return modelAndView;
	}
}

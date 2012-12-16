package net.vin.box.controller.example;

import java.util.Locale;

import net.vin.box.domain.User;
import net.vin.box.form.SearchFilter;
import net.vin.box.service.UserService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class Example2Controller {

	private static final Logger logger = LoggerFactory
			.getLogger(Example2Controller.class);

	@Autowired
	private UserService userService;

	@RequestMapping(value = "/example/example2", method = RequestMethod.GET)
	public String listUsers(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		SearchFilter newFilter = new SearchFilter();
		model.addAttribute("searchUserFilter", newFilter);
		
		return "/example/example2";
	}

	@RequestMapping(value = "/example/example2/searchUser", method = RequestMethod.POST)
	public String addUser(@ModelAttribute("userSearchFilter") SearchFilter filter,
			BindingResult result) {
		logger.info("In - addUser");
		logger.info("-----------");
		logger.info(filter.toString());
		logger.info("-----------");
		logger.info(filter.toSqlString());
		logger.info("-----------");

		return "redirect:/example/example2";
	}
}

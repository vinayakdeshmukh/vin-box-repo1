package net.vin.box.controller.example;

import java.util.List;
import java.util.Locale;

import net.vin.box.domain.SUser;
import net.vin.box.service.SUserService;

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
public class Example1Controller {

    private static final Logger logger = LoggerFactory.getLogger(Example1Controller.class);

    @Autowired
    private SUserService sUserService;

    @RequestMapping(value = "/example/example1", method = RequestMethod.GET)
    public String listUsers(Locale locale, Model model) {
        logger.info("Welcome home! The client locale is {}.", locale);

        SUser newUser = new SUser();
        newUser.setUserId("USER001");
        newUser.setFirstName("User001");
        newUser.setMiddleName("");
        newUser.setLastName("Test");
        newUser.setPassWord("test123");
        model.addAttribute("userDetail", newUser);

        List<SUser> users = sUserService.listUser(0);
        model.addAttribute("userList", users);

        return "/example/example1";
    }

    @RequestMapping(value = "/example/example1/addUser", method = RequestMethod.POST)
    public String addUser(@ModelAttribute("userDetail") SUser user, BindingResult result) {
        logger.info("In - addUser");

        sUserService.addUser(user);

        return "redirect:/example/example1";
    }
}

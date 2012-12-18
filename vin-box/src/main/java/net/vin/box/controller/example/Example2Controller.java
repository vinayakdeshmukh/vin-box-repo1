package net.vin.box.controller.example;

import java.util.Locale;

import net.vin.box.form.SearchFilter;
import net.vin.box.form.SearchFilterField;
import net.vin.box.service.RCodeService;
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
public class Example2Controller {

    private static final Logger logger = LoggerFactory.getLogger(Example2Controller.class);

    @Autowired
    private SUserService sUuserService;

    @Autowired
    private RCodeService rCodeService;

    @RequestMapping(value = "/example/example2", method = RequestMethod.GET)
    public String listUsers(Locale locale, Model model) {
        logger.info("Welcome home! The client locale is {}.", locale);

        SearchFilter newFilter = new SearchFilter();
        SearchFilterField[] fields = new SearchFilterField[2];
        fields[0] = new SearchFilterField();
        fields[0].setKey("userId");
        fields[1] = new SearchFilterField();
        fields[1].setKey("firstName");
        newFilter.setFields(fields);
        model.addAttribute("searchUserFilter", newFilter);
        model.addAttribute("lookupMapSearchFilter", sUuserService.lookupMapSearchFilter());
        model.addAttribute("lookupMapOperator", rCodeService.lookupMapByCodeType("B1_OPERATOR"));

        return "/example/example2";
    }

    @RequestMapping(value = "/example/example2/searchUser", method = RequestMethod.POST)
    public String addUser(@ModelAttribute("userSearchFilter") SearchFilter filter, BindingResult result) {
        logger.info("In - addUser");
        logger.info("-----------");
        logger.info(filter.toString());
        logger.info("-----------");
        logger.info(filter.toSqlString());
        logger.info("-----------");

        return "redirect:/example/example2";
    }
}

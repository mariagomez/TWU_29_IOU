package com.thoughtworks.twu.controller;

import com.thoughtworks.twu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class BillController {
    private UserService userService;
    private DashboardController dashboard;

    @Autowired
    public BillController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping("/add-bill")
    public ModelAndView billPage(@RequestParam(value = "Bill", defaultValue = "") String addBill) {
        return new ModelAndView("/add-bill");
    }

    @RequestMapping(value = "/dashboard", method = RequestMethod.POST)
    public ModelAndView backFromBillPage(@RequestParam(value = "Back", defaultValue = "") String back) {
        return new ModelAndView("/dashboard");
    }
}
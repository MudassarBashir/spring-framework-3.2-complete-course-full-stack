package com.caveofprogramming.spring.web.controllers;

import com.caveofprogramming.spring.web.dao.Offer;
import com.caveofprogramming.spring.web.service.OffersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * Created by Moe B. on 11/14/2016.
 */
@Controller
public class OffersController {

    @Autowired
    private OffersService offersService;

    @RequestMapping(value="/test", method= RequestMethod.GET)
    public String showTest(Model model, @RequestParam("id") String id) {
        System.out.println("Id is: " + id);
        return "home";
    }

    @RequestMapping("/offers")
    public String showOffers(Model model) {
        List<Offer> offers = offersService.getCurrent();
        model.addAttribute("offers", offers);
        return "offers";
    }

    @RequestMapping("/createoffer")
    public String createOffer() {
        return "createoffer";
    }

    @RequestMapping("/docreate")
    public String doCreate() {
        return "offercreated";
    }
}

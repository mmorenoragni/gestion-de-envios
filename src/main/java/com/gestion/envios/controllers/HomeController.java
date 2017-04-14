package com.gestion.envios.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Usuario on 14/04/2017.
 */

@Controller
public class HomeController {
    @RequestMapping(value = "/index")
    public String HomePage() {

        return "index";
    }
}

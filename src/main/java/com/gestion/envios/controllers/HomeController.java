package com.gestion.envios.controllers;

import com.gestion.envios.entity.Usuario;
import com.gestion.envios.servicios.UsuarioServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by Usuario on 14/04/2017.
 */

@Controller
public class HomeController {

    @Autowired
    private UsuarioServices usuarioServices;

    @RequestMapping(value = "/index")
    public String HomePage() {

        return "index";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String loguin(Model model,
                         @RequestParam(value = "username", required = true) String username,
                         @RequestParam(value = "password", required = true) String password ) {

        Usuario usuario = usuarioServices.getUserByPasswordAndId(username,password);
        if (usuario != null && usuario.getFirstName().trim().equals(username)) {
            model.addAttribute("usuario",usuario.getFirstName());
            return "mainPage";
        } else {
            return "errorPage";
        }
    }
}

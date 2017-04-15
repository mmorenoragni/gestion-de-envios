package com.gestion.envios.controllers;

import com.gestion.envios.entity.Usuario;
import com.gestion.envios.servicios.UsuarioServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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
    public String loguin() {

        Usuario usuario = usuarioServices.getUserByPasswordAndId("lucas");
        if (usuario.getFirstName().trim().equals("lucas"))
            return "mainPage";
        else
        return "index";
    }
}

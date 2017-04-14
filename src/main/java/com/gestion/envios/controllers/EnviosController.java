package com.gestion.envios.controllers;

import com.gestion.envios.dao.UsuarioDao;
import com.gestion.envios.entity.Usuario;
import com.gestion.envios.servicios.UsuarioServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Usuario on 14/04/2017.
 */
@RestController
public class EnviosController {

    @Autowired
    private UsuarioServices usuarioServices;

    @RequestMapping(value = "index-prueba")
    public List<Usuario> prueba() {
        return usuarioServices.getAll();
    }
}

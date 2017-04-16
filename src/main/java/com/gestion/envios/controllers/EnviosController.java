package com.gestion.envios.controllers;

import com.gestion.envios.dao.UsuarioDao;
import com.gestion.envios.entity.Cliente;
import com.gestion.envios.entity.Encomienda;
import com.gestion.envios.entity.Usuario;
import com.gestion.envios.servicios.ClienteService;
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

    @Autowired
    private ClienteService clienteService;

    @RequestMapping(value = "usuario-prueba")
    public List<Usuario> PruebaUsuario() {
        return usuarioServices.getAll();
    }


    @RequestMapping(value = "cliente-prueba")
    public List<Encomienda> PruebaCliente() {
        return clienteService.getAllEncomiendas();
    }
}

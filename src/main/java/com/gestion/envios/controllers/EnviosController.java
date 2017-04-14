package com.gestion.envios.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Usuario on 14/04/2017.
 */
@RestController
public class EnviosController {

    @RequestMapping(value = "index-prueba")
    public List<String> prueba() {
        List<String> listaReturn = new ArrayList<String>();
        listaReturn.add("1");
        listaReturn.add("2");
        listaReturn.add("3");
        return listaReturn;
    }
}

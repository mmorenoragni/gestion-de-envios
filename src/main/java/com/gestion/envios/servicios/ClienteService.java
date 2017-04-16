package com.gestion.envios.servicios;

import com.gestion.envios.dao.ClienteDao;
import com.gestion.envios.entity.Cliente;
import com.gestion.envios.entity.Encomienda;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Usuario on 16/04/2017.
 */
@Service("clienteService")
public class ClienteService {

    @Autowired
    private ClienteDao clienteDao;

    @Transactional(propagation = Propagation.REQUIRED)
    public List<Cliente> getAll() {
        List<Cliente> clientes = clienteDao.getAll();
        return clientes;
    }

    @Transactional(propagation = Propagation.REQUIRED)
    public List<Encomienda> getAllEncomiendas() {
        List<Encomienda> encomiendas = clienteDao.getAllEncomiendas();
        return encomiendas;
    }

}

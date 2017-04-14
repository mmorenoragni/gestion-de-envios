package com.gestion.envios.servicios;

import com.gestion.envios.dao.UsuarioDao;
import com.gestion.envios.entity.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Usuario on 14/04/2017.
 */
@Service("usuarioService")
public class UsuarioServices {

    @Autowired
    private UsuarioDao usuarioDao;

    @Transactional(propagation = Propagation.REQUIRED)
    public List<Usuario> getAll() {
        final List<Usuario> usuarios = usuarioDao.getAll();
        return usuarios;
    }
}

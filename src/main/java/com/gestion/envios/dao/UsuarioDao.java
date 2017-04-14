package com.gestion.envios.dao;

import com.gestion.envios.entity.Usuario;
import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Usuario on 14/04/2017.
 */
@Repository("usuarioDao")
public class UsuarioDao {

    @Autowired
    private SessionFactory sessionFactory;

    public List<Usuario> getAll() {
        final Criteria criteria = sessionFactory.getCurrentSession().createCriteria(Usuario.class);
        return criteria.list();
    }
}

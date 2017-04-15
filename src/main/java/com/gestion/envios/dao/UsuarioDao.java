package com.gestion.envios.dao;

import com.gestion.envios.entity.Usuario;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
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

    public Usuario getUserByPasswordAndId(String userName) {

        Session session = sessionFactory.getCurrentSession();
        String hql = "from Usuario where firstName = 'lucas'";
        Query query = session.createQuery(hql);
        Usuario usuarioReturn = (Usuario) query.uniqueResult();
        return usuarioReturn;
    }
}

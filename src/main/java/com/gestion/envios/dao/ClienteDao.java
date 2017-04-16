package com.gestion.envios.dao;

import com.gestion.envios.entity.Cliente;
import com.gestion.envios.entity.Encomienda;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Usuario on 16/04/2017.
 */
@Repository("clienteDao")
public class ClienteDao {

    @Autowired
    private SessionFactory sessionFactory;

    public List<Cliente> getAll() {
        Session session = sessionFactory.getCurrentSession();
        String hql = "from Cliente";
        Query query = session.createQuery(hql);

        List<Cliente> clienteReturn = query.list();
        return clienteReturn;
    }

    public List<Encomienda> getAllEncomiendas() {
        Criteria criteria = sessionFactory.getCurrentSession().createCriteria(Encomienda.class);
        return  criteria.list();
    }

}

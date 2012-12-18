package net.vin.box.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public interface BaseDao {

    public void setSessionFactory(SessionFactory sessionFactory);

    public Session getCurrentSession();

}

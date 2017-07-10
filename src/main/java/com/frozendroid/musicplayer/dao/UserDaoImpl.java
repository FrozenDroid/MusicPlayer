package com.frozendroid.musicplayer.dao;

import com.frozendroid.musicplayer.entities.User;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserDaoImpl extends HibernateDaoSupport implements UserDao {


    protected SessionFactory sessionFactory;

    @Autowired
    public UserDaoImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
        super.setSessionFactory(sessionFactory);
    }

    @Transactional(readOnly = true)
    @SuppressWarnings("unchecked")
    @Override
    public List<User> findAll() {
        return this.getSessionFactory().getCurrentSession().createQuery("from com.frozendroid.musicplayer.entities.User").list();
    }

    @Override
    @SuppressWarnings("unchecked")
    public User findByEmail(String email) {
        List<User> users = new ArrayList<>();

        users = this.getSessionFactory().getCurrentSession().createQuery("from com.frozendroid.musicplayer.entities.User where email = :email")
                .setParameter("email", email)
                .list();

        if (users.size() > 0) {
            return users.get(0);
        }
        return null;
    }

}

package org.fyhr.sebsmealplanner.service;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.fyhr.sebsmealplanner.DAO.UserDao;
import org.fyhr.sebsmealplanner.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImp implements UserService {

    private final EntityManager entityManager;

    @Autowired
    public UserServiceImp(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Autowired
    private UserDao userDao;

    public User getUser(User userDetails) {

        TypedQuery<User> typedQuery = entityManager.createQuery
                ("FROM user WHERE password = :password AND user_name = :username", User.class);

        try{
            User user = typedQuery.setParameter("password", userDetails.getPassword()).setParameter("username",
                    userDetails.getUsername()).getSingleResult();
            return user;
        }catch (Exception e) {

            return null;
        }
    }

    public User insertIntoDB(User user) {
        return userDao.save(user);
    }
}

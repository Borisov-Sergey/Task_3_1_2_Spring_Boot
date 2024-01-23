package org.example.lastmodultaskone.repository;

import org.example.lastmodultaskone.model.User;

import java.util.List;

public interface UserDao {
    void save(User user);

    List<User> getAll();
    void update(User user);

    void removeById(Long id);

    User getById(Long id);
}

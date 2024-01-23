package org.example.lastmodultaskone.service;

import org.example.lastmodultaskone.model.User;

import java.util.List;

public interface UserService {
    void save(User user);

    List<User> getAll();
    void update(User user);

    void removeById(Long id);

    User getById(Long id);
}

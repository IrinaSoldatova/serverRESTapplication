package org.example.serverRESTapplication.repository;

import org.springframework.stereotype.Repository;
import org.example.serverRESTapplication.domain.User;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ListUserRepository {
    private List<User> users = new ArrayList<>();

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }
}
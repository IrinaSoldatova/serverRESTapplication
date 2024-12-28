package org.example.serverRESTapplication.interfaces;

import org.example.serverRESTapplication.domain.User;

import java.util.List;

public interface DataProcessingService {

    List<User> getAll();

    void addUserToList(User user);

    List<User> sortUsersByAge();

    List<User> filterUsersByAge(int age);

    double calculateAverageAge();
}
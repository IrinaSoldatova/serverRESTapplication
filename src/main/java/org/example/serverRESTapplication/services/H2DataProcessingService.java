package org.example.serverRESTapplication.services;

import org.example.serverRESTapplication.interfaces.DataProcessingService;
import org.example.serverRESTapplication.repository.H2UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import org.example.serverRESTapplication.domain.User;

import java.util.List;

@Service
@Primary
public class H2DataProcessingService implements DataProcessingService {

    @Autowired
    private H2UserRepository repository;

    @Override
    public List<User> getAll() {
        return repository.getAll();
    }

    @Override
    public void addUserToList(User user) {
        repository.addUserToList(user);
    }

    @Override
    public List<User> sortUsersByAge() {
        return repository.sortUsersByAge();
    }

    @Override
    public List<User> filterUsersByAge(int age) {
        return repository.filterUsersByAge(age);
    }

    @Override
    public double calculateAverageAge() {
        return repository.calculateAverageAge();
    }

}
package org.example.serverRESTapplication.services;

import org.example.serverRESTapplication.interfaces.DataProcessingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.example.serverRESTapplication.domain.User;


import java.util.List;

@Service
public class RegistrationService {

    @Autowired
    private DataProcessingService dataProcessingService;

    @Autowired
    private UserService userService;

    @Autowired
    private NotificationService notificationService;

    public List<User> getAllUsers() {
        return dataProcessingService.getAll();
    }

    public void processRegistration(User user) {
        dataProcessingService.addUserToList(user);
        notificationService.notifyUser(user);
    }

    public void processRegistration(String name, int age, String email) {
        processRegistration(
                userService.createUser(name, age, email)
        );
    }
}
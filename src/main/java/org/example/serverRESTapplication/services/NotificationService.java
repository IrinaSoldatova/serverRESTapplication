package org.example.serverRESTapplication.services;

import org.springframework.stereotype.Service;
import org.example.serverRESTapplication.domain.User;

@Service
public class NotificationService {

    public void notifyUser(User user) {
        System.out.println("A new user has been created: " + user.getName());
    }

    public void sendNotification(String s) {
        System.out.println(s);
    }
}
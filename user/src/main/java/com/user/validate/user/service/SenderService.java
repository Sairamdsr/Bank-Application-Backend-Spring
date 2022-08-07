package com.user.validate.user.service;

import com.user.validate.user.model.Customers;
import com.user.validate.user.repository.SenderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SenderService {

    @Autowired
    SenderRepository userRepository;
    public Customers fetchSenderDetails(String id) {

        return userRepository.findById(id).get();

    }
}

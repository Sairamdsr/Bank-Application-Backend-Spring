package com.user.validate.user.controller;

import com.user.validate.user.model.Customers;
import com.user.validate.user.service.SenderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class SenderController {

    @Autowired
    SenderService userService;

    @GetMapping("/getSenderData/{customerId}")
    public Customers getSenderData(@PathVariable("customerId") String customerId) {

        try {
            return userService.fetchSenderDetails(customerId);
        } catch (Exception e) {
            return null;
        }

    }
}

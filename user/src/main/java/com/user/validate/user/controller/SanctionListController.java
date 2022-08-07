package com.user.validate.user.controller;

import com.user.validate.user.service.SanctionListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
public class SanctionListController {

    @Autowired
    SanctionListService sanctionListService;

    @GetMapping("/checkName/{name}")
    public String checkName(@PathVariable("name") String name) throws IOException {

        return sanctionListService.fetchName(name);

    }

}
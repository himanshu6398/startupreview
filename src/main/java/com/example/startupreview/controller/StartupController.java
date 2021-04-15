package com.example.startupreview.controller;

import com.example.startupreview.beans.Startup;
import com.example.startupreview.service.StartupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/admin")
public class StartupController {

    @Autowired
    private StartupService startupService;

    @CrossOrigin(origins = "http://localhost:3000")
    @PostMapping("/add_startup")
    public Startup addStartup(@RequestBody Startup startup) {
        return startupService.addStartup(startup);
    }
}

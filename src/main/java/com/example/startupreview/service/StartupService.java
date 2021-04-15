package com.example.startupreview.service;

import com.example.startupreview.beans.Startup;
import com.example.startupreview.repository.StartupRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class StartupService {

    @Autowired
    private StartupRepository startupRepository;

    public Startup addStartup(Startup startup) {
        return startupRepository.save(startup);
    }

    public Optional<Startup> getStartup(Long id) { return startupRepository.findById(id); }
}

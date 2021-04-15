package com.example.startupreview.repository;

import com.example.startupreview.beans.Startup;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StartupRepository extends JpaRepository<Startup, Long> {
}

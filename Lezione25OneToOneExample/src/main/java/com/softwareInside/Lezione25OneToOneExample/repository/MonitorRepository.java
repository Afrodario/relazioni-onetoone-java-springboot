package com.softwareInside.Lezione25OneToOneExample.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.softwareInside.Lezione25OneToOneExample.models.Monitor;

public interface MonitorRepository extends JpaRepository<Monitor, Long> {

}

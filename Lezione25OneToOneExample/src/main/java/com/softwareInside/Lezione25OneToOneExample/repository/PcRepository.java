package com.softwareInside.Lezione25OneToOneExample.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.softwareInside.Lezione25OneToOneExample.models.Pc;

public interface PcRepository extends JpaRepository<Pc, Long>{

}

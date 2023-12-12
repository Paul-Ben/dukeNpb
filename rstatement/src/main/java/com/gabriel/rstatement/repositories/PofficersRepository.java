package com.gabriel.rstatement.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gabriel.rstatement.models.Pofficers;

public interface PofficersRepository extends JpaRepository<Pofficers, Long> {
    
}

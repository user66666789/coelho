package com.pbe.coelho.repository;

import com.pbe.coelho.model.Animal;
import org.springframework.data.jpa.repository.JpaRepository;

public interface animalrepository extends JpaRepository <Animal, Long> {
}

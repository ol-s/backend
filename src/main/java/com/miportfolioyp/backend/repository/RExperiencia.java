
package com.miportfolioyp.backend.repository;

import com.miportfolioyp.backend.entity.Experiencia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RExperiencia extends JpaRepository<Experiencia, Integer> {
    
}

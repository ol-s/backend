
package com.miportfolioyp.backend.repository;

import com.miportfolioyp.backend.entity.Red;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RRed extends JpaRepository<Red, Integer> {
    
}

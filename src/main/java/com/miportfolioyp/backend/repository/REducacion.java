
package com.miportfolioyp.backend.repository;

import com.miportfolioyp.backend.entity.Educacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface REducacion  extends JpaRepository<Educacion, Integer>{
    
}

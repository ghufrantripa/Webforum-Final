/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.project.repositories;

import com.project.project.models.Automotive;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Ghufran Tripa
 */
@Repository
public interface AutomotiveRepository extends JpaRepository<Automotive, Long>{
    List<Automotive> findByUserId(long user_id);
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.project.services;

import com.project.project.interfaces.PostInterface;
import com.project.project.models.Automotive;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.project.project.repositories.AutomotiveRepository;

/**
 *
 * @author Ghufran Tripa
 */
@Service
public class AutomotiveServic implements AutomotiveInterface {

    @Autowired
    private AutomotiveRepository automotiveRepository;

    @Override
    public List<Automotive> getAll() {
        return automotiveRepository.findAll();
    }

    @Override
    public void store(Automotive automotive) {
        this.automotiveRepository.save(automotive);
    }

    @Override
    public Automotive getById(long id) {
        Optional<Automotive> optional = automotiveRepository.findById(id);

        if (!optional.isPresent()) {
            throw new RuntimeException(" Todo not found for id :: " + id);
        }

        Automotive automotive = optional.get();
        return automotive;
    }

    @Override
    public void delete(long id) {
        this.automotiveRepository.deleteById(id);
    }

    @Override
    public List<Automotive> findByUserId(long user_id) {
        return automotiveRepository.findByUserId(user_id);
    }
}

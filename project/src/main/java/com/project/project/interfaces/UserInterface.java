/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.project.interfaces;

import com.project.project.models.User;

/**
 *
 * @author Ghufran Tripa
 */
public interface UserInterface {
    void register(User user) throws Exception;
    User auth(String email, String password) throws Exception;
}

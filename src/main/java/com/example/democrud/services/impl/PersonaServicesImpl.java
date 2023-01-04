/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.democrud.services.impl;

import com.example.democrud.commons.GenericsServicesImpl;
import com.example.democrud.dao.api.PersonaDaoAPI;
import com.example.democrud.model.Persona;
import com.example.democrud.services.api.PersonaServiceAPI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;


/**
 *
 * @author Adri
 */
@Service
public class PersonaServicesImpl extends GenericsServicesImpl<Persona, Long> implements PersonaServiceAPI{

    @Autowired
    private PersonaDaoAPI personadaoapi;

@Override
    public CrudRepository<Persona, Long> getDao() {
        return personadaoapi;
    }
    
}

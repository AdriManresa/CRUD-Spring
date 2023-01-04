/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.democrud.dao.api;

import com.example.democrud.model.Persona;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Adri
 */
public interface PersonaDaoAPI extends CrudRepository<Persona, Long> {
    
}

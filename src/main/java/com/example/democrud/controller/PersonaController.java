/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.democrud.controller;

import com.example.democrud.model.Persona;
import com.example.democrud.services.api.PersonaServiceAPI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Adri
 */
@Controller
public class PersonaController {

    @Autowired
    private PersonaServiceAPI PersonaserviceAPI;

    @RequestMapping("/")
    public String index(Model model) {
        model.addAttribute("list", PersonaserviceAPI.getAll());
        return "index";
    }

    @GetMapping("/save/{id}")
    public String showsave(@PathVariable("id") Long id, Model model) {
        if (id != null && id != 0) {
            model.addAttribute("persona", PersonaserviceAPI.get(id));
        } else {
            model.addAttribute("persona", new Persona());
        }
        return "save";
    }

    @PostMapping("/save")
    public String save(Persona persona, Model model) {
        PersonaserviceAPI.save(persona);
        return "redirect:/";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable Long id, Model model) {
        PersonaserviceAPI.delete(id);
        return "redirect:/";
    }
}

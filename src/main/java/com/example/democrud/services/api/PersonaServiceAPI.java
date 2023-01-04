package com.example.democrud.services.api;

import com.example.democrud.commons.GenericsServicesAPI;
import com.example.democrud.model.Persona;
import org.springframework.stereotype.Service;

@Service
public interface PersonaServiceAPI extends GenericsServicesAPI<Persona, Long> {
    
}

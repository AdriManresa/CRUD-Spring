package com.example.democrud.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import lombok.Data;


@Data
@Entity(name ="persona")
public class Persona {

  @Id
  @SequenceGenerator(name="id", sequenceName="id", allocationSize=1)
  @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="id")
    private Long id;
    private String nombre;
    private String apellido;
    private String direccion;
    private String telefono;
}

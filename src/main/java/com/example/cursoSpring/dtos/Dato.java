package com.example.cursoSpring.dtos;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Dato {
  private Long id;
  private String cadena;

  public Dato() {
    this.id = 0L;
    this.cadena = "";
  }
}

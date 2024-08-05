package com.example.cursoSpring.dtos;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class DatoTest {

  @Test
  public void checkConstructorWithoutParams() {
    Dato dato = new Dato();
    assertNotNull(dato);
    assertEquals(dato.getId(),0L, "El id debería ser 0");
    assertEquals(dato.getCadena(),"", "La cadena debería ser ''");
    System.out.println(dato.toString());
  }

  @Test
  public void checkConstructorWithParams() {
    Dato dato = new Dato(1L, "Twitch");
    assertNotNull(dato);
    assertEquals(dato.getId(),1L, "El id debería ser 1L");
    assertEquals(dato.getCadena(),"Twitch", "La cadena debería ser 'Twitch'");
    System.out.println(dato.toString());
  }
}

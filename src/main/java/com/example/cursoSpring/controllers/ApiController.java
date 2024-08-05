package com.example.cursoSpring.controllers;

import com.example.cursoSpring.dtos.Dato;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.LinkedList;

@RestController
@RequestMapping("/api/v1/dato")
public class ApiController {
  public List<Dato> listado = new LinkedList<>();
  public Long lastID = 0L;

  /* Constructor */
  public ApiController() {
    this.listado.add(new Dato(1L, "Twitch"));
    this.listado.add(new Dato(2L, "Microsoft"));
    this.lastID = 1L;
  }

  /* Get /api/v1/dato -> Listado de datos -> findAll */
  @GetMapping("/")
  List<Dato> index() {
    return this.listado;
  }

  /* Get /api/v1/dato -> Listado de datos -> findOne/findFirst */
  @GetMapping("/{id}")
  Dato show(@PathVariable("id") Long id) {
    return this.listado
            .stream()
            .filter(item -> item.getId().equals(id))
            .findFirst().orElse(new Dato());
  }

  /* Post /api/v1/dato -> Crear un nuevo dato */
  @PostMapping("/")
  Dato create (@RequestBody Dato dato) {
    dato.setId(++this.lastID);
    this.listado.add(dato);
    return dato;
  }
}

package com.system.system.controller;


import com.system.system.model.Transaccion;
import com.system.system.service.TransaccionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TransaccionController {


    @Autowired
    TransaccionService transaccionService;

    @GetMapping("/transaccion")
    private List<Transaccion> verTransaccion(){
        return transaccionService.verTransaccion();

    }

    @PostMapping("/transaccion")
    private void crearTransaccion(@RequestBody Transaccion transaccion){
        transaccionService.crearYActualizarTransaccion(transaccion);
    }

    @DeleteMapping("/transaccion/{id}")
    private void eliminarTransaccion(@PathVariable("id") Long id){
        transaccionService.eliminarTransaccion(id);
    }

    @PutMapping("/transaccion")
    private void editarTransaccion(@RequestBody Transaccion transaccion){
        transaccionService.crearYActualizarTransaccion(transaccion);
    }
}

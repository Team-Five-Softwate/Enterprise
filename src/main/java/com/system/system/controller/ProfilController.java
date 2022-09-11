package com.system.system.controller;


import com.system.system.model.Profil;
import com.system.system.service.ProfilService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProfilController {


    @Autowired
    ProfilService profilService;

    @GetMapping("/profil")
    private List<Profil> verProfil(){
        return profilService.verProfil();

    }

    @PostMapping("/profil")
    private void crearProfil(@RequestBody Profil profil){
        profilService.crearYActualizarProfil(profil);
    }

    @DeleteMapping("/profil/{id}")
    private void eliminarProfil(@PathVariable("id") Long id){
        profilService.eliminarProfil(id);
    }

    @PutMapping("/profil")
    private void editarProfil(@RequestBody Profil profil){
        profilService.crearYActualizarProfil(profil);
    }
}

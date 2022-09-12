package com.system.system.service;


import com.system.system.model.Profil;
import com.system.system.repository.ProfilRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//Importamos las Clases
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class ProfilService {


    @Autowired
    ProfilRepository profilRepository;

    public void crearYActualizarProfil(Profil profil){
        profilRepository.save(profil);
    }

    public List<Profil> verProfil(){
        List<Profil> empleados = new ArrayList<Profil>();
        empleados.addAll(profilRepository.findAll());
        return empleados;
    }
    public void eliminarProfil(Long id){
        profilRepository.deleteAllById(Collections.singleton(id));
    }

}

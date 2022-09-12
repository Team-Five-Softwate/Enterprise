package com.system.system.service;


import com.system.system.model.Transaccion;
import com.system.system.repository.TransaccionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//Creamos la Clase Transaccion Service
@Service
public class TransaccionService {


    @Autowired
    TransaccionRepository transaccionRepository;

    public void crearYActualizarTransaccion(Transaccion transaccion){
        transaccionRepository.save(transaccion);
    }

    public List<Transaccion> verTransaccion(){
        List<Transaccion> transaccions = new ArrayList<Transaccion>();
        transaccions.addAll(transaccionRepository.findAll());
        return transaccions;
    }
    public void eliminarTransaccion(Long id){
        transaccionRepository.deleteAllById(Collections.singleton(id));
    }

}

package com.system.system.service;

import com.system.system.model.Empleado;
import com.system.system.repository.EmpleadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//Clase Empleado Service
@Service
public class EmpleadoService {

    @Autowired
    EmpleadoRepository empleadoRepository;

    public void crearYActualizarEmpleado(Empleado empleado){
        empleadoRepository.save(empleado);
    }

    public List<Empleado> verEmpleado(){
        List<Empleado> empleados = new ArrayList<Empleado>();
        empleados.addAll(empleadoRepository.findAll());
        return empleados;
    }
    public void eliminarEmpleado(Long id){
        empleadoRepository.deleteAllById(Collections.singleton(id));
    }

}

package com.system.system.service;

import com.system.system.model.Empresa;
import com.system.system.repository.EmpresaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//Importación de Clases
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class EmpresaService {

    @Autowired
    EmpresaRepository empresaRepository;

    public void crearYActualizarEmpresa(Empresa empresa){
        empresaRepository.save(empresa);
    }

    public List<Empresa> verEmpresa(){
        List<Empresa> empresas = new ArrayList<Empresa>();
        empresas.addAll(empresaRepository.findAll());
        return empresas;
    }
    public void eliminarEmpresa(Long id){
        empresaRepository.deleteAllById(Collections.singleton(id));
    }

}

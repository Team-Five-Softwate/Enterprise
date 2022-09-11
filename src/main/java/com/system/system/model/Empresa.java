package com.system.system.model;

import lombok.*;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class Empresa {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    private String name;
    private String document;
    private String phone;
    private String address;
    private Date updateAt;
    private Date createAt;

    @OneToMany
    private List<Empleado> empleados;

    @OneToMany
    private List<Transaccion> transaccions;
}

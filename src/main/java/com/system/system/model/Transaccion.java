package com.system.system.model;


import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class Transaccion {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    private String concepto;
    private float monto;
    private Date updateAt;
    private Date createAt;

    @ManyToOne
    private Empleado empleado;

    @ManyToOne
    private Empresa empresa;
}

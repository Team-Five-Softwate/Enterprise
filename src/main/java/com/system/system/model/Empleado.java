package com.system.system.model;

import com.system.system.enums.Enum_Tipo;
import lombok.*;
import net.bytebuddy.implementation.bind.MethodDelegationBinder;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class Empleado {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;


    private String email;
    private Date updateAt;
    private Date createAt;

    @Enumerated(EnumType.STRING)
    @Column(name = "tipo")
    private Enum_Tipo tipo;

    @ManyToOne
    @JoinColumn(name = "empresa_id")
    private Empresa empresa;

    @OneToOne
    private Profil profil;

    @OneToMany
    private List<Transaccion> transaccions;
}

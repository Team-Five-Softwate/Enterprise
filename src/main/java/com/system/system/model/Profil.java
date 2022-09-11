package com.system.system.model;

import lombok.*;
import org.apache.catalina.User;

import javax.persistence.*;
import java.util.Date;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class Profil {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    private String image;
    private String phone;
    private Date updateAt;
    private Date createAt;

    @OneToOne
    @JoinColumn(name = "empleado_id")
    private Empleado empleado;
}

package com.gestion.envios.entity;

import javax.persistence.*;

/**
 * Created by Usuario on 14/04/2017.
 */
@Entity
@Table(name = "USUARIOS")
public class Usuario {

    private Long id;


    private String firstName;


    private String lastName;

    private RolUsuario rolUsuario;

    @OneToOne
    @JoinColumn(name = "rol_usuario_id")
    public RolUsuario getRolUsuario() {
        return rolUsuario;
    }

    public void setRolUsuario(RolUsuario rolUsuario) {
        this.rolUsuario = rolUsuario;
    }

    @Id
    @GeneratedValue
    @Column(name = "usuario_id", nullable = false)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(name = "first_name", nullable = false)
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Column(name = "last_name", nullable = false)
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}

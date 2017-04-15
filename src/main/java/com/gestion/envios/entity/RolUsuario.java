package com.gestion.envios.entity;

import javax.persistence.*;

/**
 * Created by Usuario on 15/04/2017.
 */
@Entity
@Table(name = "ROL_USUARIOS")
public class RolUsuario {

    private long id;
    private String nombreRolUsuario;
    private String descripcion;

    @Id
    @GeneratedValue
    @Column(name = "idrol_usuarios")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Column(name = "nombre_rol_usuario")
    public String getNombreRolUsuario() {
        return nombreRolUsuario;
    }

    public void setNombreRolUsuario(String nombreRolUsuario) {
        this.nombreRolUsuario = nombreRolUsuario;
    }

    @Column(name = "descripcion")
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}

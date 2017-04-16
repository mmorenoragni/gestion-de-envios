package com.gestion.envios.entity;

import javax.persistence.*;

/**
 * Created by Usuario on 16/04/2017.
 */
@Entity
@Table(name = "CLIENTES")
public class Cliente {

    private long id;
    private long documento;
    private String name;
    private String lastName;
    private String password;

    @Id
    @GeneratedValue
    @Column(name = "id_cliente")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Column(name = "documento")
    public long getDocumento() {
        return documento;
    }

    public void setDocumento(long documento) {
        this.documento = documento;
    }

    @Column(name = "nombre_cliente")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "apellido_cliente")
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Column(name = "password")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

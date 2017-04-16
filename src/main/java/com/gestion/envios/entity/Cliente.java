package com.gestion.envios.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Set;

import static javax.persistence.CascadeType.ALL;

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
    private Set<Encomienda> encomiendas;

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

    @OneToMany(cascade=ALL, mappedBy="cliente")
    @JsonIgnore
    public Set<Encomienda> getEncomiendas() {
        return encomiendas;
    }

    public void setEncomiendas(Set<Encomienda> encomiendas) {
        this.encomiendas = encomiendas;
    }
}

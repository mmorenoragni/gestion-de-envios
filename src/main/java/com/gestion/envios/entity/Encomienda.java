package com.gestion.envios.entity;

import javax.persistence.*;

/**
 * Created by Usuario on 16/04/2017.
 */
@Entity
@Table(name = "ENCOMIENDAS")
public class Encomienda {

    private long id;
    private String descripcion;
    private String destino;
    private Cliente cliente;

    @Id
    @GeneratedValue
    @Column(name = "id_encomienda")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Column(name = "descripcion")
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Column(name = "destino")
    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    @ManyToOne
    @JoinColumn(name = "id_cliente", nullable=false)
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}

package com.gestion.envios.entity;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by Usuario on 14/04/2017.
 */
@Entity
@Table(name = "USUARIOS")
public class Usuario {

    @Id
    @GeneratedValue
    @Column(name = "usuario_id", nullable = false)
    private Long id;

    @Column(name = "first_name", nullable = false)
    private String firstName;

    @Column(name = "last_name", nullable = false)
    private String lastName;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}

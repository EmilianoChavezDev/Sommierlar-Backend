package com.sommierlar.sommierlarbackend.entity.cliente;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import lombok.Data;
import org.springframework.context.annotation.Bean;


import java.io.Serializable;


@Entity

@Data
@Table(name = "cliente")
public class clienteEntity {

    @Id
    @Column(name = "id")
    private Long id;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "direccion")
    private String direccion;

    @Column(name = "telefono")
    private String telefono;

    @Email
    @Column(name = "correo")
    private String correo;

    @Column(name = "cedula")
    private String cedula;

}

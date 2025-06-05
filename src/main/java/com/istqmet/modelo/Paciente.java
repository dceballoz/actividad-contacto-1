package com.istqmet.modelo;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Paciente {

    @Size(min=3, max=45)
    private String nombre;


    @Size(min=3, max=45)
    private String apellido;


    @Size(min=10, max=10)
    private String cedula;


    @Min(value = 1)
    @Max(value = 100)
    private Long edad;


    @DateTimeFormat(pattern = "dd-mm-yyyy")
    private Date fechaNacimiento;


    @Min(value = 1)
    @Max(value = 300)
    private Long peso;


    @Min(value = 20)
    @Max(value = 210)
    private Long talla;


    @Min(value = 60)
    @Max(value = 180)
    private Long presionArterial;


    @Min(value = 60)
    @Max(value = 180)
    private Long frecuenciaCardiaca;

    @Size(min=10, max=45)
    private String detalleAlergia;

    @Size(min=0, max=45)
    private String observacionesGenerales;


    @Size(min=3, max=45)
    private String email;


    @Size(min=9, max=9)
    private String telefonoConvencional;


    @Size(min=10, max=10)
    private String telefonoCelular;


    @Pattern( regexp = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[$@$!%*?&])([A-Za-z\\d$@$!%*?&]|[^ ]){8,15}$")
    private String password;



}

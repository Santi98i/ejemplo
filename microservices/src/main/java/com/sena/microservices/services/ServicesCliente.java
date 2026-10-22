package com.sena.microservices.services;

import com.sena.microservices.entity.Cliente;

public class ServicesCliente {
    public String validarCliente(Cliente c){
        String mensaje = "";
        c.setNombre(c.getNombre().trim().toUpperCase());
        if (c.getNombre().isEmpty()){
            mensaje = "El nombre esta vacio";
        }
        if (c.getNombre().length() > 50){
            mensaje = "El nombre debe tener menos de 50 caracteres" + mensaje;
        }
        if(c.getSaldo() < 0){
          mensaje = "Saldo es negativo" + mensaje;
        }
        if (c.getTelefono().isEmpty()){
            mensaje = "El número esta vacio" +mensaje;
        }
        if (c.getTelefono() == null || c.getTelefono().isEmpty()) {
            mensaje = "El número esta vacio" + mensaje;
        }
        if (c.getDireccion() == null || c.getDireccion().isEmpty()) {
            mensaje = "La direccion esta vacia" + mensaje;
        }
        if (c.getId() < 0){
            mensaje = "El id no puede ser negativo" + mensaje;
        }
        return mensaje;


    }
}

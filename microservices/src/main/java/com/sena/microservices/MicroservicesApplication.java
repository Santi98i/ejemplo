package com.sena.microservices;

import com.sena.microservices.entity.Cliente;
import com.sena.microservices.services.ServicesCliente;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.security.Provider;

@SpringBootApplication
public class MicroservicesApplication {

	public static void main(String[] args) {
            SpringApplication.run(MicroservicesApplication.class, args);

            Cliente c = new Cliente();
            c.setId(1);
            c.setNombre("Samuel");
            c.setSaldo(12);
            c.setTelefono("");
            c.setDireccion("calle 12 # 5-20 apartamento 301");

            ServicesCliente s = new ServicesCliente();
            String men = s.validarCliente(c);
            System.out.println(men);

    }


}

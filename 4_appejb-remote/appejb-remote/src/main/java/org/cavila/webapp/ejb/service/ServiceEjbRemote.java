package org.cavila.webapp.ejb.service;

import jakarta.ejb.Remote;
import org.cavila.webapp.ejb.models.Producto;

import java.util.List;

@Remote
public interface ServiceEjbRemote {
    String saludar(String nombre);
    List<Producto> listar();
    Producto crear(Producto producto);
}

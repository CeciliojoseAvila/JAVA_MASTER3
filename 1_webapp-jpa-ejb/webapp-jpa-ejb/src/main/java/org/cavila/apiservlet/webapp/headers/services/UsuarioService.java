package org.cavila.apiservlet.webapp.headers.services;

import jakarta.ejb.Local;
import org.cavila.apiservlet.webapp.headers.models.entities.Usuario;

import java.util.Optional;

@Local
public interface UsuarioService {
    Optional<Usuario> login(String username, String password);
}

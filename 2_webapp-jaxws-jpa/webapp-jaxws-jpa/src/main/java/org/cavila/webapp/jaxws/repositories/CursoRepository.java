package org.cavila.webapp.jaxws.repositories;

import org.cavila.webapp.jaxws.models.Curso;

import java.util.List;

public interface CursoRepository {
    List<Curso> listar();
    Curso guardar(Curso curso);
}

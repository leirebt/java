package org.lbt.jdbc.repositorio;

import org.lbt.jdbc.modelo.Producto;

import java.util.List;

public interface Repositorio<T> {
    List<Producto> listar();
    T porId(Long id);
    void guardar(T t);
    void eliminar(Long id);
}

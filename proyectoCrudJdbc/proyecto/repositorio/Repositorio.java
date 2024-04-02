package proyecto.repositorio;

import java.util.List;

public interface Repositorio<T> {

    List<T> listarUsarios();
    T porId(Long id);
    void guardarUsuario(T usuario);
    void eliminarUsuario(Long id);
}

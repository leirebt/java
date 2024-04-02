package proyecto;

import proyecto.modelo.Usuario;
import proyecto.repositorio.Repositorio;
import proyecto.repositorio.UsuarioRepositorioImple;
import proyecto.util.ConexionBaseDatos;

import javax.swing.*;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GestorUsuarios {
    public static void main(String[] args) {
        try (Connection con = ConexionBaseDatos.getInstance();) {
            Repositorio<Usuario> repositorio = new UsuarioRepositorioImple();
            int opcionIndice = 0;
            do {
                Map<String, Integer> operaciones = new HashMap();
                operaciones.put("Agregar", 1);
                operaciones.put("Eliminar", 2);
                operaciones.put("Actualizar", 3);
                operaciones.put("Ver todos", 4);
                operaciones.put("Salir", 5);

                Object[] opArreglo = operaciones.keySet().toArray();

                Object opcion = JOptionPane.showInputDialog(null,
                        "Seleccione una operación",
                        "Gestor de Usuarios",
                        JOptionPane.INFORMATION_MESSAGE, null, opArreglo, opArreglo[0]);

                if (opcion == null) {
                    JOptionPane.showMessageDialog(null, "Debe seleccionar una operación");
                } else {
                    opcionIndice = operaciones.get(opcion.toString());

                    switch (opcionIndice) {
                        case 1:
                            String username = JOptionPane.showInputDialog("Inserte el username:");
                            String password = JOptionPane.showInputDialog("Añade una contraseña segura:");
                            String email = JOptionPane.showInputDialog("Necesitamos tu email:");
                            Usuario user = new Usuario(username, password, email);
                            repositorio.guardarUsuario(user);
                            JOptionPane.showMessageDialog(null,
                                    "Usuario " + user.getUsername() + " guardado correctamente.");
                            break;
                        case 2:
                            String idEliminar = JOptionPane.showInputDialog("Añade el id del usuario a eliminar:");
                            Long id = Long.parseLong(idEliminar);
                            repositorio.eliminarUsuario(id);
                            JOptionPane.showMessageDialog(null,
                                    "Usuario con id " + id + " eliminado correctamente.");
                            break;
                        case 3:
                            String idActualizar = JOptionPane.showInputDialog("Añade el id del usuario que quieres actualizar:");
                            Long idAct = Long.parseLong(idActualizar);
                            String usernameAct = JOptionPane.showInputDialog("Inserta el username:");
                            String passwordAct = JOptionPane.showInputDialog("Añade una contraseña segura:");
                            String emailAct = JOptionPane.showInputDialog("Necesitamos tu email:");
                            Usuario actualizar = new Usuario(idAct, usernameAct, passwordAct, emailAct);
                            repositorio.guardarUsuario(actualizar);
                            JOptionPane.showMessageDialog(null,
                                    "Usuario con id " + idAct + " actualizado correctamente.");
                            break;
                        case 4:
                            List<Usuario> users = repositorio.listarUsarios();
                            for (Usuario u : users) {
                                JOptionPane.showMessageDialog(null,
                                        u.toString());
                            }
                            break;
                        case 5:
                            JOptionPane.showMessageDialog(null,
                                    "¡HASTA PRONTO!");
                            break;
                    }
                }
            } while (opcionIndice != 5);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}

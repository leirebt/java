package proyecto.repositorio;

import org.lbt.jdbc.modelo.Producto;
import org.lbt.jdbc.util.ConexionBaseDatos;
import proyecto.modelo.Usuario;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UsuarioRepositorioImple implements Repositorio<Usuario> {

    private Connection getConnection() throws SQLException {
        return ConexionBaseDatos.getInstance();
    }

    @Override
    public List<Usuario> listarUsarios() {
        List<Usuario> usuarios = new ArrayList<>();
        try (Statement stmt = getConnection().createStatement();
             ResultSet rs = stmt.executeQuery("SELECT * FROM usuariosdata")) {
            while (rs.next()) {
                Usuario user = crearUsuario(rs);
                usuarios.add(user);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return usuarios;
    }

    private Usuario crearUsuario(ResultSet rs) throws SQLException {
        Usuario user = new Usuario();
        user.setId(rs.getLong("id"));
        user.setUsername(rs.getNString("username"));
        user.setEmail(rs.getString("email"));
        user.setPassword(rs.getString("password"));
        return user;
    }

    @Override
    public Usuario porId(Long id) {
        Usuario user = null;
        String sql = "SELECT * FROM usuariosdata WHERE id = ?";
        try (PreparedStatement stmt = getConnection().prepareStatement(sql)) {
            stmt.setLong(1, id);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    user = crearUsuario(rs);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return user;
    }

    @Override
    public void guardarUsuario(Usuario usuario) {
        String sql;
        if(usuario.getId() != null && usuario.getId() > 0) {
            sql = "UPDATE usuariosdata SET username = ?, password = ?, email = ? WHERE id = ?";
        } else {
            sql = "INSERT INTO usuariosdata (username, password, email) VALUES (?, ?, ?)";
        }
        try (PreparedStatement stmt = getConnection().prepareStatement(sql)) {
            stmt.setString(1, usuario.getUsername());
            stmt.setString(2, usuario.getPassword());
            stmt.setString(3, usuario.getEmail());
            if (usuario.getId() != null && usuario.getId() > 0) {
                stmt.setLong(4, usuario.getId());
            }
            stmt.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    @Override
    public void eliminarUsuario(Long id) {
        String sql = "DELETE FROM usuariosdata WHERE id = ?";
        try (PreparedStatement stmt = getConnection().prepareStatement(sql)) {
            stmt.setLong(1, id);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

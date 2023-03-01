public class Cliente extends Persona {

    public int clienteId;

    public Cliente(String nombre, String apellido, String numeroFiscal, String direccion, int clienteId) {
        super(nombre, apellido, numeroFiscal, direccion);
        this.clienteId = clienteId;
    }

    public int getClienteId() {
        return clienteId;
    }

    @Override
    public String toString() {
        return "====== Datos de cliente ======" + "\n" +
                "Nombre: " + nombre + '\n' +
                "Apellido: " + apellido + '\n' +
                "Número Fiscal: " + numeroFiscal + '\n' +
                "Dirección: " + direccion + '\n' +
                "Id de cliente: #" + clienteId;
    }


}

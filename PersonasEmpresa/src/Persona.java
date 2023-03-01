public class Persona {
    public String nombre;
    public String apellido;
    public String numeroFiscal;
    public String direccion;

    public Persona(String nombre, String apellido, String numeroFiscal, String direccion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numeroFiscal = numeroFiscal;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getNumeroFiscal() {
        return numeroFiscal;
    }

    public String getDireccion() {
        return direccion;
    }

    @Override
    public String toString() {
        return  "====== Datos de persona ======" + "\n" +
                "Nombre: " + nombre + '\n' +
                "Apellido: " + apellido + '\n' +
                "Número Fiscal: " + numeroFiscal + '\n' +
                "Dirección: " + direccion;
    }
}

public class Empleado extends Persona {
    public Double remuneracion;
    public int empleadoId;

    public Empleado(String nombre, String apellido, String numeroFiscal, String direccion, Double remuneracion,
                    int empleadoId) {
        super(nombre, apellido, numeroFiscal, direccion);
        this.remuneracion = remuneracion;
        this.empleadoId = empleadoId;
    }

    public void aumentarRemuneracion(int porcentaje) {
        double subida = (remuneracion * porcentaje)/100;
        this.remuneracion = this.remuneracion + subida;
    }

    public Double getRemuneracion() {
        return remuneracion;
    }

    public int getEmpleadoId() {
        return empleadoId;
    }

    @Override
    public String toString() {
        return "====== Datos de empleado ====== " + "\n" +
                "Nombre: " + nombre + '\n' +
                "Apellido: " + apellido + '\n' +
                "Número Fiscal: " + numeroFiscal + '\n' +
                "Dirección: " + direccion + '\n' +
                "Remuneración: " + remuneracion + "€\n" +
                "Id de empleado: #" + empleadoId;
    }
}

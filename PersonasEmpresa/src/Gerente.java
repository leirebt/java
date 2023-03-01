public class Gerente extends Empleado {

    public Double presupuesto;

    public Gerente(String nombre, String apellido, String numeroFiscal, String direccion, Double remuneracion,
                   int empleadoId, Double presupuesto) {
        super(nombre, apellido, numeroFiscal, direccion, remuneracion, empleadoId);
        this.presupuesto = presupuesto;
    }

    public Double getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(Double presupuesto) {
        this.presupuesto = presupuesto;
    }

    @Override
    public String toString() {
        return "====== Datos de gerente ====== " + '\n' +
                "Nombre: " + nombre + '\n' +
                "Apellido: " + apellido + '\n' +
                "Número Fiscal: " + numeroFiscal + '\n' +
                "Dirección: " + direccion + '\n' +
                "Remuneración: " + remuneracion + "€\n" +
                "Id de empleado: #" + empleadoId + '\n' +
                "Presupuesto: " + presupuesto + "%";
    }
}

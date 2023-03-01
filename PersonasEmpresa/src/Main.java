public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona("María", "Sánchez", "123456",
                "Calle Princesa 7");
        Empleado empleado = new Empleado("Gustavo", "Martín", "654321",
                "Calle de las Mercedes 48", 1750.60,33);
        Cliente cliente = new Cliente("Antón", "García", "987654",
                "Beato Domingo Iturrate 33", 398);
        Gerente gerente = new Gerente("Carmen", "Álvarez", "283947",
                "Avenida Basagoiti 3", 3566.98, 14, 30.00);

        System.out.println(persona.toString());
        System.out.println();
        System.out.println(empleado.toString());
        System.out.println();
        System.out.println(cliente.toString());
        System.out.println();
        System.out.println(gerente.toString());
        System.out.println();
        System.out.println("-------------------DATOS MODIFICADOS-------------------");

        empleado.aumentarRemuneracion(10);
        System.out.println("--------->Empleado con subida salarial del 10%<---------");
        System.out.println(empleado.toString());
        System.out.println();
        gerente.setPresupuesto(22.5);
        System.out.println("--------->Gerente con cambio de presupuesto<---------");
        System.out.println(gerente.toString());
    }
}
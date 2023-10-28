package Proyectos.PatronesDeDiseno.Singleton;

public class ConexionBDDSingleton {

    private static ConexionBDDSingleton singleton;

    private ConexionBDDSingleton() {
        System.out.println("Conectándose a la Base de Datos.");
    }

    public static ConexionBDDSingleton getInstance() {
        if (singleton == null) {
            singleton = new ConexionBDDSingleton();
        }
        return singleton;
    }
}

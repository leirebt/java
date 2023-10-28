package Proyectos.PatronesDeDiseno.Singleton;

public class EjemploSingleton {

    public static void main(String[] args) {

        for(int i = 0; i < 10; i++) {
            ConexionBDDSingleton conexion = ConexionBDDSingleton.getInstance();
            System.out.println(i + ": " + conexion);
        }
    }
}

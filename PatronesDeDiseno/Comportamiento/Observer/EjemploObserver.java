package Proyectos.PatronesDeDiseno.Comportamiento.Observer;

public class EjemploObserver {
    public static void main(String[] args) {

        Corporacion google = new Corporacion("Google", 1000);

        google.addObserver(observable -> {
            System.out.println("Paul: "+ observable);
        });
        google.addObserver(observable -> {
            System.out.println("Ryan: "+ observable);
        });
        google.addObserver(observable -> {
            System.out.println("Mary: "+ observable);
        });

        google.modificaPrecio(2000);
    }
}

package Proyectos.Executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executor = Executors.newFixedThreadPool(5);

        AlfanumericoTarea numeros = new AlfanumericoTarea(Tipo.NUMERO);
        AlfanumericoTarea letras = new AlfanumericoTarea(Tipo.LETRA);

        Thread hilo1 = new Thread(numeros);
        Thread hilo2 = new Thread(letras);

        hilo1.start();
        hilo2.start();

        TimeUnit.SECONDS.sleep(6);
        System.out.println("\n---------------Hilos finalizados---------------");
    }
}

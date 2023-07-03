package Proyectos.Executor;

import java.util.concurrent.TimeUnit;

public class AlfanumericoTarea implements Runnable {

    private Tipo tipo;

    public AlfanumericoTarea(Tipo tipo) {
        this.tipo = tipo;
    }

    @Override
    public void run() {
        if(this.tipo == Tipo.NUMERO) {
            for(int i = 0; i < 10; i++) {
                System.out.print(i);
            }
            try {
                System.out.println("\nEsperamos 2 segundos...");
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        if (this.tipo == Tipo.NUMERO) {
            for(char i = 'a'; i <= 'z'; i++) {
                System.out.print(i);
            }
            try {
                System.out.println("\nEsperamos 4 segundos...");
                TimeUnit.SECONDS.sleep(4);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

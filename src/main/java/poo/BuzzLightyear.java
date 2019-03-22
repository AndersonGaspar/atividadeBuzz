package poo;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class BuzzLightyear {

    public void disparaLaser() throws InterruptedException {
        System.out.println("Atenção, mirando!!!");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Laser dispado!!!");
    }

    public void falas() {
        Random r = new Random();
        int i = r.nextInt(6);

        System.out.println(i);

        if (i == 0) {
            System.out.println("Ao infinito... e além!");
        }
        else if (i == 1) {
            System.out.println("Al infinito... y más allá!");
        }
        else if (i == 2) {
            System.out.println("Vers l'infini et au-delà!");
        }
        else if (i == 3) {
            System.out.println("Verso l'infinito... e oltre!");
        }
        else if (i == 4) {
            System.out.println("To infinity... and beyond!");
        }
        else if (i == 5) {
            System.out.println("outra frase");
        }
        else{
            return;
        }


    }
}


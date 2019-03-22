package poo;

import java.util.concurrent.TimeUnit;

public class BuzzLightyear {



    public void disparaLaser() throws InterruptedException {
        System.out.println("Atenção, mirando!!!");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Laser dispado!!!");
    }
}

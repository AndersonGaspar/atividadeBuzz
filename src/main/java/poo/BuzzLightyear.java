package poo;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class BuzzLightyear {

    private boolean estadoCapacete = false;
    private boolean estadoAsas = false;

    public boolean getEstadoAsas() {
        return estadoAsas;
    }

    public void setEstadoAsas(boolean estadoAsas) {
        this.estadoAsas = estadoAsas;
    }

    public boolean getEstadoCapacete() {
        return estadoCapacete;
    }

    public void setEstadoCapacete(boolean estadoCapacete) {
        this.estadoCapacete = estadoCapacete;
    }

    public void karate(){
        System.out.println("HA!");
        System.out.println("HA!");
        System.out.println("HA!");
    }

    public void abrirAsas(){
        if (getEstadoAsas() == false){
            System.out.println("Asas abertas!");
            setEstadoAsas(true);
        }else {
            System.out.println("As asas já estão abertas!");
        }
    }

    public void fecharAsas(){
        if (getEstadoAsas() == true){
            System.out.println("Asas fechadas!");
            setEstadoAsas(false);
        }else {
            System.out.println("As asas já estão fechadas!");
        }
    }


    public void abrirCapacete(){
        if (getEstadoCapacete() == false){
            System.out.println("Capacete aberto!");
            setEstadoCapacete(true);
        }else {
            System.out.println("O capacete já esta aberto!");
        }
    }

    public void fecharCapacete(){
        if (getEstadoCapacete() == true){
            System.out.println("Capacete fechado!");
            setEstadoCapacete(false);
        }else {
            System.out.println("O capacete já esta fechado!");
        }
    }

    public void disparaLaser() throws InterruptedException {
        System.out.println("Atenção, mirando!!!");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Laser dispado!!!");
        System.out.println("Alvo eliminado.");
    }

    public void falas() {
        Random r = new Random();
        int i = r.nextInt(6);

        //System.out.println(i);

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
            System.out.println("Ao infinito... e além!");
        }
        else{
            return;
        }


    }
}


package poo;

public class Principal {

    public static void main(String[] args) throws InterruptedException {
        //System.out.println("Olá Buzz");

        BuzzLightyear buzz1 = new BuzzLightyear();

        //buzz1.disparaLaser();

        //buzz1.falas();

//        System.out.println(buzz1.getEstadoCapacete());
//        buzz1.abrirCapacete();
//        buzz1.abrirCapacete();
//        System.out.println(buzz1.getEstadoCapacete());
//        buzz1.fecharCapacete();
//        buzz1.fecharCapacete();

        System.out.println(buzz1.getEstadoAsas());
        buzz1.abrirAsas();
        buzz1.abrirAsas();
        System.out.println(buzz1.getEstadoAsas());
        buzz1.fecharAsas();
        buzz1.fecharAsas();


    }


}

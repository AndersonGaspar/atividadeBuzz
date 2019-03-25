package poo;

public class Principal {

    public static void main(String[] args) throws InterruptedException {
        //System.out.println("Olá Buzz");

        BuzzLightyear frotaEstrelar[] = new BuzzLightyear[3];


        frotaEstrelar[0] = new BuzzLightyear();
        frotaEstrelar[1] = new BuzzLightyear();
        frotaEstrelar[2] = new BuzzLightyear();

        frotaEstrelar[0].disparaLaser();

        frotaEstrelar[1].falas();

        frotaEstrelar[2].abrirCapacete();
        frotaEstrelar[2].abrirCapacete();
        frotaEstrelar[2].fecharCapacete();

        frotaEstrelar[0].abrirAsas();
        frotaEstrelar[0].abrirAsas();
        frotaEstrelar[0].fecharAsas();

        frotaEstrelar[1].karate();

        //buzz1.falas();

//        System.out.println(buzz1.getEstadoCapacete());
//        buzz1.abrirCapacete();
//        buzz1.abrirCapacete();
//        System.out.println(buzz1.getEstadoCapacete());
//        buzz1.fecharCapacete();
//        buzz1.fecharCapacete();

//        System.out.println(buzz1.getEstadoAsas());
//        buzz1.abrirAsas();
//        buzz1.abrirAsas();
//        System.out.println(buzz1.getEstadoAsas());
//        buzz1.fecharAsas();
//        buzz1.fecharAsas();

        //buzz1.karate();


    }


}

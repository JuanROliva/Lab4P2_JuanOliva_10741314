package lab4p2_juanoliva_10741313;

import java.util.Random;

public class Pacifista extends Aldeano{

    @Override
    public void ataque(Aldeano a) {
        Random aleatorio = new Random();
        int discurso = aleatorio.nextInt(2)+1;
        switch (discurso) {
            case 1:
                System.out.println("Es mejor hacer el amor que la guerra");
                break;
                
            case 2:
                System.out.println("Amor y Paz");
                break;
                
            
            default:
                System.out.println("No voy a pelear!");
                break;
        }
    }
}

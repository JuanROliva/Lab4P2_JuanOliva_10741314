package lab4p2_juanoliva_10741313;

import java.util.Random;

public class Pacifista extends Aldeano{

    public Pacifista() {
        super();
    }

    public Pacifista(String nombre, String apellido, int edad, int puntosVida) {
        super(nombre, apellido, edad, puntosVida);
    }
    
    @Override
    public String toString() {
        return "Pacifista => " + super.toString() + " No tiene puntos de ataque";
    }
    
    @Override
    public void ataque(Aldeano a) {
        Random aleatorio = new Random();
        int discurso = aleatorio.nextInt(2)+1;
        switch (discurso) {
            case 1:
                System.out.print(" Es mejor hacer el amor que la guerra ");
                break;
                
            case 2:
                System.out.print(" Amor y Paz ");
                break;
            
            default:
                System.out.print(" No voy a pelear! ");
                break;
        }
    }
}

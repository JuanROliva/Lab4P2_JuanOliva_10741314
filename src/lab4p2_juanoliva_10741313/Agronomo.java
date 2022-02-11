package lab4p2_juanoliva_10741313;

import java.util.Random;

public class Agronomo extends Aldeano{
    private static final int puntosAtaque = 100;

    public Agronomo() {
        super();
    }

    public Agronomo(String nombre, String apellido, int edad, int puntosVida) {
        super(nombre, apellido, edad, puntosVida);
    }

    @Override
    public String toString() {
        return "Agronomo => " + super.toString() + " puntosAtaque= " + puntosAtaque;
    }

    @Override
    public void ataque(Aldeano a) {
        int puntosAtaqueTemp=puntosAtaque;
        if (a instanceof Pacifista) {
            puntosAtaqueTemp *=.05;
        }
        if (a instanceof Normal) {
            puntosAtaqueTemp *=.10;
        }
        Random aleatorio = new Random();
        int valor = aleatorio.nextInt(99)+1;
        if (valor>5) {
            if (a.getPuntosVida()<puntosAtaqueTemp) {
                a.setPuntosVida(0);
                return;
            }
            a.setPuntosVida(a.getPuntosVida()-puntosAtaqueTemp);
        }else{
            System.out.println("El ataque no fu exitoso");
        }
    }
    
    
    
    
}

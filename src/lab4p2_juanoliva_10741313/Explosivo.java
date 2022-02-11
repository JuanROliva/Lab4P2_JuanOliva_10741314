package lab4p2_juanoliva_10741313;

import java.util.Random;

public class Explosivo extends Aldeano{

    private static final int puntosAtaque = 250;

    public Explosivo() {
        super();
    }

    public Explosivo(String nombre, String apellido, int edad, int puntosVida) {
        super(nombre, apellido, edad, puntosVida);
    }

    @Override
    public String toString() {
        return "Explosivo => " + super.toString() + "Puntos de Ataque = " + puntosAtaque ;
    }
    @Override
    public void ataque(Aldeano a) {
        int puntosAtaqueTemp=puntosAtaque;
        if (a instanceof Herrero) {
            puntosAtaqueTemp *=.05;
        }
        if (a instanceof Agronomo) {
            puntosAtaqueTemp *=.10;
        }
        Random aleatorio = new Random();
        int valor = aleatorio.nextInt(99)+1;
        if (valor>15) {
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

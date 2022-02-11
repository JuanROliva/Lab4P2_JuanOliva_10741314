package lab4p2_juanoliva_10741313;

import java.util.ArrayList;

public class Herrero extends Aldeano{
    private static final float porcentajeVidaExtra = 0.5F;
    private int vidaExtra;
    private ArrayList<String> herramientas = new ArrayList<String>();
    private int  puntosAtaque;

    public Herrero() {
        super();
    }

    public Herrero(String nombre, String apellido, int edad, int puntosVida, int puntosAtaque) {
        super(nombre, apellido, edad, puntosVida);
        this.puntosAtaque = puntosAtaque;
        setVidaExtra();
    }

    public int getVidaExtra() {
        return vidaExtra;
    }

    public void setVidaExtra() {
        this.vidaExtra = (int)(getPuntosVida()*porcentajeVidaExtra);
    }

    public ArrayList<String> getHerramientas() {
        return herramientas;
    }

    public void setHerramientas(ArrayList<String> herramientas) {
        this.herramientas = herramientas;
    }

    @Override
    public void setPuntosVida(int puntosVida) {
        super.setPuntosVida(puntosVida);
        setVidaExtra();
    }

    @Override
    public void ataque(Aldeano a) {
        if (a.getPuntosVida()<puntosAtaque) {
            a.setPuntosVida(0);
            return;
        }
        a.setPuntosVida(a.getPuntosVida()-puntosAtaque);
    }
    
    
    
}

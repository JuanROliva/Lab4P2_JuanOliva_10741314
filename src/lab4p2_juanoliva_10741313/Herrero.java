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

    public int getPuntosAtaque() {
        return puntosAtaque;
    }

    public void setPuntosAtaque(int puntosAtaque) {
        if (puntosAtaque >= 200 && puntosAtaque <= 500) {
            this.puntosAtaque = puntosAtaque;
            return;
        }
        if (puntosAtaque < 200) {
            this.puntosAtaque = 200;
        }else{
            this.puntosAtaque = 500;
        }
    }

    @Override
    public String toString() {
        return "Aldeano Herrero =" + super.toString() +  "vidaExtra=" + vidaExtra + ", puntosAtaque=" + puntosAtaque ;
    }
    
    
    
    @Override
    public void ataque(Aldeano a) {
        
        
        
    }
}

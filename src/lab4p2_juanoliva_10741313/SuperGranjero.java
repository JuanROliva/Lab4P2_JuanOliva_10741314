package lab4p2_juanoliva_10741313;

public class SuperGranjero extends Aldeano{
    private int puntosAtaque;

    public SuperGranjero() {
        super();
    }

    public SuperGranjero(String nombre, String apellido, int edad, int puntosVida, int puntosAtaque) {
        super(nombre, apellido, edad, puntosVida);
        this.puntosAtaque = puntosAtaque;
    }

    public int getPuntosAtaque() {
        return puntosAtaque;
    }

    public void setPuntosAtaque(int puntosAtaque) {
        this.puntosAtaque = puntosAtaque;
    }

    @Override
    public String toString() {
        return "SuperGranjero => " + super.toString() + " puntosAtaque= > " + puntosAtaque ;
    }

    @Override
    public void ataque(Aldeano a) {
        int puntosAtaqueTemp=puntosAtaque;
        
        if (a instanceof Herrero) {
            puntosAtaqueTemp *=.10;
        }
        
        if (a instanceof Explosivo) {
            puntosAtaqueTemp *=.15;
        }
        
        if (a.getPuntosVida()<puntosAtaqueTemp) {
            a.setPuntosVida(0);
            return;
        }
        a.setPuntosVida(a.getPuntosVida()-puntosAtaqueTemp);
    }
    
}

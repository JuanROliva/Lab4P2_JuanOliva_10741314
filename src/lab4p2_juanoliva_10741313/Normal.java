package lab4p2_juanoliva_10741313;
public class Normal extends Aldeano{
    
    private static final int puntosAtaque = 50;

    public Normal() {
        super();
    }

    public Normal(String nombre, String apellido, int edad, int puntosVida) {
        super(nombre, apellido, edad, puntosVida);
    }

    @Override
    public String toString() {
        return "Aldenano Normal = " + super.toString()  + "Puntos de Ataque= " + puntosAtaque;
    }

    @Override
    public void ataque(Aldeano a) {
        int puntosAtaqueTemp=puntosAtaque;
        if (a instanceof Pacifista) {
            puntosAtaqueTemp *=.05;
        }
        
        if (a.getPuntosVida()<puntosAtaqueTemp) {
            a.setPuntosVida(0);
            return;
        }
        a.setPuntosVida(a.getPuntosVida()-puntosAtaqueTemp);
    }
    
    
}

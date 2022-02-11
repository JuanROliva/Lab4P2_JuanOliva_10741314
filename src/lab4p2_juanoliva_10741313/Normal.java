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
    public void ataque(Aldeano a) {
        if (a.getPuntosVida()<puntosAtaque) {
            a.setPuntosVida(0);
            return;
        }
        a.setPuntosVida(a.getPuntosVida()-puntosAtaque);
    }
}

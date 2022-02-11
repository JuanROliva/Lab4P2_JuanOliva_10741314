package lab4p2_juanoliva_10741313;
public abstract class Aldeano implements Ataque{
    private String nombre;
    private String apellido;
    private int edad;
    private int puntosVida;

    public Aldeano() {
    }

    public Aldeano(String nombre, String apellido, int edad, int puntosVida) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.puntosVida = puntosVida;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getPuntosVida() {
        return puntosVida;
    }

    public void setPuntosVida(int puntosVida) {
        this.puntosVida = puntosVida;
    }

    @Override
    public String toString() {
        return "nombre= " + nombre + ", apellido= " + apellido + ", edad= " + edad + ", puntosVida= " + puntosVida ;
    }
}

package lab4p2_juanoliva_10741313;

import java.util.ArrayList;

public class Familia {
    
    private String linaje;
    ArrayList<Aldeano> intregantesFamilia = new ArrayList();

    public Familia() {
    }

    public Familia(String linaje) {
        this.linaje = linaje;
    }

    public String getLinaje() {
        return linaje;
    }

    public void setLinaje(String linaje) {
        this.linaje = linaje;
    }

    public ArrayList<Aldeano> getIntregantesFamilia() {
        return intregantesFamilia;
    }

    public void setIntregantesFamilia(ArrayList<Aldeano> intregantesFamilia) {
        this.intregantesFamilia = intregantesFamilia;
    }

    @Override
    public String toString() {
        return "Familia{" + "linaje=" + linaje + ", intregantesFamilia=" + intregantesFamilia + '}';
    }
}

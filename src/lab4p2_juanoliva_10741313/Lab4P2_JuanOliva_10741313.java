package lab4p2_juanoliva_10741313;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab4P2_JuanOliva_10741313 {
    static ArrayList<Familia> familias = new ArrayList<Familia>();
    static Scanner lea = new Scanner(System.in);
    
    public static void main(String[] args) {
        poblarDatos();
        boolean ciclo = true;
        while (ciclo) {
            String opc = menu();
            switch (opc) {
                case "1":
                    agregarFamilia();
                    break;
                case "2":
                    
                    break;
                default:
                    throw new AssertionError();
            }
        }
    }
    
    static void poblarDatos(){
        Familia montesco = new Familia("Montesco");
        Familia capuleto = new Familia("Capuleto");
        Familia sistemas = new Familia("Sistemas");
        montesco.getIntregantesFamilia().add(new SuperGranjero("Romero", "Montesco", 30, 1000, 1000));
        montesco.getIntregantesFamilia().add(new Herrero("Papa Romero", "Montesco", 60, 300, 100));
        montesco.getIntregantesFamilia().add(new Agronomo("Hermanito Romeo", "Montesco", 20, 150));
        montesco.getIntregantesFamilia().add(new Pacifista("Mama Romeo", "Montesco", 58, 300));
        capuleto.getIntregantesFamilia().add(new Pacifista("Julieta", "Capuleto", 21, 500));
        capuleto.getIntregantesFamilia().add(new Herrero("Papa Julieta", "Capuleto", 70, 500, 400));
        capuleto.getIntregantesFamilia().add(new Agronomo("Hermano menor Juliera", "Capuleto", 20, 200));
        sistemas.getIntregantesFamilia().add(new Pacifista("Fulanito", "Sistemas", 25, 30));
        sistemas.getIntregantesFamilia().add(new Herrero("Menganito", "Sistemas", 68, 450, 300));
        sistemas.getIntregantesFamilia().add(new Pacifista("Menganito", "Sistemas", 22, 480));
        familias.add(montesco);
        familias.add(capuleto);
        familias.add(sistemas);
    }
    
    
    static String menu(){
        System.out.println("""
                           1. Agregar una familia nueva
                           2. Agregar un integrante
                           3. Pelear con una familia
                           4. Salir
                           """);
        System.out.print("Ingrese la opccion que desea ejecutar: ");
        return lea.nextLine();
    }
    
    static void agregarFamilia(){
        System.out.print("Ingrese el apellido de la familia que desea agregar: ");
        String linaje = lea.nextLine();
        boolean repetido = false;
        for (Familia f : familias) {
            if (f.getLinaje().toLowerCase().equals(linaje.toLowerCase())) {
                repetido = true;
                break;
            }
        }
        if (!repetido) {
            familias.add(new Familia(linaje));
        }else{
            System.out.println("La familia ya se encuentra registrada");
        }
    }
    
    
    
}

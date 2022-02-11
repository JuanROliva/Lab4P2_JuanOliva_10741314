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
                    agregarAldeano();
                    break;
                case "4":
                    for (Familia f : familias) {
                        System.out.println(f);
                    }
                    break;
                case "5":
                    ciclo = false;
                    System.out.println("feliz día de San Valentin adelantado");
                    break;
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
                           4. Listar familias
                           5. Salir
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
    
    static void agregarAldeano(){
        System.out.println("Ingrese el apellido del aldeano: ");
        String apellido = lea.nextLine();
        boolean condicion = false;
        int posicionFamilia = -1;
        for (Familia f : familias) {
            if (f.getLinaje().toLowerCase().equals(apellido.toLowerCase())) {
                condicion = true;
                posicionFamilia = familias.indexOf(f);
                break;
            }
        }
        if (!condicion) {
            System.out.println("El apellido no esta registrado");
            return;
        }
        System.out.println("""
                           Selecciones que tipo de profesion
                           1. Normal
                           2. Pacifista
                           3. Herrero
                           4. Agronomo
                           5. Explosivo
                           6. SuperGrangero
                           """);
        System.out.print("Ingrese el numero de la opcion deseada: ");
        String opc = lea.nextLine();
        
        String nombre;
        int edad, puntosVida, ataque = 0;
        
        switch (opc) {
            case "1":
            case "2":
            case "3":
            case "4":
            case "5":
                System.out.print("Ingrese el nombre: ");
                nombre = lea.nextLine();
                System.out.print("Ingrese la edad: ");
                String edadCadena = lea.nextLine();
                while (!validacionStringNumeros(edadCadena)) {
                    System.out.print("Ingrese un numero entero positivo: ");
                    edadCadena = lea.nextLine();
                }
                edad = Integer.parseInt(edadCadena);
                System.out.print("Ingrese los puntos de vida: ");
                String puntosVidaCadena = lea.nextLine();
                while (!validacionStringNumeros(puntosVidaCadena)) {
                    System.out.println("Ingrese un numero entero posivo: ");
                    puntosVidaCadena = lea.nextLine();
                }
                puntosVida = Integer.parseInt(puntosVidaCadena);
                break;
                
            case "6":
                System.out.println("Ya exite un Supergranjero, gracias por participar");
                return;
                
            default:
                System.out.println("La opcion ingresada es no valida");
                return;
        }
        
        
        String ataqueCadena;
        if (!(opc.equals("1")||opc.equals("2")||opc.equals(4)||opc.equals("5"))) {
            System.out.print("Ingrese los puntos de ataque: ");
            ataqueCadena = lea.nextLine();
            while (!validacionStringNumeros(ataqueCadena)) {
                System.out.println("Ingrese un numero entero posito: ");
                ataqueCadena = lea.nextLine();
            }
            ataque = Integer.parseInt(ataqueCadena);
        }
        
        Aldeano a;
        switch (opc) {
            case "1":
                a = new Normal(nombre, apellido, edad, puntosVida);
                break;
            case "2":
                a = new Pacifista(nombre, apellido, edad, puntosVida);
                break;
            case "3":
                a = new Herrero(nombre, apellido, edad, puntosVida, ataque);
                break;
            case "4":
                a = new Agronomo(nombre, apellido, edad, puntosVida);
                break;
            case "5":
                a = new Explosivo(nombre, apellido, edad, puntosVida);
                break;
            default: a = new Normal(nombre, apellido, edad, puntosVida);
                break;
        }
        
        
        familias.get(posicionFamilia).getIntregantesFamilia().add(a);
        System.out.println(a.getNombre() + " fue agregado exitosamente a la familia " + a.getApellido());
    }
    
    static boolean validacionStringNumeros(String c){
        boolean condicion = true;
        for (int i = 0; i < c.length(); i++) {
            if (! Character.isDigit(c.charAt(i))) {
                condicion = false;
                break;
            }
        }
        if (condicion) {
            int num = Integer.parseInt(c);
            if (num<=0) {
                condicion = false;
            }
        }
        return condicion;
    }
    
}

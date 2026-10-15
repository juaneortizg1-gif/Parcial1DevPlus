package PixelRent;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Camara> camaras = new ArrayList<>();
        int opcion;

        do {
            System.out.println("\n===== PIXELRENT =====");
            System.out.println("1. Registrar cámara");
            System.out.println("2. Listar cámaras");
            System.out.println("0. Salir");
            System.out.print("Opción: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1 -> {
                    System.out.print("Código: ");
                    int codigo = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Marca: ");
                    String marca = sc.nextLine();
                    System.out.print("Resolución: ");
                    String resolucion = sc.nextLine();
                    System.out.print("¿Tiene estabilizador? (true/false): ");
                    boolean estabilizador = sc.nextBoolean();
                    sc.nextLine();

                    camaras.add(new Camara(codigo, marca, EstadoEquipo.DISPONIBLE, resolucion, estabilizador));
                    System.out.println("Cámara registrada.");
                }
                case 2 -> {
                    if (camaras.isEmpty()) {
                        System.out.println("No hay cámaras registradas.");
                    } else {
                        for (int i = 0; i < camaras.size(); i++) {
                            System.out.println((i + 1) + ". Resolución: " + camaras.get(i).getResolucion());
                        }
                    }
                }
                case 0 -> System.out.println("Chao");
                default -> System.out.println("Opción inválida");
            }
        } while (opcion != 0);

        sc.close();
    }
}

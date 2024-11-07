/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package org.yourcompany.yourproject;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author agustin
 */
public class SistemaTransporteDS {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Paquete> listaPaquetes = new ArrayList<>();

        System.out.print("¿Cuántos paquetes desea ingresar? ");
        int numeroPaquetes = scanner.nextInt();

        for (int i = 0; i < numeroPaquetes; i++) {
            System.out.println("Ingrese los datos del paquete " + (i + 1) + ":");
            System.out.println("Destino:");
            System.out.println("1. Nacional");
            System.out.println("2. Internacional");
            System.out.print("Ingrese la opción: ");
            int opcionDestino = scanner.nextInt();
            String destino = opcionDestino == 1 ? "nacional" : "internacional";
            System.out.print("Peso: ");
            double peso = scanner.nextDouble();
            System.out.println("Urgente:");
            System.out.println("1. Sí");
            System.out.println("2. No");
            System.out.print("Ingrese la opción: ");
            int opcionUrgente = scanner.nextInt();
            boolean urgente = opcionUrgente == 1;
            System.out.print("Largo: ");
            double largo = scanner.nextDouble();
            System.out.print("Ancho: ");
            double ancho = scanner.nextDouble();
            System.out.print("Alto: ");
            double alto = scanner.nextDouble();
            int id = i + 1;
            Paquete paquete = new Paquete(id, destino, peso, urgente, largo, ancho, alto, "En proceso de clasificación");

            listaPaquetes.add(paquete);
        }

        // Mostrar los diferentes costos de envío por los diferentes transportes
        for (Paquete paquete : listaPaquetes) {
            System.out.println("Costo de envío por transporte Aéreo: ");
            calcularCosteEnvio(paquete, "Aéreo");
            System.out.println("Costo de envío por transporte Marítimo: ");
            calcularCosteEnvio(paquete, "Marítimo");
            System.out.println("Costo de envío por transporte Terrestre: ");
            calcularCosteEnvio(paquete, "Terrestre");
        }

        boolean confirmarEnvio = false;
        do {
            System.out.println("Seleccione el tipo de transporte:");
            System.out.println("1. Aéreo");
            System.out.println("2. Marítimo");
            System.out.println("3. Terrestre");
            int opcionTransporte = scanner.nextInt();
            String tipoTransporteSeleccionado;

            switch (opcionTransporte) {
                case 1:
                    tipoTransporteSeleccionado = "Aéreo";
                    System.out.println("La demora estimada para el transporte aéreo es de 1-3 días.");
                    break;
                case 2:
                    tipoTransporteSeleccionado = "Marítimo";
                    System.out.println("La demora estimada para el transporte marítimo es de 7-14 días.");
                    break;
                case 3:
                    tipoTransporteSeleccionado = "Terrestre";
                    System.out.println("La demora estimada para el transporte terrestre es de 3-5 días.");
                    break;
                default:
                    System.out.println("Opción de transporte no válida.");
                    continue; // Volver a pedir la opción si es inválida
            }

            // Preguntar al usuario si desea enviar el paquete
            System.out.println("¿Desea enviar el/los paquete/s por transporte " + tipoTransporteSeleccionado);
            System.out.println("1. sí");
            System.out.println("2. No");
            int respuesta = scanner.nextInt();
            confirmarEnvio = respuesta == 1;

        } while (!confirmarEnvio); // Repetir hasta que el usuario confirme el envío

        System.out.println("Perfecto! Excelente elección");
        System.out.println("---------------------------Analizando el estado del/los paquete/s---------------------------");
        for (Paquete paquete : listaPaquetes) {

            System.out.println("El estado del paquete " + paquete.getId() + " es: " + paquete.getEstado());
        }
        System.out.println("---------------------------Actualizando el estado del/los paquete/s---------------------------");
        for (Paquete paquete : listaPaquetes) {
            paquete.setEstado("En camino");
            System.out.println("El estado del paquete " + paquete.getId() + " es: " + paquete.getEstado());
        }

    }

    // Método para calcular el coste de envío
    public static void calcularCosteEnvio(Paquete paquete, String tipoTransporte) {
        double costeBase; // Coste base
        double costePorPeso = paquete.getPeso() * 100; // Coste por peso
        double costeUrgente = 5000; // Costo adicional por urgencia
        double costeAdicionalUrgente = 2000;
        double costeInternacional = 3000; // Costo adicional para envíos internacionales

        // Determinar el coste base según el tipo de transporte
        switch (tipoTransporte) {
            case "Aéreo":
                costeBase = 15000; // Coste base para transporte aéreo
                break;
            case "Marítimo":
                costeBase = 5000; // Coste base para transporte marítimo
                break;
            case "Terrestre":
                costeBase = 9000; // Coste base para transporte terrestre
                break;
            default:
                System.out.println("Tipo de transporte no válido.");
                return;
        }

        double costeTotal = costeBase + costePorPeso;

        // Añadir coste adicional si el paquete es urgente
        if (paquete.isUrgente()) {
            costeTotal += costeUrgente + costeAdicionalUrgente; // Sumar costo adicional
        }

        // Añadir coste adicional si el destino es internacional
        if (paquete.getDestino().equals("internacional")) {
            costeTotal += costeInternacional; // Sumar costo adicional para internacional
        }

        System.out.println("El coste de enviar el paquete número " + paquete.getId() + " por transporte " + tipoTransporte + " es de: $" + costeTotal);
    }
}

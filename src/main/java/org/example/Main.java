package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> jugadores = new ArrayList<>();

        System.out.println("Ahora indique numero de jugadores: ");
        int NumeroJugadores = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < NumeroJugadores; i++) {
            System.out.println("Ahora ingresa el nombre del jugador: " + (i + 1));
            jugadores.add(scanner.nextLine());
        }

        RuletaRusa juego = new RuletaRusa(jugadores);
        boolean preparacion = false;
        int turno = 0;

        while (!preparacion) {
            System.out.println("Es turno de " + jugadores.get(turno) + ", que la suerte te acompañe");
            scanner.nextLine();

            preparacion = juego.Dispara_bala(turno);

            if (!preparacion) {
                turno = turno + 1 % jugadores.size();
            }
        }
        System.out.println("""
                fin del juego
                """);
        scanner.close();
    }
}
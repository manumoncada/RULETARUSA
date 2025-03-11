package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RuletaRusa {
    private List<String> jugadores;
    private int Posicionbala;
    private Random random;

    public RuletaRusa() {
    }

    public List<String> getJugadores() {
        return jugadores;
    }

    public void setJugadores(List<String> jugadores) {
        this.jugadores = jugadores;
    }

    public int getPosicionbala() {
        return Posicionbala;
    }

    public void setPosicionbala(int posicionbala) {
        Posicionbala = posicionbala;
    }

    public Random getRandom() {
        return random;
    }

    public void setRandom(Random random) {
        this.random = random;
    }

    public RuletaRusa(List<String> jugadores){
        this.jugadores = new ArrayList<>(jugadores);
        this.random = new Random();
        nuevaPosicionDeLaBala();
    }
    public boolean Dispara_bala(int Numero_jugador) {
        System.out.println("Jugador: " + jugadores.get(Numero_jugador) + "es tu turno");

        if (Numero_jugador == Posicionbala) {
            System.out.println("pum " + jugadores.get(Numero_jugador) + " ha muerto");
            return true;
        } else {
            System.out.println("""
                    has sobrevivido, siguiente ronda
                    """);
            nuevaPosicionDeLaBala();
            return false;
        }
    }

    private void nuevaPosicionDeLaBala(){
        this.Posicionbala = random.nextInt(jugadores.size());
        System.out.println("el tambor a sido girado");
    }

}

package mx.utng.sesion25.testdb.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Combate {
        @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long Pokemon;

    @Column(length = 100, nullable = false)
    private String Entrenador;

    public long getPokemon() {
        return Pokemon;
    }

    public void setPokemon(long pokemon) {
        Pokemon = pokemon;
    }

    public String getEntrenador() {
        return Entrenador;
    }

    public void setEntrenador(String entrenador) {
        Entrenador = entrenador;
    }

   
}

package org.taohansen.petfriends_almoxerifado.entities;

import jakarta.persistence.Embeddable;
import lombok.Data;

@Embeddable
@Data
public class Dimensoes {

    private double altura;
    private double largura;
    private double profundidade;

    public double calcularVolume() {
        return altura * largura * profundidade;
    }
}
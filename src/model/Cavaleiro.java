package model;

import java.util.Random;

public class Cavaleiro extends Personagem {

    public Cavaleiro() {
        this.hp = 130;
        this.maxHp = 130;
        this.dano = 18;
        this.defesa = false;
    }

    @Override
    public void receberDano(int dano) {
        Random rand = new Random();
        if (defesa) {
            int parry = rand.nextInt(5);
            if (parry == 0) {
                dano = 0;
                System.out.println("Parry! Você bloqueou completamente o ataque!");
                super.receberDano(dano);
            }
        } else {
            super.receberDano(dano);
        }
    }
}

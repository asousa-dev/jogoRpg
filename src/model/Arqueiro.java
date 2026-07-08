package model;

import java.util.Random;

public class Arqueiro extends Personagem {
    public Arqueiro() {
        this.hp = 100;
        this.maxHp = 100;
        this.dano = 20;
        this.defesa = false;
    }

    @Override
    public void atacar(Personagem inimigo) {
        Random rand = new Random();
        int critico = rand.nextInt(5);
        if (critico == 0){
            System.out.println("Você acertou em cheio e deu um dano crítico!");
            critico = this.dano * 2;
            dano = critico;
        }
        super.atacar(inimigo);
        dano = 20;
    }
}

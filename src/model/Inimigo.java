package model;

import java.util.Random;

public class Inimigo extends Personagem {
    public Inimigo() {
        this.dano = 16;
        this.hp = 200;
        this.maxHp = 200;
        this.defesa = false;
    }


    public void apresentar(){
        System.out.println();
        System.out.println("model.Inimigo: Brutes");
        System.out.println("HP: " + this.hp);
        System.out.println("Dano: " + this.dano);
        System.out.println();
    }

    public void inimigoStatus(){
        System.out.println();
        System.out.println("model.Inimigo: Brutes");
        System.out.println("HP: " + this.hp + "/" + this.maxHp);
    }

    public void randomizarInimigo(Personagem jogador) throws InterruptedException {
        Random rand = new Random();
        int escolha = rand.nextInt(2);
        if (escolha == 0){
            atacar(jogador);
            if (jogador.getHp() <= 0){
                System.out.println("Brutes te matou.");
            } else {System.out.println("Brutes te atacou!"); }
        } else {
            defender();
            System.out.println("Brutes defendeu!");
        }
        Thread.sleep(500);
    }
}

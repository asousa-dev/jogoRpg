package ui;

import model.*;

import java.util.Scanner;

public class Menu {

    Scanner input = new Scanner(System.in);

    public Personagem menuPersonagem() throws InterruptedException {
        System.out.println("Bem vindo ao RPG!");
        System.out.println("Escolha sua classe:");
        System.out.println("1 - model.Cavaleiro");
        System.out.println("2 - model.Mago");
        System.out.println("3 - model.Arqueiro");
        int opcao = input.nextInt();
        switch (opcao) {
            case 1:
                Cavaleiro cavaleiro = new Cavaleiro();
                return cavaleiro;
            case 2:
                Mago mago = new Mago();
                return mago;
            case 3:
                Arqueiro arqueiro = new Arqueiro();
                return arqueiro;
            default:
                System.out.println("Opção inválida");
                return menuPersonagem();
        }
    }

    public void menuLuta(Personagem jogador) throws InterruptedException {
        Inimigo inimigo = new Inimigo();
        inimigo.apresentar();


        while(jogador.getHp() > 0 && inimigo.getHp() > 0){
            mostrarStatus(jogador);
            System.out.println("Escolha o que vai fazer: ");
            System.out.println("1 - Atacar");
            System.out.println("2 - Defender");
            if (jogador.getClass() == Mago.class) {
                System.out.println("3 - Curar (mana necessária: 3)");
            }

            int opcao = input.nextInt();
            switch (opcao) {
                case 1:
                    inimigo.randomizarInimigo(jogador);
                    jogador.atacar(inimigo);

                    break;
                case 2:
                    jogador.defender();
                    inimigo.randomizarInimigo(jogador);
                    break;
                case 3:
                    if (jogador.getClass() == Mago.class) {
                        ((Mago) jogador).curar();
                        inimigo.randomizarInimigo(jogador);
                    } break;
                default:
                    System.out.println("Opção inválida");
                    menuLuta(jogador);
            }
            if (inimigo.getHp() > 0 && jogador.getHp() > 0) {
                inimigo.inimigoStatus();
            }
        }

    }

    public void mostrarStatus(Personagem jogador){
        System.out.println();
        System.out.println("Seu personagem:");
        System.out.println("HP: " + jogador.getHp() + "/" + jogador.getMaxHp());
        if (jogador.getClass() == Mago.class){
            System.out.println("Mana: " + ((Mago) jogador).getMana());
        }
        System.out.println();
    }
}

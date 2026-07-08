import model.Personagem;
import ui.Menu;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        Menu menu = new Menu();

        Personagem jogador = menu.menuPersonagem();

        System.out.println("Seja bem-vindo nobre guerreiro!");
        System.out.println("Você foi chamado para proteger a Vila de Osyhem do Brutes...");
        System.out.println("Boa sorte!");

        Thread.sleep(2000);

        menu.menuLuta(jogador);

    }
}


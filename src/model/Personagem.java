package model;

public class Personagem {
    protected int hp;
    protected int maxHp;
    protected int dano;
    protected boolean defesa;

    public void atacar(Personagem personagemAtacado) {
        personagemAtacado.receberDano(dano);
    }

    public void defender() {
        defesa = true;
    }

    public void receberDano(int dano) {
        if (defesa) {
            hp = hp - (dano/2);
            defesa = false;
        } else  {
            hp -= dano;
        }
    }



    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getMaxHp() {
        return maxHp;
    }

    public void setMaxHp(int maxHp) {
        this.maxHp = maxHp;
    }

    public int getDano() {
        return dano;
    }

    public void setDano(int dano) {
        this.dano = dano;
    }

    public boolean getDefesa() {
        return defesa;
    }

    public void setDefesa(boolean defesa) {
        this.defesa = defesa;
    }
}

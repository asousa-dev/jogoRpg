package model;

public class Mago extends Personagem {
    protected int mana;

    public Mago() {
        this.hp = 80;
        this.maxHp = 80;
        this.dano = 23;
        this.defesa = false;
        this.mana = 1;
    }

    @Override
    public void atacar(Personagem inimigo) {
        if (mana>=5){
            dano = dano * mana/2;
            mana = 0;
        }
        super.atacar(inimigo);
        mana+=2;
        this.dano = 23;
    }



    public void curar(){
        if (mana>=3 && hp<maxHp){
            hp += 30;
            System.out.println("Você se curou 30 health points!");
            if (hp>maxHp){
                hp = maxHp;
            }
            mana = mana - 3;
        } else {
            System.out.println("Mana insuficiente, perdeu a vez!");
        }
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }
}

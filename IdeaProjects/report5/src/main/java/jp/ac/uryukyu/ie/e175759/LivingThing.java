package jp.ac.uryukyu.ie.e175759;

public class LivingThing {
    private String name;
    private int hitPoint;
    private int attack;
    private boolean dead;

    public int getAttack() {
        return attack;
    }

    public int getHitPoint() {
        return hitPoint;
    }

    public void setDead(boolean dead) {
        this.dead = dead;
    }

    public void setHitPoint(int hitPoint) {
        this.hitPoint = hitPoint;
    }

    public boolean isDead() {
        return dead;
    }

    public String getName() {
        return name;
    }

    public LivingThing(String name, int maximumHP, int attack) {
        this.name = name;
        hitPoint = maximumHP;
        this.attack = attack;
        dead = false;
        System.out.printf("%sのHPは%d。攻撃力は%dです。\n", name, hitPoint, attack);
    }

    public void attack(LivingThing opponent) {
        if (this.dead == false) {
            int damage = (int) (Math.random() * attack);
            System.out.printf("%sの攻撃！%sに%dのダメージを与えた！！\n", name, getName(), damage);
            opponent.wounded(damage);
        }
    }

    public void wounded(int damage) {
        hitPoint -= damage;
        if (hitPoint < 1) {
            dead = true;
            System.out.printf("%sは倒れた。\n", name);
        }
    }
}

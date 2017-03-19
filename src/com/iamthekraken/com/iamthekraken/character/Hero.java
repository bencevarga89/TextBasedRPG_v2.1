package com.iamthekraken.com.iamthekraken.character;

/**
 * Created by iamthekraken on 2017.03.06..
 */
public class Hero extends Human {

    private String heroClass = "Unkown";
    private String heroName = "Unkown";

    private int potionCount;
    private int manaPotionCount;
    private int heroHealth;
    private int heroMana;
    private int heroDamage;
    private int heroMagicDamage;

    public Hero(String heroName, String heroClass) {
        this.heroName = heroName;
        this.heroClass = heroClass;

    }

    public int getPotionCount() {
        return potionCount;
    }

    public int getManaPotionCount() {
        return manaPotionCount;
    }

    public int getHeroHealth() {
        return heroHealth;
    }

    public int getHeroMana() {
        return heroMana;
    }

    public int getHeroDamage() {
        return heroDamage;
    }

    public int getHeroMagicDamage() {
        return heroMagicDamage;
    }

    public String getHeroName() {
        return heroName;
    }
    public String getHeroClass() {
        return heroClass;
    }

    public void setHeroClass(String heroClass) {
        this.heroClass = heroClass;
    }

    public void setHeroName(String heroName) {
        this.heroName = heroName;
    }

    public void setPotionCount(int potionCount) {
        this.potionCount = potionCount;
    }

    public void setManaPotionCount(int manaPotionCount) {
        this.manaPotionCount = manaPotionCount;
    }

    public void setHeroHealth(int heroHealth) {
        this.heroHealth = heroHealth;
    }

    public void setHeroMana(int heroMana) {
        this.heroMana = heroMana;
    }

    public void setHeroDamage(int heroDamage) {
        this.heroDamage = heroDamage;
    }

    public void setHeroMagicDamage(int heroMagicDamage) {
        this.heroMagicDamage = heroMagicDamage;
    }
}



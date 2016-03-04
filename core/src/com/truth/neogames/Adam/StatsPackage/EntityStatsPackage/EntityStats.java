package com.truth.neogames.Adam.StatsPackage.EntityStatsPackage;

import com.truth.neogames.Enums.EntityStatName;
import com.truth.neogames.RPGObject;

/**
 * Created by Adam on 10/22/2015.
 * Class Description: Defines stats for a player or monster.
 */
public class EntityStats extends RPGObject {
    protected int level;
    protected double exp;
    protected EntityStat health;
    protected EntityStat healthRegen;
    protected EntityStat mana;
    protected EntityStat manaRegen;
    protected EntityStat strength;
    protected EntityStat constitution;
    protected EntityStat wisdom;
    protected EntityStat dexterity;
    protected DependentEntityStat speed;

    /*************
     * Constructors
     *************/

    public EntityStats() {
        level = 1;
        exp = 0.0;
        health = new EntityStat(EntityStatName.HEALTH, 100.0);
        healthRegen = new EntityStat(EntityStatName.HEALTHREGEN, 5.0);
        mana = new EntityStat(EntityStatName.MANA, 100.0);
        manaRegen = new EntityStat(EntityStatName.MANAREGEN, 10.0);
        strength = new EntityStat(EntityStatName.STRENGTH, 1.0);
        constitution = new EntityStat(EntityStatName.CONSTITUTION, 1.0);
        wisdom = new EntityStat(EntityStatName.WISDOM, 1.0);
        dexterity = new EntityStat(EntityStatName.DEXTERITY, 1.0);
        speed = new DependentEntityStat(EntityStatName.SPEED, 30.0);
        speed.addStat(dexterity);
    }

    public EntityStats(int level) {
        this.level = level;
        health = new EntityStat(EntityStatName.HEALTH, (double) (90 + (level * 10)));
        healthRegen = new EntityStat(EntityStatName.HEALTHREGEN, (double) (5 + level));
        mana = new EntityStat(EntityStatName.MANA, (double) (90 + (level * 10)));
        manaRegen = new EntityStat(EntityStatName.MANAREGEN, (double) (9 + level));
        strength = new EntityStat(EntityStatName.STRENGTH, (double) (1 + level));
        constitution = new EntityStat(EntityStatName.CONSTITUTION, (double) (1 + level));
        wisdom = new EntityStat(EntityStatName.WISDOM, (double) (1 + level));
        dexterity = new EntityStat(EntityStatName.DEXTERITY, (double) (1 + level));
        speed = new DependentEntityStat(EntityStatName.SPEED, (double) (30 + level));

    }

    public EntityStat getStat(EntityStatName name) {
        switch (name) {
            case HEALTH:
                return health;
            case HEALTHREGEN:
                return healthRegen;
            case MANA:
                return mana;
            case MANAREGEN:
                return manaRegen;
            case STRENGTH:
                return strength;
            case CONSTITUTION:
                return constitution;
            case WISDOM:
                return wisdom;
            case DEXTERITY:
                return dexterity;
            case SPEED:
                return speed;
            default:
                return null;
        }
    }

    public void setBaseStat(EntityStatName name, double value) {
        switch (name) {
            case HEALTH:
                health.setBaseMax(value);
                break;
            case HEALTHREGEN:
                healthRegen.setBaseMax(value);
                break;
            case MANA:
                mana.setBaseMax(value);
                break;
            case MANAREGEN:
                manaRegen.setBaseMax(value);
                break;
            case STRENGTH:
                strength.setBaseMax(value);
                break;
            case CONSTITUTION:
                constitution.setBaseMax(value);
                break;
            case WISDOM:
                wisdom.setBaseMax(value);
                break;
            case DEXTERITY:
                dexterity.setBaseMax(value);
                break;
            case SPEED:
                speed.setMax(value);
                break;
        }
    }

    public void setStat(EntityStatName name, double value) {
        switch (name) {
            case HEALTH:
                health.setMax(value);
                break;
            case HEALTHREGEN:
                healthRegen.setMax(value);
                break;
            case MANA:
                mana.setMax(value);
                break;
            case MANAREGEN:
                manaRegen.setMax(value);
                break;
            case STRENGTH:
                strength.setMax(value);
                break;
            case CONSTITUTION:
                constitution.setMax(value);
                break;
            case WISDOM:
                wisdom.setMax(value);
                break;
            case DEXTERITY:
                dexterity.setMax(value);
                break;
            case SPEED:
                speed.setMax(value);
                break;
        }
    }

    /*************
     * Getters and Setters
     *************/

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public EntityStat getHealth() {
        return health;
    }

    public void setHealth(EntityStat health) {
        this.health = health;
    }

    public EntityStat getHealthRegen() {
        return healthRegen;
    }

    public void setHealthRegen(EntityStat healthRegen) {
        this.healthRegen = healthRegen;
    }

    public EntityStat getMana() {
        return mana;
    }

    public void setMana(EntityStat mana) {
        this.mana = mana;
    }

    public EntityStat getManaRegen() {
        return manaRegen;
    }

    public void setManaRegen(EntityStat manaRegen) {
        this.manaRegen = manaRegen;
    }

    public EntityStat getStrength() {
        return strength;
    }

    public void setStrength(EntityStat strength) {
        this.strength = strength;
    }

    public EntityStat getConstitution() {
        return constitution;
    }

    public void setConstitution(EntityStat constitution) {
        this.constitution = constitution;
    }

    public EntityStat getWisdom() {
        return wisdom;
    }

    public void setWisdom(EntityStat wisdom) {
        this.wisdom = wisdom;
    }

    public double getExp() {
        return exp;
    }

    public void setExp(double exp) {
        this.exp = exp;
    }

    public void setByLevel(int level) {
        this.level = level;
        health = new EntityStat(EntityStatName.HEALTH, (double) (90 + (level * 10)));
        healthRegen = new EntityStat(EntityStatName.HEALTHREGEN, (double) (5 + level));
        mana = new EntityStat(EntityStatName.MANA, (double) (90 + (level * 10)));
        manaRegen = new EntityStat(EntityStatName.MANAREGEN, (double) (9 + level));
        strength = new EntityStat(EntityStatName.STRENGTH, (double) (1 + level));
        constitution = new EntityStat(EntityStatName.CONSTITUTION, (double) (1 + level));
        wisdom = new EntityStat(EntityStatName.WISDOM, (double) (1 + level));
    }

    @Override
    public String toString() {
        return "EntityStats{" +
                "level=" + level +
                ", exp=" + exp +
                ", health=" + health +
                ", healthRegen=" + healthRegen +
                ", mana=" + mana +
                ", manaRegen=" + manaRegen +
                ", strength=" + strength +
                ", constitution=" + constitution +
                ", wisdom=" + wisdom +
                ", dexterity=" + dexterity +
                ", speed=" + speed +
                '}';
    }
}

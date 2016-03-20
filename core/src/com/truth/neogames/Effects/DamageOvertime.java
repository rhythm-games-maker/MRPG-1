package com.truth.neogames.Effects;

import com.truth.neogames.Entities.LivingEntity;
import com.truth.neogames.Enums.DamageType;

/**
 * Created by acurr on 2/15/2016.
 */
public class DamageOvertime extends Effect {
    private double damage;
    private DamageType type;
    private int duration;
    private LivingEntity e;

    public DamageOvertime(double damage, DamageType type, int duration) {
        this.damage = damage;
        this.type = type;
        this.duration = duration;
    }

    public DamageOvertime(double damage, DamageType type, int duration, LivingEntity e) {
        this.damage = damage;
        this.type = type;
        this.duration = duration;
        this.e = e;

    }

    public double getDamage() {
        return damage;
    }

    public void setDamage(double damage) {
        this.damage = damage;
    }

    public DamageType getType() {
        return type;
    }

    public void setType(DamageType type) {
        this.type = type;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "DamageOvertime{" +
                "damage=" + damage +
                ", type=" + type +
                ", duration=" + duration +
                ", e=" + e +
                '}';
    }
}
package com.truth.neogames.Abilities;

import com.truth.neogames.Effects.Effect;
import com.truth.neogames.Enums.AbilityType;
import com.truth.neogames.RPGObject;

import java.util.ArrayList;

/**
 * Created by Adam on 2/29/2016.
 * Class Description:
 */
public abstract class Ability extends RPGObject {
    protected AbilityType type;
    protected int level;
    protected ArrayList<Effect> effects = new ArrayList<Effect>();
    protected int cost;
    private int duration;
    private int area;


    public AbilityType getType() {
        return type;
    }

    public void setType(AbilityType type) {
        this.type = type;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public ArrayList<Effect> getEffects() {
        return effects;
    }

    public void setEffects(ArrayList<Effect> effects) {
        this.effects = effects;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getArea() {
        return area;
    }

    @Override
    public String toString() {
        return "Ability{" +
                "type=" + type +
                ", level=" + level +
                ", effects=" + effects +
                ", cost=" + cost +
                ", duration=" + duration +
                ", area=" + area +
                '}';
    }
}
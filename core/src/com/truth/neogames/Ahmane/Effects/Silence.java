package com.truth.neogames.Ahmane.Effects;


import com.truth.neogames.Ahmane.Entities.LivingEntity;

/**
 * Created by acurr on 2/15/2016.
 */
public class Silence extends Effect {
    private int duration;
    private LivingEntity e;

    public Silence(int duration) {
        this.duration = duration;
    }

    public Silence(int duration, LivingEntity e) {
        this.duration = duration;
        this.e = e;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "Silence{" +
                "duration=" + duration +
                ", e=" + e +
                '}';
    }
}

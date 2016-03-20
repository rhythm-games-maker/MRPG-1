package com.truth.neogames.Battle;

import com.truth.neogames.Abilities.ActiveAbility;
import com.truth.neogames.Entities.LivingEntity;
import com.truth.neogames.Entities.SubTypes.Monster;
import com.truth.neogames.Entities.SubTypes.Player;
import com.truth.neogames.EnvironmentPackage.BattleGrid;
import com.truth.neogames.RPGObject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Ahmane on 10/21/2015.
 * Class Description: Calculations for a battle.
 */
public class Battle extends RPGObject {
    private Player player;
    private Monster[] monsters;
    private BattleGrid grid;

    public Battle(Player p, Monster[] monsters, BattleGrid b) {
        player = p;
        this.monsters = monsters;
        grid = b;
    }

    public void ApplyAbility(ActiveAbility ability, ArrayList<LivingEntity> targets, LivingEntity caster) {

    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public Monster[] getMonsters() {

        return monsters;
    }

    public void setMonsters(Monster... monsters) {
        this.monsters = monsters;
    }

    public List<Monster> getMonstersArea(int area) {


        List<Monster> mlist = new ArrayList<Monster>();

        for (int x = player.getxPos() - area; x <= (player.getxPos() + area); x++) {
            for (int y = player.getyPos() - area; y <= (player.getyPos() + area); y++) {

                for (Monster monster : monsters) {
                    if ((monster.getxPos() == x) && (monster.getyPos() == y)) {

                        mlist.add(monster);
                    }
                }
            }


        }

        return mlist;
    }

    public BattleGrid getGrid() {
        return grid;
    }

    public void setGrid(BattleGrid grid) {
        this.grid = grid;
    }

    @Override
    public String toString() {
        return "Battle{" +
                "player=" + player +
                ", monsters=" + Arrays.toString(monsters) +
                ", grid=" + grid +
                '}';
    }
}
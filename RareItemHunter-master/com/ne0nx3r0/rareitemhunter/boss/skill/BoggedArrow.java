package com.ne0nx3r0.rareitemhunter.boss.skill;

import com.ne0nx3r0.rareitemhunter.boss.Boss;
import com.ne0nx3r0.rareitemhunter.boss.BossSkill;
import org.bukkit.entity.Arrow;
import org.bukkit.entity.Player;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class BoggedArrow extends BossSkill
{
    public BoggedArrow()
    {
        super("Bogged Arrow");
    }

    @Override
    public boolean onDamageOther(Boss boss, EntityDamageByEntityEvent e, int level)
    {
        if(e.getEntity() instanceof Player)
        {
            Player p = (Player) e.getEntity();
            Arrow arrow = p.launchProjectile(Arrow.class);
            arrow.addCustomEffect(new PotionEffect(PotionEffectType.POISON, 20 * level, 1), true);
            return true;
        }
        return false;
    }

    @Override
    public boolean onInteract(Boss boss, Player p, int level)
    {
        return false;
    }
}

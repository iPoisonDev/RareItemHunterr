package com.ne0nx3r0.rareitemhunter.boss.skill;

import com.ne0nx3r0.rareitemhunter.boss.Boss;
import com.ne0nx3r0.rareitemhunter.boss.BossSkill;
import org.bukkit.entity.Player;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class Swallow extends BossSkill
{
    public Swallow()
    {
        super("Swallow");
    }

    @Override
    public boolean onDamageOther(Boss boss, EntityDamageByEntityEvent e, int level)
    {
        if(e.getEntity() instanceof Player)
        {
            Player p = (Player) e.getEntity();
            p.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, 20 * level, 1));
            p.teleport(boss.getEntity().getLocation().add(0, 5, 0));
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

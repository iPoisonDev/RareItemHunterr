package com.ne0nx3r0.rareitemhunter.boss.skill;

import com.ne0nx3r0.rareitemhunter.boss.Boss;
import com.ne0nx3r0.rareitemhunter.boss.BossSkill;
import org.bukkit.entity.Player;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class WaterPulse extends BossSkill
{
    public WaterPulse()
    {
        super("Water Pulse");
    }

    @Override
    public boolean onDamageOther(Boss boss, EntityDamageByEntityEvent e, int level)
    {
        if(e.getEntity() instanceof Player)
        {
            Player p = (Player) e.getEntity();
            p.addPotionEffect(new PotionEffect(PotionEffectType.WATER_BREATHING, 20 * 10, level - 1));
            p.setVelocity(p.getLocation().toVector().subtract(boss.getEntity().getLocation().toVector()).normalize().multiply(level * 0.5));
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

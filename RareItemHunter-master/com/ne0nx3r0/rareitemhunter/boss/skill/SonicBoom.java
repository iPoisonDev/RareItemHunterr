package com.ne0nx3r0.rareitemhunter.boss.skill;

import com.ne0nx3r0.rareitemhunter.boss.Boss;
import com.ne0nx3r0.rareitemhunter.boss.BossSkill;
import org.bukkit.entity.Player;
import org.bukkit.event.entity.EntityDamageByEntityEvent;

public class SonicBoom extends BossSkill
{
    public SonicBoom()
    {
        super("Sonic Boom");
    }

    @Override
    public boolean onDamageOther(Boss boss, EntityDamageByEntityEvent e, int level)
    {
        if(e.getEntity() instanceof Player)
        {
            Player p = (Player) e.getEntity();
            p.getWorld().playSound(p.getLocation(), org.bukkit.Sound.ENTITY_WARDEN_SONIC_BOOM, 1, 1);
            p.damage(level * 5, boss.getEntity());
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

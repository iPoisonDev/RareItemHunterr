package com.ne0nx3r0.rareitemhunter.boss.skill;

import com.ne0nx3r0.rareitemhunter.boss.Boss;
import com.ne0nx3r0.rareitemhunter.boss.BossSkill;
import org.bukkit.entity.Player;
import org.bukkit.entity.WindCharge;
import org.bukkit.event.entity.EntityDamageByEntityEvent;

public class WindCharge extends BossSkill
{
    public WindCharge()
    {
        super("Wind Charge");
    }

    @Override
    public boolean onDamageOther(Boss boss, EntityDamageByEntityEvent e, int level)
    {
        if(e.getEntity() instanceof Player)
        {
            Player p = (Player) e.getEntity();
            p.launchProjectile(WindCharge.class);
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

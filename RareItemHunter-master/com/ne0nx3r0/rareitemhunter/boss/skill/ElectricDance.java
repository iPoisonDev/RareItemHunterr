package com.ne0nx3r0.rareitemhunter.boss.skill;

import com.ne0nx3r0.rareitemhunter.boss.Boss;
import com.ne0nx3r0.rareitemhunter.boss.BossSkill;
import org.bukkit.entity.LivingEntity;

public class ElectricDance extends BossSkill
{
    public ElectricDance()
    {
        super("Electric Dance");
    }

    @Override
    public boolean callSkill(Boss boss, LivingEntity target, int level)
    {
        if(boss.getNearbyEntities(5, 5, 5).size() > 0)
        {
            for(LivingEntity entity : boss.getNearbyEntities(5, 5, 5))
            {
                entity.getWorld().strikeLightning(entity.getLocation());
            }
            return true;
        }
        return false;
    }
}

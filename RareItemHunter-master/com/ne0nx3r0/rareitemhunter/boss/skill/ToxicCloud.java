package com.ne0nx3r0.rareitemhunter.boss.skill;

import com.ne0nx3r0.rareitemhunter.boss.Boss;
import com.ne0nx3r0.rareitemhunter.boss.BossSkill;
import org.bukkit.entity.LivingEntity;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class ToxicCloud extends BossSkill
{
    public ToxicCloud()
    {
        super("Toxic Cloud");
    }

    @Override
    public boolean callSkill(Boss boss, LivingEntity target, int level)
    {
        if(boss.getNearbyEntities(5, 5, 5).size() > 0)
        {
            for(LivingEntity entity : boss.getNearbyEntities(5, 5, 5))
            {
                entity.addPotionEffect(new PotionEffect(PotionEffectType.POISON, 20 * 5, 1));
            }
            return true;
        }
        return false;
    }
}

package com.ne0nx3r0.rareitemhunter.property.skill;

import com.ne0nx3r0.rareitemhunter.property.ItemProperty;
import com.ne0nx3r0.rareitemhunter.property.ItemPropertyActions;
import com.ne0nx3r0.rareitemhunter.property.ItemPropertyTypes;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.event.player.PlayerInteractEvent;

public class SonicPulse extends ItemProperty
{
    public SonicPulse()
    {
        super(ItemPropertyTypes.SKILL, "Sonic Pulse", "Creates a powerful sonic pulse, damaging and knocking back nearby enemies.", 1, 10);
    }

    @Override
    public boolean onInteract(PlayerInteractEvent e, int level)
    {
        Player p = e.getPlayer();
        p.getWorld().playSound(p.getLocation(), org.bukkit.Sound.ENTITY_WARDEN_SONIC_BOOM, 1, 1);
        for (LivingEntity entity : p.getWorld().getLivingEntities())
        {
            if (entity.getLocation().distance(p.getLocation()) < 5 * level && !entity.equals(p))
            {
                entity.damage(level * 2, p);
                entity.setVelocity(entity.getLocation().toVector().subtract(p.getLocation().toVector()).normalize().multiply(level * 0.5));
            }
        }
        return true;
    }
}

package com.ne0nx3r0.rareitemhunter.property.skill;

import com.ne0nx3r0.rareitemhunter.property.ItemProperty;
import com.ne0nx3r0.rareitemhunter.property.ItemPropertyTypes;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.event.player.PlayerInteractEvent;

public class TongueWhip extends ItemProperty
{
    public TongueWhip()
    {
        super(ItemPropertyTypes.SKILL, "Tongue Whip", "Pulls an enemy towards you.", 1, 5);
    }

    @Override
    public boolean onInteract(PlayerInteractEvent e, int level)
    {
        Player p = e.getPlayer();
        for (LivingEntity entity : p.getWorld().getLivingEntities())
        {
            if (entity.getLocation().distance(p.getLocation()) < 10 * level && !entity.equals(p))
            {
                entity.teleport(p.getLocation());
                return true;
            }
        }
        return false;
    }
}

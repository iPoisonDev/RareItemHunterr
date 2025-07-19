package com.ne0nx3r0.rareitemhunter.property.skill;

import com.ne0nx3r0.rareitemhunter.property.ItemProperty;
import com.ne0nx3r0.rareitemhunter.property.ItemPropertyTypes;
import org.bukkit.entity.Player;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.util.Vector;

public class GuardianTrident extends ItemProperty
{
    public GuardianTrident()
    {
        super(ItemPropertyTypes.SKILL, "Guardian Trident", "Fires a pulse of water.", 1, 5);
    }

    @Override
    public boolean onInteract(PlayerInteractEvent e, int level)
    {
        Player p = e.getPlayer();
        p.getWorld().playSound(p.getLocation(), org.bukkit.Sound.ENTITY_GUARDIAN_ATTACK, 1, 1);
        Vector direction = p.getLocation().getDirection();
        p.getWorld().spawnEntity(p.getLocation().add(direction.multiply(2)), org.bukkit.entity.EntityType.TRIDENT);
        return true;
    }
}

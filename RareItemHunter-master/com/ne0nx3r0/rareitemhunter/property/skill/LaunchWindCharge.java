package com.ne0nx3r0.rareitemhunter.property.skill;

import com.ne0nx3r0.rareitemhunter.property.ItemProperty;
import com.ne0nx3r0.rareitemhunter.property.ItemPropertyTypes;
import org.bukkit.entity.Player;
import org.bukkit.entity.WindCharge;
import org.bukkit.event.player.PlayerInteractEvent;

public class LaunchWindCharge extends ItemProperty
{
    public LaunchWindCharge()
    {
        super(ItemPropertyTypes.SKILL, "Launch Wind Charge", "Launches a wind charge.", 1, 5);
    }

    @Override
    public boolean onInteract(PlayerInteractEvent e, int level)
    {
        Player p = e.getPlayer();
        p.launchProjectile(WindCharge.class);
        return true;
    }
}

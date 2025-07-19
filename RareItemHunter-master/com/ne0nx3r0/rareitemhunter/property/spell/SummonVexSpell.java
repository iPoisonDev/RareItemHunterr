package com.ne0nx3r0.rareitemhunter.property.spell;

import com.ne0nx3r0.rareitemhunter.property.ItemProperty;
import com.ne0nx3r0.rareitemhunter.property.ItemPropertyTypes;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.entity.Vex;
import org.bukkit.event.player.PlayerInteractEvent;

public class SummonVexSpell extends ItemProperty
{
    public SummonVexSpell()
    {
        super(ItemPropertyTypes.SPELL, "Summon Vex", "Summons a friendly Vex to fight for you.", 1, 5);
    }

    @Override
    public boolean onInteract(PlayerInteractEvent e, int level)
    {
        Player p = e.getPlayer();
        for (int i = 0; i < level; i++)
        {
            Vex vex = (Vex) p.getWorld().spawnEntity(p.getLocation(), EntityType.VEX);
            vex.setOwner(p);
        }
        return true;
    }
}

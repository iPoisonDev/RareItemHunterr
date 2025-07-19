package com.ne0nx3r0.rareitemhunter.property.spell;

import com.ne0nx3r0.rareitemhunter.property.ItemProperty;
import com.ne0nx3r0.rareitemhunter.property.ItemPropertyTypes;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.player.PlayerInteractEvent;

public class MirrorImageSpell extends ItemProperty
{
    public MirrorImageSpell()
    {
        super(ItemPropertyTypes.SPELL, "Mirror Image", "Creates a non-hostile clone of you.", 1, 5);
    }

    @Override
    public boolean onInteract(PlayerInteractEvent e, int level)
    {
        Player p = e.getPlayer();
        for (int i = 0; i < level; i++)
        {
            p.getWorld().spawnEntity(p.getLocation(), EntityType.ILLUSIONER);
        }
        return true;
    }
}

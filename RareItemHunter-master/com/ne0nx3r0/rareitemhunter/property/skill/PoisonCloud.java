package com.ne0nx3r0.rareitemhunter.property.skill;

import com.ne0nx3r0.rareitemhunter.property.ItemProperty;
import com.ne0nx3r0.rareitemhunter.property.ItemPropertyTypes;
import org.bukkit.entity.AreaEffectCloud;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class PoisonCloud extends ItemProperty
{
    public PoisonCloud()
    {
        super(ItemPropertyTypes.SKILL, "Poison Cloud", "Creates a lingering cloud of poison.", 1, 5);
    }

    @Override
    public boolean onInteract(PlayerInteractEvent e, int level)
    {
        Player p = e.getPlayer();
        AreaEffectCloud cloud = (AreaEffectCloud) p.getWorld().spawnEntity(p.getLocation(), EntityType.AREA_EFFECT_CLOUD);
        cloud.addCustomEffect(new PotionEffect(PotionEffectType.POISON, 20 * 10, level - 1), true);
        cloud.setDuration(20 * 10);
        cloud.setRadius(level * 2);
        return true;
    }
}

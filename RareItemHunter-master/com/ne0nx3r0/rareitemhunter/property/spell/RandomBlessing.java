package com.ne0nx3r0.rareitemhunter.property.spell;

import com.ne0nx3r0.rareitemhunter.property.ItemProperty;
import com.ne0nx3r0.rareitemhunter.property.ItemPropertyTypes;
import org.bukkit.entity.Player;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import java.util.Random;

public class RandomBlessing extends ItemProperty
{
    private static final PotionEffectType[] POSITIVE_EFFECTS = {
            PotionEffectType.SPEED,
            PotionEffectType.FAST_DIGGING,
            PotionEffectType.INCREASE_DAMAGE,
            PotionEffectType.HEAL,
            PotionEffectType.JUMP,
            PotionEffectType.REGENERATION,
            PotionEffectType.DAMAGE_RESISTANCE,
            PotionEffectType.FIRE_RESISTANCE,
            PotionEffectType.WATER_BREATHING,
            PotionEffectType.INVISIBILITY,
            PotionEffectType.NIGHT_VISION,
            PotionEffectType.HEALTH_BOOST,
            PotionEffectType.ABSORPTION,
            PotionEffectType.SATURATION,
            PotionEffectType.LUCK
    };

    public RandomBlessing()
    {
        super(ItemPropertyTypes.SPELL, "Random Blessing", "Grants a random positive potion effect.", 1, 5);
    }

    @Override
    public boolean onInteract(PlayerInteractEvent e, int level)
    {
        Player p = e.getPlayer();
        Random random = new Random();
        PotionEffectType effectType = POSITIVE_EFFECTS[random.nextInt(POSITIVE_EFFECTS.length)];
        p.addPotionEffect(new PotionEffect(effectType, 20 * 30 * level, level - 1));
        return true;
    }
}

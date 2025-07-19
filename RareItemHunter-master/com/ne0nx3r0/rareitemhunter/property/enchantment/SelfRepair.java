package com.ne0nx3r0.rareitemhunter.property.enchantment;

import com.ne0nx3r0.rareitemhunter.property.ItemProperty;
import com.ne0nx3r0.rareitemhunter.property.ItemPropertyTypes;
import org.bukkit.inventory.ItemStack;

public class SelfRepair extends ItemProperty
{
    public SelfRepair()
    {
        super(ItemPropertyTypes.ENCHANTMENT, "Self Repair", "Slowly repairs the item over time.", 1, 5);
    }

    @Override
    public void onTick(ItemStack is, int level)
    {
        if (is.getDurability() > 0 && Math.random() < 0.01 * level)
        {
            is.setDurability((short) (is.getDurability() - 1));
        }
    }
}

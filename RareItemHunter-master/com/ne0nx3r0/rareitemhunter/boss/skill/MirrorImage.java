package com.ne0nx3r0.rareitemhunter.boss.skill;

import com.ne0nx3r0.rareitemhunter.boss.Boss;
import com.ne0nx3r0.rareitemhunter.boss.BossSkill;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.entity.EntityDamageByEntityEvent;

public class MirrorImage extends BossSkill
{
    public MirrorImage()
    {
        super("Mirror Image");
    }

    @Override
    public boolean onDamageOther(Boss boss, EntityDamageByEntityEvent e, int level)
    {
        for (int i = 0; i < level; i++)
        {
            boss.getEntity().getWorld().spawnEntity(boss.getEntity().getLocation(), EntityType.ILLUSIONER);
        }
        return true;
    }

    @Override
    public boolean onInteract(Boss boss, Player p, int level)
    {
        return false;
    }
}

package keepcalm.mods.bukkit.bukkitAPI.entity;

import keepcalm.mods.bukkit.bukkitAPI.BukkitServer;
import net.minecraft.entity.boss.EntityDragonPart;

import org.bukkit.entity.Damageable;
import org.bukkit.entity.EnderDragon;
import org.bukkit.entity.EnderDragonPart;
//import org.bukkit.craftbukkit.CraftServer;
import org.bukkit.entity.Entity;

public class BukkitEnderDragonPart extends BukkitComplexPart implements EnderDragonPart {
    public BukkitEnderDragonPart(BukkitServer server, EntityDragonPart entity) {
        super(server, entity);
    }

    @Override
    public EnderDragon getParent() {
        return (EnderDragon) super.getParent();
    }

    @Override
    public EntityDragonPart getHandle() {
        return (EntityDragonPart) entity;
    }

    @Override
    public String toString() {
        return "BukkitEnderDragonPart";
    }

	@Override
	public void damage(int amount) {
		getParent().damage(amount);
	}

	@Override
	public void damage(int amount, Entity source) {
		getParent().damage(amount, source);
	}

	@Override
	public int getHealth() {
		return getParent().getHealth();
	}

	@Override
	public void setHealth(int health) {
		getParent().setHealth(health);
	}

	@Override
	public int getMaxHealth() {
		return getParent().getMaxHealth();
	}

	@Override
	public void setMaxHealth(int health) {
		getParent().setMaxHealth(health);
	}

	@Override
	public void resetMaxHealth() {
		getParent().resetMaxHealth();
	}
}

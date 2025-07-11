
package net.mcreator.thecorruptions.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.Entity;

import net.mcreator.thecorruptions.procedures.CorruptedOrbItemInHandTickProcedure;

public class CorruptedOrbItem extends Item {
	public CorruptedOrbItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.UNCOMMON));
	}

	@Override
	public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
		super.inventoryTick(itemstack, world, entity, slot, selected);
		if (selected)
			CorruptedOrbItemInHandTickProcedure.execute(world, entity);
	}
}

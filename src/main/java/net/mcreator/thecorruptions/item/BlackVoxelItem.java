
package net.mcreator.thecorruptions.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class BlackVoxelItem extends Item {
	public BlackVoxelItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}

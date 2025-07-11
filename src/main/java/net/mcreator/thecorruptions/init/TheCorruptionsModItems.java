
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.thecorruptions.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.thecorruptions.item.YellowVoxelItem;
import net.mcreator.thecorruptions.item.PinkVoxelItem;
import net.mcreator.thecorruptions.item.CorruptedOrbItem;
import net.mcreator.thecorruptions.item.BlackVoxelItem;
import net.mcreator.thecorruptions.TheCorruptionsMod;

public class TheCorruptionsModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, TheCorruptionsMod.MODID);
	public static final RegistryObject<Item> PIXEL_LUNA_SPAWN_EGG = REGISTRY.register("pixel_luna_spawn_egg", () -> new ForgeSpawnEggItem(TheCorruptionsModEntities.PIXEL_LUNA, -16777216, -65281, new Item.Properties()));
	public static final RegistryObject<Item> CORRUPT_ORE = block(TheCorruptionsModBlocks.CORRUPT_ORE);
	public static final RegistryObject<Item> CORRUPTED_ORB = REGISTRY.register("corrupted_orb", () -> new CorruptedOrbItem());
	public static final RegistryObject<Item> BLACK_VOXEL = REGISTRY.register("black_voxel", () -> new BlackVoxelItem());
	public static final RegistryObject<Item> YELLOW_VOXEL = REGISTRY.register("yellow_voxel", () -> new YellowVoxelItem());
	public static final RegistryObject<Item> PINK_VOXEL = REGISTRY.register("pink_voxel", () -> new PinkVoxelItem());
	public static final RegistryObject<Item> CORRUPT_PIXEL_LUNA_PHASE_1_SPAWN_EGG = REGISTRY.register("corrupt_pixel_luna_phase_1_spawn_egg",
			() -> new ForgeSpawnEggItem(TheCorruptionsModEntities.CORRUPT_PIXEL_LUNA_PHASE_1, -13434829, -3407668, new Item.Properties()));

	// Start of user code block custom items
	// End of user code block custom items
	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}

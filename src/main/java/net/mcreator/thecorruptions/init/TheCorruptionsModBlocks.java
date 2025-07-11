
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.thecorruptions.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.thecorruptions.block.CorruptOreBlock;
import net.mcreator.thecorruptions.TheCorruptionsMod;

public class TheCorruptionsModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, TheCorruptionsMod.MODID);
	public static final RegistryObject<Block> CORRUPT_ORE = REGISTRY.register("corrupt_ore", () -> new CorruptOreBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}

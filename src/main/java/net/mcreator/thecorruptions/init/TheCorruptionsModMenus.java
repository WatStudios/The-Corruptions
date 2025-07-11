
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.thecorruptions.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.mcreator.thecorruptions.TheCorruptionsMod;

public class TheCorruptionsModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, TheCorruptionsMod.MODID);
	public static final RegistryObject<MenuType<CatraftingtableMenu>> CATRAFTINGTABLE = REGISTRY.register("catraftingtable", () -> IForgeMenuType.create(CatraftingtableMenu::new));
}

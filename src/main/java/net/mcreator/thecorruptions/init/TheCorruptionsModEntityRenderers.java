
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.thecorruptions.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.thecorruptions.client.renderer.PixelLunaRenderer;
import net.mcreator.thecorruptions.client.renderer.CorruptPixelLunaPhase1Renderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class TheCorruptionsModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(TheCorruptionsModEntities.PIXEL_LUNA.get(), PixelLunaRenderer::new);
		event.registerEntityRenderer(TheCorruptionsModEntities.CORRUPT_PIXEL_LUNA_PHASE_1.get(), CorruptPixelLunaPhase1Renderer::new);
	}
}

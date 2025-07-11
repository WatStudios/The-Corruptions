
package net.mcreator.thecorruptions.client.renderer;

import software.bernie.geckolib.renderer.GeoEntityRenderer;
import software.bernie.geckolib.cache.object.BakedGeoModel;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.thecorruptions.entity.model.CorruptPixelLunaPhase1Model;
import net.mcreator.thecorruptions.entity.CorruptPixelLunaPhase1Entity;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class CorruptPixelLunaPhase1Renderer extends GeoEntityRenderer<CorruptPixelLunaPhase1Entity> {
	public CorruptPixelLunaPhase1Renderer(EntityRendererProvider.Context renderManager) {
		super(renderManager, new CorruptPixelLunaPhase1Model());
		this.shadowRadius = 0.3f;
	}

	@Override
	public RenderType getRenderType(CorruptPixelLunaPhase1Entity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}

	@Override
	public void preRender(PoseStack poseStack, CorruptPixelLunaPhase1Entity entity, BakedGeoModel model, MultiBufferSource bufferSource, VertexConsumer buffer, boolean isReRender, float partialTick, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		float scale = 1f;
		this.scaleHeight = scale;
		this.scaleWidth = scale;
		super.preRender(poseStack, entity, model, bufferSource, buffer, isReRender, partialTick, packedLight, packedOverlay, red, green, blue, alpha);
	}
}

package net.mcreator.thecorruptions.entity.model;

import software.bernie.geckolib.model.data.EntityModelData;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.core.animation.AnimationState;
import software.bernie.geckolib.core.animatable.model.CoreGeoBone;
import software.bernie.geckolib.constant.DataTickets;

import net.minecraft.util.Mth;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.thecorruptions.entity.CorruptPixelLunaPhase1Entity;

public class CorruptPixelLunaPhase1Model extends GeoModel<CorruptPixelLunaPhase1Entity> {
	@Override
	public ResourceLocation getAnimationResource(CorruptPixelLunaPhase1Entity entity) {
		return new ResourceLocation("the_corruptions", "animations/pixelluna.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(CorruptPixelLunaPhase1Entity entity) {
		return new ResourceLocation("the_corruptions", "geo/pixelluna.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(CorruptPixelLunaPhase1Entity entity) {
		return new ResourceLocation("the_corruptions", "textures/entities/" + entity.getTexture() + ".png");
	}

	@Override
	public void setCustomAnimations(CorruptPixelLunaPhase1Entity animatable, long instanceId, AnimationState animationState) {
		CoreGeoBone head = getAnimationProcessor().getBone("head");
		if (head != null) {
			EntityModelData entityData = (EntityModelData) animationState.getData(DataTickets.ENTITY_MODEL_DATA);
			head.setRotX(entityData.headPitch() * Mth.DEG_TO_RAD);
			head.setRotY(entityData.netHeadYaw() * Mth.DEG_TO_RAD);
		}

	}
}

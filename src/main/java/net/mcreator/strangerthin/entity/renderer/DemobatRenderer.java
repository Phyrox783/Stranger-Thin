
package net.mcreator.strangerthin.entity.renderer;

import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.util.math.MathHelper;
import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.IEntityRenderer;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.IRenderTypeBuffer;

import net.mcreator.strangerthin.entity.DemobatEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class DemobatRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(DemobatEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new Modeldemobat(), 1f) {
					{
						this.addLayer(new GlowingLayer<>(this));
					}

					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("strangerthin:textures/demobat.png");
					}
				};
			});
		}
	}

	@OnlyIn(Dist.CLIENT)
	private static class GlowingLayer<T extends Entity, M extends EntityModel<T>> extends LayerRenderer<T, M> {
		public GlowingLayer(IEntityRenderer<T, M> er) {
			super(er);
		}

		public void render(MatrixStack matrixStackIn, IRenderTypeBuffer bufferIn, int packedLightIn, T entitylivingbaseIn, float limbSwing,
				float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
			IVertexBuilder ivertexbuilder = bufferIn.getBuffer(RenderType.getEyes(new ResourceLocation("strangerthin:textures/demobat.png")));
			this.getEntityModel().render(matrixStackIn, ivertexbuilder, 15728640, OverlayTexture.NO_OVERLAY, 1, 1, 1, 1);
		}
	}

	// Made with Blockbench 4.2.5
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class Modeldemobat extends EntityModel<Entity> {
		private final ModelRenderer head;
		private final ModelRenderer body;
		private final ModelRenderer body_r1;
		private final ModelRenderer rightWing;
		private final ModelRenderer rightWing_r1;
		private final ModelRenderer leftWing;
		private final ModelRenderer leftWingTip_r1;

		public Modeldemobat() {
			textureWidth = 64;
			textureHeight = 64;
			head = new ModelRenderer(this);
			head.setRotationPoint(0.0F, 0.0F, 0.0F);
			head.setTextureOffset(0, 0).addBox(-2.0F, 20.0F, -8.0F, 4.0F, 4.0F, 4.0F, 0.0F, true);
			body = new ModelRenderer(this);
			body.setRotationPoint(0.0F, 0.0F, 0.0F);
			body_r1 = new ModelRenderer(this);
			body_r1.setRotationPoint(0.0F, 21.0F, 16.0F);
			body.addChild(body_r1);
			setRotationAngle(body_r1, 1.5708F, 0.0F, 0.0F);
			body_r1.setTextureOffset(0, 34).addBox(-5.0F, -11.0F, -1.0F, 10.0F, 16.0F, 1.0F, 0.0F, true);
			body_r1.setTextureOffset(0, 16).addBox(-2.0F, -20.0F, -3.0F, 4.0F, 9.0F, 4.0F, 0.0F, true);
			rightWing = new ModelRenderer(this);
			rightWing.setRotationPoint(0.0F, 2.0F, 0.0F);
			rightWing_r1 = new ModelRenderer(this);
			rightWing_r1.setRotationPoint(0.0F, 21.0F, 16.0F);
			rightWing.addChild(rightWing_r1);
			setRotationAngle(rightWing_r1, 1.5708F, 0.0F, 0.0F);
			rightWing_r1.setTextureOffset(42, 0).addBox(2.0F, -23.0F, 1.5F, 10.0F, 16.0F, 1.0F, 0.0F, true);
			rightWing_r1.setTextureOffset(24, 16).addBox(12.0F, -23.0F, 1.5F, 8.0F, 16.0F, 1.0F, 0.0F, true);
			leftWing = new ModelRenderer(this);
			leftWing.setRotationPoint(0.0F, 2.0F, 0.0F);
			leftWingTip_r1 = new ModelRenderer(this);
			leftWingTip_r1.setRotationPoint(0.0F, 21.0F, 16.0F);
			leftWing.addChild(leftWingTip_r1);
			setRotationAngle(leftWingTip_r1, 1.5708F, 0.0F, 0.0F);
			leftWingTip_r1.setTextureOffset(24, 16).addBox(-20.0F, -23.0F, 1.5F, 8.0F, 16.0F, 1.0F, 0.0F, false);
			leftWingTip_r1.setTextureOffset(42, 0).addBox(-12.0F, -23.0F, 1.5F, 10.0F, 16.0F, 1.0F, 0.0F, false);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			head.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
			body.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
			rightWing.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
			leftWing.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}

		public void setRotationAngles(Entity e, float f, float f1, float f2, float f3, float f4) {
			this.leftWing.rotateAngleZ = MathHelper.cos(f * 0.6662F) * f1;
			this.rightWing.rotateAngleZ = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
		}
	}

}

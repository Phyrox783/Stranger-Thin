
package net.mcreator.strangerthin.entity.renderer;

import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

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

import net.mcreator.strangerthin.entity.MindflayerEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class MindflayerRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(MindflayerEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new Modelmindflayer(), 5f) {
					{
						this.addLayer(new GlowingLayer<>(this));
					}

					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("strangerthin:textures/mindflayer.png");
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
			IVertexBuilder ivertexbuilder = bufferIn.getBuffer(RenderType.getEyes(new ResourceLocation("strangerthin:textures/mindflayer.png")));
			this.getEntityModel().render(matrixStackIn, ivertexbuilder, 15728640, OverlayTexture.NO_OVERLAY, 1, 1, 1, 1);
		}
	}

	// Made with Blockbench 4.2.5
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class Modelmindflayer extends EntityModel<Entity> {
		private final ModelRenderer head;
		private final ModelRenderer cube_r1;
		private final ModelRenderer cube_r2;
		private final ModelRenderer body;
		private final ModelRenderer rightarm;
		private final ModelRenderer cube_r3;
		private final ModelRenderer cube_r4;
		private final ModelRenderer cube_r5;
		private final ModelRenderer cube_r6;
		private final ModelRenderer cube_r7;
		private final ModelRenderer cube_r8;
		private final ModelRenderer cube_r9;
		private final ModelRenderer cube_r10;
		private final ModelRenderer cube_r11;
		private final ModelRenderer cube_r12;
		private final ModelRenderer cube_r13;
		private final ModelRenderer cube_r14;
		private final ModelRenderer leftarm;
		private final ModelRenderer cube_r15;
		private final ModelRenderer cube_r16;
		private final ModelRenderer cube_r17;
		private final ModelRenderer cube_r18;
		private final ModelRenderer cube_r19;
		private final ModelRenderer cube_r20;
		private final ModelRenderer cube_r21;
		private final ModelRenderer cube_r22;
		private final ModelRenderer cube_r23;
		private final ModelRenderer cube_r24;
		private final ModelRenderer cube_r25;
		private final ModelRenderer cube_r26;
		private final ModelRenderer rightleg;
		private final ModelRenderer cube_r27;
		private final ModelRenderer cube_r28;
		private final ModelRenderer cube_r29;
		private final ModelRenderer cube_r30;
		private final ModelRenderer cube_r31;
		private final ModelRenderer cube_r32;
		private final ModelRenderer cube_r33;
		private final ModelRenderer cube_r34;
		private final ModelRenderer cube_r35;
		private final ModelRenderer cube_r36;
		private final ModelRenderer cube_r37;
		private final ModelRenderer cube_r38;
		private final ModelRenderer leftleg;
		private final ModelRenderer leftarm2;
		private final ModelRenderer cube_r39;
		private final ModelRenderer cube_r40;
		private final ModelRenderer cube_r41;
		private final ModelRenderer cube_r42;
		private final ModelRenderer cube_r43;
		private final ModelRenderer cube_r44;
		private final ModelRenderer cube_r45;
		private final ModelRenderer cube_r46;
		private final ModelRenderer cube_r47;
		private final ModelRenderer cube_r48;
		private final ModelRenderer cube_r49;
		private final ModelRenderer cube_r50;

		public Modelmindflayer() {
			textureWidth = 64;
			textureHeight = 64;
			head = new ModelRenderer(this);
			head.setRotationPoint(0.0F, 24.0F, 0.0F);
			head.setTextureOffset(0, 5).addBox(-443.2F, -468.4F, 0.0F, 40.0F, 40.0F, 20.0F, 0.0F, false);
			head.setTextureOffset(32, 29).addBox(-464.04F, -488.56F, -20.16F, 81.0F, 40.0F, 60.0F, 0.0F, false);
			head.setTextureOffset(21, 14).addBox(-483.88F, -508.72F, -40.32F, 121.0F, 40.0F, 101.0F, 0.0F, false);
			head.setTextureOffset(0, 14).addBox(-503.72F, -610.04F, -60.48F, 161.0F, 101.0F, 141.0F, 0.0F, false);
			head.setTextureOffset(0, 14).addBox(-362.92F, -610.04F, -40.32F, 121.0F, 101.0F, 101.0F, 0.0F, false);
			head.setTextureOffset(0, 14).addBox(-302.08F, -610.04F, -60.48F, 40.0F, 101.0F, 141.0F, 0.0F, false);
			head.setTextureOffset(23, 21).addBox(-493.8F, -669.84F, -40.32F, 141.0F, 60.0F, 101.0F, 0.0F, false);
			head.setTextureOffset(0, 26).addBox(-463.88F, -730.32F, -30.24F, 101.0F, 60.0F, 81.0F, 0.0F, false);
			cube_r1 = new ModelRenderer(this);
			cube_r1.setRotationPoint(-201.6F, -246.96F, 0.0F);
			head.addChild(cube_r1);
			setRotationAngle(cube_r1, 0.0F, 0.0F, 0.2618F);
			cube_r1.setTextureOffset(0, 0).addBox(-342.4F, -625.32F, 0.0F, 40.0F, 81.0F, 20.0F, 0.0F, false);
			cube_r1.setTextureOffset(0, 33).addBox(-352.32F, -544.68F, -10.08F, 60.0F, 81.0F, 40.0F, 0.0F, false);
			cube_r2 = new ModelRenderer(this);
			cube_r2.setRotationPoint(-201.6F, -246.96F, 0.0F);
			head.addChild(cube_r2);
			setRotationAngle(cube_r2, 0.0F, 0.0F, 0.1309F);
			cube_r2.setTextureOffset(18, 29).addBox(-302.76F, -524.36F, -20.16F, 81.0F, 101.0F, 60.0F, 0.0F, false);
			body = new ModelRenderer(this);
			body.setRotationPoint(0.0F, 24.0F, 0.0F);
			body.setTextureOffset(0, 0).addBox(-221.88F, -670.04F, -110.88F, 363.0F, 161.0F, 242.0F, 0.0F, false);
			body.setTextureOffset(0, 0).addBox(-202.04F, -690.84F, -90.72F, 323.0F, 81.0F, 202.0F, 0.0F, false);
			body.setTextureOffset(0, 0).addBox(403.0F, -610.04F, -60.48F, 101.0F, 101.0F, 141.0F, 0.0F, false);
			body.setTextureOffset(0, 0).addBox(503.8F, -589.88F, -40.32F, 101.0F, 101.0F, 101.0F, 0.0F, false);
			body.setTextureOffset(0, 0).addBox(584.44F, -549.56F, -40.32F, 101.0F, 101.0F, 101.0F, 0.0F, false);
			body.setTextureOffset(0, 0).addBox(685.08F, -428.6F, -20.16F, 81.0F, 101.0F, 60.0F, 0.0F, false);
			body.setTextureOffset(0, 0).addBox(746.24F, -347.64F, -20.16F, 40.0F, 141.0F, 60.0F, 0.0F, false);
			body.setTextureOffset(0, 0).addBox(786.56F, -146.04F, 0.0F, 40.0F, 141.0F, 20.0F, 0.0F, false);
			body.setTextureOffset(0, 0).addBox(766.4F, -226.68F, -10.08F, 40.0F, 141.0F, 40.0F, 0.0F, false);
			body.setTextureOffset(0, 0).addBox(644.92F, -489.24F, -30.24F, 101.0F, 81.0F, 81.0F, 0.0F, false);
			body.setTextureOffset(0, 0).addBox(141.2F, -650.2F, -80.64F, 262.0F, 121.0F, 181.0F, 0.0F, false);
			body.setTextureOffset(0, 0).addBox(-262.12F, -629.88F, -90.72F, 121.0F, 141.0F, 202.0F, 0.0F, false);
			rightarm = new ModelRenderer(this);
			rightarm.setRotationPoint(0.0F, 24.0F, 221.76F);
			cube_r3 = new ModelRenderer(this);
			cube_r3.setRotationPoint(-201.6F, -246.96F, 0.0F);
			rightarm.addChild(cube_r3);
			setRotationAngle(cube_r3, 1.5272F, -0.2182F, 0.0F);
			cube_r3.setTextureOffset(0, 0).addBox(-50.28F, 292.28F, -231.84F, 141.0F, 121.0F, 101.0F, 0.0F, false);
			cube_r4 = new ModelRenderer(this);
			cube_r4.setRotationPoint(-201.6F, -246.96F, 0.0F);
			rightarm.addChild(cube_r4);
			setRotationAngle(cube_r4, 1.4835F, -0.2182F, 0.0F);
			cube_r4.setTextureOffset(0, 0).addBox(-40.36F, 302.2F, -211.68F, 121.0F, 101.0F, 181.0F, 0.0F, false);
			cube_r5 = new ModelRenderer(this);
			cube_r5.setRotationPoint(-201.6F, -246.96F, 0.0F);
			rightarm.addChild(cube_r5);
			setRotationAngle(cube_r5, 1.5708F, 2.4871F, 0.0F);
			cube_r5.setTextureOffset(0, 0).addBox(-282.28F, -655.24F, -252.0F, 121.0F, 121.0F, 81.0F, 0.0F, false);
			cube_r5.setTextureOffset(0, 0).addBox(-272.36F, -645.32F, -171.36F, 101.0F, 101.0F, 81.0F, 0.0F, false);
			cube_r6 = new ModelRenderer(this);
			cube_r6.setRotationPoint(-201.6F, -246.96F, 0.0F);
			rightarm.addChild(cube_r6);
			setRotationAngle(cube_r6, 1.5708F, -1.8762F, 0.0F);
			cube_r6.setTextureOffset(0, 0).addBox(443.48F, -252.04F, -252.0F, 121.0F, 121.0F, 81.0F, 0.0F, false);
			cube_r6.setTextureOffset(0, 0).addBox(453.4F, -242.12F, -171.36F, 101.0F, 101.0F, 81.0F, 0.0F, false);
			cube_r7 = new ModelRenderer(this);
			cube_r7.setRotationPoint(-201.6F, -246.96F, 0.0F);
			rightarm.addChild(cube_r7);
			setRotationAngle(cube_r7, 1.0036F, -1.8762F, 0.0F);
			cube_r7.setTextureOffset(0, 0).addBox(453.4F, -141.48F, -191.52F, 101.0F, 81.0F, 161.0F, 0.0F, false);
			cube_r8 = new ModelRenderer(this);
			cube_r8.setRotationPoint(-201.6F, -246.96F, 0.0F);
			rightarm.addChild(cube_r8);
			setRotationAngle(cube_r8, 1.0036F, 2.4871F, 0.0F);
			cube_r8.setTextureOffset(0, 0).addBox(-272.36F, -484.2F, -433.44F, 101.0F, 81.0F, 202.0F, 0.0F, false);
			cube_r9 = new ModelRenderer(this);
			cube_r9.setRotationPoint(-201.6F, -246.96F, 0.0F);
			rightarm.addChild(cube_r9);
			setRotationAngle(cube_r9, 0.7854F, -0.2182F, 0.0F);
			cube_r9.setTextureOffset(0, 0).addBox(-30.44F, 261.72F, 171.36F, 101.0F, 81.0F, 202.0F, 0.0F, false);
			cube_r10 = new ModelRenderer(this);
			cube_r10.setRotationPoint(-201.6F, -246.96F, 0.0F);
			rightarm.addChild(cube_r10);
			setRotationAngle(cube_r10, -1.1781F, -0.2182F, 0.0F);
			cube_r10.setTextureOffset(0, 0).addBox(-60.36F, -615.08F, -131.04F, 141.0F, 101.0F, 81.0F, 0.0F, false);
			cube_r11 = new ModelRenderer(this);
			cube_r11.setRotationPoint(-201.6F, -246.96F, 0.0F);
			rightarm.addChild(cube_r11);
			setRotationAngle(cube_r11, -1.5708F, -0.2182F, 0.0F);
			cube_r11.setTextureOffset(0, 0).addBox(-80.2F, -594.44F, -90.72F, 181.0F, 161.0F, 60.0F, 0.0F, false);
			cube_r12 = new ModelRenderer(this);
			cube_r12.setRotationPoint(-201.6F, -246.96F, 0.0F);
			rightarm.addChild(cube_r12);
			setRotationAngle(cube_r12, -1.4399F, -0.2182F, 0.0F);
			cube_r12.setTextureOffset(0, 0).addBox(-50.44F, -564.84F, -231.84F, 121.0F, 81.0F, 141.0F, 0.0F, false);
			cube_r12.setTextureOffset(0, 0).addBox(-70.28F, -584.68F, -90.72F, 161.0F, 121.0F, 101.0F, 0.0F, false);
			cube_r13 = new ModelRenderer(this);
			cube_r13.setRotationPoint(-201.6F, -246.96F, 0.0F);
			rightarm.addChild(cube_r13);
			setRotationAngle(cube_r13, -0.5672F, -0.2182F, 0.0F);
			cube_r13.setTextureOffset(0, 0).addBox(-40.52F, -534.6F, 70.56F, 101.0F, 81.0F, 222.0F, 0.0F, false);
			cube_r13.setTextureOffset(0, 0).addBox(-50.44F, -544.52F, -131.04F, 121.0F, 101.0F, 202.0F, 0.0F, false);
			cube_r14 = new ModelRenderer(this);
			cube_r14.setRotationPoint(-201.6F, -246.96F, 0.0F);
			rightarm.addChild(cube_r14);
			setRotationAngle(cube_r14, 0.4363F, -0.2182F, 0.0F);
			cube_r14.setTextureOffset(0, 0).addBox(-50.44F, -413.32F, 181.44F, 121.0F, 121.0F, 202.0F, 0.0F, false);
			cube_r14.setTextureOffset(0, 0).addBox(-40.52F, -403.4F, 30.24F, 101.0F, 101.0F, 202.0F, 0.0F, false);
			leftarm = new ModelRenderer(this);
			leftarm.setRotationPoint(-262.08F, 24.0F, 80.64F);
			setRotationAngle(leftarm, 0.0F, -2.6616F, 0.0F);
			cube_r15 = new ModelRenderer(this);
			cube_r15.setRotationPoint(-201.6F, -241.92F, 221.76F);
			leftarm.addChild(cube_r15);
			setRotationAngle(cube_r15, 0.4363F, -0.2182F, 0.0F);
			cube_r15.setTextureOffset(0, 0).addBox(-40.52F, -407.9678F, 32.37F, 101.0F, 101.0F, 202.0F, 0.0F, false);
			cube_r15.setTextureOffset(0, 0).addBox(-50.44F, -417.8878F, 183.57F, 121.0F, 121.0F, 202.0F, 0.0F, false);
			cube_r16 = new ModelRenderer(this);
			cube_r16.setRotationPoint(-201.6F, -241.92F, 221.76F);
			leftarm.addChild(cube_r16);
			setRotationAngle(cube_r16, -0.5672F, -0.2182F, 0.0F);
			cube_r16.setTextureOffset(0, 0).addBox(-50.44F, -548.7707F, -133.748F, 121.0F, 101.0F, 202.0F, 0.0F, false);
			cube_r16.setTextureOffset(0, 0).addBox(-40.52F, -538.8507F, 67.852F, 101.0F, 81.0F, 222.0F, 0.0F, false);
			cube_r17 = new ModelRenderer(this);
			cube_r17.setRotationPoint(-201.6F, -241.92F, 221.76F);
			leftarm.addChild(cube_r17);
			setRotationAngle(cube_r17, 1.5272F, -0.2182F, 0.0F);
			cube_r17.setTextureOffset(0, 0).addBox(-50.28F, 292.0602F, -226.8048F, 141.0F, 121.0F, 101.0F, 0.0F, false);
			cube_r18 = new ModelRenderer(this);
			cube_r18.setRotationPoint(-201.6F, -241.92F, 221.76F);
			leftarm.addChild(cube_r18);
			setRotationAngle(cube_r18, 1.4835F, -0.2182F, 0.0F);
			cube_r18.setTextureOffset(0, 0).addBox(-40.36F, 301.7607F, -206.6592F, 121.0F, 101.0F, 181.0F, 0.0F, false);
			cube_r19 = new ModelRenderer(this);
			cube_r19.setRotationPoint(-201.6F, -241.92F, 221.76F);
			leftarm.addChild(cube_r19);
			setRotationAngle(cube_r19, 1.5708F, -1.8762F, 0.0F);
			cube_r19.setTextureOffset(0, 0).addBox(443.48F, -252.04F, -246.96F, 121.0F, 121.0F, 81.0F, 0.0F, false);
			cube_r19.setTextureOffset(0, 0).addBox(453.4F, -242.12F, -166.32F, 101.0F, 101.0F, 81.0F, 0.0F, false);
			cube_r20 = new ModelRenderer(this);
			cube_r20.setRotationPoint(-201.6F, -241.92F, 221.76F);
			leftarm.addChild(cube_r20);
			setRotationAngle(cube_r20, 1.0036F, -1.8762F, 0.0F);
			cube_r20.setTextureOffset(0, 0).addBox(453.4F, -144.188F, -187.2693F, 101.0F, 81.0F, 161.0F, 0.0F, false);
			cube_r21 = new ModelRenderer(this);
			cube_r21.setRotationPoint(-201.6F, -241.92F, 221.76F);
			leftarm.addChild(cube_r21);
			setRotationAngle(cube_r21, 0.7854F, -0.2182F, 0.0F);
			cube_r21.setTextureOffset(0, 0).addBox(-30.44F, 258.1562F, 174.9238F, 101.0F, 81.0F, 202.0F, 0.0F, false);
			cube_r22 = new ModelRenderer(this);
			cube_r22.setRotationPoint(-201.6F, -241.92F, 221.76F);
			leftarm.addChild(cube_r22);
			setRotationAngle(cube_r22, -1.5708F, -0.2182F, 0.0F);
			cube_r22.setTextureOffset(0, 0).addBox(-80.2F, -594.44F, -95.76F, 181.0F, 161.0F, 60.0F, 0.0F, false);
			cube_r23 = new ModelRenderer(this);
			cube_r23.setRotationPoint(-201.6F, -241.92F, 221.76F);
			leftarm.addChild(cube_r23);
			setRotationAngle(cube_r23, -1.4399F, -0.2182F, 0.0F);
			cube_r23.setTextureOffset(0, 0).addBox(-70.28F, -585.3379F, -95.7169F, 161.0F, 121.0F, 101.0F, 0.0F, false);
			cube_r23.setTextureOffset(0, 0).addBox(-50.44F, -565.4979F, -236.8369F, 121.0F, 81.0F, 141.0F, 0.0F, false);
			cube_r24 = new ModelRenderer(this);
			cube_r24.setRotationPoint(-201.6F, -241.92F, 221.76F);
			leftarm.addChild(cube_r24);
			setRotationAngle(cube_r24, -1.1781F, -0.2182F, 0.0F);
			cube_r24.setTextureOffset(0, 0).addBox(-60.36F, -617.0087F, -135.6964F, 141.0F, 101.0F, 81.0F, 0.0F, false);
			cube_r25 = new ModelRenderer(this);
			cube_r25.setRotationPoint(-201.6F, -241.92F, 221.76F);
			leftarm.addChild(cube_r25);
			setRotationAngle(cube_r25, 1.5708F, 2.4871F, 0.0F);
			cube_r25.setTextureOffset(0, 0).addBox(-272.36F, -645.32F, -166.32F, 101.0F, 101.0F, 81.0F, 0.0F, false);
			cube_r25.setTextureOffset(0, 0).addBox(-282.28F, -655.24F, -246.96F, 121.0F, 121.0F, 81.0F, 0.0F, false);
			cube_r26 = new ModelRenderer(this);
			cube_r26.setRotationPoint(-201.6F, -241.92F, 221.76F);
			leftarm.addChild(cube_r26);
			setRotationAngle(cube_r26, 1.0036F, 2.4871F, 0.0F);
			cube_r26.setTextureOffset(0, 0).addBox(-272.36F, -486.908F, -429.1893F, 101.0F, 81.0F, 202.0F, 0.0F, false);
			rightleg = new ModelRenderer(this);
			rightleg.setRotationPoint(161.28F, 24.0F, -100.8F);
			setRotationAngle(rightleg, 0.0F, 0.829F, 0.0F);
			cube_r27 = new ModelRenderer(this);
			cube_r27.setRotationPoint(-201.6F, -241.92F, 221.76F);
			rightleg.addChild(cube_r27);
			setRotationAngle(cube_r27, 1.0036F, -1.8762F, 0.0F);
			cube_r27.setTextureOffset(0, 0).addBox(453.4F, -144.188F, -187.2693F, 101.0F, 81.0F, 161.0F, 0.0F, false);
			cube_r28 = new ModelRenderer(this);
			cube_r28.setRotationPoint(-201.6F, -241.92F, 221.76F);
			rightleg.addChild(cube_r28);
			setRotationAngle(cube_r28, 0.4363F, -0.2182F, 0.0F);
			cube_r28.setTextureOffset(0, 0).addBox(-50.44F, -417.8878F, 183.57F, 121.0F, 121.0F, 202.0F, 0.0F, false);
			cube_r28.setTextureOffset(0, 0).addBox(-40.52F, -407.9678F, 32.37F, 101.0F, 101.0F, 202.0F, 0.0F, false);
			cube_r29 = new ModelRenderer(this);
			cube_r29.setRotationPoint(-201.6F, -241.92F, 221.76F);
			rightleg.addChild(cube_r29);
			setRotationAngle(cube_r29, -0.5672F, -0.2182F, 0.0F);
			cube_r29.setTextureOffset(0, 0).addBox(-50.44F, -548.7707F, -133.748F, 121.0F, 101.0F, 202.0F, 0.0F, false);
			cube_r29.setTextureOffset(0, 0).addBox(-40.52F, -538.8507F, 67.852F, 101.0F, 81.0F, 222.0F, 0.0F, false);
			cube_r30 = new ModelRenderer(this);
			cube_r30.setRotationPoint(-201.6F, -241.92F, 221.76F);
			rightleg.addChild(cube_r30);
			setRotationAngle(cube_r30, -1.4399F, -0.2182F, 0.0F);
			cube_r30.setTextureOffset(0, 0).addBox(-50.44F, -565.4979F, -236.8369F, 121.0F, 81.0F, 141.0F, 0.0F, false);
			cube_r30.setTextureOffset(0, 0).addBox(-70.28F, -585.3379F, -95.7169F, 161.0F, 121.0F, 101.0F, 0.0F, false);
			cube_r31 = new ModelRenderer(this);
			cube_r31.setRotationPoint(-201.6F, -241.92F, 221.76F);
			rightleg.addChild(cube_r31);
			setRotationAngle(cube_r31, -1.1781F, -0.2182F, 0.0F);
			cube_r31.setTextureOffset(0, 0).addBox(-60.36F, -617.0087F, -135.6964F, 141.0F, 101.0F, 81.0F, 0.0F, false);
			cube_r32 = new ModelRenderer(this);
			cube_r32.setRotationPoint(-201.6F, -241.92F, 221.76F);
			rightleg.addChild(cube_r32);
			setRotationAngle(cube_r32, 1.5708F, -1.8762F, 0.0F);
			cube_r32.setTextureOffset(0, 0).addBox(443.48F, -252.04F, -246.96F, 121.0F, 121.0F, 81.0F, 0.0F, false);
			cube_r32.setTextureOffset(0, 0).addBox(453.4F, -242.12F, -166.32F, 101.0F, 101.0F, 81.0F, 0.0F, false);
			cube_r33 = new ModelRenderer(this);
			cube_r33.setRotationPoint(-201.6F, -241.92F, 221.76F);
			rightleg.addChild(cube_r33);
			setRotationAngle(cube_r33, 1.5708F, 2.4871F, 0.0F);
			cube_r33.setTextureOffset(0, 0).addBox(-282.28F, -655.24F, -246.96F, 121.0F, 121.0F, 81.0F, 0.0F, false);
			cube_r33.setTextureOffset(0, 0).addBox(-272.36F, -645.32F, -166.32F, 101.0F, 101.0F, 81.0F, 0.0F, false);
			cube_r34 = new ModelRenderer(this);
			cube_r34.setRotationPoint(-201.6F, -241.92F, 221.76F);
			rightleg.addChild(cube_r34);
			setRotationAngle(cube_r34, 1.0036F, 2.4871F, 0.0F);
			cube_r34.setTextureOffset(0, 0).addBox(-272.36F, -486.908F, -429.1893F, 101.0F, 81.0F, 202.0F, 0.0F, false);
			cube_r35 = new ModelRenderer(this);
			cube_r35.setRotationPoint(-201.6F, -241.92F, 221.76F);
			rightleg.addChild(cube_r35);
			setRotationAngle(cube_r35, 1.5272F, -0.2182F, 0.0F);
			cube_r35.setTextureOffset(0, 0).addBox(-50.28F, 292.0602F, -226.8048F, 141.0F, 121.0F, 101.0F, 0.0F, false);
			cube_r36 = new ModelRenderer(this);
			cube_r36.setRotationPoint(-201.6F, -241.92F, 221.76F);
			rightleg.addChild(cube_r36);
			setRotationAngle(cube_r36, -1.5708F, -0.2182F, 0.0F);
			cube_r36.setTextureOffset(0, 0).addBox(-80.2F, -594.44F, -95.76F, 181.0F, 161.0F, 60.0F, 0.0F, false);
			cube_r37 = new ModelRenderer(this);
			cube_r37.setRotationPoint(-201.6F, -241.92F, 221.76F);
			rightleg.addChild(cube_r37);
			setRotationAngle(cube_r37, 1.4835F, -0.2182F, 0.0F);
			cube_r37.setTextureOffset(0, 0).addBox(-40.36F, 301.7607F, -206.6592F, 121.0F, 101.0F, 181.0F, 0.0F, false);
			cube_r38 = new ModelRenderer(this);
			cube_r38.setRotationPoint(-201.6F, -241.92F, 221.76F);
			rightleg.addChild(cube_r38);
			setRotationAngle(cube_r38, 0.7854F, -0.2182F, 0.0F);
			cube_r38.setTextureOffset(0, 0).addBox(-30.44F, 258.1562F, 174.9238F, 101.0F, 81.0F, 202.0F, 0.0F, false);
			leftleg = new ModelRenderer(this);
			leftleg.setRotationPoint(0.0F, 24.0F, 0.0F);
			setRotationAngle(leftleg, 0.0F, -0.7418F, 0.0F);
			leftarm2 = new ModelRenderer(this);
			leftarm2.setRotationPoint(-262.08F, 0.0F, 80.64F);
			leftleg.addChild(leftarm2);
			setRotationAngle(leftarm2, 0.0F, -2.6616F, 0.0F);
			cube_r39 = new ModelRenderer(this);
			cube_r39.setRotationPoint(-423.36F, -241.92F, 201.6F);
			leftarm2.addChild(cube_r39);
			setRotationAngle(cube_r39, 0.4363F, -0.2182F, 0.0F);
			cube_r39.setTextureOffset(0, 0).addBox(-40.52F, -407.9678F, 32.37F, 101.0F, 101.0F, 202.0F, 0.0F, false);
			cube_r39.setTextureOffset(0, 0).addBox(-50.44F, -417.8878F, 183.57F, 121.0F, 121.0F, 202.0F, 0.0F, false);
			cube_r40 = new ModelRenderer(this);
			cube_r40.setRotationPoint(-423.36F, -241.92F, 201.6F);
			leftarm2.addChild(cube_r40);
			setRotationAngle(cube_r40, -0.5672F, -0.2182F, 0.0F);
			cube_r40.setTextureOffset(0, 0).addBox(-50.44F, -548.7707F, -133.748F, 121.0F, 101.0F, 202.0F, 0.0F, false);
			cube_r40.setTextureOffset(0, 0).addBox(-40.52F, -538.8507F, 67.852F, 101.0F, 81.0F, 222.0F, 0.0F, false);
			cube_r41 = new ModelRenderer(this);
			cube_r41.setRotationPoint(-423.36F, -241.92F, 201.6F);
			leftarm2.addChild(cube_r41);
			setRotationAngle(cube_r41, 1.5272F, -0.2182F, 0.0F);
			cube_r41.setTextureOffset(0, 0).addBox(-50.28F, 292.0602F, -226.8048F, 141.0F, 121.0F, 101.0F, 0.0F, false);
			cube_r42 = new ModelRenderer(this);
			cube_r42.setRotationPoint(-423.36F, -241.92F, 201.6F);
			leftarm2.addChild(cube_r42);
			setRotationAngle(cube_r42, 1.4835F, -0.2182F, 0.0F);
			cube_r42.setTextureOffset(0, 0).addBox(-40.36F, 301.7607F, -206.6592F, 121.0F, 101.0F, 181.0F, 0.0F, false);
			cube_r43 = new ModelRenderer(this);
			cube_r43.setRotationPoint(-423.36F, -241.92F, 201.6F);
			leftarm2.addChild(cube_r43);
			setRotationAngle(cube_r43, 1.5708F, -1.8762F, 0.0F);
			cube_r43.setTextureOffset(0, 0).addBox(443.48F, -252.04F, -246.96F, 121.0F, 121.0F, 81.0F, 0.0F, false);
			cube_r43.setTextureOffset(0, 0).addBox(453.4F, -242.12F, -166.32F, 101.0F, 101.0F, 81.0F, 0.0F, false);
			cube_r44 = new ModelRenderer(this);
			cube_r44.setRotationPoint(-423.36F, -241.92F, 201.6F);
			leftarm2.addChild(cube_r44);
			setRotationAngle(cube_r44, 1.0036F, -1.8762F, 0.0F);
			cube_r44.setTextureOffset(0, 0).addBox(453.4F, -144.188F, -187.2693F, 101.0F, 81.0F, 161.0F, 0.0F, false);
			cube_r45 = new ModelRenderer(this);
			cube_r45.setRotationPoint(-423.36F, -241.92F, 201.6F);
			leftarm2.addChild(cube_r45);
			setRotationAngle(cube_r45, 0.7854F, -0.2182F, 0.0F);
			cube_r45.setTextureOffset(0, 0).addBox(-30.44F, 258.1562F, 174.9238F, 101.0F, 81.0F, 202.0F, 0.0F, false);
			cube_r46 = new ModelRenderer(this);
			cube_r46.setRotationPoint(-423.36F, -241.92F, 201.6F);
			leftarm2.addChild(cube_r46);
			setRotationAngle(cube_r46, -1.5708F, -0.2182F, 0.0F);
			cube_r46.setTextureOffset(0, 0).addBox(-80.2F, -594.44F, -95.76F, 181.0F, 161.0F, 60.0F, 0.0F, false);
			cube_r47 = new ModelRenderer(this);
			cube_r47.setRotationPoint(-423.36F, -241.92F, 201.6F);
			leftarm2.addChild(cube_r47);
			setRotationAngle(cube_r47, -1.4399F, -0.2182F, 0.0F);
			cube_r47.setTextureOffset(0, 0).addBox(-70.28F, -585.3379F, -95.7169F, 161.0F, 121.0F, 101.0F, 0.0F, false);
			cube_r47.setTextureOffset(0, 0).addBox(-50.44F, -565.4979F, -236.8369F, 121.0F, 81.0F, 141.0F, 0.0F, false);
			cube_r48 = new ModelRenderer(this);
			cube_r48.setRotationPoint(-423.36F, -241.92F, 201.6F);
			leftarm2.addChild(cube_r48);
			setRotationAngle(cube_r48, -1.1781F, -0.2182F, 0.0F);
			cube_r48.setTextureOffset(0, 0).addBox(-60.36F, -617.0087F, -135.6964F, 141.0F, 101.0F, 81.0F, 0.0F, false);
			cube_r49 = new ModelRenderer(this);
			cube_r49.setRotationPoint(-423.36F, -241.92F, 201.6F);
			leftarm2.addChild(cube_r49);
			setRotationAngle(cube_r49, 1.5708F, 2.4871F, 0.0F);
			cube_r49.setTextureOffset(0, 0).addBox(-272.36F, -645.32F, -166.32F, 101.0F, 101.0F, 81.0F, 0.0F, false);
			cube_r49.setTextureOffset(0, 0).addBox(-282.28F, -655.24F, -246.96F, 121.0F, 121.0F, 81.0F, 0.0F, false);
			cube_r50 = new ModelRenderer(this);
			cube_r50.setRotationPoint(-423.36F, -241.92F, 201.6F);
			leftarm2.addChild(cube_r50);
			setRotationAngle(cube_r50, 1.0036F, 2.4871F, 0.0F);
			cube_r50.setTextureOffset(0, 0).addBox(-272.36F, -486.908F, -429.1893F, 101.0F, 81.0F, 202.0F, 0.0F, false);
		}

		@Override
		public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
			// previously the render function, render code was moved to a method below
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			head.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
			body.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
			rightarm.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
			leftarm.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
			rightleg.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
			leftleg.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}
	}

}

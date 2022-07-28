
package net.mcreator.strangerthin.entity.renderer;

import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.util.math.MathHelper;
import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.MobRenderer;

import net.mcreator.strangerthin.entity.LarvademogorgonEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class LarvademogorgonRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(LarvademogorgonEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new Modellarva(), 0.5f) {

					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("strangerthin:textures/larva.png");
					}
				};
			});
		}
	}

	public static class Modellarva extends EntityModel<Entity> {
		private final ModelRenderer head;
		private final ModelRenderer body;
		private final ModelRenderer cube_r1;
		private final ModelRenderer tail;
		private final ModelRenderer leg1;
		private final ModelRenderer cube_r2;
		private final ModelRenderer cube_r3;
		private final ModelRenderer cube_r4;
		private final ModelRenderer leg2;
		private final ModelRenderer cube_r5;
		private final ModelRenderer cube_r6;
		private final ModelRenderer cube_r7;
		private final ModelRenderer leg3;
		private final ModelRenderer cube_r8;
		private final ModelRenderer cube_r9;
		private final ModelRenderer leg4;
		private final ModelRenderer cube_r10;
		private final ModelRenderer cube_r11;

		public Modellarva() {
			textureWidth = 32;
			textureHeight = 32;
			head = new ModelRenderer(this);
			head.setRotationPoint(0.0F, 24.0F, 0.0F);
			addBoxHelper(head, 16, 8, 1.0F, -3.0F, -6.5F, 1, 1, 2, 0.0F, false);
			addBoxHelper(head, 16, 11, -1.0F, -3.0F, -6.5F, 1, 1, 2, 0.0F, false);
			addBoxHelper(head, 18, 18, 1.0F, -5.0F, -6.5F, 1, 1, 2, 0.0F, false);
			addBoxHelper(head, 0, 19, -1.0F, -5.0F, -6.5F, 1, 1, 2, 0.0F, false);
			addBoxHelper(head, 10, 15, -1.0F, -5.0F, -5.5F, 3, 3, 2, 0.0F, false);
			body = new ModelRenderer(this);
			body.setRotationPoint(0.0F, 24.0F, 0.0F);
			addBoxHelper(body, 0, 0, -1.0F, -2.0F, -1.5F, 3, 2, 5, 0.0F, false);
			addBoxHelper(body, 0, 7, 1.0F, -3.0F, -2.0F, 1, 1, 6, 0.0F, false);
			addBoxHelper(body, 8, 8, -1.0F, -3.0F, -2.0F, 1, 1, 6, 0.0F, false);
			addBoxHelper(body, 16, 5, -1.0F, -2.0F, 3.5F, 3, 2, 1, 0.0F, false);
			cube_r1 = new ModelRenderer(this);
			cube_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
			body.addChild(cube_r1);
			setRotationAngle(cube_r1, 0.2182F, 0.0F, 0.0F);
			addBoxHelper(cube_r1, 11, 0, -1.0F, -4.5F, -3.0F, 3, 3, 2, 0.0F, false);
			tail = new ModelRenderer(this);
			tail.setRotationPoint(0.0F, 24.0F, 0.0F);
			addBoxHelper(tail, 0, 14, 0.0F, -1.0F, 3.5F, 1, 1, 4, 0.0F, false);
			leg1 = new ModelRenderer(this);
			leg1.setRotationPoint(0.0F, 24.0F, 0.0F);
			cube_r2 = new ModelRenderer(this);
			cube_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
			leg1.addChild(cube_r2);
			setRotationAngle(cube_r2, 0.0F, -0.2182F, 0.0F);
			addBoxHelper(cube_r2, 0, 7, 2.5F, -1.0F, 0.0F, 1, 1, 2, 0.0F, false);
			cube_r3 = new ModelRenderer(this);
			cube_r3.setRotationPoint(0.0F, 0.0F, 0.0F);
			leg1.addChild(cube_r3);
			setRotationAngle(cube_r3, -0.6545F, -0.2182F, 0.0F);
			addBoxHelper(cube_r3, 0, 0, 2.5F, -4.5F, 0.0F, 1, 2, 1, 0.0F, false);
			cube_r4 = new ModelRenderer(this);
			cube_r4.setRotationPoint(0.0F, 0.0F, 0.0F);
			leg1.addChild(cube_r4);
			setRotationAngle(cube_r4, 0.3054F, -0.2182F, 0.0F);
			addBoxHelper(cube_r4, 0, 14, 2.5F, -1.5F, 2.0F, 1, 2, 1, 0.0F, false);
			leg2 = new ModelRenderer(this);
			leg2.setRotationPoint(0.0F, 24.0F, 0.0F);
			cube_r5 = new ModelRenderer(this);
			cube_r5.setRotationPoint(0.0F, 0.0F, 0.0F);
			leg2.addChild(cube_r5);
			setRotationAngle(cube_r5, 0.0F, 0.2182F, 0.0F);
			addBoxHelper(cube_r5, 8, 7, -2.5F, -1.0F, 0.0F, 1, 1, 2, 0.0F, false);
			cube_r6 = new ModelRenderer(this);
			cube_r6.setRotationPoint(0.0F, 0.0F, 0.0F);
			leg2.addChild(cube_r6);
			setRotationAngle(cube_r6, 0.3054F, 0.2182F, 0.0F);
			addBoxHelper(cube_r6, 6, 15, -2.5F, -1.5F, 2.0F, 1, 2, 1, 0.0F, false);
			cube_r7 = new ModelRenderer(this);
			cube_r7.setRotationPoint(0.0F, 0.0F, 0.0F);
			leg2.addChild(cube_r7);
			setRotationAngle(cube_r7, -0.6545F, 0.2182F, 0.0F);
			addBoxHelper(cube_r7, 6, 19, -2.5F, -4.5F, 0.0F, 1, 2, 1, 0.0F, false);
			leg3 = new ModelRenderer(this);
			leg3.setRotationPoint(0.0F, 24.0F, 0.0F);
			cube_r8 = new ModelRenderer(this);
			cube_r8.setRotationPoint(0.0F, 0.0F, 0.0F);
			leg3.addChild(cube_r8);
			setRotationAngle(cube_r8, 0.0F, 0.2182F, 0.0F);
			addBoxHelper(cube_r8, 0, 10, -2.0F, -1.0F, -3.0F, 1, 1, 2, 0.0F, false);
			cube_r9 = new ModelRenderer(this);
			cube_r9.setRotationPoint(0.0F, 0.0F, 0.0F);
			leg3.addChild(cube_r9);
			setRotationAngle(cube_r9, 0.1745F, 0.0F, 0.1745F);
			addBoxHelper(cube_r9, 14, 20, -2.0F, -2.0F, -1.0F, 1, 2, 1, 0.0F, false);
			leg4 = new ModelRenderer(this);
			leg4.setRotationPoint(0.0F, 24.0F, 0.0F);
			cube_r10 = new ModelRenderer(this);
			cube_r10.setRotationPoint(0.0F, 0.0F, 0.0F);
			leg4.addChild(cube_r10);
			setRotationAngle(cube_r10, 0.1745F, 0.0F, -0.1745F);
			addBoxHelper(cube_r10, 10, 20, 2.0F, -2.0F, -1.0F, 1, 2, 1, 0.0F, false);
			cube_r11 = new ModelRenderer(this);
			cube_r11.setRotationPoint(0.0F, 0.0F, 0.0F);
			leg4.addChild(cube_r11);
			setRotationAngle(cube_r11, 0.0F, -0.2182F, 0.0F);
			addBoxHelper(cube_r11, 8, 10, 2.0F, -1.0F, -3.0F, 1, 1, 2, 0.0F, false);
		}

		@Override
		public void render(MatrixStack ms, IVertexBuilder vb, int i1, int i2, float f1, float f2, float f3, float f4) {
			head.render(ms, vb, i1, i2, f1, f2, f3, f4);
			body.render(ms, vb, i1, i2, f1, f2, f3, f4);
			tail.render(ms, vb, i1, i2, f1, f2, f3, f4);
			leg1.render(ms, vb, i1, i2, f1, f2, f3, f4);
			leg2.render(ms, vb, i1, i2, f1, f2, f3, f4);
			leg3.render(ms, vb, i1, i2, f1, f2, f3, f4);
			leg4.render(ms, vb, i1, i2, f1, f2, f3, f4);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}

		public void setRotationAngles(Entity e, float f, float f1, float f2, float f3, float f4) {

			this.tail.rotateAngleZ = f3 / (180F / (float) Math.PI);
			this.head.rotateAngleY = f3 / (180F / (float) Math.PI);
			this.head.rotateAngleX = f4 / (180F / (float) Math.PI);
			this.leg1.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
			this.leg4.rotateAngleY = MathHelper.cos(f * 1.0F) * -1.0F * f1;
			this.leg2.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
			this.leg3.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		}
	}

	@OnlyIn(Dist.CLIENT)
	public static void addBoxHelper(ModelRenderer renderer, int texU, int texV, float x, float y, float z, int dx, int dy, int dz, float delta) {
		addBoxHelper(renderer, texU, texV, x, y, z, dx, dy, dz, delta, renderer.mirror);
	}

	@OnlyIn(Dist.CLIENT)
	public static void addBoxHelper(ModelRenderer renderer, int texU, int texV, float x, float y, float z, int dx, int dy, int dz, float delta,
			boolean mirror) {
		renderer.mirror = mirror;
		renderer.addBox("", x, y, z, dx, dy, dz, delta, texU, texV);
	}
}


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

import net.mcreator.strangerthin.entity.DemodogEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class DemodogRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(DemodogEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new Modelwolf(), 1f) {

					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("strangerthin:textures/wolf.png");
					}
				};
			});
		}
	}

	public static class Modelwolf extends EntityModel<Entity> {
		private final ModelRenderer head;
		private final ModelRenderer body;
		private final ModelRenderer upperBody;
		private final ModelRenderer leg0;
		private final ModelRenderer leg1;
		private final ModelRenderer leg2;
		private final ModelRenderer leg3;
		private final ModelRenderer tail;
		private final ModelRenderer bodyb2;
		private final ModelRenderer headb2;
		private final ModelRenderer arm0;
		private final ModelRenderer arm1;
		private final ModelRenderer leg0b;
		private final ModelRenderer leg1b2;
		private final ModelRenderer headb;
		private final ModelRenderer head_r1;
		private final ModelRenderer head_r2;
		private final ModelRenderer head_r3;
		private final ModelRenderer head_r4;
		private final ModelRenderer head_r5;
		private final ModelRenderer bodyb;
		private final ModelRenderer upperBodyb;
		private final ModelRenderer leg1b;
		private final ModelRenderer cube_r1;
		private final ModelRenderer cube_r2;
		private final ModelRenderer leg1_r1;
		private final ModelRenderer leg2b;
		private final ModelRenderer leg1_r2;
		private final ModelRenderer cube_r3;
		private final ModelRenderer cube_r4;
		private final ModelRenderer leg3b;
		private final ModelRenderer leg1_r3;
		private final ModelRenderer cube_r5;
		private final ModelRenderer cube_r6;
		private final ModelRenderer tailb;
		private final ModelRenderer tail_r1;
		private final ModelRenderer leg4b;
		private final ModelRenderer cube_r7;
		private final ModelRenderer cube_r8;
		private final ModelRenderer leg1_r4;

		public Modelwolf() {
			textureWidth = 64;
			textureHeight = 32;
			head = new ModelRenderer(this);
			head.setRotationPoint(1.0F, 13.5F, -7.0F);
			body = new ModelRenderer(this);
			body.setRotationPoint(0.0F, 14.0F, 2.0F);
			upperBody = new ModelRenderer(this);
			upperBody.setRotationPoint(1.0F, 14.0F, 2.0F);
			leg0 = new ModelRenderer(this);
			leg0.setRotationPoint(2.5F, 16.0F, 7.0F);
			leg1 = new ModelRenderer(this);
			leg1.setRotationPoint(-0.5F, 16.0F, 7.0F);
			leg2 = new ModelRenderer(this);
			leg2.setRotationPoint(2.5F, 16.0F, -4.0F);
			leg3 = new ModelRenderer(this);
			leg3.setRotationPoint(-0.5F, 16.0F, -4.0F);
			tail = new ModelRenderer(this);
			tail.setRotationPoint(1.0F, 12.0F, 8.0F);
			bodyb2 = new ModelRenderer(this);
			bodyb2.setRotationPoint(0.0F, -7.0F, 0.0F);
			headb2 = new ModelRenderer(this);
			headb2.setRotationPoint(0.0F, -7.0F, -2.0F);
			arm0 = new ModelRenderer(this);
			arm0.setRotationPoint(0.0F, -7.0F, 0.0F);
			arm1 = new ModelRenderer(this);
			arm1.setRotationPoint(0.0F, -7.0F, 0.0F);
			leg0b = new ModelRenderer(this);
			leg0b.setRotationPoint(4.0F, 11.0F, 0.0F);
			leg1b2 = new ModelRenderer(this);
			leg1b2.setRotationPoint(-5.0F, 11.0F, 0.0F);
			headb = new ModelRenderer(this);
			headb.setRotationPoint(1.0F, 13.5F, -7.0F);
			addBoxHelper(headb, 0, 0, -3.0F, -3.0F, -2.0F, 6, 6, 4, 0.0F, true);
			head_r1 = new ModelRenderer(this);
			head_r1.setRotationPoint(-1.0F, 10.5F, 7.0F);
			headb.addChild(head_r1);
			setRotationAngle(head_r1, -0.6981F, 0.0F, 0.0F);
			addBoxHelper(head_r1, 0, 10, -0.5F, -4.52F, -19.0F, 3, 1, 4, 0.0F, true);
			head_r2 = new ModelRenderer(this);
			head_r2.setRotationPoint(-1.0F, 10.5F, 7.0F);
			headb.addChild(head_r2);
			setRotationAngle(head_r2, -0.3927F, -0.0436F, 0.48F);
			addBoxHelper(head_r2, 16, 14, -7.0F, -2.5F, -11.0F, 3, 4, 1, 0.0F, true);
			head_r3 = new ModelRenderer(this);
			head_r3.setRotationPoint(-1.0F, 10.5F, 7.0F);
			headb.addChild(head_r3);
			setRotationAngle(head_r3, -0.3927F, -0.0436F, 2.2689F);
			addBoxHelper(head_r3, 16, 14, -9.0F, 10.5F, -5.0F, 3, 4, 1, 0.0F, true);
			head_r4 = new ModelRenderer(this);
			head_r4.setRotationPoint(-1.0F, 10.5F, 7.0F);
			headb.addChild(head_r4);
			setRotationAngle(head_r4, -0.3927F, -0.0436F, -2.2689F);
			addBoxHelper(head_r4, 16, 14, 4.0F, 12.5F, -5.0F, 3, 4, 1, 0.0F, true);
			head_r5 = new ModelRenderer(this);
			head_r5.setRotationPoint(-1.0F, 10.5F, 7.0F);
			headb.addChild(head_r5);
			setRotationAngle(head_r5, -0.3927F, -0.0436F, -0.48F);
			addBoxHelper(head_r5, 16, 14, 5.0F, -1.5F, -11.0F, 3, 4, 1, 0.0F, true);
			bodyb = new ModelRenderer(this);
			bodyb.setRotationPoint(0.0F, 14.0F, 2.0F);
			addBoxHelper(bodyb, 42, 16, -2.0F, 0.0F, 2.0F, 6, 3, 5, 0.0F, true);
			addBoxHelper(bodyb, 24, 2, -2.0F, 0.0F, -2.0F, 6, 2, 5, 0.0F, false);
			addBoxHelper(bodyb, 24, 2, -2.0F, 0.0F, -7.0F, 6, 4, 6, 0.0F, false);
			upperBodyb = new ModelRenderer(this);
			upperBodyb.setRotationPoint(1.0F, 14.0F, 2.0F);
			addBoxHelper(upperBodyb, 21, 2, -4.0F, -2.0F, -5.0F, 8, 4, 6, 0.0F, true);
			addBoxHelper(upperBodyb, 0, 0, -3.0F, -1.0F, 1.0F, 6, 1, 2, 0.0F, false);
			leg1b = new ModelRenderer(this);
			leg1b.setRotationPoint(-0.5F, 16.0F, 7.0F);
			addBoxHelper(leg1b, 0, 0, -3.0F, 7.0F, -4.0F, 2, 1, 3, 0.0F, false);
			cube_r1 = new ModelRenderer(this);
			cube_r1.setRotationPoint(1.0F, 0.0F, 0.0F);
			leg1b.addChild(cube_r1);
			setRotationAngle(cube_r1, -0.48F, 0.0F, 0.0F);
			addBoxHelper(cube_r1, 0, 0, -4.0F, 3.0F, 1.0F, 2, 4, 2, 0.0F, false);
			cube_r2 = new ModelRenderer(this);
			cube_r2.setRotationPoint(1.0F, 0.0F, 0.0F);
			leg1b.addChild(cube_r2);
			setRotationAngle(cube_r2, 1.0036F, 0.0F, 0.0F);
			addBoxHelper(cube_r2, 56, 17, -4.0F, -2.0F, -5.0F, 2, 5, 2, 0.0F, false);
			leg1_r1 = new ModelRenderer(this);
			leg1_r1.setRotationPoint(1.5F, 8.0F, -7.0F);
			leg1b.addChild(leg1_r1);
			setRotationAngle(leg1_r1, -0.48F, 0.0F, 0.0F);
			addBoxHelper(leg1_r1, 0, 18, -4.5F, -12.0F, 0.0F, 2, 6, 2, 0.0F, true);
			leg2b = new ModelRenderer(this);
			leg2b.setRotationPoint(2.5F, 16.0F, -4.0F);
			addBoxHelper(leg2b, 0, 0, 1.0F, 7.0F, -4.0F, 2, 1, 3, 0.0F, false);
			leg1_r2 = new ModelRenderer(this);
			leg1_r2.setRotationPoint(5.5F, 8.0F, -4.0F);
			leg2b.addChild(leg1_r2);
			setRotationAngle(leg1_r2, -0.3054F, 0.0F, 0.0F);
			addBoxHelper(leg1_r2, 0, 18, -4.5F, -12.0F, 3.0F, 2, 6, 2, 0.0F, true);
			cube_r3 = new ModelRenderer(this);
			cube_r3.setRotationPoint(5.0F, 0.0F, 3.0F);
			leg2b.addChild(cube_r3);
			setRotationAngle(cube_r3, -0.2182F, 0.0F, 0.0F);
			addBoxHelper(cube_r3, 0, 0, -4.0F, 4.0F, -4.0F, 2, 4, 2, 0.0F, false);
			cube_r4 = new ModelRenderer(this);
			cube_r4.setRotationPoint(5.0F, 0.0F, 3.0F);
			leg2b.addChild(cube_r4);
			setRotationAngle(cube_r4, 1.9635F, 0.0F, 0.0F);
			addBoxHelper(cube_r4, 0, 0, -4.0F, -6.0F, -3.0F, 2, 5, 2, 0.0F, false);
			leg3b = new ModelRenderer(this);
			leg3b.setRotationPoint(-0.5F, 16.0F, -4.0F);
			addBoxHelper(leg3b, 0, 0, -3.0F, 7.0F, -4.0F, 2, 1, 3, 0.0F, false);
			leg1_r3 = new ModelRenderer(this);
			leg1_r3.setRotationPoint(1.5F, 8.0F, -4.0F);
			leg3b.addChild(leg1_r3);
			setRotationAngle(leg1_r3, -0.3054F, 0.0F, 0.0F);
			addBoxHelper(leg1_r3, 0, 18, -4.5F, -12.0F, 3.0F, 2, 6, 2, 0.0F, true);
			cube_r5 = new ModelRenderer(this);
			cube_r5.setRotationPoint(1.0F, 0.0F, 3.0F);
			leg3b.addChild(cube_r5);
			setRotationAngle(cube_r5, -0.2182F, 0.0F, 0.0F);
			addBoxHelper(cube_r5, 0, 0, -4.0F, 4.0F, -4.0F, 2, 4, 2, 0.0F, false);
			cube_r6 = new ModelRenderer(this);
			cube_r6.setRotationPoint(1.0F, 0.0F, 3.0F);
			leg3b.addChild(cube_r6);
			setRotationAngle(cube_r6, 1.9635F, 0.0F, 0.0F);
			addBoxHelper(cube_r6, 56, 25, -4.0F, -6.0F, -3.0F, 2, 5, 2, 0.0F, false);
			tailb = new ModelRenderer(this);
			tailb.setRotationPoint(1.0F, 12.0F, 8.0F);
			tail_r1 = new ModelRenderer(this);
			tail_r1.setRotationPoint(-1.0F, 12.0F, -8.0F);
			tailb.addChild(tail_r1);
			setRotationAngle(tail_r1, 1.2654F, 0.0F, 0.0F);
			addBoxHelper(tail_r1, 11, 4, 0.0F, 5.0F, 9.0F, 2, 4, 2, 0.0F, true);
			leg4b = new ModelRenderer(this);
			leg4b.setRotationPoint(7.0F, 24.0F, 0.0F);
			addBoxHelper(leg4b, 0, 0, -3.5F, -1.0F, 3.0F, 2, 1, 3, 0.0F, false);
			cube_r7 = new ModelRenderer(this);
			cube_r7.setRotationPoint(0.5F, -8.0F, 7.0F);
			leg4b.addChild(cube_r7);
			setRotationAngle(cube_r7, 1.0036F, 0.0F, 0.0F);
			addBoxHelper(cube_r7, 56, 17, -4.0F, -2.0F, -5.0F, 2, 5, 2, 0.0F, false);
			cube_r8 = new ModelRenderer(this);
			cube_r8.setRotationPoint(0.5F, -8.0F, 7.0F);
			leg4b.addChild(cube_r8);
			setRotationAngle(cube_r8, -0.48F, 0.0F, 0.0F);
			addBoxHelper(cube_r8, 0, 0, -4.0F, 3.0F, 1.0F, 2, 4, 2, 0.0F, false);
			leg1_r4 = new ModelRenderer(this);
			leg1_r4.setRotationPoint(1.0F, 0.0F, 0.0F);
			leg4b.addChild(leg1_r4);
			setRotationAngle(leg1_r4, -0.48F, 0.0F, 0.0F);
			addBoxHelper(leg1_r4, 0, 18, -4.5F, -12.0F, 0.0F, 2, 6, 2, 0.0F, true);
		}

		@Override
		public void render(MatrixStack ms, IVertexBuilder vb, int i1, int i2, float f1, float f2, float f3, float f4) {
			head.render(ms, vb, i1, i2, f1, f2, f3, f4);
			body.render(ms, vb, i1, i2, f1, f2, f3, f4);
			upperBody.render(ms, vb, i1, i2, f1, f2, f3, f4);
			leg0.render(ms, vb, i1, i2, f1, f2, f3, f4);
			leg1.render(ms, vb, i1, i2, f1, f2, f3, f4);
			leg2.render(ms, vb, i1, i2, f1, f2, f3, f4);
			leg3.render(ms, vb, i1, i2, f1, f2, f3, f4);
			tail.render(ms, vb, i1, i2, f1, f2, f3, f4);
			bodyb2.render(ms, vb, i1, i2, f1, f2, f3, f4);
			headb2.render(ms, vb, i1, i2, f1, f2, f3, f4);
			arm0.render(ms, vb, i1, i2, f1, f2, f3, f4);
			arm1.render(ms, vb, i1, i2, f1, f2, f3, f4);
			leg0b.render(ms, vb, i1, i2, f1, f2, f3, f4);
			leg1b2.render(ms, vb, i1, i2, f1, f2, f3, f4);
			headb.render(ms, vb, i1, i2, f1, f2, f3, f4);
			bodyb.render(ms, vb, i1, i2, f1, f2, f3, f4);
			upperBodyb.render(ms, vb, i1, i2, f1, f2, f3, f4);
			leg1b.render(ms, vb, i1, i2, f1, f2, f3, f4);
			leg2b.render(ms, vb, i1, i2, f1, f2, f3, f4);
			leg3b.render(ms, vb, i1, i2, f1, f2, f3, f4);
			tailb.render(ms, vb, i1, i2, f1, f2, f3, f4);
			leg4b.render(ms, vb, i1, i2, f1, f2, f3, f4);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}

		public void setRotationAngles(Entity e, float f, float f1, float f2, float f3, float f4) {

			this.upperBodyb.rotateAngleZ = f4 / (180F / (float) Math.PI);
			this.head.rotateAngleY = f3 / (180F / (float) Math.PI);
			this.head.rotateAngleX = f4 / (180F / (float) Math.PI);
			this.bodyb.rotateAngleZ = f3 / (180F / (float) Math.PI);
			this.leg4b.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
			this.leg2b.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
			this.headb.rotateAngleY = f3 / (180F / (float) Math.PI);
			this.headb.rotateAngleX = f4 / (180F / (float) Math.PI);
			this.leg3b.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
			this.leg1b.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
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

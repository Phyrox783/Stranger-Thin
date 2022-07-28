
public static class Modeldemogorgon extends EntityModel<Entity> {
	private final ModelRenderer body;
	private final ModelRenderer body_r1;
	private final ModelRenderer head;
	private final ModelRenderer head_r1;
	private final ModelRenderer head_r2;
	private final ModelRenderer head_r3;
	private final ModelRenderer head_r4;
	private final ModelRenderer head_r5;
	private final ModelRenderer head_r6;
	private final ModelRenderer head_r7;
	private final ModelRenderer hat;
	private final ModelRenderer rightArm;
	private final ModelRenderer leftArm_r1;
	private final ModelRenderer leftArm_r2;
	private final ModelRenderer leftArm_r3;
	private final ModelRenderer leftArm_r4;
	private final ModelRenderer leftArm_r5;
	private final ModelRenderer leftArm_r6;
	private final ModelRenderer leftArm_r7;
	private final ModelRenderer leftArm;
	private final ModelRenderer leftArm_r8;
	private final ModelRenderer leftArm_r9;
	private final ModelRenderer leftArm_r10;
	private final ModelRenderer leftArm_r11;
	private final ModelRenderer leftArm_r12;
	private final ModelRenderer leftArm_r13;
	private final ModelRenderer leftArm_r14;
	private final ModelRenderer rightLeg;
	private final ModelRenderer leftLeg_r1;
	private final ModelRenderer leftLeg_r2;
	private final ModelRenderer rightLeg_r1;
	private final ModelRenderer leftLeg;
	private final ModelRenderer leftLeg_r3;
	private final ModelRenderer leftLeg_r4;
	private final ModelRenderer leftLeg_r5;

	public Modeldemogorgon() {
		textureWidth = 64;
		textureHeight = 32;

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, -14.0F, 0.0F);

		body_r1 = new ModelRenderer(this);
		body_r1.setRotationPoint(0.0F, 34.0F, 0.0F);
		body.addChild(body_r1);
		setRotationAngle(body_r1, 0.2182F, 0.0F, 0.0F);
		body_r1.setTextureOffset(40, 20).addBox(-4.0F, -30.0F, 2.0F, 8.0F, 8.0F, 4.0F, 0.0F, true);
		body_r1.setTextureOffset(32, 16).addBox(1.0F, -38.0F, 0.0F, 4.0F, 8.0F, 1.0F, 0.0F, true);
		body_r1.setTextureOffset(32, 16).addBox(-5.0F, -38.0F, 0.0F, 4.0F, 8.0F, 1.0F, 0.0F, true);
		body_r1.setTextureOffset(0, 18).addBox(-5.0F, -38.0F, 1.0F, 10.0F, 8.0F, 6.0F, 0.0F, true);

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, 0.0F, 0.0F);

		head_r1 = new ModelRenderer(this);
		head_r1.setRotationPoint(0.0F, 20.0F, 0.0F);
		head.addChild(head_r1);
		setRotationAngle(head_r1, 0.48F, -0.0436F, 2.3998F);
		head_r1.setTextureOffset(36, 19).addBox(-31.0F, 15.0F, -21.0F, 4.0F, 6.0F, 1.0F, 0.0F, true);

		head_r2 = new ModelRenderer(this);
		head_r2.setRotationPoint(0.0F, 20.0F, 0.0F);
		head.addChild(head_r2);
		setRotationAngle(head_r2, 0.48F, -0.0436F, 0.9599F);
		head_r2.setTextureOffset(36, 19).addBox(-36.0F, -35.0F, 4.0F, 4.0F, 6.0F, 1.0F, 0.0F, false);

		head_r3 = new ModelRenderer(this);
		head_r3.setRotationPoint(0.0F, 20.0F, 0.0F);
		head.addChild(head_r3);
		setRotationAngle(head_r3, 0.48F, 0.0F, 0.0F);
		head_r3.setTextureOffset(36, 19).addBox(-2.0F, -51.0F, 10.0F, 4.0F, 6.0F, 1.0F, 0.0F, true);

		head_r4 = new ModelRenderer(this);
		head_r4.setRotationPoint(0.0F, 20.0F, 0.0F);
		head.addChild(head_r4);
		setRotationAngle(head_r4, 0.48F, 0.0436F, -0.9599F);
		head_r4.setTextureOffset(36, 19).addBox(32.0F, -35.0F, 4.0F, 4.0F, 6.0F, 1.0F, 0.0F, true);

		head_r5 = new ModelRenderer(this);
		head_r5.setRotationPoint(0.0F, 20.0F, 0.0F);
		head.addChild(head_r5);
		setRotationAngle(head_r5, 0.48F, 0.0436F, -2.3998F);
		head_r5.setTextureOffset(36, 19).addBox(27.0F, 15.0F, -21.0F, 4.0F, 6.0F, 1.0F, 0.0F, true);

		head_r6 = new ModelRenderer(this);
		head_r6.setRotationPoint(0.0F, 20.0F, 0.0F);
		head.addChild(head_r6);
		setRotationAngle(head_r6, 0.2182F, 0.0F, 0.0F);
		head_r6.setTextureOffset(34, 25).addBox(-2.0F, -40.0F, 1.0F, 4.0F, 2.0F, 4.0F, 0.0F, true);

		head_r7 = new ModelRenderer(this);
		head_r7.setRotationPoint(0.0F, 20.0F, 0.0F);
		head.addChild(head_r7);
		setRotationAngle(head_r7, 0.1745F, 0.0F, 0.0F);
		head_r7.setTextureOffset(0, 0).addBox(-4.0F, -47.0F, -3.0F, 8.0F, 8.0F, 8.0F, 0.0F, true);

		hat = new ModelRenderer(this);
		hat.setRotationPoint(0.0F, -14.0F, 0.0F);

		rightArm = new ModelRenderer(this);
		rightArm.setRotationPoint(8.0F, -23.0F, 0.0F);
		setRotationAngle(rightArm, 0.0436F, 0.0F, -1.4835F);

		leftArm_r1 = new ModelRenderer(this);
		leftArm_r1.setRotationPoint(-3.0F, 32.0F, 0.0F);
		rightArm.addChild(leftArm_r1);
		setRotationAngle(leftArm_r1, 0.48F, 0.0436F, 0.6981F);
		leftArm_r1.setTextureOffset(47, 22).addBox(-26.5F, -13.5F, -15.0F, 1.0F, 1.0F, 4.0F, 0.0F, false);

		leftArm_r2 = new ModelRenderer(this);
		leftArm_r2.setRotationPoint(-3.0F, 32.0F, 0.0F);
		rightArm.addChild(leftArm_r2);
		setRotationAngle(leftArm_r2, 0.2618F, 0.0436F, 0.6981F);
		leftArm_r2.setTextureOffset(47, 22).addBox(-26.5F, -12.0F, -18.0F, 1.0F, 1.0F, 4.0F, 0.0F, false);
		leftArm_r2.setTextureOffset(47, 22).addBox(-26.5F, -13.5F, -14.0F, 3.0F, 4.0F, 4.0F, 0.0F, false);
		leftArm_r2.setTextureOffset(36, 19).addBox(-26.5F, -14.0F, -2.0F, 3.0F, 5.0F, 6.0F, 0.0F, false);
		leftArm_r2.setTextureOffset(30, 14).addBox(-26.5F, -13.0F, -12.0F, 2.0F, 3.0F, 15.0F, 0.0F, false);
		leftArm_r2.setTextureOffset(52, 0).addBox(-27.0F, -24.0F, -1.0F, 2.0F, 12.0F, 4.0F, 0.0F, false);
		leftArm_r2.setTextureOffset(35, 20).addBox(-27.0F, -25.0F, -2.0F, 3.0F, 5.0F, 6.0F, 0.0F, false);

		leftArm_r3 = new ModelRenderer(this);
		leftArm_r3.setRotationPoint(-3.0F, 32.0F, 0.0F);
		rightArm.addChild(leftArm_r3);
		setRotationAngle(leftArm_r3, 0.5236F, 0.4363F, 0.6981F);
		leftArm_r3.setTextureOffset(47, 22).addBox(-17.0F, -18.5F, -27.0F, 1.0F, 1.0F, 6.0F, 0.0F, false);

		leftArm_r4 = new ModelRenderer(this);
		leftArm_r4.setRotationPoint(-3.0F, 32.0F, 0.0F);
		rightArm.addChild(leftArm_r4);
		setRotationAngle(leftArm_r4, 0.2618F, 0.48F, 0.6981F);
		leftArm_r4.setTextureOffset(47, 22).addBox(-15.5F, -14.5F, -32.5F, 1.0F, 1.0F, 6.0F, 0.0F, false);

		leftArm_r5 = new ModelRenderer(this);
		leftArm_r5.setRotationPoint(-3.0F, 32.0F, 0.0F);
		rightArm.addChild(leftArm_r5);
		setRotationAngle(leftArm_r5, 0.0F, 0.6109F, 0.6981F);
		leftArm_r5.setTextureOffset(47, 22).addBox(-11.5F, -9.5F, -36.0F, 1.0F, 1.0F, 5.0F, 0.0F, false);

		leftArm_r6 = new ModelRenderer(this);
		leftArm_r6.setRotationPoint(-3.0F, 32.0F, 0.0F);
		rightArm.addChild(leftArm_r6);
		setRotationAngle(leftArm_r6, 0.0436F, 0.0436F, 0.6981F);
		leftArm_r6.setTextureOffset(47, 22).addBox(-26.5F, -10.5F, -20.0F, 1.0F, 1.0F, 4.0F, 0.0F, false);

		leftArm_r7 = new ModelRenderer(this);
		leftArm_r7.setRotationPoint(-3.0F, 32.0F, 0.0F);
		rightArm.addChild(leftArm_r7);
		setRotationAngle(leftArm_r7, 1.0908F, 0.0436F, 0.6981F);
		leftArm_r7.setTextureOffset(47, 22).addBox(-26.5F, -22.5F, 2.0F, 1.0F, 6.0F, 1.0F, 0.0F, false);

		leftArm = new ModelRenderer(this);
		leftArm.setRotationPoint(-5.0F, -12.0F, 0.0F);

		leftArm_r8 = new ModelRenderer(this);
		leftArm_r8.setRotationPoint(5.0F, 32.0F, 0.0F);
		leftArm.addChild(leftArm_r8);
		setRotationAngle(leftArm_r8, 1.0908F, 0.0436F, 0.6981F);
		leftArm_r8.setTextureOffset(47, 22).addBox(-26.5F, -21.5F, 2.0F, 1.0F, 6.0F, 1.0F, 0.0F, false);

		leftArm_r9 = new ModelRenderer(this);
		leftArm_r9.setRotationPoint(5.0F, 32.0F, 0.0F);
		leftArm.addChild(leftArm_r9);
		setRotationAngle(leftArm_r9, 0.5672F, -0.3927F, 0.6981F);
		leftArm_r9.setTextureOffset(47, 22).addBox(-32.0F, -8.0F, -7.0F, 1.0F, 1.0F, 5.0F, 0.0F, false);

		leftArm_r10 = new ModelRenderer(this);
		leftArm_r10.setRotationPoint(5.0F, 32.0F, 0.0F);
		leftArm.addChild(leftArm_r10);
		setRotationAngle(leftArm_r10, 0.3054F, -0.3927F, 0.6981F);
		leftArm_r10.setTextureOffset(47, 22).addBox(-32.0F, -9.0F, -10.0F, 1.0F, 1.0F, 6.0F, 0.0F, false);

		leftArm_r11 = new ModelRenderer(this);
		leftArm_r11.setRotationPoint(5.0F, 32.0F, 0.0F);
		leftArm.addChild(leftArm_r11);
		setRotationAngle(leftArm_r11, 0.0436F, -0.3927F, 0.6981F);
		leftArm_r11.setTextureOffset(47, 22).addBox(-32.5F, -10.0F, -11.0F, 1.0F, 1.0F, 5.0F, 0.0F, false);

		leftArm_r12 = new ModelRenderer(this);
		leftArm_r12.setRotationPoint(5.0F, 32.0F, 0.0F);
		leftArm.addChild(leftArm_r12);
		setRotationAngle(leftArm_r12, 0.0436F, 0.0436F, 0.6981F);
		leftArm_r12.setTextureOffset(47, 22).addBox(-26.5F, -10.5F, -19.0F, 1.0F, 1.0F, 3.0F, 0.0F, false);

		leftArm_r13 = new ModelRenderer(this);
		leftArm_r13.setRotationPoint(5.0F, 32.0F, 0.0F);
		leftArm.addChild(leftArm_r13);
		setRotationAngle(leftArm_r13, 0.2618F, 0.0436F, 0.6981F);
		leftArm_r13.setTextureOffset(47, 22).addBox(-26.5F, -12.0F, -17.0F, 1.0F, 1.0F, 3.0F, 0.0F, false);
		leftArm_r13.setTextureOffset(47, 22).addBox(-27.5F, -13.5F, -14.0F, 3.0F, 4.0F, 4.0F, 0.0F, false);
		leftArm_r13.setTextureOffset(47, 22).addBox(-27.5F, -14.0F, -2.0F, 3.0F, 5.0F, 6.0F, 0.0F, false);
		leftArm_r13.setTextureOffset(47, 22).addBox(-28.0F, -25.0F, -2.0F, 3.0F, 5.0F, 6.0F, 0.0F, false);
		leftArm_r13.setTextureOffset(30, 13).addBox(-26.5F, -13.0F, -12.0F, 2.0F, 3.0F, 15.0F, 0.0F, false);
		leftArm_r13.setTextureOffset(52, 0).addBox(-27.0F, -24.0F, -1.0F, 2.0F, 12.0F, 4.0F, 0.0F, false);

		leftArm_r14 = new ModelRenderer(this);
		leftArm_r14.setRotationPoint(5.0F, 32.0F, 0.0F);
		leftArm.addChild(leftArm_r14);
		setRotationAngle(leftArm_r14, 0.48F, 0.0436F, 0.6981F);
		leftArm_r14.setTextureOffset(47, 22).addBox(-26.5F, -13.5F, -14.0F, 1.0F, 1.0F, 3.0F, 0.0F, false);

		rightLeg = new ModelRenderer(this);
		rightLeg.setRotationPoint(2.0F, -2.0F, 0.0F);
		rightLeg.setTextureOffset(42, 23).addBox(3.0F, 23.0F, -11.0F, 4.0F, 2.0F, 7.0F, 0.0F, false);

		leftLeg_r1 = new ModelRenderer(this);
		leftLeg_r1.setRotationPoint(-2.0F, 22.0F, 0.0F);
		rightLeg.addChild(leftLeg_r1);
		setRotationAngle(leftLeg_r1, 0.6109F, 0.0F, -0.0873F);
		leftLeg_r1.setTextureOffset(35, 3).addBox(5.5F, -13.0F, 1.0F, 3.0F, 7.0F, 3.0F, 0.0F, false);

		leftLeg_r2 = new ModelRenderer(this);
		leftLeg_r2.setRotationPoint(-2.0F, 22.0F, 0.0F);
		rightLeg.addChild(leftLeg_r2);
		setRotationAngle(leftLeg_r2, -0.4363F, 0.0F, -0.0873F);
		leftLeg_r2.setTextureOffset(36, 1).addBox(5.5F, -7.0F, -6.0F, 3.0F, 12.0F, 3.0F, 0.0F, false);

		rightLeg_r1 = new ModelRenderer(this);
		rightLeg_r1.setRotationPoint(-2.0F, 22.0F, 0.0F);
		rightLeg.addChild(rightLeg_r1);
		setRotationAngle(rightLeg_r1, -0.4363F, 0.0F, -0.3491F);
		rightLeg_r1.setTextureOffset(35, 1).addBox(8.0F, -19.0F, -11.0F, 4.0F, 12.0F, 3.0F, 0.0F, true);

		leftLeg = new ModelRenderer(this);
		leftLeg.setRotationPoint(-2.0F, -2.0F, 0.0F);
		leftLeg.setTextureOffset(42, 23).addBox(-7.0F, 23.0F, -11.0F, 4.0F, 2.0F, 8.0F, 0.0F, false);

		leftLeg_r3 = new ModelRenderer(this);
		leftLeg_r3.setRotationPoint(2.0F, 22.0F, 0.0F);
		leftLeg.addChild(leftLeg_r3);
		setRotationAngle(leftLeg_r3, 0.6109F, 0.0F, 0.0873F);
		leftLeg_r3.setTextureOffset(35, 5).addBox(-8.5F, -13.0F, 1.0F, 3.0F, 7.0F, 3.0F, 0.0F, false);

		leftLeg_r4 = new ModelRenderer(this);
		leftLeg_r4.setRotationPoint(2.0F, 22.0F, 0.0F);
		leftLeg.addChild(leftLeg_r4);
		setRotationAngle(leftLeg_r4, -0.4363F, 0.0F, 0.0873F);
		leftLeg_r4.setTextureOffset(36, 0).addBox(-8.5F, -7.0F, -5.0F, 3.0F, 12.0F, 3.0F, 0.0F, false);

		leftLeg_r5 = new ModelRenderer(this);
		leftLeg_r5.setRotationPoint(2.0F, 22.0F, 0.0F);
		leftLeg.addChild(leftLeg_r5);
		setRotationAngle(leftLeg_r5, -0.4363F, 0.0F, 0.3491F);
		leftLeg_r5.setTextureOffset(34, 1).addBox(-12.0F, -18.0F, -11.0F, 4.0F, 12.0F, 3.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		body.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		head.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		hat.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		rightArm.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		leftArm.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		rightLeg.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		leftLeg.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		this.rightArm.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
		this.leftLeg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.head.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.head.rotateAngleX = f4 / (180F / (float) Math.PI);
		this.leftArm.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
		this.rightLeg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
	}
}
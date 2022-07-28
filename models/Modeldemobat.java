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
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
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

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		this.leftWing.rotateAngleZ = MathHelper.cos(f * 0.6662F) * f1;
		this.rightWing.rotateAngleZ = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
	}
}
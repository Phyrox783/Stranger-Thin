
public static class Modellarva extends ModelBase {
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
		head.cubeList.add(new ModelBox(head, 16, 8, 1.0F, -3.0F, -6.5F, 1, 1, 2, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 16, 11, -1.0F, -3.0F, -6.5F, 1, 1, 2, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 18, 18, 1.0F, -5.0F, -6.5F, 1, 1, 2, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 0, 19, -1.0F, -5.0F, -6.5F, 1, 1, 2, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 10, 15, -1.0F, -5.0F, -5.5F, 3, 3, 2, 0.0F, false));

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 24.0F, 0.0F);
		body.cubeList.add(new ModelBox(body, 0, 0, -1.0F, -2.0F, -1.5F, 3, 2, 5, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 0, 7, 1.0F, -3.0F, -2.0F, 1, 1, 6, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 8, 8, -1.0F, -3.0F, -2.0F, 1, 1, 6, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 16, 5, -1.0F, -2.0F, 3.5F, 3, 2, 1, 0.0F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		body.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.2182F, 0.0F, 0.0F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 11, 0, -1.0F, -4.5F, -3.0F, 3, 3, 2, 0.0F, false));

		tail = new ModelRenderer(this);
		tail.setRotationPoint(0.0F, 24.0F, 0.0F);
		tail.cubeList.add(new ModelBox(tail, 0, 14, 0.0F, -1.0F, 3.5F, 1, 1, 4, 0.0F, false));

		leg1 = new ModelRenderer(this);
		leg1.setRotationPoint(0.0F, 24.0F, 0.0F);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
		leg1.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, -0.2182F, 0.0F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 7, 2.5F, -1.0F, 0.0F, 1, 1, 2, 0.0F, false));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(0.0F, 0.0F, 0.0F);
		leg1.addChild(cube_r3);
		setRotationAngle(cube_r3, -0.6545F, -0.2182F, 0.0F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 0, 2.5F, -4.5F, 0.0F, 1, 2, 1, 0.0F, false));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(0.0F, 0.0F, 0.0F);
		leg1.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.3054F, -0.2182F, 0.0F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 14, 2.5F, -1.5F, 2.0F, 1, 2, 1, 0.0F, false));

		leg2 = new ModelRenderer(this);
		leg2.setRotationPoint(0.0F, 24.0F, 0.0F);

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(0.0F, 0.0F, 0.0F);
		leg2.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.0F, 0.2182F, 0.0F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 8, 7, -2.5F, -1.0F, 0.0F, 1, 1, 2, 0.0F, false));

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(0.0F, 0.0F, 0.0F);
		leg2.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.3054F, 0.2182F, 0.0F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 6, 15, -2.5F, -1.5F, 2.0F, 1, 2, 1, 0.0F, false));

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(0.0F, 0.0F, 0.0F);
		leg2.addChild(cube_r7);
		setRotationAngle(cube_r7, -0.6545F, 0.2182F, 0.0F);
		cube_r7.cubeList.add(new ModelBox(cube_r7, 6, 19, -2.5F, -4.5F, 0.0F, 1, 2, 1, 0.0F, false));

		leg3 = new ModelRenderer(this);
		leg3.setRotationPoint(0.0F, 24.0F, 0.0F);

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(0.0F, 0.0F, 0.0F);
		leg3.addChild(cube_r8);
		setRotationAngle(cube_r8, 0.0F, 0.2182F, 0.0F);
		cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 10, -2.0F, -1.0F, -3.0F, 1, 1, 2, 0.0F, false));

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(0.0F, 0.0F, 0.0F);
		leg3.addChild(cube_r9);
		setRotationAngle(cube_r9, 0.1745F, 0.0F, 0.1745F);
		cube_r9.cubeList.add(new ModelBox(cube_r9, 14, 20, -2.0F, -2.0F, -1.0F, 1, 2, 1, 0.0F, false));

		leg4 = new ModelRenderer(this);
		leg4.setRotationPoint(0.0F, 24.0F, 0.0F);

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(0.0F, 0.0F, 0.0F);
		leg4.addChild(cube_r10);
		setRotationAngle(cube_r10, 0.1745F, 0.0F, -0.1745F);
		cube_r10.cubeList.add(new ModelBox(cube_r10, 10, 20, 2.0F, -2.0F, -1.0F, 1, 2, 1, 0.0F, false));

		cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(0.0F, 0.0F, 0.0F);
		leg4.addChild(cube_r11);
		setRotationAngle(cube_r11, 0.0F, -0.2182F, 0.0F);
		cube_r11.cubeList.add(new ModelBox(cube_r11, 8, 10, 2.0F, -1.0F, -3.0F, 1, 1, 2, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		head.render(f5);
		body.render(f5);
		tail.render(f5);
		leg1.render(f5);
		leg2.render(f5);
		leg3.render(f5);
		leg4.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
		this.tail.rotateAngleZ = f3 / (180F / (float) Math.PI);
		this.head.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.head.rotateAngleX = f4 / (180F / (float) Math.PI);
		this.leg1.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.leg4.rotateAngleY = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.leg2.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		this.leg3.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
	}
}
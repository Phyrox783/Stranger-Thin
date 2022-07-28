
public static class Modelwolf extends ModelBase {
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
		headb.cubeList.add(new ModelBox(headb, 0, 0, -3.0F, -3.0F, -2.0F, 6, 6, 4, 0.0F, true));

		head_r1 = new ModelRenderer(this);
		head_r1.setRotationPoint(-1.0F, 10.5F, 7.0F);
		headb.addChild(head_r1);
		setRotationAngle(head_r1, -0.6981F, 0.0F, 0.0F);
		head_r1.cubeList.add(new ModelBox(head_r1, 0, 10, -0.5F, -4.52F, -19.0F, 3, 1, 4, 0.0F, true));

		head_r2 = new ModelRenderer(this);
		head_r2.setRotationPoint(-1.0F, 10.5F, 7.0F);
		headb.addChild(head_r2);
		setRotationAngle(head_r2, -0.3927F, -0.0436F, 0.48F);
		head_r2.cubeList.add(new ModelBox(head_r2, 16, 14, -7.0F, -2.5F, -11.0F, 3, 4, 1, 0.0F, true));

		head_r3 = new ModelRenderer(this);
		head_r3.setRotationPoint(-1.0F, 10.5F, 7.0F);
		headb.addChild(head_r3);
		setRotationAngle(head_r3, -0.3927F, -0.0436F, 2.2689F);
		head_r3.cubeList.add(new ModelBox(head_r3, 16, 14, -9.0F, 10.5F, -5.0F, 3, 4, 1, 0.0F, true));

		head_r4 = new ModelRenderer(this);
		head_r4.setRotationPoint(-1.0F, 10.5F, 7.0F);
		headb.addChild(head_r4);
		setRotationAngle(head_r4, -0.3927F, -0.0436F, -2.2689F);
		head_r4.cubeList.add(new ModelBox(head_r4, 16, 14, 4.0F, 12.5F, -5.0F, 3, 4, 1, 0.0F, true));

		head_r5 = new ModelRenderer(this);
		head_r5.setRotationPoint(-1.0F, 10.5F, 7.0F);
		headb.addChild(head_r5);
		setRotationAngle(head_r5, -0.3927F, -0.0436F, -0.48F);
		head_r5.cubeList.add(new ModelBox(head_r5, 16, 14, 5.0F, -1.5F, -11.0F, 3, 4, 1, 0.0F, true));

		bodyb = new ModelRenderer(this);
		bodyb.setRotationPoint(0.0F, 14.0F, 2.0F);
		bodyb.cubeList.add(new ModelBox(bodyb, 42, 16, -2.0F, 0.0F, 2.0F, 6, 3, 5, 0.0F, true));
		bodyb.cubeList.add(new ModelBox(bodyb, 24, 2, -2.0F, 0.0F, -2.0F, 6, 2, 5, 0.0F, false));
		bodyb.cubeList.add(new ModelBox(bodyb, 24, 2, -2.0F, 0.0F, -7.0F, 6, 4, 6, 0.0F, false));

		upperBodyb = new ModelRenderer(this);
		upperBodyb.setRotationPoint(1.0F, 14.0F, 2.0F);
		upperBodyb.cubeList.add(new ModelBox(upperBodyb, 21, 2, -4.0F, -2.0F, -5.0F, 8, 4, 6, 0.0F, true));
		upperBodyb.cubeList.add(new ModelBox(upperBodyb, 0, 0, -3.0F, -1.0F, 1.0F, 6, 1, 2, 0.0F, false));

		leg1b = new ModelRenderer(this);
		leg1b.setRotationPoint(-0.5F, 16.0F, 7.0F);
		leg1b.cubeList.add(new ModelBox(leg1b, 0, 0, -3.0F, 7.0F, -4.0F, 2, 1, 3, 0.0F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(1.0F, 0.0F, 0.0F);
		leg1b.addChild(cube_r1);
		setRotationAngle(cube_r1, -0.48F, 0.0F, 0.0F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 0, -4.0F, 3.0F, 1.0F, 2, 4, 2, 0.0F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(1.0F, 0.0F, 0.0F);
		leg1b.addChild(cube_r2);
		setRotationAngle(cube_r2, 1.0036F, 0.0F, 0.0F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 56, 17, -4.0F, -2.0F, -5.0F, 2, 5, 2, 0.0F, false));

		leg1_r1 = new ModelRenderer(this);
		leg1_r1.setRotationPoint(1.5F, 8.0F, -7.0F);
		leg1b.addChild(leg1_r1);
		setRotationAngle(leg1_r1, -0.48F, 0.0F, 0.0F);
		leg1_r1.cubeList.add(new ModelBox(leg1_r1, 0, 18, -4.5F, -12.0F, 0.0F, 2, 6, 2, 0.0F, true));

		leg2b = new ModelRenderer(this);
		leg2b.setRotationPoint(2.5F, 16.0F, -4.0F);
		leg2b.cubeList.add(new ModelBox(leg2b, 0, 0, 1.0F, 7.0F, -4.0F, 2, 1, 3, 0.0F, false));

		leg1_r2 = new ModelRenderer(this);
		leg1_r2.setRotationPoint(5.5F, 8.0F, -4.0F);
		leg2b.addChild(leg1_r2);
		setRotationAngle(leg1_r2, -0.3054F, 0.0F, 0.0F);
		leg1_r2.cubeList.add(new ModelBox(leg1_r2, 0, 18, -4.5F, -12.0F, 3.0F, 2, 6, 2, 0.0F, true));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(5.0F, 0.0F, 3.0F);
		leg2b.addChild(cube_r3);
		setRotationAngle(cube_r3, -0.2182F, 0.0F, 0.0F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 0, -4.0F, 4.0F, -4.0F, 2, 4, 2, 0.0F, false));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(5.0F, 0.0F, 3.0F);
		leg2b.addChild(cube_r4);
		setRotationAngle(cube_r4, 1.9635F, 0.0F, 0.0F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 0, -4.0F, -6.0F, -3.0F, 2, 5, 2, 0.0F, false));

		leg3b = new ModelRenderer(this);
		leg3b.setRotationPoint(-0.5F, 16.0F, -4.0F);
		leg3b.cubeList.add(new ModelBox(leg3b, 0, 0, -3.0F, 7.0F, -4.0F, 2, 1, 3, 0.0F, false));

		leg1_r3 = new ModelRenderer(this);
		leg1_r3.setRotationPoint(1.5F, 8.0F, -4.0F);
		leg3b.addChild(leg1_r3);
		setRotationAngle(leg1_r3, -0.3054F, 0.0F, 0.0F);
		leg1_r3.cubeList.add(new ModelBox(leg1_r3, 0, 18, -4.5F, -12.0F, 3.0F, 2, 6, 2, 0.0F, true));

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(1.0F, 0.0F, 3.0F);
		leg3b.addChild(cube_r5);
		setRotationAngle(cube_r5, -0.2182F, 0.0F, 0.0F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 0, -4.0F, 4.0F, -4.0F, 2, 4, 2, 0.0F, false));

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(1.0F, 0.0F, 3.0F);
		leg3b.addChild(cube_r6);
		setRotationAngle(cube_r6, 1.9635F, 0.0F, 0.0F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 56, 25, -4.0F, -6.0F, -3.0F, 2, 5, 2, 0.0F, false));

		tailb = new ModelRenderer(this);
		tailb.setRotationPoint(1.0F, 12.0F, 8.0F);

		tail_r1 = new ModelRenderer(this);
		tail_r1.setRotationPoint(-1.0F, 12.0F, -8.0F);
		tailb.addChild(tail_r1);
		setRotationAngle(tail_r1, 1.2654F, 0.0F, 0.0F);
		tail_r1.cubeList.add(new ModelBox(tail_r1, 11, 4, 0.0F, 5.0F, 9.0F, 2, 4, 2, 0.0F, true));

		leg4b = new ModelRenderer(this);
		leg4b.setRotationPoint(7.0F, 24.0F, 0.0F);
		leg4b.cubeList.add(new ModelBox(leg4b, 0, 0, -3.5F, -1.0F, 3.0F, 2, 1, 3, 0.0F, false));

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(0.5F, -8.0F, 7.0F);
		leg4b.addChild(cube_r7);
		setRotationAngle(cube_r7, 1.0036F, 0.0F, 0.0F);
		cube_r7.cubeList.add(new ModelBox(cube_r7, 56, 17, -4.0F, -2.0F, -5.0F, 2, 5, 2, 0.0F, false));

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(0.5F, -8.0F, 7.0F);
		leg4b.addChild(cube_r8);
		setRotationAngle(cube_r8, -0.48F, 0.0F, 0.0F);
		cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 0, -4.0F, 3.0F, 1.0F, 2, 4, 2, 0.0F, false));

		leg1_r4 = new ModelRenderer(this);
		leg1_r4.setRotationPoint(1.0F, 0.0F, 0.0F);
		leg4b.addChild(leg1_r4);
		setRotationAngle(leg1_r4, -0.48F, 0.0F, 0.0F);
		leg1_r4.cubeList.add(new ModelBox(leg1_r4, 0, 18, -4.5F, -12.0F, 0.0F, 2, 6, 2, 0.0F, true));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		head.render(f5);
		body.render(f5);
		upperBody.render(f5);
		leg0.render(f5);
		leg1.render(f5);
		leg2.render(f5);
		leg3.render(f5);
		tail.render(f5);
		bodyb2.render(f5);
		headb2.render(f5);
		arm0.render(f5);
		arm1.render(f5);
		leg0b.render(f5);
		leg1b2.render(f5);
		headb.render(f5);
		bodyb.render(f5);
		upperBodyb.render(f5);
		leg1b.render(f5);
		leg2b.render(f5);
		leg3b.render(f5);
		tailb.render(f5);
		leg4b.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
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
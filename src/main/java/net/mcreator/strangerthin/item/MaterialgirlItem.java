
package net.mcreator.strangerthin.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.util.ResourceLocation;
import net.minecraft.item.Rarity;
import net.minecraft.item.MusicDiscItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;

import net.mcreator.strangerthin.StrangerthinModElements;

@StrangerthinModElements.ModElement.Tag
public class MaterialgirlItem extends StrangerthinModElements.ModElement {
	@ObjectHolder("strangerthin:materialgirl")
	public static final Item block = null;

	public MaterialgirlItem(StrangerthinModElements instance) {
		super(instance, 46);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new MusicDiscItemCustom());
	}

	public static class MusicDiscItemCustom extends MusicDiscItem {
		public MusicDiscItemCustom() {
			super(0, StrangerthinModElements.sounds.get(new ResourceLocation("strangerthin:materialgirl")),
					new Item.Properties().group(ItemGroup.MISC).maxStackSize(1).rarity(Rarity.RARE));
			setRegistryName("materialgirl");
		}
	}
}

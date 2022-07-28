
package net.mcreator.strangerthin.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.util.ResourceLocation;
import net.minecraft.item.Rarity;
import net.minecraft.item.MusicDiscItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;

import net.mcreator.strangerthin.StrangerthinModElements;

@StrangerthinModElements.ModElement.Tag
public class ShoudistayorshouldigoItem extends StrangerthinModElements.ModElement {
	@ObjectHolder("strangerthin:shoudistayorshouldigo")
	public static final Item block = null;

	public ShoudistayorshouldigoItem(StrangerthinModElements instance) {
		super(instance, 44);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new MusicDiscItemCustom());
	}

	public static class MusicDiscItemCustom extends MusicDiscItem {
		public MusicDiscItemCustom() {
			super(0, StrangerthinModElements.sounds.get(new ResourceLocation("strangerthin:shouldistayorshouldigo")),
					new Item.Properties().group(ItemGroup.MISC).maxStackSize(1).rarity(Rarity.RARE));
			setRegistryName("shoudistayorshouldigo");
		}
	}
}

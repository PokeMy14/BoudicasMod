
package net.mcreator.boudicasmod.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.boudicasmod.BoudicasModModElements;

@BoudicasModModElements.ModElement.Tag
public class PiritashovelItem extends BoudicasModModElements.ModElement {
	@ObjectHolder("boudicas_mod:piritashovel")
	public static final Item block = null;
	public PiritashovelItem(BoudicasModModElements instance) {
		super(instance, 25);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ShovelItem(new IItemTier() {
			public int getMaxUses() {
				return 150;
			}

			public float getEfficiency() {
				return 6f;
			}

			public float getAttackDamage() {
				return 2f;
			}

			public int getHarvestLevel() {
				return 1;
			}

			public int getEnchantability() {
				return 14;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(PiritaIngotItem.block, (int) (1)));
			}
		}, 1, -2.5f, new Item.Properties().group(ItemGroup.TOOLS)) {
		}.setRegistryName("piritashovel"));
	}
}

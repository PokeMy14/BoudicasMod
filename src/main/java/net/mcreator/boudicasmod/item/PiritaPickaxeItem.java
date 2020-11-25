
package net.mcreator.boudicasmod.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.boudicasmod.itemgroup.BoudicasModItemGroup;
import net.mcreator.boudicasmod.BoudicasModModElements;

@BoudicasModModElements.ModElement.Tag
public class PiritaPickaxeItem extends BoudicasModModElements.ModElement {
	@ObjectHolder("boudicas_mod:pirita_pickaxe")
	public static final Item block = null;
	public PiritaPickaxeItem(BoudicasModModElements instance) {
		super(instance, 14);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new PickaxeItem(new IItemTier() {
			public int getMaxUses() {
				return 1164;
			}

			public float getEfficiency() {
				return 12f;
			}

			public float getAttackDamage() {
				return 4f;
			}

			public int getHarvestLevel() {
				return 6;
			}

			public int getEnchantability() {
				return 42;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(PiritaIngotItem.block, (int) (1)));
			}
		}, 1, -3f, new Item.Properties().group(BoudicasModItemGroup.tab)) {
		}.setRegistryName("pirita_pickaxe"));
	}
}

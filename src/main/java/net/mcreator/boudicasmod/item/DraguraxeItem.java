
package net.mcreator.boudicasmod.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.boudicasmod.BoudicasModModElements;

@BoudicasModModElements.ModElement.Tag
public class DraguraxeItem extends BoudicasModModElements.ModElement {
	@ObjectHolder("boudicas_mod:draguraxe")
	public static final Item block = null;
	public DraguraxeItem(BoudicasModModElements instance) {
		super(instance, 40);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 300;
			}

			public float getEfficiency() {
				return 4f;
			}

			public float getAttackDamage() {
				return 7.5f;
			}

			public int getHarvestLevel() {
				return 1;
			}

			public int getEnchantability() {
				return 6;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(DraguraxeItem.block, (int) (1)));
			}
		}, 3, -3.2f, new Item.Properties().group(ItemGroup.TOOLS)) {
		}.setRegistryName("draguraxe"));
	}
}

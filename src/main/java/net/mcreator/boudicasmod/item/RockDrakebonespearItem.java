
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
public class RockDrakebonespearItem extends BoudicasModModElements.ModElement {
	@ObjectHolder("boudicas_mod:rock_drakebonespear")
	public static final Item block = null;
	public RockDrakebonespearItem(BoudicasModModElements instance) {
		super(instance, 26);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 350;
			}

			public float getEfficiency() {
				return 4f;
			}

			public float getAttackDamage() {
				return 8f;
			}

			public int getHarvestLevel() {
				return 0;
			}

			public int getEnchantability() {
				return 14;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(RockdrakehornItem.block, (int) (1)));
			}
		}, 3, -2f, new Item.Properties().group(ItemGroup.TOOLS)) {
		}.setRegistryName("rock_drakebonespear"));
	}
}

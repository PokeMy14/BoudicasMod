
package net.mcreator.boudicasmod.item;

@BoudicasModModElements.ModElement.Tag
public class PiritaSwordItem extends BoudicasModModElements.ModElement {

	@ObjectHolder("boudicas_mod:pirita_sword")
	public static final Item block = null;

	public PiritaSwordItem(BoudicasModModElements instance) {
		super(instance, 16);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 1164;
			}

			public float getEfficiency() {
				return 12f;
			}

			public float getAttackDamage() {
				return 16f;
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
		}, 3, -3f, new Item.Properties().group(BoudicasModItemGroup.tab)) {

		}.setRegistryName("pirita_sword"));
	}

}
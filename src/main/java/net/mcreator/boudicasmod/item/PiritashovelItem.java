
package net.mcreator.boudicasmod.item;

@BoudicasModModElements.ModElement.Tag
public class PiritaShovelItem extends BoudicasModModElements.ModElement {

	@ObjectHolder("boudicas_mod:pirita_shovel")
	public static final Item block = null;

	public PiritaShovelItem(BoudicasModModElements instance) {
		super(instance, 17);
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

		}.setRegistryName("pirita_shovel"));
	}

}


package net.mcreator.boudicasmod.item;

@BoudicasModModElements.ModElement.Tag
public class PiritaaxeItem extends BoudicasModModElements.ModElement {

	@ObjectHolder("boudicas_mod:piritaaxe")
	public static final Item block = null;

	public PiritaaxeItem(BoudicasModModElements instance) {
		super(instance, 24);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new AxeItem(new IItemTier() {
			public int getMaxUses() {
				return 100;
			}

			public float getEfficiency() {
				return 6f;
			}

			public float getAttackDamage() {
				return 5f;
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
		}, 1, -2.8f, new Item.Properties().group(ItemGroup.TOOLS)) {

		}.setRegistryName("piritaaxe"));
	}

}

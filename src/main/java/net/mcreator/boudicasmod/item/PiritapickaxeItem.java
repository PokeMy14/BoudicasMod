
package net.mcreator.boudicasmod.item;

@BoudicasModModElements.ModElement.Tag
public class PiritapickaxeItem extends BoudicasModModElements.ModElement {

	@ObjectHolder("boudicas_mod:piritapickaxe")
	public static final Item block = null;

	public PiritapickaxeItem(BoudicasModModElements instance) {
		super(instance, 23);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new PickaxeItem(new IItemTier() {
			public int getMaxUses() {
				return 100;
			}

			public float getEfficiency() {
				return 4f;
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
		}, 1, -3f, new Item.Properties().group(ItemGroup.TOOLS)) {

		}.setRegistryName("piritapickaxe"));
	}

}

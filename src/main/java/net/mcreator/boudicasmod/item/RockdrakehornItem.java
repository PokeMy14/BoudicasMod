
package net.mcreator.boudicasmod.item;

@BoudicasModModElements.ModElement.Tag
public class RockdrakehornItem extends BoudicasModModElements.ModElement {

	@ObjectHolder("boudicas_mod:rockdrakehorn")
	public static final Item block = null;

	public RockdrakehornItem(BoudicasModModElements instance) {
		super(instance, 26);

	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	public static class ItemCustom extends Item {

		public ItemCustom() {
			super(new Item.Properties().group(ItemGroup.MISC).maxStackSize(1).rarity(Rarity.UNCOMMON));
			setRegistryName("rockdrakehorn");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}

	}

}

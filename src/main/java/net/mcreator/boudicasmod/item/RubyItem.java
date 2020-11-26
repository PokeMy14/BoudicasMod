
package net.mcreator.boudicasmod.item;

@BoudicasModModElements.ModElement.Tag
public class RubyItem extends BoudicasModModElements.ModElement {

	@ObjectHolder("boudicas_mod:ruby")
	public static final Item block = null;

	public RubyItem(BoudicasModModElements instance) {
		super(instance, 16);

	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	public static class ItemCustom extends Item {

		public ItemCustom() {
			super(new Item.Properties().group(ItemGroup.MISC).maxStackSize(64).rarity(Rarity.COMMON));
			setRegistryName("ruby");
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

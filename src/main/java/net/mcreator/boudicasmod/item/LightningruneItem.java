
package net.mcreator.boudicasmod.item;

@BoudicasModModElements.ModElement.Tag
public class LightningruneItem extends BoudicasModModElements.ModElement {

	@ObjectHolder("boudicas_mod:lightningrune")
	public static final Item block = null;

	public LightningruneItem(BoudicasModModElements instance) {
		super(instance, 30);

	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	public static class ItemCustom extends Item {

		public ItemCustom() {
			super(new Item.Properties().group(ItemGroup.MISC).maxStackSize(64).rarity(Rarity.COMMON));
			setRegistryName("lightningrune");
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


package net.mcreator.boudicasmod.item;

@BoudicasModModElements.ModElement.Tag
public class CornItem extends BoudicasModModElements.ModElement {

	@ObjectHolder("boudicas_mod:corn")
	public static final Item block = null;

	public CornItem(BoudicasModModElements instance) {
		super(instance, 22);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new FoodItemCustom());
	}

	public static class FoodItemCustom extends Item {

		public FoodItemCustom() {
			super(new Item.Properties().group(ItemGroup.FOOD).maxStackSize(64).rarity(Rarity.COMMON)
					.food((new Food.Builder()).hunger(5).saturation(0.5f)

							.meat().build()));
			setRegistryName("corn");
		}

		@Override
		public int getUseDuration(ItemStack stack) {
			return 34;
		}

		@Override
		public UseAction getUseAction(ItemStack itemstack) {
			return UseAction.EAT;
		}

	}

}

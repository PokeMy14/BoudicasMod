
package net.mcreator.boudicasmod.item;

@BoudicasModModElements.ModElement.Tag
public class CucumberItem extends BoudicasModModElements.ModElement {

	@ObjectHolder("boudicas_mod:cucumber")
	public static final Item block = null;

	public CucumberItem(BoudicasModModElements instance) {
		super(instance, 28);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new FoodItemCustom());
	}

	public static class FoodItemCustom extends Item {

		public FoodItemCustom() {
			super(new Item.Properties().group(ItemGroup.FOOD).maxStackSize(64).rarity(Rarity.COMMON)
					.food((new Food.Builder()).hunger(3).saturation(0.3f)

							.build()));
			setRegistryName("cucumber");
		}

		@Override
		public int getUseDuration(ItemStack stack) {
			return 30;
		}

		@Override
		public UseAction getUseAction(ItemStack itemstack) {
			return UseAction.EAT;
		}

	}

}

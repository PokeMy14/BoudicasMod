
package net.mcreator.boudicasmod.block;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.common.ToolType;

import net.minecraft.world.storage.loot.LootContext;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.BlockItem;
import net.minecraft.block.material.Material;
import net.minecraft.block.SoundType;
import net.minecraft.block.FallingBlock;
import net.minecraft.block.BlockState;
import net.minecraft.block.Block;

import net.mcreator.boudicasmod.itemgroup.BoudicasModItemGroup;
import net.mcreator.boudicasmod.item.SulfurDustItem;
import net.mcreator.boudicasmod.BoudicasModModElements;

import java.util.List;
import java.util.Collections;

@BoudicasModModElements.ModElement.Tag
public class SulfurBlockBlock extends BoudicasModModElements.ModElement {
	@ObjectHolder("boudicas_mod:sulfur_block")
	public static final Block block = null;
	public SulfurBlockBlock(BoudicasModModElements instance) {
		super(instance, 3);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new CustomBlock());
		elements.items
				.add(() -> new BlockItem(block, new Item.Properties().group(BoudicasModItemGroup.tab)).setRegistryName(block.getRegistryName()));
	}
	public static class CustomBlock extends FallingBlock {
		public CustomBlock() {
			super(Block.Properties.create(Material.IRON).sound(SoundType.METAL).hardnessAndResistance(5f, 10f).lightValue(0).harvestLevel(2)
					.harvestTool(ToolType.PICKAXE));
			setRegistryName("sulfur_block");
		}

		@Override
		public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
			List<ItemStack> dropsOriginal = super.getDrops(state, builder);
			if (!dropsOriginal.isEmpty())
				return dropsOriginal;
			return Collections.singletonList(new ItemStack(SulfurDustItem.block, (int) (9)));
		}
	}
}

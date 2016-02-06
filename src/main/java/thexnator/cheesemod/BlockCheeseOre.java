package thexnator.cheesemod;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

public class BlockCheeseOre extends Block {

	public BlockCheeseOre(Material material) {
		super(material);
		this.setHardness(0.7F);
		this.setLightLevel(0.5F);
	}
	
	@Override
	public boolean isOpaqueCube() {
		return false;
	}
	
	@Override
	public Item getItemDropped(int metadata, Random rand, int fortune){
		return CheeseMod.itemCheeseStick;
	}
}

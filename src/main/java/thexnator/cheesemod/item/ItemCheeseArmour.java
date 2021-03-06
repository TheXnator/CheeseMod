package thexnator.cheesemod.item;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class ItemCheeseArmour extends ItemArmor {

	public ItemCheeseArmour(ArmorMaterial armourMaterial, int renderIndex, int armourType) {
		super(armourMaterial, renderIndex, armourType);
	}

	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
	{
		if(this.armorType == 2)
		{
			return "cm:textures/models/armor/cheese_layer_2.png";
		}
		return "cm:textures/models/armor/cheese_layer_1.png";
	}
}

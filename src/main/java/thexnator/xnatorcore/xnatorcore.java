package thexnator.xnatorcore;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;

@Mod(modid = "xc", name = "Xnator Core", version = "1.0")
public class xnatorcore {
	
	public static Item itemCheese;
	public static Item itemReinforcedCheese;
	public static Item itemReinforcedPotato;
	public static Item itemTheXnator;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event){
		itemCheese = new ItemFood(10, 0.8F, true).setUnlocalizedName("ItemCheese").setTextureName("xc:itemcheese").setCreativeTab(tabXnatorMods);
		itemTheXnator = new ItemTheXnator().setUnlocalizedName("ItemTheXnator").setTextureName("xc:itemthexnator").setCreativeTab(tabXnatorMods);
		itemReinforcedCheese = new ItemFood(200, 10.0F, true).setUnlocalizedName("ItemReinforcedCheese").setTextureName("xc:itemreinforcedcheese").setCreativeTab(tabXnatorMods);
		itemReinforcedPotato = new ItemFood(200, 10.0F, true).setUnlocalizedName("ItemReinforcedPotato").setTextureName("xc:itemreinforcedpotato").setCreativeTab(tabXnatorMods);
		GameRegistry.registerItem(itemReinforcedCheese, itemReinforcedCheese.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(itemReinforcedPotato, itemReinforcedPotato.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(itemCheese, itemCheese.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(itemTheXnator, itemTheXnator.getUnlocalizedName().substring(5));
	}
	@EventHandler
	public void Init(FMLInitializationEvent event){
		GameRegistry.addRecipe(new ItemStack(itemCheese, 4), new Object[]{"MM",
		                                                                  "WW", 'M',Items.milk_bucket, 'W', Items.wheat});
		GameRegistry.addRecipe(new ItemStack(itemReinforcedCheese), new Object[]{"DDD",
				                                                                 "DCD",
																			     "DDD", 'D', Items.diamond, 'C', itemCheese});
		GameRegistry.addRecipe(new ItemStack(itemReinforcedPotato), new Object[]{"DDD",
                                                                                 "DPD",
			                                                                     "DDD", 'D', Items.diamond, 'P', Items.potato});
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event){
		
	}
	
	public static CreativeTabs tabXnatorMods = new CreativeTabs("tabXnatorMods"){
		@Override
		public Item getTabIconItem(){
			return new ItemStack(itemCheese).getItem();
		}
	};
}

/*
 * manageryzy's Minecraft Sample API.
 * 
 * This File is GUN licensed.
 * Do not forget to share the source code of your mod , if your Mod refer these codes .
 * 
 * Copyleft manageryzy@gmail.com
 */
package manageryzy.mclib;

import cpw.mods.fml.common.registry.GameData;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

/**
 * This class is the wrapper class of the Original Minecraft Item Class.
 * 
 * You Could User code like codes below to setup your Item.
 * 
 * McLib.RegisterItem
 * 		.SetItem(new ItemBucket())
 * 		.setCreativeTab("tabMisc")
 * 		.setTextureName("item.bucket")
 * 		.setUnlocalizedName("bucket")
 * 		.Reg("bucket",null)
 * 
 * @author manageryzy@gmail.com
 *
 */
public class RegItem {
	private static Item theItem;
	
	/**
	 * Set the Current Item of the Register wrapper class.
	 * 
	 * Use this method when you want to registry your own new Item.
	 */
	public RegItem SetItem(Item i)
	{
		theItem = i;
		
		if(theItem == null)
		{
			Logs.err("NULL pointer");
		}
		
		return this;
	}
	
	
	/**
	 * Set the Current Item of the Register wrapper class using the name of an existed Item.
	 */
	public RegItem SetExistItem(String ItemName)
	{
		theItem = GameData.getItemRegistry().getObject(ItemName);
		
		if(theItem == null)
		{
			Logs.err("The Item '"+ItemName+"' is not avaliable!");
		}
		
		return this;
	}
	
	
	public RegItem SetExistItem(Item item)
	{
		theItem = item;
		
		return this;
	}
	
	/**
	 * <b>The text below is from Minecraft Forge!</b><br>
     * Register the specified Item with a mod specific name : overrides the standard type based name.
     * 
     * @param name The mod-unique name to register it as - null will remove a custom name
     * @param modId deprecated, unused
     * where one mod should "own" all the blocks of all the mods, null defaults to the active mod
     */
	public void Reg(String name,String modId)
	{
		GameRegistry.registerItem(theItem, name, modId);
	}
	
	/**
	 * Container Item is the Container of other Item.
	 * For Example.bukkit is the container item of the lava_bukkit.
	 * 
	 * This setting will have effect on craft system.
	 * 
	 * @param ContainerItem
	 */
	public RegItem setContainerItem(Item ContainerItem)
	{
		theItem.setContainerItem(ContainerItem);
		
		return this;
	}
	
	/**
	 * Set the CreativeTable of the Item.Here are some available values:<br>
	 * <li>tabAllSearch</li>
	 * <li>tabBlock</li>
	 * <li>tabBrewing</li>
	 * <li>tabCombat</li>
	 * <li>tabDecorations</li>
	 * <li>tabFood</li>
	 * <li>tabInventory</li>
	 * <li>tabMaterials</li>
	 * <li>tabMisc</li>
	 * <li>tabRedstone</li>
	 * <li>tabTools</li>
	 * <li>tabTransport</li>
	 * @param CreativeTable the Name of the Creative Table
	 * @return
	 */
	public RegItem setCreativeTab(String CreativeTable)
	{
		CreativeTabs table = null;
		
		switch(CreativeTable)
		{
		case "tabAllSearch":
			table = CreativeTabs.tabAllSearch;
			break;
		case "tabBlock":
			table = CreativeTabs.tabBlock;
			break;
		case "tabBrewing":
			table = CreativeTabs.tabBrewing;
			break;
		case "tabCombat":
			table = CreativeTabs.tabCombat;
			break;
		case "tabDecorations":
			table = CreativeTabs.tabDecorations;
			break;
		case "tabFood":
			table = CreativeTabs.tabFood;
			break;
		case "tabInventory":
			table = CreativeTabs.tabInventory;
			break;
		case "tabMaterials":
			table = CreativeTabs.tabMaterials;
			break;
		case "tabMisc":
			table = CreativeTabs.tabMisc;
			break;
		case "tabRedstone":
			table = CreativeTabs.tabRedstone;
			break;
		case "tabTools":
			table = CreativeTabs.tabTools;
			break;
		case "tabTransport":
			table = CreativeTabs.tabTransport;
			break;
			
		}
		
		theItem.setCreativeTab(table);
		
		return this;
	}
	
	/**
	 * The Original form of this method
	 */
	public RegItem setCreativeTab(CreativeTabs table)
	{
		theItem.setCreativeTab(table);
		
		return this;
	}
	
	
	/**
	 * Sets bFull3D to True and return the object.
	 * 
	 * this feature will have a effect on the way of player holding items.
	 */
	public RegItem setFull3D()
	{
		theItem.setFull3D();
		
		return this;
	}
	
	/**
	 * <b>The text below is from Minecraft Forge!</b><br>
     * Sets or removes the harvest level for the specified tool class.
     * 
     * @param toolClass Class
     * @param level Harvest level:
     *     Wood:    0
     *     Stone:   1
     *     Iron:    2
     *     Diamond: 3
     *     Gold:    0
     */
	public RegItem setHarvestLevel(String toolClass , int level)
	{
		theItem.setHarvestLevel(toolClass, level);
		
		return this;
	}
	
	/**
	 * If it is different items in the same id,please set it true.
	 */
	public RegItem setHasSubtypes(Boolean Bool)
	{
		theItem.setHasSubtypes(Bool);
		
		return this;
	}
	
	/**
	 * set max damage of an Item
	 */
	public RegItem setMaxDamage(int MaxDamage)
	{
		theItem.setMaxDamage(MaxDamage);
		
		return this;
	}
	
	/**
	 * Set the Max Size of the Stack Size.
	 * For example:eggs or snow ball is only 16 ,but stone is 64.
	 * 
	 * Notice:if you set it larger than 64,the Game may run in some unexpected ways.
	 */
	public RegItem setMaxStackSize(int MaxStackSize)
	{
		if(MaxStackSize<=0)
		{
			Logs.err("The Item Stack is setted Too Small");
			return this;
		}
		
		if(MaxStackSize>64)
		{
			Logs.log("The Item Stack is setted Too Large!");
		}
		
		theItem.setMaxStackSize(MaxStackSize);
		

		return this;
	}
	
	/**
	 * if a tool is repairable,like sword,you can recipe two tools into one.
	 */
	public RegItem setNoRepair()
	{
		theItem.setNoRepair();
		
		return this;
	}
	
	/**
	 * Sets the string representing this item's effect on a potion when used as an ingredient
	 */
	public RegItem setPotionEffect(String effect)
	{
		theItem.setPotionEffect(effect);
		
		return this;
	}
	
	/**
	 * Set The Texture Name
	 */
	public RegItem setTextureName(String TextureName)
	{
		theItem.setTextureName(TextureName);
		
		return this;
	}
	
	/**
	 * Set The "Unlocalized Name" of an item.
	 * 
	 * This name is pretty like "english name"
	 */
	public RegItem setUnlocalizedName(String UnlocalizedName)
	{
		theItem.setUnlocalizedName(UnlocalizedName);
		
		return this;
	}
}

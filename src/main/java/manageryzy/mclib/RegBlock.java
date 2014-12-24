package manageryzy.mclib;

import cpw.mods.fml.common.registry.GameData;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.Block.SoundType;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemBlock;

/**
 * The Block wrapper class
 * 
 * 
 * @author manageryzy@gmail.com
 */
public class RegBlock
{
	private static Block theBlock;
	
	/**
	 * set the present block
	 */
	public RegBlock setBlock(Block b)
	{
		theBlock = b;
		
		return this;
	}
	
	public RegBlock setExistBlock(String BlockName)
	{
		theBlock = GameData.getBlockRegistry().getObject(BlockName);
		
		if(theBlock == null)
		{
			Logs.err(BlockName + "is not found"); 
		}
		
		return this;
	}
	
	public RegBlock setExistBlock(Block block)
	{
		theBlock = block;
		
		return this;		
	}
	
	public Block getBlock()
	{
		return theBlock;
	}
	
	public void Reg(String name)
	{
		GameRegistry.registerBlock(theBlock,  name);
	}
	
	public void Reg(String name, Class<? extends ItemBlock> ItemClass)
	{
		GameRegistry.registerBlock(theBlock, ItemClass, name);
	}
	
	public void Reg(String name,Class<? extends ItemBlock> itemclass, Object... itemCtorArgs)
	{
		GameRegistry.registerBlock(theBlock, itemclass, name, itemCtorArgs);
	}
	
	
	
	public RegBlock setBlockBounds(float minX,float minY,float minZ,float MaxX,float MaxY,float MaxZ)
	{
		theBlock.setBlockBounds(minX, minY, minZ, MaxX, MaxY, MaxZ);
		
		if(minX<0||minY<0||minZ<0||
				MaxX<minX||MaxY<minY||MaxZ<minZ||
				MaxX>1||MaxY>1||MaxZ>1)
		{
			Logs.log("the border of the block may be incorrect!");
		}
		
		return this;
	}
	
	public RegBlock setBlockName(String name)
	{
		theBlock.setBlockName(name);
		
		return this;
	}
	
	public RegBlock setBlockTextureName(String trxture)
	{
		theBlock.setBlockTextureName(trxture);
		
		return this;
	}
	
	public RegBlock setBlockUnbreakable()
	{
		theBlock.setBlockUnbreakable();
		
		return this;
	}
	
	public RegBlock setCreativeTab(CreativeTabs tab)
	{
		theBlock.setCreativeTab(tab);
		
		return this;
	}
	
	public RegBlock setCreativeTab(String CreativeTab)
	{
		CreativeTabs table = null;
		switch(CreativeTab)
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
		
		theBlock.setCreativeTab(table);
		
		return this;
	}
	
	
	public RegBlock setHardness(float hardness)
	{
		theBlock.setHardness(hardness);
		
		return this;
	}
	
	public RegBlock setHarvestLevel(String tool,int level)
	{
		theBlock.setHarvestLevel(tool, level);
		
		return this;
	}
	
	public RegBlock setLightLevel(float light)
	{
		theBlock.setLightLevel(light);
		
		return this;
	}
	
	public RegBlock setLightOpacity(int alpha)
	{
		theBlock.setLightOpacity(alpha);
		
		return this;
	}
	
	public RegBlock setResistance(float resistance)
	{
		theBlock.setResistance(resistance);
		
		return this;
	}
	
	public RegBlock setStepSound(String Sound)
	{
		SoundType soundType = null;
		
		switch(Sound)
		{
		case "Anvil":
			soundType = Block.soundTypeAnvil;
		case "Cloth":
			soundType = Block.soundTypeCloth;
		case "Glass":
			soundType = Block.soundTypeGlass;
		case "Grass":
			soundType = Block.soundTypeGrass;
		case "Gravel":
			soundType = Block.soundTypeGravel;
		case "Ladder":
			soundType = Block.soundTypeLadder;
		case "Metal":
			soundType = Block.soundTypeMetal;
		case "Piston":
			soundType = Block.soundTypePiston;
		case "Sand":
			soundType = Block.soundTypeSand;
		case "Snow":
			soundType = Block.soundTypeSnow;
		case "Stone":
			soundType = Block.soundTypeStone;
		case "Wood":
			soundType = Block.soundTypeWood;
		}
		
		theBlock.setStepSound(soundType);
		
		return this;
	}
	
	public RegBlock setTickRandomly(boolean Bool)
	{
		theBlock.setTickRandomly(Bool);
		
		return this;
	}
}
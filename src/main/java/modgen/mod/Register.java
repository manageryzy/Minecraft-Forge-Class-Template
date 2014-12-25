package modgen.mod;

import net.minecraft.block.material.Material;
import manageryzy.mclib.McLib;
import modgen.block.MyBlock;
import modgen.item.MyItem;


public class Register {
	static boolean isBlockReg = false;
	static boolean isItemReg = false;
	
	public static void BlockRegister()
	{
		if(isBlockReg)
			return;
		
		isBlockReg = true;
		
		McLib.getRegisterBlock().setBlock(new MyBlock(Material.wood))
			.setBlockBounds(0, 0, 0, 1, 1, 1)
			.setBlockName("MyFirstBlock")
			.setBlockTextureName("stone")
			.setBlockUnbreakable(false)
			.setCreativeTab("tabBlock")
			.setHardness(5)
			.setHarvestLevel("axe", 3)
			.setLightLevel(1.0F)
			.setLightOpacity(3)
			.setResistance(35)
			.setStepSound("Stone")
			.setTickRandomly(false)
			.Reg("myFirstBlock");
	}
	
	
	public static void ItemRegister()
	{
		if(isItemReg)
			return;
		
		isItemReg = true;
		
		
		McLib.getRegisterItem().SetItem(new MyItem())
			.setCreativeTab("tabBlock")
			.setFull3D()
			.setUnlocalizedName("MyItemName")
			.Reg("myFirstItem", "");
	}
}

package modgen.item;

import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class MyItem extends Item{

	public MyItem() {
		super();
	}
	
	@Override
	public void onArmorTick(World world, EntityPlayer player,
			ItemStack itemStack) {
		// TODO Auto-generated method stub
		super.onArmorTick(world, player, itemStack);
	}
	
	@Override
	public boolean onBlockDestroyed(ItemStack p_150894_1_, World p_150894_2_,
			Block p_150894_3_, int p_150894_4_, int p_150894_5_,
			int p_150894_6_, EntityLivingBase p_150894_7_) {
		// TODO Auto-generated method stub
		return super.onBlockDestroyed(p_150894_1_, p_150894_2_, p_150894_3_,
				p_150894_4_, p_150894_5_, p_150894_6_, p_150894_7_);
	}
	
	@Override
	public boolean onBlockStartBreak(ItemStack itemstack, int X, int Y, int Z,
			EntityPlayer player) {
		// TODO Auto-generated method stub
		return super.onBlockStartBreak(itemstack, X, Y, Z, player);
	}
	
	@Override
	public void onCreated(ItemStack p_77622_1_, World p_77622_2_,
			EntityPlayer p_77622_3_) {
		// TODO Auto-generated method stub
		super.onCreated(p_77622_1_, p_77622_2_, p_77622_3_);
	}
	
	@Override
	public boolean onDroppedByPlayer(ItemStack item, EntityPlayer player) {
		// TODO Auto-generated method stub
		return super.onDroppedByPlayer(item, player);
	}
	
	@Override
	public ItemStack onEaten(ItemStack p_77654_1_, World p_77654_2_,
			EntityPlayer p_77654_3_) {
		// TODO Auto-generated method stub
		return super.onEaten(p_77654_1_, p_77654_2_, p_77654_3_);
	}
	
	@Override
	public boolean onEntityItemUpdate(EntityItem entityItem) {
		// TODO Auto-generated method stub
		return super.onEntityItemUpdate(entityItem);
	}
	
	@Override
	public boolean onEntitySwing(EntityLivingBase entityLiving, ItemStack stack) {
		// TODO Auto-generated method stub
		return super.onEntitySwing(entityLiving, stack);
	}
	
	@Override
	public ItemStack onItemRightClick(ItemStack p_77659_1_, World p_77659_2_,
			EntityPlayer p_77659_3_) {
		// TODO Auto-generated method stub
		return super.onItemRightClick(p_77659_1_, p_77659_2_, p_77659_3_);
	}
	
	@Override
	public boolean onItemUse(ItemStack p_77648_1_, EntityPlayer p_77648_2_,
			World p_77648_3_, int p_77648_4_, int p_77648_5_, int p_77648_6_,
			int p_77648_7_, float p_77648_8_, float p_77648_9_,
			float p_77648_10_) {
		// TODO Auto-generated method stub
		return super
				.onItemUse(p_77648_1_, p_77648_2_, p_77648_3_, p_77648_4_, p_77648_5_,
						p_77648_6_, p_77648_7_, p_77648_8_, p_77648_9_, p_77648_10_);
	}
	
	@Override
	public boolean onItemUseFirst(ItemStack stack, EntityPlayer player,
			World world, int x, int y, int z, int side, float hitX, float hitY,
			float hitZ) {
		// TODO Auto-generated method stub
		return super.onItemUseFirst(stack, player, world, x, y, z, side, hitX, hitY,
				hitZ);
	}
	
	@Override
	public boolean onLeftClickEntity(ItemStack stack, EntityPlayer player,
			Entity entity) {
		// TODO Auto-generated method stub
		return super.onLeftClickEntity(stack, player, entity);
	}
	
	@Override
	public void onPlayerStoppedUsing(ItemStack p_77615_1_, World p_77615_2_,
			EntityPlayer p_77615_3_, int p_77615_4_) {
		// TODO Auto-generated method stub
		super.onPlayerStoppedUsing(p_77615_1_, p_77615_2_, p_77615_3_, p_77615_4_);
	}
	@Override
	public void onUpdate(ItemStack p_77663_1_, World p_77663_2_,
			Entity p_77663_3_, int p_77663_4_, boolean p_77663_5_) {
		// TODO Auto-generated method stub
		super.onUpdate(p_77663_1_, p_77663_2_, p_77663_3_, p_77663_4_, p_77663_5_);
	}
	@Override
	public void onUsingTick(ItemStack stack, EntityPlayer player, int count) {
		// TODO Auto-generated method stub
		super.onUsingTick(stack, player, count);
	}
	
}

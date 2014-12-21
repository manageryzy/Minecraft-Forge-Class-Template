package modgen.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.Explosion;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class MyBlock extends Block {

	public MyBlock(Material p_i45394_1_) {
		super(p_i45394_1_);
	}
	
	@Override
	public boolean onBlockActivated(World p_149727_1_, int p_149727_2_,
			int p_149727_3_, int p_149727_4_, EntityPlayer p_149727_5_,
			int p_149727_6_, float p_149727_7_, float p_149727_8_,
			float p_149727_9_) {
		// TODO Auto-generated method stub
		return super.onBlockActivated(p_149727_1_, p_149727_2_, p_149727_3_,
				p_149727_4_, p_149727_5_, p_149727_6_, p_149727_7_, p_149727_8_,
				p_149727_9_);
	}
	
	@Override
	public void onBlockAdded(World p_149726_1_, int p_149726_2_,
			int p_149726_3_, int p_149726_4_) {
		// TODO Auto-generated method stub
		super.onBlockAdded(p_149726_1_, p_149726_2_, p_149726_3_, p_149726_4_);
	}
	
	@Override
	public void onBlockClicked(World p_149699_1_, int p_149699_2_,
			int p_149699_3_, int p_149699_4_, EntityPlayer p_149699_5_) {
		// TODO Auto-generated method stub
		super.onBlockClicked(p_149699_1_, p_149699_2_, p_149699_3_, p_149699_4_,
				p_149699_5_);
	}
	
	@Override
	public void onBlockDestroyedByExplosion(World p_149723_1_, int p_149723_2_,
			int p_149723_3_, int p_149723_4_, Explosion p_149723_5_) {
		// TODO Auto-generated method stub
		super.onBlockDestroyedByExplosion(p_149723_1_, p_149723_2_, p_149723_3_,
				p_149723_4_, p_149723_5_);
	}
	
	@Override
	public void onBlockDestroyedByPlayer(World p_149664_1_, int p_149664_2_,
			int p_149664_3_, int p_149664_4_, int p_149664_5_) {
		// TODO Auto-generated method stub
		super.onBlockDestroyedByPlayer(p_149664_1_, p_149664_2_, p_149664_3_,
				p_149664_4_, p_149664_5_);
	}
	
	@Override
	public boolean onBlockEventReceived(World p_149696_1_, int p_149696_2_,
			int p_149696_3_, int p_149696_4_, int p_149696_5_, int p_149696_6_) {
		// TODO Auto-generated method stub
		return super.onBlockEventReceived(p_149696_1_, p_149696_2_, p_149696_3_,
				p_149696_4_, p_149696_5_, p_149696_6_);
	}
	
	@Override
	public void onBlockExploded(World world, int x, int y, int z,
			Explosion explosion) {
		// TODO Auto-generated method stub
		super.onBlockExploded(world, x, y, z, explosion);
	}
	
	@Override
	public void onBlockHarvested(World p_149681_1_, int p_149681_2_,
			int p_149681_3_, int p_149681_4_, int p_149681_5_,
			EntityPlayer p_149681_6_) {
		// TODO Auto-generated method stub
		super.onBlockHarvested(p_149681_1_, p_149681_2_, p_149681_3_, p_149681_4_,
				p_149681_5_, p_149681_6_);
	}
	
	@Override
	public int onBlockPlaced(World p_149660_1_, int p_149660_2_,
			int p_149660_3_, int p_149660_4_, int p_149660_5_,
			float p_149660_6_, float p_149660_7_, float p_149660_8_,
			int p_149660_9_) {
		// TODO Auto-generated method stub
		return super.onBlockPlaced(p_149660_1_, p_149660_2_, p_149660_3_, p_149660_4_,
				p_149660_5_, p_149660_6_, p_149660_7_, p_149660_8_, p_149660_9_);
	}
	
	@Override
	public void onBlockPlacedBy(World p_149689_1_, int p_149689_2_,
			int p_149689_3_, int p_149689_4_, EntityLivingBase p_149689_5_,
			ItemStack p_149689_6_) {
		// TODO Auto-generated method stub
		super.onBlockPlacedBy(p_149689_1_, p_149689_2_, p_149689_3_, p_149689_4_,
				p_149689_5_, p_149689_6_);
	}
	
	@Override
	public void onBlockPreDestroy(World p_149725_1_, int p_149725_2_,
			int p_149725_3_, int p_149725_4_, int p_149725_5_) {
		// TODO Auto-generated method stub
		super.onBlockPreDestroy(p_149725_1_, p_149725_2_, p_149725_3_, p_149725_4_,
				p_149725_5_);
	}
	
	@Override
	public void onEntityCollidedWithBlock(World p_149670_1_, int p_149670_2_,
			int p_149670_3_, int p_149670_4_, Entity p_149670_5_) {
		// TODO Auto-generated method stub
		super.onEntityCollidedWithBlock(p_149670_1_, p_149670_2_, p_149670_3_,
				p_149670_4_, p_149670_5_);
	}
	
	@Override
	public void onEntityWalking(World p_149724_1_, int p_149724_2_,
			int p_149724_3_, int p_149724_4_, Entity p_149724_5_) {
		// TODO Auto-generated method stub
		super.onEntityWalking(p_149724_1_, p_149724_2_, p_149724_3_, p_149724_4_,
				p_149724_5_);
	}
	
	@Override
	public void onFallenUpon(World p_149746_1_, int p_149746_2_,
			int p_149746_3_, int p_149746_4_, Entity p_149746_5_,
			float p_149746_6_) {
		// TODO Auto-generated method stub
		super.onFallenUpon(p_149746_1_, p_149746_2_, p_149746_3_, p_149746_4_,
				p_149746_5_, p_149746_6_);
	}
	
	@Override
	public void onNeighborBlockChange(World p_149695_1_, int p_149695_2_,
			int p_149695_3_, int p_149695_4_, Block p_149695_5_) {
		// TODO Auto-generated method stub
		super.onNeighborBlockChange(p_149695_1_, p_149695_2_, p_149695_3_, p_149695_4_,
				p_149695_5_);
	}
	
	@Override
	public void onNeighborChange(IBlockAccess world, int x, int y, int z,
			int tileX, int tileY, int tileZ) {
		// TODO Auto-generated method stub
		super.onNeighborChange(world, x, y, z, tileX, tileY, tileZ);
	}
	
	@Override
	public void onPlantGrow(World world, int x, int y, int z, int sourceX,
			int sourceY, int sourceZ) {
		// TODO Auto-generated method stub
		super.onPlantGrow(world, x, y, z, sourceX, sourceY, sourceZ);
	}
	
	@Override
	public void onPostBlockPlaced(World p_149714_1_, int p_149714_2_,
			int p_149714_3_, int p_149714_4_, int p_149714_5_) {
		// TODO Auto-generated method stub
		super.onPostBlockPlaced(p_149714_1_, p_149714_2_, p_149714_3_, p_149714_4_,
				p_149714_5_);
	}
	

}

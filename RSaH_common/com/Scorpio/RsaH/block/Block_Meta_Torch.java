package com.Scorpio.RsaH.block;

import java.util.List;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import net.minecraft.world.IBlockAccess;

import com.Scorpio.RsaH.lib.Reference;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class Block_Meta_Torch extends BlockWireRSaH
{
	
	@SideOnly(Side.CLIENT)
	public Icon[] icons;
	
	public Block_Meta_Torch(int id, boolean isLite)
	{
		super(id);
		this.setCreativeTab((CreativeTabs)null);
		this.setUnlocalizedName("BLOCK_TORCH_METABLOCKS_NAME");
	}
	
	@SideOnly(Side.CLIENT)
	
    /**
     * From the specified side and block metadata retrieves the blocks texture. Args: side, metadata
     */
	public Icon getIcon(int i, int j)
	{
		return this.icons[j];
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@SideOnly(Side.CLIENT)
	
    /**
     * returns a list of blocks with the same ID, but different meta (eg: wood returns 4 blocks)
     */
	public void getSubBlocks(int id, CreativeTabs creativeTab, List list)
	{
		for(int i = 0; i < 32; ++i)
		{
			list.add(new ItemStack(id, 1, i));
		}
	}
	
    /**
     * Can this block provide power. Only wire currently seems to have this change based on its state.
     */
    public boolean canProvidePower()
    {
        return true;
    }
    
    /**
     * Returns true if the block is emitting indirect/weak redstone power on the specified side. If isBlockNormalCube
     * returns true, standard redstone propagation rules will apply instead and this will not be called. Args: World, X,
     * Y, Z, side. Note that the side is reversed - eg it is 1 (up) when checking the bottom of the block.
     */
    public int isProvidingWeakPower(IBlockAccess par1IBlockAccess, int par2, int par3, int par4, int par5)
    {
        return 15;
    }
    
	@SideOnly(Side.CLIENT)
	
    /**
     * When this method is called, your block should register all the icons it needs with the given IconRegister. This
     * is the only chance you get to register icons.
     */
	public void registerIcons(IconRegister iconRegister)
	{
		this.icons = new Icon[32];
		
		for (int i = 0; i < this.icons.length; ++i)
		{
			this.icons[i] = iconRegister.registerIcon(Reference.MOD_ID + ":" + this.getUnlocalizedName2() + i);
		}
	}
}

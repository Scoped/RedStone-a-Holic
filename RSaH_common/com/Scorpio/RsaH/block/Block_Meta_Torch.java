package com.Scorpio.RsaH.block;

import java.util.List;
import java.util.Random;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;

import com.Scorpio.RsaH.RedStone_a_holic;
import com.Scorpio.RsaH.lib.Reference;
import com.Scorpio.RsaH.lib.Strings;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class Block_Meta_Torch extends BlockTorchRSaH
{
    /** Whether the redstone torch is currently active or not. */
    private boolean torchActive = false;
	
	@SideOnly(Side.CLIENT)
	public Icon[] icons;
	
	public Block_Meta_Torch(int id, boolean isLite)
	{
		super(id, isLite);
        this.torchActive = isLite;
        this.setTickRandomly(true);
		this.setCreativeTab(RedStone_a_holic.TabRSaH);
		this.setUnlocalizedName(Strings.BLOCK_TORCH_METABLOCKS_NAME);
	}
	
    /**
     * Returns the ID of the items to drop on destruction.
     */
    public int idDropped(int par1, Random par2Random, int par3)
    {
        return this.blockID;
    }
	
    /**
     * Returns true if the given block ID is equivalent to this one. Example: redstoneTorchOn matches itself and
     * redstoneTorchOff, and vice versa. Most blocks only match themselves.
     */
    public boolean isAssociatedBlockID(int par1)
    {
        return par1 == ModBlocks.MetaTorchIdleBlocks.blockID || par1 == ModBlocks.MetaTorchActiveBlocks.blockID;
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
		for(int i = 0; i < 14; ++i)
		{
			list.add(new ItemStack(id, 1, i));
		}
	}
    
	@SideOnly(Side.CLIENT)
	
    /**
     * When this method is called, your block should register all the icons it needs with the given IconRegister. This
     * is the only chance you get to register icons.
     */
	public void registerIcons(IconRegister iconRegister)
	{
		this.icons = new Icon[14];
		
		for (int i = 0; i < this.icons.length; ++i)
		{
			this.icons[i] = iconRegister.registerIcon(Reference.MOD_ID + ":" + this.getUnlocalizedName2() + i);
		}
	}
}

package com.Scorpio.RsaH.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockRedstoneTorch;
import net.minecraft.client.renderer.texture.IconRegister;

import com.Scorpio.RsaH.lib.Reference;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockTorchRSaH extends BlockRedstoneTorch
{

    private String IconTorchLit;
    private String IconTorch;
    
    protected boolean isTorchActive;
    
    public Block setIconTorchLit(String iconTorchLit)
    {
    	this.IconTorchLit = iconTorchLit;
    	return this;
    }
    
    public Block setIconTorch(String iconTorch)
    {
    	this.IconTorch = iconTorch;
    	return this;
    }

	public String getIconTorchLit()
	{
		return "tile." + this.IconTorchLit;
	}

	public String getIconTorch()
	{
		return "tile." + this.IconTorch;
	}

	public BlockTorchRSaH(int id, boolean isLite)
	{
		super(id, isLite);
	}

    @SideOnly(Side.CLIENT)
    
    /**
     * When this method is called, your block should register all the icons it needs with the given IconRegister. This
     * is the only chance you get to register icons.
     */
    public void registerIcons(IconRegister register)
    {
        if (this.isTorchActive)
        {
            this.blockIcon = register.registerIcon(Reference.MOD_ID + ":" + this.getIconTorchLit().substring(this.getIconTorchLit().indexOf(".")+1));
        }
        else
        {
            this.blockIcon = register.registerIcon(Reference.MOD_ID + ":" + this.getIconTorch().substring(this.getIconTorch().indexOf(".")+1));
        }
    }
}
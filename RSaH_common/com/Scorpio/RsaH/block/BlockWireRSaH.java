package com.Scorpio.RsaH.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockRedstoneWire;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.util.Icon;

import com.Scorpio.RsaH.lib.Reference;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockWireRSaH extends BlockRedstoneWire
{
	
    @SideOnly(Side.CLIENT)
    private Icon iconCross1; //field_94413_c
    @SideOnly(Side.CLIENT)
    private Icon iconLine2;//field_94410_cO
    @SideOnly(Side.CLIENT)
    private Icon iconCrossOverlay3;//field_94411_cP
    @SideOnly(Side.CLIENT)
    private Icon iconCrossOverlay4;//field_94412_cQ
    
    private String IconCross;
    private String IconLine;
    private String IconCrossOverlay;
    private String IconLineOverlay;
    
    public Block setIconCross(String iconCross)
    {
    	this.IconCross = iconCross;
    	return this;
    }
    
    public Block setIconLine(String iconLine)
    {
    	this.IconLine = iconLine;
    	return this;
    }
    
    public Block setIconCrossOverlay(String iconCrossOverlay)
    {
    	this.IconCrossOverlay = iconCrossOverlay;
    	return this;
    }
    
    public Block setIconLineOverlay(String iconLineOverlay)
    {
    	this.IconLineOverlay = iconLineOverlay;
    	return this;
    }
    
	public BlockWireRSaH(int id)
	{
		super(id);
	}
	
	public String getIconCross()
	{
		return "tile." + this.IconCross;
	}
	
	public String getIconLine()
	{
		return "tile." + this.IconLine;
	}
	
	public String getIconCrossOverlay()
	{
		return "tile." + this.IconCrossOverlay;
	}
	
	public String getIconLineOverlay()
	{
		return "tile." + this.IconLineOverlay;
	}
	
	@SideOnly(Side.CLIENT)
	@Override
	public void registerIcons(IconRegister register)
	{
		blockIcon = iconCross1;
		iconCross1 = register.registerIcon(Reference.MOD_ID + ":" + this.getIconCross().substring(this.getIconCross().indexOf(".")+1));
		iconLine2 = register.registerIcon(Reference.MOD_ID + ":" + this.getIconCrossOverlay().substring(this.getIconCrossOverlay().indexOf(".")+1));
		iconCrossOverlay3 = register.registerIcon(Reference.MOD_ID + ":" + this.getIconLine().substring(this.getIconLine().indexOf(".")+1));
		iconCrossOverlay4 = register.registerIcon(Reference.MOD_ID + ":" + this.getIconLineOverlay().substring(this.getIconLineOverlay().indexOf(".")+1));
	}
}

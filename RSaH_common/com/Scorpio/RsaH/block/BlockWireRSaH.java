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
	protected static Icon iconCross;
    @SideOnly(Side.CLIENT)
    protected static Icon iconLine;
    @SideOnly(Side.CLIENT)
    protected static Icon iconCrossOverlay;
    @SideOnly(Side.CLIENT)
    protected static Icon iconLineOverlay;
    
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
		iconCross = register.registerIcon(Reference.MOD_ID + ":" + this.getIconCross().substring(this.getIconCross().indexOf(".")+1));
		iconLine = register.registerIcon(Reference.MOD_ID + ":" + this.getIconCrossOverlay().substring(this.getIconCrossOverlay().indexOf(".")+1));
		iconCrossOverlay = register.registerIcon(Reference.MOD_ID + ":" + this.getIconLine().substring(this.getIconLine().indexOf(".")+1));
		iconLineOverlay = register.registerIcon(Reference.MOD_ID + ":" + this.getIconLineOverlay().substring(this.getIconLineOverlay().indexOf(".")+1));
		this.blockIcon = BlockWireRSaH.iconCross;
	}
	
    @SideOnly(Side.CLIENT)
    public Icon icon(String par0Str)
    {
        return par0Str == this.getIconCross() ? BlockWireRSaH.iconCross : (par0Str == this.getIconLine() ? BlockWireRSaH.iconLine : (par0Str == this.getIconCrossOverlay() ? BlockWireRSaH.iconCrossOverlay : (par0Str == this.getIconLineOverlay() ? BlockWireRSaH.iconLineOverlay : null)));
    }
}

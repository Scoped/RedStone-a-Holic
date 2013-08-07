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
    
    private static String IconCross;
    private static String IconLine;
    private static String IconCrossOverlay;
    private static String IconLineOverlay;
    
    public Block setIconCross(String iconCross)
    {
    	IconCross = iconCross;
    	return this;
    }
    
    public Block setIconLine(String iconLine)
    {
    	IconLine = iconLine;
    	return this;
    }
    
    public Block setIconCrossOverlay(String iconCrossOverlay)
    {
    	IconCrossOverlay = iconCrossOverlay;
    	return this;
    }
    
    public Block setIconLineOverlay(String iconLineOverlay)
    {
    	IconLineOverlay = iconLineOverlay;
    	return this;
    }
    
	public BlockWireRSaH(int id)
	{
		super(id);
	}
	
	public static String getIconCross()
	{
		return "tile." + IconCross;
	}
	
	public static String getIconLine()
	{
		return "tile." + IconLine;
	}
	
	public static String getIconCrossOverlay()
	{
		return "tile." + IconCrossOverlay;
	}
	
	public static String getIconLineOverlay()
	{
		return "tile." + IconLineOverlay;
	}
	
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister register)
	{
		iconCross = register.registerIcon(Reference.MOD_ID + ":" + getIconCross().substring(getIconCross().indexOf(".")+1));
		iconLine = register.registerIcon(Reference.MOD_ID + ":" + getIconCrossOverlay().substring(getIconCrossOverlay().indexOf(".")+1));
		iconCrossOverlay = register.registerIcon(Reference.MOD_ID + ":" + getIconLine().substring(getIconLine().indexOf(".")+1));
		iconLineOverlay = register.registerIcon(Reference.MOD_ID + ":" + getIconLineOverlay().substring(getIconLineOverlay().indexOf(".")+1));
		this.blockIcon = BlockWireRSaH.iconCross;
	}
	
    @SideOnly(Side.CLIENT)
    public static Icon icon(String par0Str)
    {
        return par0Str == getIconCross() ? BlockWireRSaH.iconCross : (par0Str == getIconLine() ? BlockWireRSaH.iconLine : (par0Str == getIconCrossOverlay() ? BlockWireRSaH.iconCrossOverlay : (par0Str == getIconLineOverlay() ? BlockWireRSaH.iconLineOverlay : null)));
    }
}

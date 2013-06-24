package com.Scorpio.RsaH.tileEntity;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;

import org.lwjgl.opengl.GL11;

import com.Scorpio.RsaH.lib.Reference;
import com.Scorpio.RsaH.model.ModelWire;

public class TileEntityWireRenderer extends TileEntitySpecialRenderer
{
	private ModelWire model;

	public TileEntityWireRenderer()
	{
		model = new ModelWire();
	}

    private String IconCross;
    private String IconLine;
    private String IconCrossOverlay;
    private String IconLineOverlay;
    
    public TileEntityWireRenderer setIconCross(String iconCross)
    {
    	this.IconCross = iconCross;
    	return this;
    }
    
    public TileEntityWireRenderer setIconLine(String iconLine)
    {
    	this.IconLine = iconLine;
    	return this;
    }
    
    public TileEntityWireRenderer setIconCrossOverlay(String iconCrossOverlay)
    {
    	this.IconCrossOverlay = iconCrossOverlay;
    	return this;
    }
    
    public TileEntityWireRenderer setIconLineOverlay(String iconLineOverlay)
    {
    	this.IconLineOverlay = iconLineOverlay;
    	return this;
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
	
	public void renderAModelAt(TileEntityWire tile, double d, double d1, double d2, float f)
	{

		int i =0; // a regular int, with a zero. more on this below
		
		if(tile.worldObj != null) // to tell the world that your object is placed.
		{
			i =(tile.worldObj.getBlockMetadata(tile.xCoord, tile.yCoord, tile.zCoord)); // to tell the game it needs to pick up metadata from your block
		}
		
			switch (i) // the good part. get's your block muliple textures
			{
			case 0:
				bindTextureByName(Reference.MOD_ID + ":" + this.getIconCross().substring(this.getIconCross().indexOf(".")+1)); // bindTextureByName + the path to your image. for the block that you gave damage number 0
				break;
			case 1:
				bindTextureByName("/subaraki/pillar.png"); // and so on and so on
				break;
			case 2:
				bindTextureByName("/subaraki/pillar2.png");
				break;
			case 3:
				bindTextureByName("/subaraki/pillar4.png");
				break;
			case 4:
				bindTextureByName("/subaraki/pillar5.png");
				break;
			case 5:
				bindTextureByName("/subaraki/pillar6.png");
				break;
			case 6:
				bindTextureByName("/subaraki/pillar7.png");
				break;
			case 7:
				bindTextureByName("/subaraki/pillar8.png");
				break;
			case 8:
				bindTextureByName("/subaraki/pillar9.png");
				break;
			case 9:
				bindTextureByName("/subaraki/pillar10.png");
				break;
			case 10:
				bindTextureByName("/subaraki/pillar11.png");
				break;
			default:
				bindTextureByName(Reference.MOD_ID + ":" + this.getIconCross().substring(this.getIconCross().indexOf(".")+1));
			}
			
			GL11.glPushMatrix();
			GL11.glTranslatef((float)d + 0.5F, (float)d1 + 1.5F, (float)d2 + 0.5F); //size
			GL11.glRotatef(0, 0.0F, 1.0F, 0.0F);
			GL11.glScalef(1.0F, -1F, -1F);
			model.renderModel(0.0625F);
			GL11.glPopMatrix();
	}
	
	public void renderTileEntityAt(TileEntity tileentity, double d, double d1, double d2, float f)
	{
		renderAModelAt((TileEntityWire) tileentity, d, d1, d2, f);
	}
	
}

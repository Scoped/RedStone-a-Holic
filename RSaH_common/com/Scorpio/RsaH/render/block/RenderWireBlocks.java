package com.Scorpio.RsaH.render.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockRedstoneWire;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.src.FMLRenderAccessLibrary;
import net.minecraft.util.Icon;
import net.minecraft.world.IBlockAccess;

public class RenderWireBlocks
{
	
    /** The IBlockAccess used by this instance of RenderBlocks */
    public IBlockAccess blockAccess;
    public final Minecraft minecraftRB;
	
    public RenderWireBlocks(IBlockAccess par1IBlockAccess)
    {
        this.blockAccess = par1IBlockAccess;
        this.minecraftRB = Minecraft.getMinecraft();
    }

    public RenderWireBlocks()
    {
        this.minecraftRB = Minecraft.getMinecraft();
    }
    
    /**
     * Renders a redstone wire block at the given coordinates
     */
    public boolean renderBlockRedstoneWire(Block par1Block, int par2, int par3, int par4)
    {
        Tessellator tessellator = Tessellator.instance;
        int l = this.blockAccess.getBlockMetadata(par2, par3, par4);
        Icon icon = BlockRedstoneWire.func_94409_b("redstoneDust_cross");
        Icon icon1 = BlockRedstoneWire.func_94409_b("redstoneDust_line");
        Icon icon2 = BlockRedstoneWire.func_94409_b("redstoneDust_cross_overlay");
        Icon icon3 = BlockRedstoneWire.func_94409_b("redstoneDust_line_overlay");
        tessellator.setBrightness(par1Block.getMixedBrightnessForBlock(this.blockAccess, par2, par3, par4));
        float f = 1.0F;
        float f1 = (float)l / 15.0F;
        float f2 = f1 * 0.6F + 0.4F;

        if (l == 0)
        {
            f2 = 0.3F;
        }

        float f3 = f1 * f1 * 0.7F - 0.5F;
        float f4 = f1 * f1 * 0.6F - 0.7F;

        if (f3 < 0.0F)
        {
            f3 = 0.0F;
        }

        if (f4 < 0.0F)
        {
            f4 = 0.0F;
        }

        tessellator.setColorOpaque_F(f2, f3, f4);
        boolean flag = BlockRedstoneWire.isPowerProviderOrWire(this.blockAccess, par2 - 1, par3, par4, 1) || !this.blockAccess.isBlockNormalCube(par2 - 1, par3, par4) && BlockRedstoneWire.isPowerProviderOrWire(this.blockAccess, par2 - 1, par3 - 1, par4, -1);
        boolean flag1 = BlockRedstoneWire.isPowerProviderOrWire(this.blockAccess, par2 + 1, par3, par4, 3) || !this.blockAccess.isBlockNormalCube(par2 + 1, par3, par4) && BlockRedstoneWire.isPowerProviderOrWire(this.blockAccess, par2 + 1, par3 - 1, par4, -1);
        boolean flag2 = BlockRedstoneWire.isPowerProviderOrWire(this.blockAccess, par2, par3, par4 - 1, 2) || !this.blockAccess.isBlockNormalCube(par2, par3, par4 - 1) && BlockRedstoneWire.isPowerProviderOrWire(this.blockAccess, par2, par3 - 1, par4 - 1, -1);
        boolean flag3 = BlockRedstoneWire.isPowerProviderOrWire(this.blockAccess, par2, par3, par4 + 1, 0) || !this.blockAccess.isBlockNormalCube(par2, par3, par4 + 1) && BlockRedstoneWire.isPowerProviderOrWire(this.blockAccess, par2, par3 - 1, par4 + 1, -1);

        if (!this.blockAccess.isBlockNormalCube(par2, par3 + 1, par4))
        {
            if (this.blockAccess.isBlockNormalCube(par2 - 1, par3, par4) && BlockRedstoneWire.isPowerProviderOrWire(this.blockAccess, par2 - 1, par3 + 1, par4, -1))
            {
                flag = true;
            }

            if (this.blockAccess.isBlockNormalCube(par2 + 1, par3, par4) && BlockRedstoneWire.isPowerProviderOrWire(this.blockAccess, par2 + 1, par3 + 1, par4, -1))
            {
                flag1 = true;
            }

            if (this.blockAccess.isBlockNormalCube(par2, par3, par4 - 1) && BlockRedstoneWire.isPowerProviderOrWire(this.blockAccess, par2, par3 + 1, par4 - 1, -1))
            {
                flag2 = true;
            }

            if (this.blockAccess.isBlockNormalCube(par2, par3, par4 + 1) && BlockRedstoneWire.isPowerProviderOrWire(this.blockAccess, par2, par3 + 1, par4 + 1, -1))
            {
                flag3 = true;
            }
        }

        float f5 = (float)(par2 + 0);
        float f6 = (float)(par2 + 1);
        float f7 = (float)(par4 + 0);
        float f8 = (float)(par4 + 1);
        int i1 = 0;

        if ((flag || flag1) && !flag2 && !flag3)
        {
            i1 = 1;
        }

        if ((flag2 || flag3) && !flag1 && !flag)
        {
            i1 = 2;
        }

        if (i1 == 0)
        {
            int j1 = 0;
            int k1 = 0;
            int l1 = 16;
            int i2 = 16;

            if (!flag)
            {
                f5 += 0.3125F;
            }

            if (!flag)
            {
                j1 += 5;
            }

            if (!flag1)
            {
                f6 -= 0.3125F;
            }

            if (!flag1)
            {
                l1 -= 5;
            }

            if (!flag2)
            {
                f7 += 0.3125F;
            }

            if (!flag2)
            {
                k1 += 5;
            }

            if (!flag3)
            {
                f8 -= 0.3125F;
            }

            if (!flag3)
            {
                i2 -= 5;
            }

            tessellator.addVertexWithUV((double)f6, (double)par3 + 0.015625D, (double)f8, (double)icon.getInterpolatedU((double)l1), (double)icon.getInterpolatedV((double)i2));
            tessellator.addVertexWithUV((double)f6, (double)par3 + 0.015625D, (double)f7, (double)icon.getInterpolatedU((double)l1), (double)icon.getInterpolatedV((double)k1));
            tessellator.addVertexWithUV((double)f5, (double)par3 + 0.015625D, (double)f7, (double)icon.getInterpolatedU((double)j1), (double)icon.getInterpolatedV((double)k1));
            tessellator.addVertexWithUV((double)f5, (double)par3 + 0.015625D, (double)f8, (double)icon.getInterpolatedU((double)j1), (double)icon.getInterpolatedV((double)i2));
            tessellator.setColorOpaque_F(f, f, f);
            tessellator.addVertexWithUV((double)f6, (double)par3 + 0.015625D, (double)f8, (double)icon2.getInterpolatedU((double)l1), (double)icon2.getInterpolatedV((double)i2));
            tessellator.addVertexWithUV((double)f6, (double)par3 + 0.015625D, (double)f7, (double)icon2.getInterpolatedU((double)l1), (double)icon2.getInterpolatedV((double)k1));
            tessellator.addVertexWithUV((double)f5, (double)par3 + 0.015625D, (double)f7, (double)icon2.getInterpolatedU((double)j1), (double)icon2.getInterpolatedV((double)k1));
            tessellator.addVertexWithUV((double)f5, (double)par3 + 0.015625D, (double)f8, (double)icon2.getInterpolatedU((double)j1), (double)icon2.getInterpolatedV((double)i2));
        }
        else if (i1 == 1)
        {
            tessellator.addVertexWithUV((double)f6, (double)par3 + 0.015625D, (double)f8, (double)icon1.getMaxU(), (double)icon1.getMaxV());
            tessellator.addVertexWithUV((double)f6, (double)par3 + 0.015625D, (double)f7, (double)icon1.getMaxU(), (double)icon1.getMinV());
            tessellator.addVertexWithUV((double)f5, (double)par3 + 0.015625D, (double)f7, (double)icon1.getMinU(), (double)icon1.getMinV());
            tessellator.addVertexWithUV((double)f5, (double)par3 + 0.015625D, (double)f8, (double)icon1.getMinU(), (double)icon1.getMaxV());
            tessellator.setColorOpaque_F(f, f, f);
            tessellator.addVertexWithUV((double)f6, (double)par3 + 0.015625D, (double)f8, (double)icon3.getMaxU(), (double)icon3.getMaxV());
            tessellator.addVertexWithUV((double)f6, (double)par3 + 0.015625D, (double)f7, (double)icon3.getMaxU(), (double)icon3.getMinV());
            tessellator.addVertexWithUV((double)f5, (double)par3 + 0.015625D, (double)f7, (double)icon3.getMinU(), (double)icon3.getMinV());
            tessellator.addVertexWithUV((double)f5, (double)par3 + 0.015625D, (double)f8, (double)icon3.getMinU(), (double)icon3.getMaxV());
        }
        else
        {
            tessellator.addVertexWithUV((double)f6, (double)par3 + 0.015625D, (double)f8, (double)icon1.getMaxU(), (double)icon1.getMaxV());
            tessellator.addVertexWithUV((double)f6, (double)par3 + 0.015625D, (double)f7, (double)icon1.getMinU(), (double)icon1.getMaxV());
            tessellator.addVertexWithUV((double)f5, (double)par3 + 0.015625D, (double)f7, (double)icon1.getMinU(), (double)icon1.getMinV());
            tessellator.addVertexWithUV((double)f5, (double)par3 + 0.015625D, (double)f8, (double)icon1.getMaxU(), (double)icon1.getMinV());
            tessellator.setColorOpaque_F(f, f, f);
            tessellator.addVertexWithUV((double)f6, (double)par3 + 0.015625D, (double)f8, (double)icon3.getMaxU(), (double)icon3.getMaxV());
            tessellator.addVertexWithUV((double)f6, (double)par3 + 0.015625D, (double)f7, (double)icon3.getMinU(), (double)icon3.getMaxV());
            tessellator.addVertexWithUV((double)f5, (double)par3 + 0.015625D, (double)f7, (double)icon3.getMinU(), (double)icon3.getMinV());
            tessellator.addVertexWithUV((double)f5, (double)par3 + 0.015625D, (double)f8, (double)icon3.getMaxU(), (double)icon3.getMinV());
        }

        if (!this.blockAccess.isBlockNormalCube(par2, par3 + 1, par4))
        {
            if (this.blockAccess.isBlockNormalCube(par2 - 1, par3, par4) && this.blockAccess.getBlockId(par2 - 1, par3 + 1, par4) == Block.redstoneWire.blockID)
            {
                tessellator.setColorOpaque_F(f * f2, f * f3, f * f4);
                tessellator.addVertexWithUV((double)par2 + 0.015625D, (double)((float)(par3 + 1) + 0.021875F), (double)(par4 + 1), (double)icon1.getMaxU(), (double)icon1.getMinV());
                tessellator.addVertexWithUV((double)par2 + 0.015625D, (double)(par3 + 0), (double)(par4 + 1), (double)icon1.getMinU(), (double)icon1.getMinV());
                tessellator.addVertexWithUV((double)par2 + 0.015625D, (double)(par3 + 0), (double)(par4 + 0), (double)icon1.getMinU(), (double)icon1.getMaxV());
                tessellator.addVertexWithUV((double)par2 + 0.015625D, (double)((float)(par3 + 1) + 0.021875F), (double)(par4 + 0), (double)icon1.getMaxU(), (double)icon1.getMaxV());
                tessellator.setColorOpaque_F(f, f, f);
                tessellator.addVertexWithUV((double)par2 + 0.015625D, (double)((float)(par3 + 1) + 0.021875F), (double)(par4 + 1), (double)icon3.getMaxU(), (double)icon3.getMinV());
                tessellator.addVertexWithUV((double)par2 + 0.015625D, (double)(par3 + 0), (double)(par4 + 1), (double)icon3.getMinU(), (double)icon3.getMinV());
                tessellator.addVertexWithUV((double)par2 + 0.015625D, (double)(par3 + 0), (double)(par4 + 0), (double)icon3.getMinU(), (double)icon3.getMaxV());
                tessellator.addVertexWithUV((double)par2 + 0.015625D, (double)((float)(par3 + 1) + 0.021875F), (double)(par4 + 0), (double)icon3.getMaxU(), (double)icon3.getMaxV());
            }

            if (this.blockAccess.isBlockNormalCube(par2 + 1, par3, par4) && this.blockAccess.getBlockId(par2 + 1, par3 + 1, par4) == Block.redstoneWire.blockID)
            {
                tessellator.setColorOpaque_F(f * f2, f * f3, f * f4);
                tessellator.addVertexWithUV((double)(par2 + 1) - 0.015625D, (double)(par3 + 0), (double)(par4 + 1), (double)icon1.getMinU(), (double)icon1.getMaxV());
                tessellator.addVertexWithUV((double)(par2 + 1) - 0.015625D, (double)((float)(par3 + 1) + 0.021875F), (double)(par4 + 1), (double)icon1.getMaxU(), (double)icon1.getMaxV());
                tessellator.addVertexWithUV((double)(par2 + 1) - 0.015625D, (double)((float)(par3 + 1) + 0.021875F), (double)(par4 + 0), (double)icon1.getMaxU(), (double)icon1.getMinV());
                tessellator.addVertexWithUV((double)(par2 + 1) - 0.015625D, (double)(par3 + 0), (double)(par4 + 0), (double)icon1.getMinU(), (double)icon1.getMinV());
                tessellator.setColorOpaque_F(f, f, f);
                tessellator.addVertexWithUV((double)(par2 + 1) - 0.015625D, (double)(par3 + 0), (double)(par4 + 1), (double)icon3.getMinU(), (double)icon3.getMaxV());
                tessellator.addVertexWithUV((double)(par2 + 1) - 0.015625D, (double)((float)(par3 + 1) + 0.021875F), (double)(par4 + 1), (double)icon3.getMaxU(), (double)icon3.getMaxV());
                tessellator.addVertexWithUV((double)(par2 + 1) - 0.015625D, (double)((float)(par3 + 1) + 0.021875F), (double)(par4 + 0), (double)icon3.getMaxU(), (double)icon3.getMinV());
                tessellator.addVertexWithUV((double)(par2 + 1) - 0.015625D, (double)(par3 + 0), (double)(par4 + 0), (double)icon3.getMinU(), (double)icon3.getMinV());
            }

            if (this.blockAccess.isBlockNormalCube(par2, par3, par4 - 1) && this.blockAccess.getBlockId(par2, par3 + 1, par4 - 1) == Block.redstoneWire.blockID)
            {
                tessellator.setColorOpaque_F(f * f2, f * f3, f * f4);
                tessellator.addVertexWithUV((double)(par2 + 1), (double)(par3 + 0), (double)par4 + 0.015625D, (double)icon1.getMinU(), (double)icon1.getMaxV());
                tessellator.addVertexWithUV((double)(par2 + 1), (double)((float)(par3 + 1) + 0.021875F), (double)par4 + 0.015625D, (double)icon1.getMaxU(), (double)icon1.getMaxV());
                tessellator.addVertexWithUV((double)(par2 + 0), (double)((float)(par3 + 1) + 0.021875F), (double)par4 + 0.015625D, (double)icon1.getMaxU(), (double)icon1.getMinV());
                tessellator.addVertexWithUV((double)(par2 + 0), (double)(par3 + 0), (double)par4 + 0.015625D, (double)icon1.getMinU(), (double)icon1.getMinV());
                tessellator.setColorOpaque_F(f, f, f);
                tessellator.addVertexWithUV((double)(par2 + 1), (double)(par3 + 0), (double)par4 + 0.015625D, (double)icon3.getMinU(), (double)icon3.getMaxV());
                tessellator.addVertexWithUV((double)(par2 + 1), (double)((float)(par3 + 1) + 0.021875F), (double)par4 + 0.015625D, (double)icon3.getMaxU(), (double)icon3.getMaxV());
                tessellator.addVertexWithUV((double)(par2 + 0), (double)((float)(par3 + 1) + 0.021875F), (double)par4 + 0.015625D, (double)icon3.getMaxU(), (double)icon3.getMinV());
                tessellator.addVertexWithUV((double)(par2 + 0), (double)(par3 + 0), (double)par4 + 0.015625D, (double)icon3.getMinU(), (double)icon3.getMinV());
            }

            if (this.blockAccess.isBlockNormalCube(par2, par3, par4 + 1) && this.blockAccess.getBlockId(par2, par3 + 1, par4 + 1) == Block.redstoneWire.blockID)
            {
                tessellator.setColorOpaque_F(f * f2, f * f3, f * f4);
                tessellator.addVertexWithUV((double)(par2 + 1), (double)((float)(par3 + 1) + 0.021875F), (double)(par4 + 1) - 0.015625D, (double)icon1.getMaxU(), (double)icon1.getMinV());
                tessellator.addVertexWithUV((double)(par2 + 1), (double)(par3 + 0), (double)(par4 + 1) - 0.015625D, (double)icon1.getMinU(), (double)icon1.getMinV());
                tessellator.addVertexWithUV((double)(par2 + 0), (double)(par3 + 0), (double)(par4 + 1) - 0.015625D, (double)icon1.getMinU(), (double)icon1.getMaxV());
                tessellator.addVertexWithUV((double)(par2 + 0), (double)((float)(par3 + 1) + 0.021875F), (double)(par4 + 1) - 0.015625D, (double)icon1.getMaxU(), (double)icon1.getMaxV());
                tessellator.setColorOpaque_F(f, f, f);
                tessellator.addVertexWithUV((double)(par2 + 1), (double)((float)(par3 + 1) + 0.021875F), (double)(par4 + 1) - 0.015625D, (double)icon3.getMaxU(), (double)icon3.getMinV());
                tessellator.addVertexWithUV((double)(par2 + 1), (double)(par3 + 0), (double)(par4 + 1) - 0.015625D, (double)icon3.getMinU(), (double)icon3.getMinV());
                tessellator.addVertexWithUV((double)(par2 + 0), (double)(par3 + 0), (double)(par4 + 1) - 0.015625D, (double)icon3.getMinU(), (double)icon3.getMaxV());
                tessellator.addVertexWithUV((double)(par2 + 0), (double)((float)(par3 + 1) + 0.021875F), (double)(par4 + 1) - 0.015625D, (double)icon3.getMaxU(), (double)icon3.getMaxV());
            }
        }

        return true;
    }
}

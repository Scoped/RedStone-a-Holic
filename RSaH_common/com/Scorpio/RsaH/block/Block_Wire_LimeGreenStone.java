package com.Scorpio.RsaH.block;

import java.util.Random;

import net.minecraft.util.Direction;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

import com.Scorpio.RsaH.item.ModItems;
import com.Scorpio.RsaH.lib.Strings;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class Block_Wire_LimeGreenStone extends BlockWireRSaH
{
    
	public Block_Wire_LimeGreenStone(int id)
	{
		super(id);
		this.setUnlocalizedName(Strings.BLOCK_WIRE_LIMEGREENSTONE_NAME);
		this.setIconCross("LimeGreenStoneDust_Cross");
		this.setIconCrossOverlay("LimeGreenStoneDust_Cross_Overlay");
		this.setIconLine("LimeGreenStoneDust_Line");
		this.setIconLineOverlay("LimeGreenStoneDust_Line_Overlay");
	}
	
    @SideOnly(Side.CLIENT)
    /**
     * Returns a integer with hex for 0xrrggbb with this color multiplied against the blocks color. Note only called
     * when first determining what to render.
     */
    public int colorMultiplier(IBlockAccess par1IBlockAccess, int par2, int par3, int par4)
    {
        return 333399;
    }
    
    /**
     * A randomly called display update to be able to add particles or other items for display
     */
    public void randomDisplayTick(World par1World, int par2, int par3, int par4, Random par5Random)
    {
        int l = par1World.getBlockMetadata(par2, par3, par4);

        if (l > 0)
        {
            double d0 = (double)par2 + 0.5D + ((double)par5Random.nextFloat() - 0.5D) * 0.2D;
            double d1 = (double)((float)par3 + 0.0625F);
            double d2 = (double)par4 + 0.5D + ((double)par5Random.nextFloat() - 0.5D) * 0.2D;
            float f = (float)l / -1.0F;
            float f1 = f * -1.0F + -1.0F;

            if (l == 0)
            {
                f1 = 0.0F;
            }

            float f2 = f * f * -1.0F - -1.0F;
            float f3 = f * f * 0.6F - 0.7F;

            if (f2 < 0.0F)
            {
                f2 = 0.0F;
            }

            if (f3 < 0.0F)
            {
                f3 = 0.0F;
            }

            par1World.spawnParticle("reddust", d0, d1, d2, (double)f1, (double)f2, (double)f3);
        }
    }
    
    public int idDropped(int par1, Random par2Random, int par3)
    {
        return ModItems.Dust_LimeGreenStone.itemID;
    }
    
    /**
     * Returns true if redstone wire can connect to the specified block. Params: World, X, Y, Z, side (not a normal
     * notch-side, this can be 0, 1, 2, 3 or -1)
     */
    public static boolean isPowerProviderOrWire(IBlockAccess par0IBlockAccess, int par1, int par2, int par3, int par4)
    {
        int i1 = par0IBlockAccess.getBlockId(par1, par2, par3);

        if (i1 != ModBlocks.LimeGreenStoneWireBlock.blockID)
        {
            return false;
        }
        else if (i1 == 0)
        {
            return true;
        }
        /*else if (!ModBlocks.BrownStoneRepeaterIdle.func_94487_f(i1))
        {
            return (Block.blocksList[i1] != null && Block.blocksList[i1].canConnectRedstone(par0IBlockAccess, par1, par2, par3, par4));
        }*/
        else
        {
            int j1 = par0IBlockAccess.getBlockMetadata(par1, par2, par3);
            return par4 == (j1 & 3) || par4 == Direction.rotateOpposite[j1 & 3];
        }
    }
    
    public static boolean isPowerProviderOrTorch(IBlockAccess par0IBlockAccess, int par1, int par2, int par3, int par4)
    {
        int i1 = par0IBlockAccess.getBlockId(par1, par2, par3);

        if (i1 != ModBlocks.LimeGreenStoneTorchActive.blockID)
        {
            return false;
        }
        else if (i1 == 0)
        {
            return true;
        }
        else
        {
            int j1 = par0IBlockAccess.getBlockMetadata(par1, par2, par3);
            return par4 == (j1 & 3) || par4 == Direction.rotateOpposite[j1 & 3];
        }
    }
    
    /**
     * Returns true if the block coordinate passed can provide power, or is a redstone wire, or if its a repeater that
     * is powered.
     */
    /*
    public static boolean isPoweredOrRepeater(IBlockAccess par0IBlockAccess, int par1, int par2, int par3, int par4)
    {
        if (isPowerProviderOrWire(par0IBlockAccess, par1, par2, par3, par4))
        {
            return true;
        }
        else
        {
            int i1 = par0IBlockAccess.getBlockId(par1, par2, par3);

            if (i1 == Block.CyanStoneRepeaterActive.blockID)
            {
                int j1 = par0IBlockAccess.getBlockMetadata(par1, par2, par3);
                return par4 == (j1 & 3);
            }
            else
            {
                return false;
            }
        }
    }*/
    
    /**
     * only called by clickMiddleMouseButton , and passed to inventory.setCurrentItem (along with isCreative)
     */
    public int idPicked(World par1World, int par2, int par3, int par4)
    {
        return ModItems.Dust_LimeGreenStone.itemID;
    }
    
}

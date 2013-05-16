package com.Scorpio.RsaH.block;

import java.util.Random;

import net.minecraft.util.Direction;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

import com.Scorpio.RsaH.item.ModItems;
import com.Scorpio.RsaH.lib.Strings;

public class Block_Wire_BlueStone extends BlockWireRSaH
{
    
	public Block_Wire_BlueStone(int id)
	{
		super(id);
		this.setUnlocalizedName(Strings.BLOCK_WIRE_BLUESTONE_NAME);
		this.setIconCross("BlueStoneDust_Cross");
		this.setIconCrossOverlay("BlueStoneDust_Cross_Overlay");
		this.setIconLine("BlueStoneDust_Line");
		this.setIconLineOverlay("BlueStoneDust_Line_Overlay");
	}
	
    /**
     * Returns a integer with hex for 2A3EAA with this color multiplied against the blocks color. Note only called
     * when first determining what to render.
     */
    public int colorMultiplier(IBlockAccess par1IBlockAccess, int par2, int par3, int par4)
    {
        return 333399;
    }
    
    public int idDropped(int par1, Random par2Random, int par3)
    {
        return ModItems.Dust_BlueStone.itemID;
    }
    
    /**
     * Returns true if redstone wire can connect to the specified block. Params: World, X, Y, Z, side (not a normal
     * notch-side, this can be 0, 1, 2, 3 or -1)
     */
    public static boolean isPowerProviderOrWire(IBlockAccess par0IBlockAccess, int par1, int par2, int par3, int par4)
    {
        int i1 = par0IBlockAccess.getBlockId(par1, par2, par3);

        if (i1 != ModBlocks.BlueStoneWireBlock.blockID)
        {
            return false;
        }
        else if (i1 == 0)
        {
            return true;
        }
        /*else if (!ModBlocks.bluestoneRepeaterIdle.func_94487_f(i1))
        {
            return (Block.blocksList[i1] != null && Block.blocksList[i1].canConnectRedstone(par0IBlockAccess, par1, par2, par3, par4));
        }*/
        else
        {
            int j1 = par0IBlockAccess.getBlockMetadata(par1, par2, par3);
            return par4 == (j1 & 3) || par4 == Direction.rotateOpposite[j1 & 3];
        }
    }
    
    /*public static boolean isPowerProviderOrTorch(IBlockAccess par0IBlockAccess, int par1, int par2, int par3, int par4)
    {
        int i1 = par0IBlockAccess.getBlockId(par1, par2, par3);

        if (i1 != ModBlocks.BlueStoneTorchBlock.blockID)
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
    }*/
    
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

            if (i1 == Block.bluestoneRepeaterActive.blockID)
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
        return ModItems.Dust_BlueStone.itemID;
    }
    
}

package com.Scorpio.RsaH.block;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import net.minecraft.block.RedstoneUpdateInfo;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.world.World;

import com.Scorpio.RsaH.lib.Strings;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class Block_Torch_CyanStone extends BlockTorchRSaH
{
    /** Map of ArrayLists of RedstoneUpdateInfo. Key of map is World. */
    private static Map cyanstoneUpdateInfoCache = new HashMap();
    
	protected Block_Torch_CyanStone(int id, boolean isLite)
	{
		super(id, isLite);
        this.isTorchActive = isLite;
        this.setIconTorchLit("CyanStone_Torch_Lit");
        this.setIconTorch("CyanStone_Torch");
        this.setTickRandomly(true);
        this.setCreativeTab((CreativeTabs)null);
		this.setUnlocalizedName(Strings.BLOCK_TORCH_CYANSTONE_NAME);
	}
	
	private boolean checkForBurnout(World par1World, int par2, int par3, int par4, boolean par5)
    {
        if (!cyanstoneUpdateInfoCache.containsKey(par1World))
        {
        	cyanstoneUpdateInfoCache.put(par1World, new ArrayList());
        }

        List list = (List)cyanstoneUpdateInfoCache.get(par1World);

        if (par5)
        {
            list.add(new RedstoneUpdateInfo(par2, par3, par4, par1World.getTotalWorldTime()));
        }

        int l = 0;

        for (int i1 = 0; i1 < list.size(); ++i1)
        {
            RedstoneUpdateInfo redstoneupdateinfo = (RedstoneUpdateInfo)list.get(i1);

            if (redstoneupdateinfo.x == par2 && redstoneupdateinfo.y == par3 && redstoneupdateinfo.z == par4)
            {
                ++l;

                if (l >= 8)
                {
                    return true;
                }
            }
        }

        return false;
    }
	
    @SideOnly(Side.CLIENT)

    /**
     * A randomly called display update to be able to add particles or other items for display
     */
    public void randomDisplayTick(World par1World, int par2, int par3, int par4, Random par5Random)
    {
        if (this.isTorchActive)
        {
            int l = par1World.getBlockMetadata(par2, par3, par4);
            double d0 = (double)((float)par2 + 0.5F) + (double)(par5Random.nextFloat() - 0.5F) * 0.2D;
            double d1 = (double)((float)par3 + 0.7F) + (double)(par5Random.nextFloat() - 0.5F) * 0.2D;
            double d2 = (double)((float)par4 + 0.5F) + (double)(par5Random.nextFloat() - 0.5F) * 0.2D;
            double d3 = 0.2199999988079071D;
            double d4 = 0.27000001072883606D;

            if (l == 1)
            {
                par1World.spawnParticle("reddust", d0 - d4, d1 + d3, d2, 0.0D, 0.0D, 0.0D);
            }
            else if (l == 2)
            {
                par1World.spawnParticle("reddust", d0 + d4, d1 + d3, d2, 0.0D, 0.0D, 0.0D);
            }
            else if (l == 3)
            {
                par1World.spawnParticle("reddust", d0, d1 + d3, d2 - d4, 0.0D, 0.0D, 0.0D);
            }
            else if (l == 4)
            {
                par1World.spawnParticle("reddust", d0, d1 + d3, d2 + d4, 0.0D, 0.0D, 0.0D);
            }
            else
            {
                par1World.spawnParticle("reddust", d0, d1, d2, 0.0D, 0.0D, 0.0D);
            }
        }
    }
	
    /**
     * Returns true or false based on whether the block the torch is attached to is providing indirect power.
     */
    private boolean isIndirectlyPowered(World par1World, int par2, int par3, int par4)
    {
        int l = par1World.getBlockMetadata(par2, par3, par4);
        return l == 5 && par1World.getIndirectPowerOutput(par2, par3 - 1, par4, 0) ? true : (l == 3 && par1World.getIndirectPowerOutput(par2, par3, par4 - 1, 2) ? true : (l == 4 && par1World.getIndirectPowerOutput(par2, par3, par4 + 1, 3) ? true : (l == 1 && par1World.getIndirectPowerOutput(par2 - 1, par3, par4, 4) ? true : l == 2 && par1World.getIndirectPowerOutput(par2 + 1, par3, par4, 5))));
    }
    
    /**
     * Ticks the block if it's been scheduled
     */
    public void updateTick(World par1World, int par2, int par3, int par4, Random par5Random)
    {
    boolean flag = this.isIndirectlyPowered(par1World, par2, par3, par4);
    List list = (List)cyanstoneUpdateInfoCache.get(par1World);

    while (list != null && !list.isEmpty() && par1World.getTotalWorldTime() - ((RedstoneUpdateInfo)list.get(0)).updateTime > 60L)
    {
        list.remove(0);
    }

    if (this.isTorchActive)
    {
        if (flag)
        {
            par1World.setBlock(par2, par3, par4, ModBlocks.CyanStoneTorchIdle.blockID, par1World.getBlockMetadata(par2, par3, par4), 3);

            if (this.checkForBurnout(par1World, par2, par3, par4, true))
            {
                par1World.playSoundEffect((double)((float)par2 + 0.5F), (double)((float)par3 + 0.5F), (double)((float)par4 + 0.5F), "random.fizz", 0.5F, 2.6F + (par1World.rand.nextFloat() - par1World.rand.nextFloat()) * 0.8F);

                for (int l = 0; l < 5; ++l)
                {
                    double d0 = (double)par2 + par5Random.nextDouble() * 0.6D + 0.2D;
                    double d1 = (double)par3 + par5Random.nextDouble() * 0.6D + 0.2D;
                    double d2 = (double)par4 + par5Random.nextDouble() * 0.6D + 0.2D;
                    par1World.spawnParticle("smoke", d0, d1, d2, 0.0D, 0.0D, 0.0D);
                }
            }
        }
    }
    else if (!flag && !this.checkForBurnout(par1World, par2, par3, par4, false))
    {
        par1World.setBlock(par2, par3, par4, ModBlocks.CyanStoneTorchActive.blockID, par1World.getBlockMetadata(par2, par3, par4), 3);
    }
    }

    
    /**
     * Returns the ID of the items to drop on destruction.
     */
    public int idDropped(int par1, Random par2Random, int par3)
    {
        return ModBlocks.CyanStoneTorchActive.blockID;
    }

    /**
     * Can this block provide power. Only wire currently seems to have this change based on its state.
     */
    public boolean canProvidePower()
    {
        return true;
    }
    
    /**
     * only called by clickMiddleMouseButton , and passed to inventory.setCurrentItem (along with isCreative)
     */
    public int idPicked(World par1World, int par2, int par3, int par4)
    {
        return ModBlocks.CyanStoneTorchActive.blockID;
    }

    /**
     * Returns true if the given block ID is equivalent to this one. Example: redstoneTorchOn matches itself and
     * redstoneTorchOff, and vice versa. Most blocks only match themselves.
     */
    public boolean isAssociatedBlockID(int par1)
    {
        return par1 == ModBlocks.CyanStoneTorchIdle.blockID || par1 == ModBlocks.CyanStoneTorchActive.blockID;
    }
}

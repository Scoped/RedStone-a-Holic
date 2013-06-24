package com.Scorpio.RsaH.block;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.util.Direction;
import net.minecraft.util.Icon;
import net.minecraft.world.ChunkPosition;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

import com.Scorpio.RsaH.item.ModItems;
import com.Scorpio.RsaH.lib.Strings;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class Block_Wire_BlueStone extends BlockWireRSaH
{
    /**
     * When false, power transmission methods do not look at other redstone wires. Used internally during
     * updateCurrentStrength.
     */
    private boolean wiresProvidePower = true;
    private Set blocksNeedingUpdate = new HashSet();
    @SideOnly(Side.CLIENT)
    static Icon iconCross;
    @SideOnly(Side.CLIENT)
    static Icon iconLine;
    @SideOnly(Side.CLIENT)
    static Icon iconCrossOverlay;
    @SideOnly(Side.CLIENT)
    static Icon iconLineOverlay;
    
	public Block_Wire_BlueStone(int id)
	{
		super(id);
		this.setUnlocalizedName(Strings.BLOCK_WIRE_BLUESTONE_NAME);
		this.enableStats = false;
		//this.setIconCross("BlueStoneDust_Cross");
		//this.setIconCrossOverlay("BlueStoneDust_Cross_Overlay");
		//this.setIconLine("BlueStoneDust_Line");
		//this.setIconLineOverlay("BlueStoneDust_Line_Overlay");
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
     * The type of render function that is called for this block
     */
	public int getRenderType()
	{
		return ModBlocks.modelWireID;
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
            float f = (float)l / 15.0F;
            float f1 = f * -1.0F + -1.0F;

            if (l == 0)
            {
                f1 = 0.0F;
            }

            float f2 = f * f * -1.0F - -1.0F;
            float f3 = f * f * 0.6F - 0.7F;

            if (f2 < 0.0F)
            {
                f2 = 1.0F;
            }

            if (f3 < 0.0F)
            {
                f3 = 1.0F;
            }

            par1World.spawnParticle("reddust", d0, d1, d2, (double)f1, (double)f2, (double)f3);
        }
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
    
    public static boolean isPowerProviderOrTorch(IBlockAccess par0IBlockAccess, int par1, int par2, int par3, int par4)
    {
        int i1 = par0IBlockAccess.getBlockId(par1, par2, par3);

        if (i1 != ModBlocks.BlueStoneTorchActive.blockID)
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
     * Returns the current strength at the specified block if it is greater than the passed value, or the passed value
     * otherwise. Signature: (world, x, y, z, strength)
     */
    private int getMaxCurrentStrength(World par1World, int par2, int par3, int par4, int par5)
    {
        if (par1World.getBlockId(par2, par3, par4) != this.blockID)
        {
            return par5;
        }
        else
        {
            int i1 = par1World.getBlockMetadata(par2, par3, par4);
            return i1 > par5 ? i1 : par5;
        }
    }
    
    /**
     * Sets the strength of the wire current (0-15) for this block based on neighboring blocks and propagates to
     * neighboring redstone wires
     */
    private void updateAndPropagateCurrentStrength(World par1World, int par2, int par3, int par4)
    {
        this.calculateCurrentChanges(par1World, par2, par3, par4, par2, par3, par4);
        ArrayList arraylist = new ArrayList(this.blocksNeedingUpdate);
        this.blocksNeedingUpdate.clear();

        for (int l = 0; l < arraylist.size(); ++l)
        {
            ChunkPosition chunkposition = (ChunkPosition)arraylist.get(l);
            par1World.notifyBlocksOfNeighborChange(chunkposition.x, chunkposition.y, chunkposition.z, this.blockID);
        }
    }
    
    private void calculateCurrentChanges(World par1World, int par2, int par3, int par4, int par5, int par6, int par7)
    {
        int k1 = par1World.getBlockMetadata(par2, par3, par4);
        byte b0 = 0;
        int l1 = this.getMaxCurrentStrength(par1World, par5, par6, par7, b0);
        this.wiresProvidePower = false;
        int i2 = par1World.getStrongestIndirectPower(par2, par3, par4);
        this.wiresProvidePower = true;

        if (i2 > 0 && i2 > l1 - 1)
        {
            l1 = i2;
        }

        int j2 = 0;

        for (int k2 = 0; k2 < 4; ++k2)
        {
            int l2 = par2;
            int i3 = par4;

            if (k2 == 0)
            {
                l2 = par2 - 1;
            }

            if (k2 == 1)
            {
                ++l2;
            }

            if (k2 == 2)
            {
                i3 = par4 - 1;
            }

            if (k2 == 3)
            {
                ++i3;
            }

            if (l2 != par5 || i3 != par7)
            {
                j2 = this.getMaxCurrentStrength(par1World, l2, par3, i3, j2);
            }

            if (par1World.isBlockNormalCube(l2, par3, i3) && !par1World.isBlockNormalCube(par2, par3 + 1, par4))
            {
                if ((l2 != par5 || i3 != par7) && par3 >= par6)
                {
                    j2 = this.getMaxCurrentStrength(par1World, l2, par3 + 1, i3, j2);
                }
            }
            else if (!par1World.isBlockNormalCube(l2, par3, i3) && (l2 != par5 || i3 != par7) && par3 <= par6)
            {
                j2 = this.getMaxCurrentStrength(par1World, l2, par3 - 1, i3, j2);
            }
        }

        if (j2 > l1)
        {
            l1 = j2 - 1;
        }
        else if (l1 > 0)
        {
            --l1;
        }
        else
        {
            l1 = 0;
        }

        if (i2 > l1 - 1)
        {
            l1 = i2;
        }

        if (k1 != l1)
        {
            par1World.setBlockMetadataWithNotify(par2, par3, par4, l1, 2);
            this.blocksNeedingUpdate.add(new ChunkPosition(par2, par3, par4));
            this.blocksNeedingUpdate.add(new ChunkPosition(par2 - 1, par3, par4));
            this.blocksNeedingUpdate.add(new ChunkPosition(par2 + 1, par3, par4));
            this.blocksNeedingUpdate.add(new ChunkPosition(par2, par3 - 1, par4));
            this.blocksNeedingUpdate.add(new ChunkPosition(par2, par3 + 1, par4));
            this.blocksNeedingUpdate.add(new ChunkPosition(par2, par3, par4 - 1));
            this.blocksNeedingUpdate.add(new ChunkPosition(par2, par3, par4 + 1));
        }
    }
    
    /**
     * Calls World.notifyBlocksOfNeighborChange() for all neighboring blocks, but only if the given block is a redstone
     * wire.
     */
    private void notifyWireNeighborsOfNeighborChange(World par1World, int par2, int par3, int par4)
    {
        if (par1World.getBlockId(par2, par3, par4) == this.blockID)
        {
            par1World.notifyBlocksOfNeighborChange(par2, par3, par4, this.blockID);
            par1World.notifyBlocksOfNeighborChange(par2 - 1, par3, par4, this.blockID);
            par1World.notifyBlocksOfNeighborChange(par2 + 1, par3, par4, this.blockID);
            par1World.notifyBlocksOfNeighborChange(par2, par3, par4 - 1, this.blockID);
            par1World.notifyBlocksOfNeighborChange(par2, par3, par4 + 1, this.blockID);
            par1World.notifyBlocksOfNeighborChange(par2, par3 - 1, par4, this.blockID);
            par1World.notifyBlocksOfNeighborChange(par2, par3 + 1, par4, this.blockID);
        }
    }
    
    /**
     * Called whenever the block is added into the world. Args: world, x, y, z
     */
    public void onBlockAdded(World par1World, int par2, int par3, int par4)
    {
        super.onBlockAdded(par1World, par2, par3, par4);

        if (!par1World.isRemote)
        {
        	this.updateAndPropagateCurrentStrength(par1World, par2, par3, par4);
            par1World.notifyBlocksOfNeighborChange(par2, par3 + 1, par4, this.blockID);
            par1World.notifyBlocksOfNeighborChange(par2, par3 - 1, par4, this.blockID);
            this.notifyWireNeighborsOfNeighborChange(par1World, par2 - 1, par3, par4);
            this.notifyWireNeighborsOfNeighborChange(par1World, par2 + 1, par3, par4);
            this.notifyWireNeighborsOfNeighborChange(par1World, par2, par3, par4 - 1);
            this.notifyWireNeighborsOfNeighborChange(par1World, par2, par3, par4 + 1);

            if (par1World.isBlockNormalCube(par2 - 1, par3, par4))
            {
                this.notifyWireNeighborsOfNeighborChange(par1World, par2 - 1, par3 + 1, par4);
            }
            else
            {
                this.notifyWireNeighborsOfNeighborChange(par1World, par2 - 1, par3 - 1, par4);
            }

            if (par1World.isBlockNormalCube(par2 + 1, par3, par4))
            {
                this.notifyWireNeighborsOfNeighborChange(par1World, par2 + 1, par3 + 1, par4);
            }
            else
            {
                this.notifyWireNeighborsOfNeighborChange(par1World, par2 + 1, par3 - 1, par4);
            }

            if (par1World.isBlockNormalCube(par2, par3, par4 - 1))
            {
                this.notifyWireNeighborsOfNeighborChange(par1World, par2, par3 + 1, par4 - 1);
            }
            else
            {
                this.notifyWireNeighborsOfNeighborChange(par1World, par2, par3 - 1, par4 - 1);
            }

            if (par1World.isBlockNormalCube(par2, par3, par4 + 1))
            {
                this.notifyWireNeighborsOfNeighborChange(par1World, par2, par3 + 1, par4 + 1);
            }
            else
            {
                this.notifyWireNeighborsOfNeighborChange(par1World, par2, par3 - 1, par4 + 1);
            }
        }
    }
    
    /**
     * Lets the block know when one of its neighbor changes. Doesn't know which neighbor changed (coordinates passed are
     * their own) Args: x, y, z, neighbor blockID
     */
    public void onNeighborBlockChange(World par1World, int par2, int par3, int par4, int par5)
    {
        if (!par1World.isRemote)
        {
            boolean flag = this.canPlaceBlockAt(par1World, par2, par3, par4);

            if (flag)
            {
                this.updateAndPropagateCurrentStrength(par1World, par2, par3, par4);
            }
            else
            {
                this.dropBlockAsItem(par1World, par2, par3, par4, 0, 0);
                par1World.setBlockToAir(par2, par3, par4);
            }

            super.onNeighborBlockChange(par1World, par2, par3, par4, par5);
        }
    }
    
    /**
     * only called by clickMiddleMouseButton , and passed to inventory.setCurrentItem (along with isCreative)
     */
    public int idPicked(World par1World, int par2, int par3, int par4)
    {
        return ModItems.Dust_BlueStone.itemID;
    }
    /*
    @SideOnly(Side.CLIENT)
    public static Icon func_94409_b(String par0Str, BlockWireRSaH blockWire)
    {
        return par0Str == blockWire.getIconCross() ? blockWire.iconCross : (par0Str == blockWire.getIconLine() ? blockWire.iconLine : (par0Str == blockWire.getIconCrossOverlay() ? blockWire.iconCrossOverlay : (par0Str == blockWire.getIconLineOverlay() ? blockWire.iconLineOverlay : null)));
    }
    */
}

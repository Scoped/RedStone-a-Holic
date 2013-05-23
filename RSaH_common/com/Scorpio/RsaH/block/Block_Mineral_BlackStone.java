package com.Scorpio.RsaH.block;

import java.util.Random;

import net.minecraft.block.material.Material;

import com.Scorpio.RsaH.RedStone_a_holic;
import com.Scorpio.RsaH.lib.Strings;

public class Block_Mineral_BlackStone extends BlockRSaH
{
	public Block_Mineral_BlackStone(int id)
	{
		super(id, Material.rock);
		this.setCreativeTab(RedStone_a_holic.TabRSaH);
		this.setUnlocalizedName(Strings.BLOCK_BLACKSTONE_NAME);
	}
    /**
     * Returns the ID of the items to drop on destruction.
     */
    public int idDropped(int par1, Random par2Random, int par3)
    {
        return ModBlocks.BlackStoneBlock.blockID;
    }
}

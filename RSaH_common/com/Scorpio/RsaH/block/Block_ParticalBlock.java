package com.Scorpio.RsaH.block;

import java.util.Random;

import com.Scorpio.RsaH.RedStone_a_holic;
import com.Scorpio.RsaH.lib.Strings;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class Block_ParticalBlock extends BlockRSaH
{
	private double motionX;
	private double motionY;
	private double motionZ;

	public Block_ParticalBlock(int id)
	{
		super(id, Material.rock);
		this.setCreativeTab(RedStone_a_holic.TabRSaH);
		this.setUnlocalizedName(Strings.BLOCK_PARTICLEBLOCK_NAME);
	}
	
    /**
     * Checks to see if the block is flammable.
     */
    private boolean isFlammable(World par1World, int par2, int par3, int par4)
    {
        return par1World.getBlockMaterial(par2, par3, par4).getCanBurn();
    }
	
	@SideOnly(Side.CLIENT)
	public void randomDisplayTick(World world, int x, int y, int z, Random random)
	{
        
		float f1 = (float)x + 0.5F;
		float f2 = (float)y + 1.1F;
		float f3 = (float)z + 0.5F;
		float f4 = random.nextFloat() * 0.7F - 0.3F;
		float f5 = random.nextFloat() * 0.7F - 0.3F;
		
		float smoke1 = (float)x + 0.5F;
		float smoke2 = (float)y + 1.1F;
		float smoke3 = (float)z + 0.5F;
		
        double d0 = (double)((float)x + random.nextFloat());
        double d1 = (double)((float)y + random.nextFloat());
        double d2 = (double)((float)z + random.nextFloat());
        double d3 = 0.0D;
        double d4 = 0.0D;
        double d5 = 0.0D;
        int i1 = random.nextInt(2) * 2 - 1;
        d3 = ((double)random.nextFloat() - 0.5D) * 0.5D;
        d4 = ((double)random.nextFloat() - -1.5D) * 0.5D;
        d5 = ((double)random.nextFloat() - 0.5D) * 0.5D;
        
		world.spawnParticle("smoke", (double)(f1+f4), (double)f2 , (double)(f3+f5), 0.0D, 0.0D, 0.0D);
		//world.spawnParticle("largesmoke", (double)smoke1, (double)smoke2, (double)smoke3, 0.0D, 0.0D, 1.0D);
		//world.spawnParticle("largesmoke", (double)smoke1, (double)smoke2, (double)smoke3, 1.0D, 0.0D, 0.0D);
		//world.spawnParticle("largesmoke", (double)smoke1, (double)smoke2, (double)smoke3, -1.0D, 0.0D, 0.0D);
		//world.spawnParticle("largesmoke", (double)smoke1, (double)smoke2, (double)smoke3, 0.0D, 0.0D, -1.0D);
		world.spawnParticle("flame", (double)(f1+f4), (double)f2 , (double)(f3+f5), 0.0D, 1.0D, 0.0D);
		world.spawnParticle("flame", (double)(f1+f4), (double)f2 , (double)(f3+f5), 0.0D, 0.0D, 0.0D);
		world.spawnParticle("portal", d0, d1, d2, d3, d4 + 10.0D, d5);
		world.spawnParticle("enchantmenttable", (double)(f1+f4), (double)f2 , (double)(f3+f5), 0.0D, 10.0D, 0.0D);
	}
}

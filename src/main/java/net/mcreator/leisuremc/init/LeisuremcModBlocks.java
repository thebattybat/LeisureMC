
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.leisuremc.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.leisuremc.block.OpPortalBlock;
import net.mcreator.leisuremc.block.EBlock;
import net.mcreator.leisuremc.block.DuplicatorBlock;
import net.mcreator.leisuremc.LeisuremcMod;

public class LeisuremcModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, LeisuremcMod.MODID);
	public static final RegistryObject<Block> DUPLICATOR = REGISTRY.register("duplicator", () -> new DuplicatorBlock());
	public static final RegistryObject<Block> E = REGISTRY.register("e", () -> new EBlock());
	public static final RegistryObject<Block> OP_PORTAL = REGISTRY.register("op_portal", () -> new OpPortalBlock());
}

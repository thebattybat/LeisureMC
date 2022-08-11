
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.leisuremc.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.world.level.biome.Biome;

import net.mcreator.leisuremc.world.biome.DamondBiome;
import net.mcreator.leisuremc.LeisuremcMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class LeisuremcModBiomes {
	public static final DeferredRegister<Biome> REGISTRY = DeferredRegister.create(ForgeRegistries.BIOMES, LeisuremcMod.MODID);
	public static final RegistryObject<Biome> DAMOND = REGISTRY.register("damond", () -> DamondBiome.createBiome());

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			DamondBiome.init();
		});
	}
}

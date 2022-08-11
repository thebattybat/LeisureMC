
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.leisuremc.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.renderer.entity.ThrownItemRenderer;

import net.mcreator.leisuremc.client.renderer.ManRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class LeisuremcModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(LeisuremcModEntities.RANGED_ITEM_IDK.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(LeisuremcModEntities.MAN.get(), ManRenderer::new);
	}
}

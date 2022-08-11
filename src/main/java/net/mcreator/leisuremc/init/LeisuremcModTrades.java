
/*
*    MCreator note: This file will be REGENERATED on each build.
*/
package net.mcreator.leisuremc.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.village.VillagerTradesEvent;
import net.minecraftforge.common.BasicItemListing;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.npc.VillagerTrades;
import net.minecraft.world.entity.npc.VillagerProfession;

import java.util.List;

import it.unimi.dsi.fastutil.ints.Int2ObjectMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.FORGE)
public class LeisuremcModTrades {
	@SubscribeEvent
	public static void registerTrades(VillagerTradesEvent event) {
		Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
		if (event.getType() == VillagerProfession.CLERIC) {
			trades.get(1).add(new BasicItemListing(new ItemStack(Blocks.WARPED_BUTTON, 6), new ItemStack(Blocks.LAVA, 64),
					new ItemStack(LeisuremcModItems.RANGED_ITEM_IDK.get()), 10, 5, 0.05f));
		}
	}
}

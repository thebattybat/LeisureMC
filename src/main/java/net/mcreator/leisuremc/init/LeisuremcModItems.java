
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.leisuremc.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.leisuremc.item.StopItem;
import net.mcreator.leisuremc.item.RangedItemIdkItem;
import net.mcreator.leisuremc.item.QuagoatItem;
import net.mcreator.leisuremc.item.OpItem;
import net.mcreator.leisuremc.item.ModPizzaItem;
import net.mcreator.leisuremc.item.MiningToolXdItem;
import net.mcreator.leisuremc.item.MeleeItem;
import net.mcreator.leisuremc.item.LedmekerItem;
import net.mcreator.leisuremc.item.JetPuffedItem;
import net.mcreator.leisuremc.item.IronGeterItem;
import net.mcreator.leisuremc.item.FalevitatorItem;
import net.mcreator.leisuremc.item.FabricItem;
import net.mcreator.leisuremc.item.DreamItem;
import net.mcreator.leisuremc.item.BowlerDreamItem;
import net.mcreator.leisuremc.item.BookgeterItem;
import net.mcreator.leisuremc.LeisuremcMod;

public class LeisuremcModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, LeisuremcMod.MODID);
	public static final RegistryObject<Item> QUAGOAT = REGISTRY.register("quagoat", () -> new QuagoatItem());
	public static final RegistryObject<Item> RANGED_ITEM_IDK = REGISTRY.register("ranged_item_idk", () -> new RangedItemIdkItem());
	public static final RegistryObject<Item> MOD_PIZZA = REGISTRY.register("mod_pizza", () -> new ModPizzaItem());
	public static final RegistryObject<Item> DUPLICATOR = block(LeisuremcModBlocks.DUPLICATOR, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> MELEE = REGISTRY.register("melee", () -> new MeleeItem());
	public static final RegistryObject<Item> E = block(LeisuremcModBlocks.E, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> FALEVITATOR = REGISTRY.register("falevitator", () -> new FalevitatorItem());
	public static final RegistryObject<Item> STOP = REGISTRY.register("stop", () -> new StopItem());
	public static final RegistryObject<Item> OP = REGISTRY.register("op", () -> new OpItem());
	public static final RegistryObject<Item> BOOKGETER = REGISTRY.register("bookgeter", () -> new BookgeterItem());
	public static final RegistryObject<Item> MAN = REGISTRY.register("man_spawn_egg",
			() -> new ForgeSpawnEggItem(LeisuremcModEntities.MAN, -3355444, -1, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> LEDMEKER = REGISTRY.register("ledmeker", () -> new LedmekerItem());
	public static final RegistryObject<Item> BOWLER_DREAM_HELMET = REGISTRY.register("bowler_dream_helmet", () -> new BowlerDreamItem.Helmet());
	public static final RegistryObject<Item> BOWLER_DREAM_CHESTPLATE = REGISTRY.register("bowler_dream_chestplate",
			() -> new BowlerDreamItem.Chestplate());
	public static final RegistryObject<Item> BOWLER_DREAM_LEGGINGS = REGISTRY.register("bowler_dream_leggings", () -> new BowlerDreamItem.Leggings());
	public static final RegistryObject<Item> BOWLER_DREAM_BOOTS = REGISTRY.register("bowler_dream_boots", () -> new BowlerDreamItem.Boots());
	public static final RegistryObject<Item> FABRIC = REGISTRY.register("fabric", () -> new FabricItem());
	public static final RegistryObject<Item> JET_PUFFED = REGISTRY.register("jet_puffed", () -> new JetPuffedItem());
	public static final RegistryObject<Item> DREAM = REGISTRY.register("dream", () -> new DreamItem());
	public static final RegistryObject<Item> MINING_TOOL_XD = REGISTRY.register("mining_tool_xd", () -> new MiningToolXdItem());
	public static final RegistryObject<Item> IRON_GETER = REGISTRY.register("iron_geter", () -> new IronGeterItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}

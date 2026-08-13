/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.copperarmortooldversion.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;

import net.minecraft.world.item.Item;

import net.mcreator.copperarmortooldversion.item.CopperarmorItem;
import net.mcreator.copperarmortooldversion.CopperArmorToOldVersionMod;

public class CopperArmorToOldVersionModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(CopperArmorToOldVersionMod.MODID);
	public static final DeferredItem<Item> COPPERARMOR_HELMET;
	public static final DeferredItem<Item> COPPERARMOR_CHESTPLATE;
	public static final DeferredItem<Item> COPPERARMOR_LEGGINGS;
	public static final DeferredItem<Item> COPPERARMOR_BOOTS;
	static {
		COPPERARMOR_HELMET = REGISTRY.register("copperarmor_helmet", CopperarmorItem.Helmet::new);
		COPPERARMOR_CHESTPLATE = REGISTRY.register("copperarmor_chestplate", CopperarmorItem.Chestplate::new);
		COPPERARMOR_LEGGINGS = REGISTRY.register("copperarmor_leggings", CopperarmorItem.Leggings::new);
		COPPERARMOR_BOOTS = REGISTRY.register("copperarmor_boots", CopperarmorItem.Boots::new);
	}
	// Start of user code block custom items
	// End of user code block custom items
}
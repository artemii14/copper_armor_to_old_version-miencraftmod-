/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.copperarmortooldversion.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.core.registries.Registries;

import net.mcreator.copperarmortooldversion.CopperArmorToOldVersionMod;

@EventBusSubscriber
public class CopperArmorToOldVersionModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, CopperArmorToOldVersionMod.MODID);

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.COMBAT) {
			tabData.accept(CopperArmorToOldVersionModItems.COPPERARMOR_HELMET.get());
			tabData.accept(CopperArmorToOldVersionModItems.COPPERARMOR_CHESTPLATE.get());
			tabData.accept(CopperArmorToOldVersionModItems.COPPERARMOR_LEGGINGS.get());
			tabData.accept(CopperArmorToOldVersionModItems.COPPERARMOR_BOOTS.get());
		}
	}
}
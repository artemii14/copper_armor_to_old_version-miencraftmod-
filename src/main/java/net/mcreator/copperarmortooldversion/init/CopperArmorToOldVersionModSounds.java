/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.copperarmortooldversion.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

import net.mcreator.copperarmortooldversion.CopperArmorToOldVersionMod;

public class CopperArmorToOldVersionModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(Registries.SOUND_EVENT, CopperArmorToOldVersionMod.MODID);
	public static final DeferredHolder<SoundEvent, SoundEvent> COPPER_ARMOR_SOUND = REGISTRY.register("copper_armor_sound",
			() -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("copper_armor_to_old_version", "copper_armor_sound")));
}
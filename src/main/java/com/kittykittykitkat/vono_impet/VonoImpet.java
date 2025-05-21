package com.kittykittykitkat.vono_impet;

import com.kittykittykitkat.vono_impet.block.VonoImpetBlocks;
import com.kittykittykitkat.vono_impet.block.entity.VonoImpetBlockEntities;
import com.kittykittykitkat.vono_impet.compat.VonoImpetDramaticDoors;
import com.kittykittykitkat.vono_impet.entity.VonoImpetBoats;
import com.kittykittykitkat.vono_impet.feature.VonoImpetFeatures;
import com.kittykittykitkat.vono_impet.item.VonoImpetItemGroups;
import com.kittykittykitkat.vono_impet.item.VonoImpetItems;
import com.kittykittykitkat.vono_impet.particles.VonoImpetParticles;
import com.kittykittykitkat.vono_impet.sound.VonoImpetSounds;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.block.ComposterBlock;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class VonoImpet implements ModInitializer {
	public static final String MOD_ID = "vono_impet";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		VonoImpetParticles.registerParticles();
		VonoImpetItemGroups.registerItemGroups();
		VonoImpetSounds.registerSounds();
		VonoImpetBlocks.registerBlocks();
		VonoImpetBlockEntities.registerBlockEntities();
		VonoImpetItems.registerItems();
		VonoImpetFeatures.registerFeatures();
		VonoImpetBoats.registerBoats();

		registerCompostables();
		registerFuels();
		registerStrippables();
		registerFlammables();

		if (FabricLoader.getInstance().isModLoaded("dramaticdoors")) {
			VonoImpetDramaticDoors.registerDramaticDoors();
		}

	}

	private void registerCompostables() {
		ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(VonoImpetBlocks.MIRAKELL_LEAVES, 0.3f);
	}

	private void registerFuels() {
		FuelRegistry.INSTANCE.add(VonoImpetItems.MIRAKELL_SIGN_ITEM, 800);
		FuelRegistry.INSTANCE.add(VonoImpetItems.MIRAKELL_HANGING_SIGN_ITEM, 800);
//		FuelRegistry.INSTANCE.add(VonoImpetBlocks.MIRAKELL_SAPLING, 100);
		FuelRegistry.INSTANCE.add(VonoImpetItems.MIRAKELL_BOAT_ITEM, 1200);
		FuelRegistry.INSTANCE.add(VonoImpetItems.MIRAKELL_CHEST_BOAT_ITEM, 1200);
		FuelRegistry.INSTANCE.add(VonoImpetBlocks.MIRAKELL_FENCE, 300);
		FuelRegistry.INSTANCE.add(VonoImpetBlocks.MIRAKELL_FENCE_GATE, 300);
	}

	private void registerStrippables() {
		StrippableBlockRegistry.register(VonoImpetBlocks.MIRAKELL_LOG, VonoImpetBlocks.STRIPPED_MIRAKELL_LOG);
		StrippableBlockRegistry.register(VonoImpetBlocks.MIRAKELL_WOOD, VonoImpetBlocks.STRIPPED_MIRAKELL_WOOD);
	}

	private void registerFlammables() {
		FlammableBlockRegistry.getDefaultInstance().add(VonoImpetBlocks.MIRAKELL_LOG, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(VonoImpetBlocks.MIRAKELL_WOOD, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(VonoImpetBlocks.STRIPPED_MIRAKELL_LOG, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(VonoImpetBlocks.STRIPPED_MIRAKELL_WOOD, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(VonoImpetBlocks.MIRAKELL_LEAVES, 30, 60);
		FlammableBlockRegistry.getDefaultInstance().add(VonoImpetBlocks.MIRAKELL_PLANKS, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(VonoImpetBlocks.MIRAKELL_SLAB, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(VonoImpetBlocks.MIRAKELL_FENCE, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(VonoImpetBlocks.MIRAKELL_FENCE_GATE, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(VonoImpetBlocks.MIRAKELL_STAIRS, 5, 20);
	}
}
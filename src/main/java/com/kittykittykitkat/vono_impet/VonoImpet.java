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

import net.fabricmc.loader.api.FabricLoader;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class VonoImpet implements ModInitializer {
	public static final String MOD_ID = "vono_impet";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		registerCompostables();
		registerFuels();
		registerStrippables();
		registerFlammables();

		VonoImpetParticles.registerParticles();
		VonoImpetItemGroups.registerItemGroups();
		VonoImpetSounds.registerSounds();
		VonoImpetBlocks.registerBlocks();
		VonoImpetBlockEntities.registerBlockEntities();
		VonoImpetItems.registerItems();
		VonoImpetFeatures.registerFeatures();
		VonoImpetBoats.registerBoats();

		if (FabricLoader.getInstance().isModLoaded("dramaticdoors")) {
			VonoImpetDramaticDoors.registerDramaticDoors();
		}

	}

	private void registerCompostables() {}

	private void registerFuels() {}

	private void registerStrippables() {}

	private void registerFlammables() {}
}
package com.kittykittykitkat.vono_impet;

import com.kittykittykitkat.vono_impet.block.VonoImpetBlocks;
import com.kittykittykitkat.vono_impet.compat.VonoImpetDramaticDoors;
import com.kittykittykitkat.vono_impet.entity.VonoImpetBoats;
import com.kittykittykitkat.vono_impet.item.VonoImpetItemGroups;
import com.kittykittykitkat.vono_impet.item.VonoImpetItems;
import com.kittykittykitkat.vono_impet.particles.VonoImpetParticles;
import com.kittykittykitkat.vono_impet.sound.VonoImpetSoundsEvents;
import com.kittykittykitkat.vono_impet.world.gen.VonoImpetWorldGeneration;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;
import net.fabricmc.fabric.api.resource.ResourceManagerHelper;
import net.fabricmc.fabric.api.resource.ResourcePackActivationType;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.block.ComposterBlock;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class VonoImpet implements ModInitializer {
	public static final String MOD_ID = "vono_impet";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	// TODO: Proper volumes and weights for all the various biome ambient sounds

	@Override
	public void onInitialize() {
		ResourceManagerHelper.registerBuiltinResourcePack(
			new Identifier(MOD_ID, "bushy_leaves"),
			FabricLoader.getInstance().getModContainer(MOD_ID).orElseThrow(),
			ResourcePackActivationType.NORMAL
		);

		VonoImpetParticles.registerParticles();
		VonoImpetItemGroups.registerItemGroups();
		VonoImpetSoundsEvents.registerSounds();
		VonoImpetBlocks.registerBlocks();
		VonoImpetItems.registerItems();
		VonoImpetBoats.registerBoats();
		VonoImpetWorldGeneration.generateWorldGen();

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
//		ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(VonoImpetBlocks.MIRAKELL_SAPLING, 0.3f);
		ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(VonoImpetBlocks.VARSTER_LEAVES, 0.3f);
//		ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(VonoImpetBlocks.VARSTER_SAPLING, 0.3f);
	}

	private void registerFuels() {
		FuelRegistry.INSTANCE.add(VonoImpetItems.MIRAKELL_SIGN_ITEM, 800);
		FuelRegistry.INSTANCE.add(VonoImpetItems.MIRAKELL_HANGING_SIGN_ITEM, 800);
//		FuelRegistry.INSTANCE.add(VonoImpetBlocks.MIRAKELL_SAPLING, 100);
		FuelRegistry.INSTANCE.add(VonoImpetItems.MIRAKELL_BOAT, 1200);
		FuelRegistry.INSTANCE.add(VonoImpetItems.MIRAKELL_CHEST_BOAT, 1200);
		FuelRegistry.INSTANCE.add(VonoImpetBlocks.MIRAKELL_FENCE, 300);
		FuelRegistry.INSTANCE.add(VonoImpetBlocks.MIRAKELL_FENCE_GATE, 300);

		FuelRegistry.INSTANCE.add(VonoImpetItems.VARSTER_SIGN_ITEM, 800);
		FuelRegistry.INSTANCE.add(VonoImpetItems.VARSTER_HANGING_SIGN_ITEM, 800);
//		FuelRegistry.INSTANCE.add(VonoImpetBlocks.VARSTER_SAPLING, 100);
		FuelRegistry.INSTANCE.add(VonoImpetItems.VARSTER_BOAT, 1200);
		FuelRegistry.INSTANCE.add(VonoImpetItems.VARSTER_CHEST_BOAT, 1200);
		FuelRegistry.INSTANCE.add(VonoImpetBlocks.VARSTER_FENCE, 300);
		FuelRegistry.INSTANCE.add(VonoImpetBlocks.VARSTER_FENCE_GATE, 300);
	}

	private void registerStrippables() {
		StrippableBlockRegistry.register(VonoImpetBlocks.MIRAKELL_LOG, VonoImpetBlocks.STRIPPED_MIRAKELL_LOG);
		StrippableBlockRegistry.register(VonoImpetBlocks.MIRAKELL_WOOD, VonoImpetBlocks.STRIPPED_MIRAKELL_WOOD);
		StrippableBlockRegistry.register(VonoImpetBlocks.VARSTER_LOG, VonoImpetBlocks.STRIPPED_VARSTER_LOG);
		StrippableBlockRegistry.register(VonoImpetBlocks.VARSTER_WOOD, VonoImpetBlocks.STRIPPED_VARSTER_WOOD);
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

		FlammableBlockRegistry.getDefaultInstance().add(VonoImpetBlocks.VARSTER_LOG, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(VonoImpetBlocks.VARSTER_WOOD, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(VonoImpetBlocks.STRIPPED_VARSTER_LOG, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(VonoImpetBlocks.STRIPPED_VARSTER_WOOD, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(VonoImpetBlocks.VARSTER_LEAVES, 30, 60);
		FlammableBlockRegistry.getDefaultInstance().add(VonoImpetBlocks.VARSTER_PLANKS, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(VonoImpetBlocks.VARSTER_SLAB, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(VonoImpetBlocks.VARSTER_FENCE, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(VonoImpetBlocks.VARSTER_FENCE_GATE, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(VonoImpetBlocks.VARSTER_STAIRS, 5, 20);
	}
}
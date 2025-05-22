package com.kittykittykitkat.vono_impet.entity;

import com.kittykittykitkat.vono_impet.block.VonoImpetBlocks;
import com.kittykittykitkat.vono_impet.item.VonoImpetItems;
import com.terraformersmc.terraform.boat.api.TerraformBoatType;
import com.terraformersmc.terraform.boat.api.TerraformBoatTypeRegistry;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;

import static com.kittykittykitkat.vono_impet.VonoImpet.MOD_ID;

public class VonoImpetBoats {
    public static final Identifier MIRAKELL_BOAT_ID = new Identifier(MOD_ID, "mirakell_boat");
    public static final Identifier MIRAKELL_CHEST_BOAT_ID = new Identifier(MOD_ID, "mirakell_chest_boat");

    public static final RegistryKey<TerraformBoatType> MIRAKELL_BOAT_KEY = TerraformBoatTypeRegistry.createKey(MIRAKELL_BOAT_ID);

    public static final Identifier VARSTER_BOAT_ID = new Identifier(MOD_ID, "varster_boat");
    public static final Identifier VARSTER_CHEST_BOAT_ID = new Identifier(MOD_ID, "varster_chest_boat");

    public static final RegistryKey<TerraformBoatType> VARSTER_BOAT_KEY = TerraformBoatTypeRegistry.createKey(VARSTER_BOAT_ID);

    public static void registerBoats() {
        TerraformBoatType mirakellBoat = new TerraformBoatType.Builder()
                .item(VonoImpetItems.MIRAKELL_BOAT)
                .chestItem(VonoImpetItems.MIRAKELL_CHEST_BOAT)
                .planks(VonoImpetBlocks.MIRAKELL_PLANKS.asItem())
                .build();

        Registry.register(TerraformBoatTypeRegistry.INSTANCE, MIRAKELL_BOAT_KEY, mirakellBoat);

        TerraformBoatType varsterBoat = new TerraformBoatType.Builder()
                .item(VonoImpetItems.VARSTER_BOAT)
                .chestItem(VonoImpetItems.VARSTER_CHEST_BOAT)
                .planks(VonoImpetBlocks.VARSTER_PLANKS.asItem())
                .build();

        Registry.register(TerraformBoatTypeRegistry.INSTANCE, VARSTER_BOAT_KEY, varsterBoat);
    }
}

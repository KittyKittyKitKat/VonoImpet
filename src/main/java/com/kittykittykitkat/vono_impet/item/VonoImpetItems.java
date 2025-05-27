package com.kittykittykitkat.vono_impet.item;

import com.kittykittykitkat.vono_impet.block.VonoImpetBlocks;
import com.kittykittykitkat.vono_impet.entity.VonoImpetBoats;
import com.kittykittykitkat.vono_impet.sound.VonoImpetSoundsEvents;
import com.terraformersmc.terraform.boat.api.item.TerraformBoatItemHelper;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;

import static com.kittykittykitkat.vono_impet.VonoImpet.MOD_ID;

public class VonoImpetItems {
    public static final Item MIRAKELL_SIGN_ITEM = registerItem(
            "mirakell_sign",
            new SignItem(
                    new FabricItemSettings().maxCount(16),
                    VonoImpetBlocks.MIRAKELL_SIGN,
                    VonoImpetBlocks.MIRAKELL_WALL_SIGN
            )
    );

    public static final Item MIRAKELL_HANGING_SIGN_ITEM = registerItem(
            "mirakell_hanging_sign",
            new HangingSignItem(
                    VonoImpetBlocks.MIRAKELL_HANGING_SIGN,
                    VonoImpetBlocks.MIRAKELL_WALL_HANGING_SIGN,
                    new FabricItemSettings().maxCount(16)
            )
    );

    public static final Item MIRAKELL_BOAT = TerraformBoatItemHelper.registerBoatItem(
            VonoImpetBoats.MIRAKELL_BOAT_ID,
            VonoImpetBoats.MIRAKELL_BOAT_KEY,
            false
    );

    public static final Item MIRAKELL_CHEST_BOAT = TerraformBoatItemHelper.registerBoatItem(
            VonoImpetBoats.MIRAKELL_CHEST_BOAT_ID,
            VonoImpetBoats.MIRAKELL_BOAT_KEY,
            true);

    public static final Item VARSTER_SIGN_ITEM = registerItem(
            "varster_sign",
            new SignItem(
                    new FabricItemSettings().maxCount(16),
                    VonoImpetBlocks.VARSTER_SIGN,
                    VonoImpetBlocks.VARSTER_WALL_SIGN
            )
    );

    public static final Item VARSTER_HANGING_SIGN_ITEM = registerItem(
            "varster_hanging_sign",
            new HangingSignItem(
                    VonoImpetBlocks.VARSTER_HANGING_SIGN,
                    VonoImpetBlocks.VARSTER_WALL_HANGING_SIGN,
                    new FabricItemSettings().maxCount(16)
            )
    );

    public static final Item VARSTER_BOAT = TerraformBoatItemHelper.registerBoatItem(
            VonoImpetBoats.VARSTER_BOAT_ID,
            VonoImpetBoats.VARSTER_BOAT_KEY,
            false
    );

    public static final Item VARSTER_CHEST_BOAT = TerraformBoatItemHelper.registerBoatItem(
            VonoImpetBoats.VARSTER_CHEST_BOAT_ID,
            VonoImpetBoats.VARSTER_BOAT_KEY,
            true
    );

    public static final Item MUSIC_DISC_PASET_E_IMPETIF_LENA = registerItem(
            "music_disc_paset_e_impetif_lena",
            new MusicDiscItem(
                    9,
                    VonoImpetSoundsEvents.MUSIC_DISC_PASET_E_IMPETIF_LENA,
                    new FabricItemSettings().maxCount(1).rarity(Rarity.RARE),
                    251
            )
    );

    // TODO: Make edible
    public static final Item VARSTER_ANVI = registerItem(
            "varster_anvi",
            new Item(
                    new FabricItemSettings()
            )
    );

    public static final Item POTENTIAL_SPARK = registerItem(
            "potential_spark",
            new Item(
                    new FabricItemSettings()
            )
    );

    public static final Item ELUSIVE_REMNANT = registerItem(
            "elusive_remnant",
            new Item(
                    new FabricItemSettings()
            )
    );

    public static final Item CRYNIA_INGOT = registerItem(
            "crynia_ingot",
            new Item(
                    new FabricItemSettings()
            )
    );

    // TODO: Make fireproof?
    // TODO: Replace default netherite values with custom ones
    // TODO: Longsword and Multibow
    public static final Item CRYNIA_SWORD = registerItem(
            "crynia_sword",
            new SwordItem(
                    CryniaToolMaterial.INSTANCE,
                    3,
                    -2.4F,
                    new FabricItemSettings()
            )
    );

    public static final Item CRYNIA_PICKAXE = registerItem(
            "crynia_pickaxe",
            new PickaxeItem(
                    CryniaToolMaterial.INSTANCE,
                    1,
                    -2.8F,
                    new FabricItemSettings()
            )
    );

    public static final Item CRYNIA_AXE = registerItem(
            "crynia_axe",
            new AxeItem(
                    CryniaToolMaterial.INSTANCE,
                    5,
                    -3.0F,
                    new FabricItemSettings()
            )
    );

    public static final Item CRYNIA_SHOVEL = registerItem(
            "crynia_shovel",
            new ShovelItem(
                    CryniaToolMaterial.INSTANCE,
                    1.5F,
                    -3.0F,
                    new FabricItemSettings()
            )
    );

    public static final Item CRYNIA_HOE = registerItem(
            "crynia_hoe",
            new HoeItem(
                    CryniaToolMaterial.INSTANCE,
                    -4,
                    0.0F,
                    new FabricItemSettings()
            )
    );

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(MOD_ID, name), item);
    }

    public static void registerItems() {

    }
}

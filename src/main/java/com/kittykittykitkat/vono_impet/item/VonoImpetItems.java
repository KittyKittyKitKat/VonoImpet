package com.kittykittykitkat.vono_impet.item;

import com.kittykittykitkat.vono_impet.block.VonoImpetBlocks;
import com.kittykittykitkat.vono_impet.entity.VonoImpetBoats;
import com.terraformersmc.terraform.boat.api.item.TerraformBoatItemHelper;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.HangingSignItem;
import net.minecraft.item.Item;
import net.minecraft.item.SignItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import static com.kittykittykitkat.vono_impet.VonoImpet.MOD_ID;

public class VonoImpetItems {
    public static final Item MIRAKELL_SIGN_ITEM = registerItem("mirakell_sign", new SignItem(new FabricItemSettings().maxCount(16), VonoImpetBlocks.MIRAKELL_SIGN, VonoImpetBlocks.MIRAKELL_WALL_SIGN));
    public static final Item MIRAKELL_HANGING_SIGN_ITEM = registerItem("mirakell_hanging_sign", new HangingSignItem(VonoImpetBlocks.MIRAKELL_HANGING_SIGN, VonoImpetBlocks.MIRAKELL_WALL_HANGING_SIGN, new FabricItemSettings().maxCount(16)));

    public static final Item MIRAKELL_BOAT_ITEM = TerraformBoatItemHelper.registerBoatItem(VonoImpetBoats.MIRAKELL_BOAT_ID, VonoImpetBoats.MIRAKELL_BOAT_KEY, false);
    public static final Item MIRAKELL_CHEST_BOAT_ITEM = TerraformBoatItemHelper.registerBoatItem(VonoImpetBoats.MIRAKELL_CHEST_BOAT_ID, VonoImpetBoats.MIRAKELL_BOAT_KEY, true);

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(MOD_ID, name), item);
    }

    public static void registerItems() {

    }
}

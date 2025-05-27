package com.kittykittykitkat.vono_impet.item;

import net.fabricmc.yarn.constants.MiningLevels;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class CryniaToolMaterial implements ToolMaterial {
    public static final CryniaToolMaterial INSTANCE = new CryniaToolMaterial();

    // TODO: Replace default netherite values with custom ones
    @Override
    public int getDurability() {
        return 2031;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 9.0F;
    }

    @Override
    public float getAttackDamage() {
        return 4.0F;
    }

    @Override
    public int getMiningLevel() {
        return MiningLevels.NETHERITE;
    }

    @Override
    public int getEnchantability() {
        return 15;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(VonoImpetItems.CRYNIA_INGOT);
    }
}

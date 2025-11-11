package com.kittykittykitkat.vono_impet.sound;

import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;

import static com.kittykittykitkat.vono_impet.VonoImpet.MOD_ID;

public class VonoImpetSoundsEvents {
    public static final SoundEvent MUSIC_DISC_PASET_E_IMPETIF_LENA = registerSoundEvent("music_disc.paset_e_impetif_lena");
    public static final SoundEvent MUSIC_DISC_ZERO = registerSoundEvent("music_disc.0");

    public static SoundEvent registerSoundEvent(String name) {
        Identifier id = new Identifier(MOD_ID, name);
        return Registry.register(Registries.SOUND_EVENT, id, SoundEvent.of(id));
    }

    public static void registerSounds() {

    }
}

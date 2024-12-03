package net.william.luexpansion.sound;

import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.william.luexpansion.LUExpansion;

public class ModSounds {
    public static SoundEvent CENTRAL_BANK_NEXT = registerSoundEvent("central_bank_next");
    public static SoundEvent CENTRAL_BANK_THIS = registerSoundEvent("central_bank_this");
    public static SoundEvent CENTRAL_LIVERPOOL_STREET_NEXT = registerSoundEvent("central_liverpool_street_next");
    public static SoundEvent CENTRAL_LIVERPOOL_STREET_THIS = registerSoundEvent("central_liverpool_street_this");

    private static SoundEvent registerSoundEvent(String name) {
        Identifier id = new Identifier(LUExpansion.MOD_ID, name);
        return Registry.register(Registry.SOUND_EVENT, id, new SoundEvent(id));
    }

    public static void registerSounds() {
        LUExpansion.LOGGER.info("Registering Sounds for " + LUExpansion.MOD_ID);
    }
}

package turbotech.metal_pipes.sounds;

import turbotech.metal_pipes.MetalPipes;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.Identifier;
import net.minecraft.sounds.SoundEvent;

public class ModSounds {
    public static final SoundEvent METAL_PIPE = registerSoundEvent("metal_pipe");

    private static SoundEvent registerSoundEvent(String name){
        Identifier id = Identifier.fromNamespaceAndPath(MetalPipes.MOD_ID, name);
        return Registry.register(BuiltInRegistries.SOUND_EVENT, id, SoundEvent.createVariableRangeEvent(id));
    }
}

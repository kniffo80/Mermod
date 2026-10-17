package io.github.thatpreston.mermod.neoforge.mixin;

import io.github.thatpreston.mermod.mixin.MermodMixinConfigPlugin;
import net.neoforged.fml.loading.FMLLoader;

public class NeoForgeMixinConfigPlugin extends MermodMixinConfigPlugin {
    @Override
    public boolean isModLoaded(String id) {
        return FMLLoader.getCurrent().getLoadingModList().getModFileById(id) != null;
    }
}
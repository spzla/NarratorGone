package me.devlisuu.narratorgone.mixin;

import net.minecraft.client.Keyboard;
import net.minecraft.client.util.NarratorManager;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(Keyboard.class)
public abstract class KeyboardMixin {
    @Redirect(method = "onKey", at = @At(value = "INVOKE", target = "Lnet/minecraft/client/util/NarratorManager;isActive()Z"))
    public boolean onKey(NarratorManager instance) {
        return false;
    }
}
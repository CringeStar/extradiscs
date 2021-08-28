package cringestar.extra.discs.mixin;


import cringestar.extra.discs.DanceConstant;
import net.minecraft.client.render.WorldRenderer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

@Mixin (WorldRenderer.class)
public class WorldRendererMixin{
    @ModifyConstant(
            method = "updateEntitiesForSong",
            constant = @Constant(doubleValue = 3.0D))
            private double DanceDouble2(double distance) {
        return DanceConstant.PARROT_DANCE_DISTANCE;
    }

}

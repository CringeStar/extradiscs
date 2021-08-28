package cringestar.extra.discs.mixin;


import cringestar.extra.discs.DanceConstant;
import net.minecraft.entity.passive.ParrotEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

@Mixin (ParrotEntity.class)
public class ParrotMixin{
    @ModifyConstant(
            method = "tickMovement",
            constant = @Constant(doubleValue = 3.46D))
            private double DanceDouble(double distance) {
            return DanceConstant.PARROT_DANCE_DISTANCE;
    }
}
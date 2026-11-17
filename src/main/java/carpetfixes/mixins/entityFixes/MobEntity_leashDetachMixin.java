package carpetfixes.mixins.entityFixes;

import carpetfixes.CFSettings;
import carpetfixes.patches.LeashKnotDetach;
import net.minecraft.entity.Leashable;
import net.minecraft.entity.decoration.LeashKnotEntity;
import net.minecraft.entity.mob.MobEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

/**
 * Fixes leashes not removing themselves when a mob detaches from a leash. Leading to a leash knot on a fence
 * connected to nothing
 */

@Mixin(Leashable.class)
public interface MobEntity_leashDetachMixin extends Leashable {
    @Inject(
            method = "detachLeash(ZZ)V",
            at = @At("HEAD")
    )
    default void cf$detachLeash(boolean sendPacket, boolean dropItem, CallbackInfo ci) {
        if (CFSettings.leashKnotNotUpdatingOnBreakFix && this.getLeashHolder() instanceof LeashKnotEntity leashKnotEntity &&
                (Object) this instanceof MobEntity mobEntity) {
            ((LeashKnotDetach) leashKnotEntity).carpet_fixes$onDetachLeash(mobEntity);
        }
    }
}

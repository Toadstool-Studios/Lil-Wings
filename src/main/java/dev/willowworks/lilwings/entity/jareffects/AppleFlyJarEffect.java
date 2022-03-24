package dev.willowworks.lilwings.entity.jareffects;

import dev.willowworks.lilwings.block.ButterflyJarBlockEntity;
import dev.willowworks.lilwings.registry.LilWingsEntities;
import net.minecraft.core.particles.ParticleOptions;
import net.minecraft.world.level.Level;

public class AppleFlyJarEffect implements JarEffect{
    @Override
    public void tickEffect(Level level, ButterflyJarBlockEntity blockEntity) {
        if((int) (Math.random() * 100) == 1) {
            blockEntity.setEntityType(LilWingsEntities.GOLD_APPLEFLY_BUTTERFLY.entityType().get());
        }
    }

    @Override
    public ParticleOptions getParticleType() {
        return null;
    }
}

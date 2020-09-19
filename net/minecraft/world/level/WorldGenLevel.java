package net.minecraft.world.level;

import java.util.stream.Stream;
import net.minecraft.core.SectionPos;
import net.minecraft.world.level.levelgen.feature.StructureFeature;
import net.minecraft.world.level.levelgen.structure.StructureStart;

public interface WorldGenLevel extends ServerLevelAccessor {
  long getSeed();
  
  Stream<? extends StructureStart<?>> startsForFeature(SectionPos paramSectionPos, StructureFeature<?> paramStructureFeature);
}


/* Location:              C:\Users\Josep\Downloads\Decompile Minecraft\deobfuscated.jar!\net\minecraft\world\level\WorldGenLevel.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
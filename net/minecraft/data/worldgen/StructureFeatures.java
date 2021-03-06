/*    */ package net.minecraft.data.worldgen;
/*    */ import net.minecraft.data.BuiltinRegistries;
/*    */ import net.minecraft.world.level.levelgen.feature.ConfiguredStructureFeature;
/*    */ import net.minecraft.world.level.levelgen.feature.MineshaftFeature;
/*    */ import net.minecraft.world.level.levelgen.feature.RuinedPortalFeature;
/*    */ import net.minecraft.world.level.levelgen.feature.StructureFeature;
/*    */ import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
/*    */ import net.minecraft.world.level.levelgen.feature.configurations.JigsawConfiguration;
/*    */ import net.minecraft.world.level.levelgen.feature.configurations.MineshaftConfiguration;
/*    */ import net.minecraft.world.level.levelgen.feature.configurations.NoneFeatureConfiguration;
/*    */ import net.minecraft.world.level.levelgen.feature.configurations.OceanRuinConfiguration;
/*    */ import net.minecraft.world.level.levelgen.feature.configurations.ProbabilityFeatureConfiguration;
/*    */ import net.minecraft.world.level.levelgen.feature.configurations.RuinedPortalConfiguration;
/*    */ import net.minecraft.world.level.levelgen.feature.configurations.ShipwreckConfiguration;
/*    */ import net.minecraft.world.level.levelgen.feature.structures.StructureTemplatePool;
/*    */ import net.minecraft.world.level.levelgen.structure.OceanRuinFeature;
/*    */ 
/*    */ public class StructureFeatures {
/* 19 */   public static final ConfiguredStructureFeature<JigsawConfiguration, ? extends StructureFeature<JigsawConfiguration>> PILLAGER_OUTPOST = register("pillager_outpost", StructureFeature.PILLAGER_OUTPOST.configured((FeatureConfiguration)new JigsawConfiguration(() -> PillagerOutpostPools.START, 7)));
/* 20 */   public static final ConfiguredStructureFeature<MineshaftConfiguration, ? extends StructureFeature<MineshaftConfiguration>> MINESHAFT = register("mineshaft", StructureFeature.MINESHAFT.configured((FeatureConfiguration)new MineshaftConfiguration(0.004F, MineshaftFeature.Type.NORMAL)));
/* 21 */   public static final ConfiguredStructureFeature<MineshaftConfiguration, ? extends StructureFeature<MineshaftConfiguration>> MINESHAFT_MESA = register("mineshaft_mesa", StructureFeature.MINESHAFT.configured((FeatureConfiguration)new MineshaftConfiguration(0.004F, MineshaftFeature.Type.MESA)));
/* 22 */   public static final ConfiguredStructureFeature<NoneFeatureConfiguration, ? extends StructureFeature<NoneFeatureConfiguration>> WOODLAND_MANSION = register("mansion", StructureFeature.WOODLAND_MANSION.configured((FeatureConfiguration)NoneFeatureConfiguration.INSTANCE));
/* 23 */   public static final ConfiguredStructureFeature<NoneFeatureConfiguration, ? extends StructureFeature<NoneFeatureConfiguration>> JUNGLE_TEMPLE = register("jungle_pyramid", StructureFeature.JUNGLE_TEMPLE.configured((FeatureConfiguration)NoneFeatureConfiguration.INSTANCE));
/* 24 */   public static final ConfiguredStructureFeature<NoneFeatureConfiguration, ? extends StructureFeature<NoneFeatureConfiguration>> DESERT_PYRAMID = register("desert_pyramid", StructureFeature.DESERT_PYRAMID.configured((FeatureConfiguration)NoneFeatureConfiguration.INSTANCE));
/* 25 */   public static final ConfiguredStructureFeature<NoneFeatureConfiguration, ? extends StructureFeature<NoneFeatureConfiguration>> IGLOO = register("igloo", StructureFeature.IGLOO.configured((FeatureConfiguration)NoneFeatureConfiguration.INSTANCE));
/* 26 */   public static final ConfiguredStructureFeature<ShipwreckConfiguration, ? extends StructureFeature<ShipwreckConfiguration>> SHIPWRECK = register("shipwreck", StructureFeature.SHIPWRECK.configured((FeatureConfiguration)new ShipwreckConfiguration(false)));
/* 27 */   public static final ConfiguredStructureFeature<ShipwreckConfiguration, ? extends StructureFeature<ShipwreckConfiguration>> SHIPWRECH_BEACHED = register("shipwreck_beached", StructureFeature.SHIPWRECK.configured((FeatureConfiguration)new ShipwreckConfiguration(true)));
/* 28 */   public static final ConfiguredStructureFeature<NoneFeatureConfiguration, ? extends StructureFeature<NoneFeatureConfiguration>> SWAMP_HUT = register("swamp_hut", StructureFeature.SWAMP_HUT.configured((FeatureConfiguration)NoneFeatureConfiguration.INSTANCE));
/* 29 */   public static final ConfiguredStructureFeature<NoneFeatureConfiguration, ? extends StructureFeature<NoneFeatureConfiguration>> STRONGHOLD = register("stronghold", StructureFeature.STRONGHOLD.configured((FeatureConfiguration)NoneFeatureConfiguration.INSTANCE));
/* 30 */   public static final ConfiguredStructureFeature<NoneFeatureConfiguration, ? extends StructureFeature<NoneFeatureConfiguration>> OCEAN_MONUMENT = register("monument", StructureFeature.OCEAN_MONUMENT.configured((FeatureConfiguration)NoneFeatureConfiguration.INSTANCE));
/* 31 */   public static final ConfiguredStructureFeature<OceanRuinConfiguration, ? extends StructureFeature<OceanRuinConfiguration>> OCEAN_RUIN_COLD = register("ocean_ruin_cold", StructureFeature.OCEAN_RUIN.configured((FeatureConfiguration)new OceanRuinConfiguration(OceanRuinFeature.Type.COLD, 0.3F, 0.9F)));
/* 32 */   public static final ConfiguredStructureFeature<OceanRuinConfiguration, ? extends StructureFeature<OceanRuinConfiguration>> OCEAN_RUIN_WARM = register("ocean_ruin_warm", StructureFeature.OCEAN_RUIN.configured((FeatureConfiguration)new OceanRuinConfiguration(OceanRuinFeature.Type.WARM, 0.3F, 0.9F)));
/* 33 */   public static final ConfiguredStructureFeature<NoneFeatureConfiguration, ? extends StructureFeature<NoneFeatureConfiguration>> NETHER_BRIDGE = register("fortress", StructureFeature.NETHER_BRIDGE.configured((FeatureConfiguration)NoneFeatureConfiguration.INSTANCE));
/* 34 */   public static final ConfiguredStructureFeature<NoneFeatureConfiguration, ? extends StructureFeature<NoneFeatureConfiguration>> NETHER_FOSSIL = register("nether_fossil", StructureFeature.NETHER_FOSSIL.configured((FeatureConfiguration)NoneFeatureConfiguration.INSTANCE));
/* 35 */   public static final ConfiguredStructureFeature<NoneFeatureConfiguration, ? extends StructureFeature<NoneFeatureConfiguration>> END_CITY = register("end_city", StructureFeature.END_CITY.configured((FeatureConfiguration)NoneFeatureConfiguration.INSTANCE));
/* 36 */   public static final ConfiguredStructureFeature<ProbabilityFeatureConfiguration, ? extends StructureFeature<ProbabilityFeatureConfiguration>> BURIED_TREASURE = register("buried_treasure", StructureFeature.BURIED_TREASURE.configured((FeatureConfiguration)new ProbabilityFeatureConfiguration(0.01F)));
/* 37 */   public static final ConfiguredStructureFeature<JigsawConfiguration, ? extends StructureFeature<JigsawConfiguration>> BASTION_REMNANT = register("bastion_remnant", StructureFeature.BASTION_REMNANT.configured((FeatureConfiguration)new JigsawConfiguration(() -> BastionPieces.START, 6)));
/*    */   
/* 39 */   public static final ConfiguredStructureFeature<JigsawConfiguration, ? extends StructureFeature<JigsawConfiguration>> VILLAGE_PLAINS = register("village_plains", StructureFeature.VILLAGE.configured((FeatureConfiguration)new JigsawConfiguration(() -> PlainVillagePools.START, 6)));
/* 40 */   public static final ConfiguredStructureFeature<JigsawConfiguration, ? extends StructureFeature<JigsawConfiguration>> VILLAGE_DESERT = register("village_desert", StructureFeature.VILLAGE.configured((FeatureConfiguration)new JigsawConfiguration(() -> DesertVillagePools.START, 6)));
/* 41 */   public static final ConfiguredStructureFeature<JigsawConfiguration, ? extends StructureFeature<JigsawConfiguration>> VILLAGE_SAVANNA = register("village_savanna", StructureFeature.VILLAGE.configured((FeatureConfiguration)new JigsawConfiguration(() -> SavannaVillagePools.START, 6)));
/* 42 */   public static final ConfiguredStructureFeature<JigsawConfiguration, ? extends StructureFeature<JigsawConfiguration>> VILLAGE_SNOWY = register("village_snowy", StructureFeature.VILLAGE.configured((FeatureConfiguration)new JigsawConfiguration(() -> SnowyVillagePools.START, 6)));
/* 43 */   public static final ConfiguredStructureFeature<JigsawConfiguration, ? extends StructureFeature<JigsawConfiguration>> VILLAGE_TAIGA = register("village_taiga", StructureFeature.VILLAGE.configured((FeatureConfiguration)new JigsawConfiguration(() -> TaigaVillagePools.START, 6)));
/*    */   
/* 45 */   public static final ConfiguredStructureFeature<RuinedPortalConfiguration, ? extends StructureFeature<RuinedPortalConfiguration>> RUINED_PORTAL_STANDARD = register("ruined_portal", StructureFeature.RUINED_PORTAL.configured((FeatureConfiguration)new RuinedPortalConfiguration(RuinedPortalFeature.Type.STANDARD)));
/* 46 */   public static final ConfiguredStructureFeature<RuinedPortalConfiguration, ? extends StructureFeature<RuinedPortalConfiguration>> RUINED_PORTAL_DESERT = register("ruined_portal_desert", StructureFeature.RUINED_PORTAL.configured((FeatureConfiguration)new RuinedPortalConfiguration(RuinedPortalFeature.Type.DESERT)));
/* 47 */   public static final ConfiguredStructureFeature<RuinedPortalConfiguration, ? extends StructureFeature<RuinedPortalConfiguration>> RUINED_PORTAL_JUNGLE = register("ruined_portal_jungle", StructureFeature.RUINED_PORTAL.configured((FeatureConfiguration)new RuinedPortalConfiguration(RuinedPortalFeature.Type.JUNGLE)));
/* 48 */   public static final ConfiguredStructureFeature<RuinedPortalConfiguration, ? extends StructureFeature<RuinedPortalConfiguration>> RUINED_PORTAL_SWAMP = register("ruined_portal_swamp", StructureFeature.RUINED_PORTAL.configured((FeatureConfiguration)new RuinedPortalConfiguration(RuinedPortalFeature.Type.SWAMP)));
/* 49 */   public static final ConfiguredStructureFeature<RuinedPortalConfiguration, ? extends StructureFeature<RuinedPortalConfiguration>> RUINED_PORTAL_MOUNTAIN = register("ruined_portal_mountain", StructureFeature.RUINED_PORTAL.configured((FeatureConfiguration)new RuinedPortalConfiguration(RuinedPortalFeature.Type.MOUNTAIN)));
/* 50 */   public static final ConfiguredStructureFeature<RuinedPortalConfiguration, ? extends StructureFeature<RuinedPortalConfiguration>> RUINED_PORTAL_OCEAN = register("ruined_portal_ocean", StructureFeature.RUINED_PORTAL.configured((FeatureConfiguration)new RuinedPortalConfiguration(RuinedPortalFeature.Type.OCEAN)));
/* 51 */   public static final ConfiguredStructureFeature<RuinedPortalConfiguration, ? extends StructureFeature<RuinedPortalConfiguration>> RUINED_PORTAL_NETHER = register("ruined_portal_nether", StructureFeature.RUINED_PORTAL.configured((FeatureConfiguration)new RuinedPortalConfiguration(RuinedPortalFeature.Type.NETHER)));
/*    */   
/*    */   private static <FC extends FeatureConfiguration, F extends StructureFeature<FC>> ConfiguredStructureFeature<FC, F> register(String debug0, ConfiguredStructureFeature<FC, F> debug1) {
/* 54 */     return (ConfiguredStructureFeature<FC, F>)BuiltinRegistries.register(BuiltinRegistries.CONFIGURED_STRUCTURE_FEATURE, debug0, debug1);
/*    */   }
/*    */ }


/* Location:              C:\Users\Josep\Downloads\Decompile Minecraft\deobfuscated.jar!\net\minecraft\data\worldgen\StructureFeatures.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
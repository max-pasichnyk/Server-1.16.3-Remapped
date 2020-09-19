/*    */ package net.minecraft.world.level.newbiome.layer;
/*    */ 
/*    */ import net.minecraft.world.level.newbiome.context.Context;
/*    */ import net.minecraft.world.level.newbiome.layer.traits.CastleTransformer;
/*    */ 
/*    */ public enum RemoveTooMuchOceanLayer implements CastleTransformer {
/*  7 */   INSTANCE;
/*    */ 
/*    */   
/*    */   public int apply(Context debug1, int debug2, int debug3, int debug4, int debug5, int debug6) {
/* 11 */     if (Layers.isShallowOcean(debug6) && Layers.isShallowOcean(debug2) && Layers.isShallowOcean(debug3) && Layers.isShallowOcean(debug5) && Layers.isShallowOcean(debug4) && debug1.nextRandom(2) == 0) {
/* 12 */       return 1;
/*    */     }
/* 14 */     return debug6;
/*    */   }
/*    */ }


/* Location:              C:\Users\Josep\Downloads\Decompile Minecraft\deobfuscated.jar!\net\minecraft\world\level\newbiome\layer\RemoveTooMuchOceanLayer.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
/*    */ package net.minecraft.util.datafix.fixes;
/*    */ 
/*    */ import com.mojang.datafixers.DSL;
/*    */ import com.mojang.datafixers.Typed;
/*    */ import com.mojang.datafixers.schemas.Schema;
/*    */ import com.mojang.serialization.Dynamic;
/*    */ 
/*    */ public class EntityShulkerColorFix extends NamedEntityFix {
/*    */   public EntityShulkerColorFix(Schema debug1, boolean debug2) {
/* 10 */     super(debug1, debug2, "EntityShulkerColorFix", References.ENTITY, "minecraft:shulker");
/*    */   }
/*    */   
/*    */   public Dynamic<?> fixTag(Dynamic<?> debug1) {
/* 14 */     if (!debug1.get("Color").map(Dynamic::asNumber).result().isPresent()) {
/* 15 */       return debug1.set("Color", debug1.createByte((byte)10));
/*    */     }
/* 17 */     return debug1;
/*    */   }
/*    */ 
/*    */   
/*    */   protected Typed<?> fix(Typed<?> debug1) {
/* 22 */     return debug1.update(DSL.remainderFinder(), this::fixTag);
/*    */   }
/*    */ }


/* Location:              C:\Users\Josep\Downloads\Decompile Minecraft\deobfuscated.jar!\net\minecraf\\util\datafix\fixes\EntityShulkerColorFix.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
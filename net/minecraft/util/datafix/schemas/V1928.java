/*    */ package net.minecraft.util.datafix.schemas;
/*    */ 
/*    */ import com.mojang.datafixers.DSL;
/*    */ import com.mojang.datafixers.schemas.Schema;
/*    */ import com.mojang.datafixers.types.templates.TypeTemplate;
/*    */ import java.util.Map;
/*    */ import java.util.function.Supplier;
/*    */ import net.minecraft.util.datafix.fixes.References;
/*    */ 
/*    */ 
/*    */ public class V1928
/*    */   extends NamespacedSchema
/*    */ {
/*    */   public V1928(int debug1, Schema debug2) {
/* 15 */     super(debug1, debug2);
/*    */   }
/*    */   
/*    */   protected static TypeTemplate equipment(Schema debug0) {
/* 19 */     return DSL.optionalFields("ArmorItems", 
/* 20 */         DSL.list(References.ITEM_STACK.in(debug0)), "HandItems", 
/* 21 */         DSL.list(References.ITEM_STACK.in(debug0)));
/*    */   }
/*    */ 
/*    */   
/*    */   protected static void registerMob(Schema debug0, Map<String, Supplier<TypeTemplate>> debug1, String debug2) {
/* 26 */     debug0.register(debug1, debug2, () -> equipment(debug0));
/*    */   }
/*    */ 
/*    */   
/*    */   public Map<String, Supplier<TypeTemplate>> registerEntities(Schema debug1) {
/* 31 */     Map<String, Supplier<TypeTemplate>> debug2 = super.registerEntities(debug1);
/*    */     
/* 33 */     debug2.remove("minecraft:illager_beast");
/* 34 */     registerMob(debug1, debug2, "minecraft:ravager");
/*    */     
/* 36 */     return debug2;
/*    */   }
/*    */ }


/* Location:              C:\Users\Josep\Downloads\Decompile Minecraft\deobfuscated.jar!\net\minecraf\\util\datafix\schemas\V1928.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
/*    */ package com.mojang.datafixers.types.constant;
/*    */ 
/*    */ import com.mojang.datafixers.DSL;
/*    */ import com.mojang.datafixers.types.Type;
/*    */ import com.mojang.datafixers.types.templates.TypeTemplate;
/*    */ import com.mojang.serialization.Codec;
/*    */ import com.mojang.serialization.Dynamic;
/*    */ import com.mojang.serialization.DynamicOps;
/*    */ import java.util.Optional;
/*    */ 
/*    */ 
/*    */ 
/*    */ public final class EmptyPartPassthrough
/*    */   extends Type<Dynamic<?>>
/*    */ {
/*    */   public String toString() {
/* 17 */     return "EmptyPartPassthrough";
/*    */   }
/*    */ 
/*    */   
/*    */   public Optional<Dynamic<?>> point(DynamicOps<?> ops) {
/* 22 */     return Optional.of(new Dynamic(ops));
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean equals(Object o, boolean ignoreRecursionPoints, boolean checkIndex) {
/* 27 */     return (this == o);
/*    */   }
/*    */ 
/*    */   
/*    */   public TypeTemplate buildTemplate() {
/* 32 */     return DSL.constType(this);
/*    */   }
/*    */ 
/*    */   
/*    */   public Codec<Dynamic<?>> buildCodec() {
/* 37 */     return Codec.PASSTHROUGH;
/*    */   }
/*    */ }


/* Location:              C:\Users\Josep\Downloads\Decompile Minecraft\deobfuscated.jar!\com\mojang\datafixers\types\constant\EmptyPartPassthrough.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
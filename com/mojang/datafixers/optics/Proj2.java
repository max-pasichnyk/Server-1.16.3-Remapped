/*    */ package com.mojang.datafixers.optics;
/*    */ 
/*    */ import com.mojang.datafixers.util.Pair;
/*    */ 
/*    */ 
/*    */ public final class Proj2<F, G, G2>
/*    */   implements Lens<Pair<F, G>, Pair<F, G2>, G, G2>
/*    */ {
/*    */   public G view(Pair<F, G> pair) {
/* 10 */     return (G)pair.getSecond();
/*    */   }
/*    */ 
/*    */   
/*    */   public Pair<F, G2> update(G2 newValue, Pair<F, G> pair) {
/* 15 */     return Pair.of(pair.getFirst(), newValue);
/*    */   }
/*    */ 
/*    */   
/*    */   public String toString() {
/* 20 */     return "π2";
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean equals(Object obj) {
/* 25 */     return obj instanceof Proj2;
/*    */   }
/*    */ }


/* Location:              C:\Users\Josep\Downloads\Decompile Minecraft\deobfuscated.jar!\com\mojang\datafixers\optics\Proj2.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
/*    */ package net.minecraft.world.item.enchantment;
/*    */ 
/*    */ import net.minecraft.world.entity.EquipmentSlot;
/*    */ 
/*    */ public class TridentChannelingEnchantment extends Enchantment {
/*    */   public TridentChannelingEnchantment(Enchantment.Rarity debug1, EquipmentSlot... debug2) {
/*  7 */     super(debug1, EnchantmentCategory.TRIDENT, debug2);
/*    */   }
/*    */ 
/*    */   
/*    */   public int getMinCost(int debug1) {
/* 12 */     return 25;
/*    */   }
/*    */ 
/*    */   
/*    */   public int getMaxCost(int debug1) {
/* 17 */     return 50;
/*    */   }
/*    */ 
/*    */   
/*    */   public int getMaxLevel() {
/* 22 */     return 1;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean checkCompatibility(Enchantment debug1) {
/* 27 */     return super.checkCompatibility(debug1);
/*    */   }
/*    */ }


/* Location:              C:\Users\Josep\Downloads\Decompile Minecraft\deobfuscated.jar!\net\minecraft\world\item\enchantment\TridentChannelingEnchantment.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
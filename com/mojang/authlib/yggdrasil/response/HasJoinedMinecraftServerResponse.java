/*    */ package com.mojang.authlib.yggdrasil.response;
/*    */ 
/*    */ import com.mojang.authlib.properties.PropertyMap;
/*    */ import java.util.UUID;
/*    */ 
/*    */ public class HasJoinedMinecraftServerResponse
/*    */   extends Response {
/*    */   private UUID id;
/*    */   private PropertyMap properties;
/*    */   
/*    */   public UUID getId() {
/* 12 */     return this.id;
/*    */   }
/*    */   
/*    */   public PropertyMap getProperties() {
/* 16 */     return this.properties;
/*    */   }
/*    */ }


/* Location:              C:\Users\Josep\Downloads\Decompile Minecraft\deobfuscated.jar!\com\mojang\authlib\yggdrasil\response\HasJoinedMinecraftServerResponse.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
/*    */ package net.minecraft.network.protocol.game;
/*    */ 
/*    */ import java.io.IOException;
/*    */ import net.minecraft.network.FriendlyByteBuf;
/*    */ import net.minecraft.network.PacketListener;
/*    */ import net.minecraft.network.protocol.Packet;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ 
/*    */ 
/*    */ public class ClientboundRotateHeadPacket
/*    */   implements Packet<ClientGamePacketListener>
/*    */ {
/*    */   private int entityId;
/*    */   private byte yHeadRot;
/*    */   
/*    */   public ClientboundRotateHeadPacket() {}
/*    */   
/*    */   public ClientboundRotateHeadPacket(Entity debug1, byte debug2) {
/* 19 */     this.entityId = debug1.getId();
/* 20 */     this.yHeadRot = debug2;
/*    */   }
/*    */ 
/*    */   
/*    */   public void read(FriendlyByteBuf debug1) throws IOException {
/* 25 */     this.entityId = debug1.readVarInt();
/* 26 */     this.yHeadRot = debug1.readByte();
/*    */   }
/*    */ 
/*    */   
/*    */   public void write(FriendlyByteBuf debug1) throws IOException {
/* 31 */     debug1.writeVarInt(this.entityId);
/* 32 */     debug1.writeByte(this.yHeadRot);
/*    */   }
/*    */ 
/*    */   
/*    */   public void handle(ClientGamePacketListener debug1) {
/* 37 */     debug1.handleRotateMob(this);
/*    */   }
/*    */ }


/* Location:              C:\Users\Josep\Downloads\Decompile Minecraft\deobfuscated.jar!\net\minecraft\network\protocol\game\ClientboundRotateHeadPacket.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
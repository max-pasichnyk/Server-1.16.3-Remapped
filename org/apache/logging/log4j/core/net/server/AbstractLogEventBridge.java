/*    */ package org.apache.logging.log4j.core.net.server;
/*    */ 
/*    */ import java.io.IOException;
/*    */ import java.io.InputStream;
/*    */ import org.apache.logging.log4j.Logger;
/*    */ import org.apache.logging.log4j.status.StatusLogger;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public abstract class AbstractLogEventBridge<T extends InputStream>
/*    */   implements LogEventBridge<T>
/*    */ {
/*    */   protected static final int END = -1;
/* 35 */   protected static final Logger logger = (Logger)StatusLogger.getLogger();
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public T wrapStream(InputStream inputStream) throws IOException {
/* 41 */     return (T)inputStream;
/*    */   }
/*    */ }


/* Location:              C:\Users\Josep\Downloads\Decompile Minecraft\deobfuscated.jar!\org\apache\logging\log4j\core\net\server\AbstractLogEventBridge.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */
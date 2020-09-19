/*     */ package org.apache.logging.log4j.message;
/*     */ 
/*     */ import org.apache.logging.log4j.util.PerformanceSensitive;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @PerformanceSensitive({"allocation"})
/*     */ public class ReusableSimpleMessage
/*     */   implements ReusableMessage, CharSequence
/*     */ {
/*     */   private static final long serialVersionUID = -9199974506498249809L;
/*  28 */   private static Object[] EMPTY_PARAMS = new Object[0];
/*     */   private CharSequence charSequence;
/*     */   
/*     */   public void set(String message) {
/*  32 */     this.charSequence = message;
/*     */   }
/*     */   
/*     */   public void set(CharSequence charSequence) {
/*  36 */     this.charSequence = charSequence;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getFormattedMessage() {
/*  41 */     return String.valueOf(this.charSequence);
/*     */   }
/*     */ 
/*     */   
/*     */   public String getFormat() {
/*  46 */     return getFormattedMessage();
/*     */   }
/*     */ 
/*     */   
/*     */   public Object[] getParameters() {
/*  51 */     return EMPTY_PARAMS;
/*     */   }
/*     */ 
/*     */   
/*     */   public Throwable getThrowable() {
/*  56 */     return null;
/*     */   }
/*     */ 
/*     */   
/*     */   public void formatTo(StringBuilder buffer) {
/*  61 */     buffer.append(this.charSequence);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Object[] swapParameters(Object[] emptyReplacement) {
/*  71 */     return emptyReplacement;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public short getParameterCount() {
/*  80 */     return 0;
/*     */   }
/*     */ 
/*     */   
/*     */   public Message memento() {
/*  85 */     return new SimpleMessage(this.charSequence);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int length() {
/*  92 */     return (this.charSequence == null) ? 0 : this.charSequence.length();
/*     */   }
/*     */ 
/*     */   
/*     */   public char charAt(int index) {
/*  97 */     return this.charSequence.charAt(index);
/*     */   }
/*     */ 
/*     */   
/*     */   public CharSequence subSequence(int start, int end) {
/* 102 */     return this.charSequence.subSequence(start, end);
/*     */   }
/*     */ }


/* Location:              C:\Users\Josep\Downloads\Decompile Minecraft\deobfuscated.jar!\org\apache\logging\log4j\message\ReusableSimpleMessage.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */
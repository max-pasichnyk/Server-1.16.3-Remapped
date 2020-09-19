package org.apache.logging.log4j.message;

public interface FlowMessageFactory {
  EntryMessage newEntryMessage(Message paramMessage);
  
  ExitMessage newExitMessage(Object paramObject, Message paramMessage);
  
  ExitMessage newExitMessage(EntryMessage paramEntryMessage);
  
  ExitMessage newExitMessage(Object paramObject, EntryMessage paramEntryMessage);
}


/* Location:              C:\Users\Josep\Downloads\Decompile Minecraft\deobfuscated.jar!\org\apache\logging\log4j\message\FlowMessageFactory.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */
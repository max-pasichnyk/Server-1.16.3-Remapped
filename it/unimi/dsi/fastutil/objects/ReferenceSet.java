package it.unimi.dsi.fastutil.objects;

import java.util.Iterator;
import java.util.Set;

public interface ReferenceSet<K> extends ReferenceCollection<K>, Set<K> {
  ObjectIterator<K> iterator();
}


/* Location:              C:\Users\Josep\Downloads\Decompile Minecraft\deobfuscated.jar!\i\\unimi\dsi\fastutil\objects\ReferenceSet.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
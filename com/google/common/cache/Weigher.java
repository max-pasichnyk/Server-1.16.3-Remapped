package com.google.common.cache;

import com.google.common.annotations.GwtCompatible;

@GwtCompatible
public interface Weigher<K, V> {
  int weigh(K paramK, V paramV);
}


/* Location:              C:\Users\Josep\Downloads\Decompile Minecraft\deobfuscated.jar!\com\google\common\cache\Weigher.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
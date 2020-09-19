package org.apache.logging.log4j.core.config.plugins;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.PARAMETER, ElementType.TYPE, ElementType.FIELD})
public @interface PluginAliases {
  String[] value();
}


/* Location:              C:\Users\Josep\Downloads\Decompile Minecraft\deobfuscated.jar!\org\apache\logging\log4j\core\config\plugins\PluginAliases.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */